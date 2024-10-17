#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <gtk/gtk.h>
#include <cairo.h>

#define SIZE 400
#define PI 3.1416

static int width, height;
           
float teta;


int vortex[12][2];
           
int coef,
    col;
static int o=1;

static int v=1;              
    


static void pintado();


float angles[8][3];
static void pintado() {

	
	
	angles[0][0]=-.5;
	angles[0][1]=-.5;
	angles[0][2]=-.5;
	angles[1][0]=-.5;
	angles[1][1]=.5;
	angles[1][2]=-.5;
	angles[2][0]=.5;
	angles[2][1]=.5;
	angles[2][2]=-.5;
	angles[3][0]=.5;
	angles[3][1]=-.5;
	angles[3][2]=-.5;
	angles[4][0]=-.5;
	angles[4][1]=-.5;
	angles[4][2]=.5;
	angles[5][0]=-.5;
	angles[5][1]=.5;
	angles[5][2]=.5;
	angles[6][0]=.5;
	angles[6][1]=.5;
	angles[6][2]=.5;
	angles[7][0]=.5;
	angles[7][1]=-.5;
	angles[7][2]=.5;
	
	vortex[0][0]=0;
	vortex[0][1]=1;
	
	vortex[1][0]=1;
	vortex[1][1]=2;
	
	vortex[2][0]=2;
	vortex[2][1]=3;
	
	vortex[3][0]=3;
	vortex[3][1]=0;
	
	vortex[4][0]=4;
	vortex[4][1]=5;
	
	vortex[5][0]=5;
	vortex[5][1]=6;
	
	vortex[6][0]=6;
	vortex[6][1]=7;
	
	vortex[7][0]=7;
	vortex[7][1]=4;
	
	vortex[8][0]=0;
	vortex[8][1]=4;
	
	vortex[9][0]=1;
	vortex[9][1]=5;
	
	vortex[10][0]=2;
	vortex[10][1]=6;
	
	vortex[11][0]=3;
	vortex[11][1]=7;
	

}

void on_button_click(GtkWidget *widget, gpointer data)
{

    

    if ((char *) data=="1")
    {
        o=1;;
    }
    if ((char *) data=="2")
    {
        o=2;;
    }
    if ((char *) data=="3")
    {
        o=3;
    }
    if ((char *) data=="4")
    {
        if (v==-1){v=0;}
        if (v==0){v=1;}
        if (v==1){v=-1;}
        
    }
    }
static gboolean move(GtkWidget* widget)
{


	
	float nuevox, nuevoy, nuevoz;
	

  
    GtkWidget* window = gtk_widget_get_toplevel(widget);
    gtk_window_get_size(GTK_WINDOW(window), &width, &height);
    
    
   if (teta<PI){teta+=0.005*v;}else{teta=0;}
    
		switch(o)
		{ 
    
    case 1:
    for (int i=0; i<8 ; i++)
    {
    
    nuevox=angles[i][0]*cos(teta)+angles[i][1]*sin(teta);
    
    nuevoy=-angles[i][0]*sin(teta)+angles[i][1]*cos(teta);
    nuevoz=angles[i][2];
    angles[i][0]=nuevox;
    angles[i][1]=nuevoy;
    angles[i][2]=nuevoz;
    
    }
    break;
    
    
            case 2:
            for (int i=0; i<8 ; i++)
    {
            
    nuevox=angles[i][0]*cos(teta)+angles[i][2]*sin(teta);
    nuevoy=angles[i][1];
    nuevoz=-angles[i][0]*sin(teta)+angles[i][2]*cos(teta);
    
    angles[i][0]=nuevox;
    angles[i][1]=nuevoy;
    angles[i][2]=nuevoz;
    
    }
    break;        
            case 3:
            for (int i=0; i<8 ; i++)
    {
    
    nuevox=angles[i][0];
    nuevoy=angles[i][1]*cos(teta)-angles[i][2]*sin(teta);
    nuevoz=angles[i][1]*sin(teta)+angles[i][2]*cos(teta);
    
    angles[i][0]=nuevox;
    angles[i][1]=nuevoy;
    angles[i][2]=nuevoz;
    
    }
    break;
    }

    gtk_widget_queue_draw(widget);
    
    return TRUE;
}

