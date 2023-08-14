#include <stdio.h>
#include <allegro5/allegro.h>
#include <allegro5/allegro_primitives.h>
#include <allegro5/allegro_font.h>
#include <allegro5/allegro_ttf.h>
#include <allegro5/allegro_image.h>
#include <chrono>
#include <iostream>
#include <fstream>
#include <string>
#include <math.h>
//#include <thread>


using namespace std;
void concatenarCharACadena(char c, char *cadena)
{
char cadenaTemporal[2];
cadenaTemporal[0]=c;
cadenaTemporal[1]='\0';
strcat(cadena,cadenaTemporal);
}
int main(int argc, char *argv[])
{

    auto now = std::chrono::system_clock::now();
    std::time_t end_time = std::chrono::system_clock::to_time_t(now);
    string tiempo=ctime(&end_time);
if (!al_init())
	{
		fprintf(stderr, "Couldn't initialize Allegro\n");
		return 1;
	}
	ALLEGRO_DISPLAY *display = al_create_display(1700, 980);
	if (display == NULL)
	{
		fprintf(stderr, "Couldn't create display\n");
		return 1;
	}
	if (!al_init_primitives_addon())
	{
		fprintf(stderr, "Couldn't initialize Allegro primitives addon\n");
		return -1;
	}
	if (!al_init_font_addon())
	{
		fprintf(stderr, "Couldn't initialize Allegro text addon\n");
		return -1;
	}
	
	
	if (!al_init_ttf_addon())
	{
		fprintf(stderr, "Couldn't initialize Allegro ttf\n");
		return -1;
	}
        if (!al_init_image_addon())
	{
		fprintf(stderr, "Couldn't initialize Allegro image\n");
		return -1;
	}
	ALLEGRO_FONT *font = al_load_font("./fonts/Roboto/Roboto-Regular.ttf", 256, 0);
	ALLEGRO_FONT *font1 = al_load_font("./fonts/Roboto/Roboto-BoldItalic.ttf", 100, 0);
	if (font1 == NULL)
	{
		fprintf(stderr, "Couldn't load font\n");
		return 1;
	}
	if (font == NULL)
	{
		fprintf(stderr, "Couldn't load font\n");
		return 1;
	}
	const char *text =ctime(&end_time);
	const char *text1="L";
	const char *text2="u";
	const char *text3="c";
	const char *text4="a";
	const char *text5="r";
	const char *text6="ú";
	
	ALLEGRO_COLOR black = al_map_rgb(0, 0, 0);
        ALLEGRO_COLOR green= al_map_rgb(0, 100, 50);
        ALLEGRO_COLOR blue = al_map_rgb(0, 200, 250);
        ALLEGRO_COLOR yellow= al_map_rgb(0,100,150);
        ALLEGRO_COLOR white=al_map_rgb(0,50,50);
        ALLEGRO_COLOR juan=al_map_rgb(0,50,250);
        ALLEGRO_COLOR red=al_map_rgb_f(1, 0.5, 0);
        int bx, by, bw, bh;
	al_get_text_dimensions(font, text, &bx, &by, &bw, &bh);
	bw += bx;
	bh += by;
	// Better scaling quality
	 al_set_new_bitmap_flags(ALLEGRO_MIN_LINEAR | ALLEGRO_MAG_LINEAR);
	ALLEGRO_BITMAP *textimage = al_create_bitmap(bw, bh);
	al_set_target_bitmap(textimage);
	al_draw_text(font, al_map_rgb(0xFF, 0xFF, 0xFF), 0, 0, 0, text);
	al_set_target_backbuffer(display);

        int w = al_get_display_width(display);
	int h = al_get_display_height(display);
        
        al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green); 
	al_draw_text(font, white, 0, 0, 0, "Vigilancia");
	
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
       
	al_flip_display();
	
	al_rest(3);
        
          int x;
          int y;
 
  for(  x=0;x<141;x++)
    {
        
     //   sleep(1);
        y=4*pow(x,2)/108;
        al_clear_to_color(white);
       al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green); 
  
    
    
    al_draw_text(font,green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	
       
        
      
        
         
      //     al_draw_bitmap_region(prota,paso*48,dir*48,paso*48,dir*48,100,y,0);
           al_draw_text(font,black, 100, y, 0, text1);
       al_flip_display();
    }
       for(x=0;x<141;x++)
       {
           y=4*pow(x,2)/108;
           al_clear_to_color(white);
           al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green);
       
       al_draw_text(font,green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	
 //      al_draw_bitmap_region(prota,paso*48,dir*48,paso*48,dir*48,100,1600,0);
 //     al_draw_bitmap_region(proto,paso*48,dir*48,paso*48,dir*48,300,y,0);
         al_draw_text(font,black,100, 736, 0, text1);
         al_draw_text(font,black,300, y, 0, text2);
        al_flip_display();
       }
       for(x=0;x<141;x++)
       {
        y=4*pow(x,2)/108;
        al_clear_to_color(white);
      
       al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green);
        al_draw_text(font,green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	
    //     al_draw_bitmap_region(prota,paso*48,dir*48,paso*48,dir*48,100,1600,0);
   //    al_draw_bitmap_region(proto,paso*48,dir*48,paso*48,dir*48,350,1600,0);
 //   al_draw_bitmap_region(prato,paso*48,dir*48,paso*48,dir*48,500,y,0);
 al_draw_text(font,black,100, 736, 0, text1);
 al_draw_text(font, black,300, 736, 0, text2);
 al_draw_text(font, black,500, y, 0, text3);
        al_flip_display();
    }
     for(x=0;x<141;x++)
       {
        y=4*pow(x,2)/108;
        al_clear_to_color(white);
         al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green);
        al_draw_text(font,green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
      
   //      al_draw_bitmap_region(prota,paso*48,dir*48,paso*48,dir*48,100,1600,0);
 //    al_draw_bitmap_region(proto,paso*48,dir*48,paso*48,dir*48,350,1600,0);
 //   al_draw_bitmap_region(prato,paso*48,dir*48,paso*48,dir*48,500,1600,0);
  //  al_draw_bitmap_region(prata,paso*48,dir*48,paso*48,dir*48,700,y,0);
      al_draw_text(font, black,100, 736, 0, text1);
      al_draw_text(font, black,300, 736, 0, text2);
      al_draw_text(font,black,500, 736, 0, text3);
      al_draw_text(font,black,700, y, 0, text4);
          al_flip_display();
    }
    for(x=0;x<141;x++)
       {
        y=4*pow(x,2)/108;
        al_clear_to_color(white);
         al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green);
        al_draw_text(font, green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	
        al_draw_text(font, black,100, 736, 0, text1);
      al_draw_text(font, black,300, 736, 0, text2);
     al_draw_text(font,black,500, 736, 0, text3);
      al_draw_text(font,black,700, 736, 0, text4);
       al_draw_text(font,black,900, y, 0, text5);
      
          al_flip_display();
       }
       for(x=0;x<142;x++)
       {
        y=4*pow(x,2)/108;
        al_clear_to_color(white);
         al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green);
        al_draw_text(font, green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	
        al_draw_text(font, black,100, 736, 0, text1);
      al_draw_text(font, black,300, 736, 0, text2);
     al_draw_text(font,black,500, 736, 0, text3);
      al_draw_text(font,black,700, 736, 0, text4);
     al_draw_text(font,black,900, 736,0, text5);
      al_draw_text(font,juan,300, y,0, text6);
      // al_draw_circle(100, 100, 50, blue, 3);
          al_flip_display();
       }
       al_clear_to_color(white);
         al_draw_filled_circle(440,  100,  64, blue);
        al_draw_filled_ellipse(860,250,440,350,juan);
        al_draw_filled_ellipse(420,350,250,100,blue);
        al_draw_filled_circle(1020 , 100,  64, black);
        al_draw_filled_circle(50 , 40,  64, green);
        al_draw_text(font, green, 0, 0, 0, "Vigilancia");
	al_draw_scaled_bitmap(textimage, 0, 0, bw, bh, 0, (h - bh) / 2, w, bh * w / bw, 0);
	
        al_draw_text(font, black,100, 736, 0, text1);
      //al_draw_text(font, black,300, 736, 0, text2);
     al_draw_text(font,black,500, 736, 0, text3);
      al_draw_text(font,black,700, 736, 0, text4);
     al_draw_text(font,black,900, 736,0, text5);
      al_draw_text(font,juan,300, 736,0, text6);
      // al_draw_circle(100, 100, 50, blue, 3);
          
       al_draw_text(font1, red, 40, 500, 0, "Por Luis Federico Berruezo Sánchez");