static gboolean draw(GtkWidget* widget,cairo_t* context)
{
   
    for (int i=0; i < 12; i++) {
        cairo_move_to(context,angles[vortex[i][0]][0]*100+200,angles[vortex[i][0]][1]*100+200);
        cairo_line_to(context,angles[vortex[i][1]][0]*100+200,angles[vortex[i][1]][1]*100+200);
    }
    cairo_stroke(context);

    return FALSE;
}

int main(int argc, char** argv) {

    pintado();
    GtkWidget* window;
    GtkWidget* darea;
    cairo_t *context;
  GtkWidget *button;
  GtkWidget *table;
  GtkWidget *label;
  GtkWidget *frame;
    
    gtk_init(&argc, &argv);
    window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
    gtk_container_set_border_width (GTK_CONTAINER (window), 10);
    gtk_window_set_position(GTK_WINDOW(window), GTK_WIN_POS_CENTER);
    gtk_window_set_default_size(GTK_WINDOW(window), 800, 600);
    gtk_window_set_title(GTK_WINDOW(window), "EL CUBO DE LUIS FEDERICO");
    
    table = gtk_table_new (3,4,FALSE);
    gtk_container_add (GTK_CONTAINER (window), table);



button = gtk_button_new_with_label ("x");
  
  g_signal_connect (G_OBJECT (button), "clicked", G_CALLBACK (on_button_click), (gpointer) "1");
  gtk_table_attach (GTK_TABLE(table),button,0,1,0,1,0,0,2,2);

  button = gtk_button_new_with_label ("y");
  g_signal_connect (G_OBJECT (button), "clicked", G_CALLBACK(on_button_click), (gpointer) "2");
  gtk_table_attach (GTK_TABLE (table),button,1,2,0,1,0,0,2,2);

  button = gtk_button_new_with_label ("z");
  g_signal_connect (G_OBJECT (button), "clicked", G_CALLBACK(on_button_click), (gpointer) "3");
  gtk_table_attach (GTK_TABLE(table),button,2,3,0,1,0,0,2,2);

  button = gtk_button_new_with_label ("spped");
  g_signal_connect (G_OBJECT (button), "clicked", G_CALLBACK(on_button_click), (gpointer) "4");
  gtk_table_attach (GTK_TABLE(table),button,2,3,0,3,0,0,2,2);

  button=gtk_button_new_with_label ("Salir");
  gtk_table_attach (GTK_TABLE (table),button,0,2,1,2,0,0,2,2);
  g_signal_connect (G_OBJECT(window),"destroy",G_CALLBACK(gtk_main_quit),NULL);
  g_signal_connect_swapped (G_OBJECT(button),"clicked",G_CALLBACK(gtk_main_quit),(gpointer)window);

    frame=gtk_frame_new(NULL);
    darea = gtk_drawing_area_new();



gtk_container_add (GTK_CONTAINER (frame), darea);
    gtk_widget_set_size_request (darea, 400, 400);
    gtk_table_attach (GTK_TABLE(table),frame,3,4,0,2,GTK_EXPAND|GTK_FILL, GTK_EXPAND|GTK_FILL,0,0);
    g_signal_connect (G_OBJECT (darea), "draw", G_CALLBACK (draw), NULL);
    
    
    gtk_window_set_position(GTK_WINDOW(window), GTK_WIN_POS_CENTER);
    gtk_window_set_default_size(GTK_WINDOW(window), 600, 400);
    gtk_window_set_title(GTK_WINDOW(window), "EL CUBO DE LUIS FEDERICO");
    

    g_timeout_add(90, (GSourceFunc)move, window);


    gtk_widget_show_all(window);
    gtk_main();

    return 0;
}