//  al_flip_display();
//	getch();
al_flip_display();
	al_rest(2);
        
        al_clear_to_color(black);
        
	fstream ficheroEntrada;
	int r1=0;
	//string garaje="";
 char letra;
 char txt[255]=":";
char espacio='/';
char separa=' ';

char termina='.';
//char *text2[255];
//char text1[255];

 ficheroEntrada.open ("textos/123456.txt", ios::in);
 if (ficheroEntrada.is_open()) {
 while (! ficheroEntrada.eof() ) {
 ficheroEntrada >> letra;
 if (letra ==espacio){letra=separa;}
 if (letra ==termina){letra=separa;}
         //const char *text << {&letra};
 	//al_clear_to_color(black);
 	//char *text[r1]={&letra};
 	//garaje=garaje+text;
 	//const char *txt<<*text;
 	concatenarCharACadena(letra,  txt);
 	const char *texto=txt;
 	al_draw_text(font1, red, 40, 500, 0, texto);
 	//strcpy(text1,text2[r1]);
 	//for(int r2=1;r2<=r1;r2++)
 	//{
 	//char *text1=text2[r1];
 	//char *text=text2[r1];
 	//al_draw_text(font1, red, 40, 500, 0, text);
 	//}
 	
 	// r1++;
 	al_flip_display();
 	al_rest(.5);
 	}
	al_rest(2);
        
        
 ficheroEntrada.close();
 }
 else {printf("Fichero inexistente");
	
      
	}
	 al_destroy_display(display);
	return 0;
}
 	
