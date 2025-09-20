import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
//import java.awt.*;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import java.awt.Polygon;
//import java.util.Scanner;
/*
public class PoligonoEjemplo3 extends JPanel {
      boolean dyed =true;  
 static int nPoints = 8;
        static int [] pointx = new int [nPoints];
        static int [] pointy = new int [nPoints];
   int [] oldpointx = new int [nPoints];
       int [] oldpointy = new int [nPoints];
    protected void paintComponent( Graphics g ){ 
    super.paintComponent( g ); 
*/

//@Override
class PoligonoEjemplo6 extends JFrame implements Runnable{
 private boolean dyed =true;  
 private int ofra=0;
 private int[] gg =new int [6];
 private int nPoints = 8;
       private int [][] pointx = new int [6][nPoints];
        private int [][] pointy = new int [6][nPoints];
        private int [] pontx = new int [nPoints];
        private int [] ponty = new int [nPoints];
        private double[][] angle = new double [8][3];
        private double [][] medio = new double[6][3];
private int[][] vertice0x1=new int[2][4];
private int[][] vertice1x1=new int[2][4];
private int[][] vertice2x1=new int[2][4];
private int[][] vertice3x1=new int[2][4];
private int[][] vertice4x1=new int[2][4];
private int[][] vertice5x1=new int[2][4];
private int[][] vertice6x1=new int[2][4];
/*
private int[] vertice0x2=new int[4];
private int[] vertice1x2=new int[4];
private int[] vertice2x2=new int[4];
private int[] vertice3x2=new int[4];
private int[] vertice4x2=new int[4];
private int[] vertice5x2=new int[4];
private int[] vertice6x2=new int[4];
*/
private int[][] vertice0y1=new int[2][4];
private int[][] vertice1y1=new int[2][4];
private int[][] vertice2y1=new int[2][4];
private int[][] vertice3y1=new int[2][4];
private int[][] vertice4y1=new int[2][4];
private int[][] vertice5y1=new int[2][4];
private int[][] vertice6y1=new int[2][4];
/*
private int[] vertice0y2=new int[4];
private int[] vertice1y2=new int[4];
private int[] vertice2y2=new int[4];
private int[] vertice3y2=new int[4];
private int[] vertice4y2=new int[4];
private int[] vertice5y2=new int[4];
private int[] vertice6y2=new int[4];
*/
private int[][] vertice0z1=new int[2][4];
private int[][] vertice1z1=new int[2][4];
private int[][] vertice2z1=new int[2][4];
private int[][] vertice3z1=new int[2][4];
private int[][] vertice4z1=new int[2][4];
private int[][] vertice5z1=new int[2][4];
private int[][] vertice6z1=new int[2][4];
/*
private int[] vertice0z2=new int[4];
private int[] vertice1z2=new int[4];
private int[] vertice2z2=new int[4];
private int[] vertice3z2=new int[4];
private int[] vertice4z2=new int[4];
private int[] vertice5z2=new int[4];
private int[] vertice6z2=new int[4];
*/
  // private int [] oldpointx = new int [nPoints];
    //   private int [] oldpointy = new int [nPoints];
private int s=3;
    private double teta1=0;
    private double teta2=0;
    private double teta3=0;
   private int o=1;
private boolean mov=true;
private Thread hilo;
public int y;
 public PoligonoEjemplo6(){
    super("Dibujo de Polígono");
        //PoligonoEjemplo6 panel = new PoligonoEjemplo6();
        JFrame panel =new JFrame();
       //add(panel);
        setSize(600, 600);
        setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // y=ye;
   angle[5][0]=-.5f;
    angle[5][1]=-.5f;
    angle[5][2]=-.5f;
    angle[1][0]=-.5f;
    angle[1][1]=.5f;
    angle[1][2]=-.5f;
    angle[2][0]=.5f;
    angle[2][1]=.5f;
    angle[2][2]=-.5f;
    angle[6][0]=.5f;
    angle[6][1]=-.5f;
    angle[6][2]=-.5f;
    angle[4][0]=-.5f;
    angle[4][1]=-.5f;
    angle[4][2]=.5f;
    angle[0][0]=-.5f;
    angle[0][1]=.5f;
    angle[0][2]=.5f;
    angle[3][0]=.5f;
    angle[3][1]=.5f;
    angle[3][2]=.5f;
    angle[7][0]=.5f;
    angle[7][1]=-.5f;
    angle[7][2]=.5f;

    medio[0][0]=0;
    medio[0][1]=0.5;
    medio[0][2]=0;

    medio[1][0]=0;
    medio[1][1]=-0.5;
    medio[1][2]=0;

    medio[2][0]=0.5;
    medio[2][1]=0;
    medio[2][2]=0;
    
    medio[3][0]=-0.5;
    medio[3][1]=0;
    medio[3][2]=0;
    
    medio[4][0]=0;
    medio[4][1]=0;
    medio[4][2]=-0.5;
    
    medio[5][0]=0;
    medio[5][1]=0;
    medio[5][2]=0.5;
    
        hilo =new Thread(this);
       hilo.start();
}
 void movecubo(){
//boolean [] g = new boolean [8];

    double nuevo1x,nuevo1y,nuevo1z;

    double nuevox,nuevoy,nuevoz;
    
               
 

//System.out.println("Nuevos angular");
   // if (teta<Math.PI){teta+=5*s;}else{teta=0;}
           teta1+= 0.5;  
           
          // o=(int)(teta)%20;
          // if (teta>35){o=1;}
          if(teta1==5){o=(int)((o%3));o++;teta1=0;}   
          
          //for(o=1;o<4;o++){
         // System.out.print("caso : "+o+"    y    , teta :"+teta1+"      ");
    switch(o)
    {
        //rotation x
           

        case 1:
            for (int i=0; i<6 ; i++)
            {
                nuevo1x=medio[i][0]*Math.cos(teta1)+medio[i][1]*Math.sin(teta1);
                nuevo1y=-medio[i][0]*Math.sin(teta1)+medio[i][1]*Math.cos(teta1);
                nuevo1z=medio[i][2];

                medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;

                      
}
           


            
        for (int i=0; i<8 ; i++)
        {

            nuevox=angle[i][0]*Math.cos(teta1)+angle[i][1]*Math.sin(teta1);
            nuevoy=-angle[i][0]*Math.sin(teta1)+angle[i][1]*Math.cos(teta1);
            nuevoz=angle[i][2];




            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        break;


        case 2:

            for (int i=0; i<6 ; i++)
            {
                nuevo1x=medio[i][0]*Math.cos(teta1)+medio[i][2]*Math.sin(teta1);
                nuevo1y=medio[i][1];
                nuevo1z=-medio[i][0]*Math.sin(teta1)+medio[i][2]*Math.cos(teta1);


               medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;

            
}
        for (int i=0; i<8 ; i++)
        {

            //rotation y
            nuevox=angle[i][0]*Math.cos(teta1)+angle[i][2]*Math.sin(teta1);
            nuevoy=angle[i][1];
            nuevoz=-angle[i][0]*Math.sin(teta1)+angle[i][2]*Math.cos(teta1);



            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        break;
        case 3:
            for (int i=0; i<6 ; i++)
            {

                nuevo1x=medio[i][0];
                nuevo1y=medio[i][1]*Math.cos(teta1)-medio[i][2]*Math.sin(teta1);
                nuevo1z=medio[i][1]*Math.sin(teta1)+medio[i][2]*Math.cos(teta1);

               medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;

            
            }

        for (int i=0; i<8 ; i++)
        {
            //rotation z

            nuevox=angle[i][0];
            nuevoy=angle[i][1]*Math.cos(teta1)-angle[i][2]*Math.sin(teta1);
            nuevoz=angle[i][1]*Math.sin(teta1)+angle[i][2]*Math.cos(teta1);




            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        break;
        default:
            break;
 }
//}
/*
    for (int i=0;i<8;i++){
        for (int j=0;j<3;j++){
        System.out.println(angle[i][j]*200+200);
    }
    }
   */ 
   // for(int h=0;h<6;h++){

   


}

    public void paint(Graphics g ) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int t=200;
        int q=200;
        int [][] combi=new int[24][4];

//1
combi[0][0]=0;
combi[0][1]=1;
combi[0][2]=2;
combi[0][3]=3;
//2
combi[1][0]=0;
combi[1][1]=1;
combi[1][2]=3;
combi[1][3]=2;
//3
combi[2][0]=0;
combi[2][1]=3;
combi[2][2]=1;
combi[2][3]=2;
//4
combi[3][0]=0;
combi[3][1]=3;
combi[3][2]=2;
combi[3][3]=1;
//5
combi[4][0]=0;
combi[4][1]=2;
combi[4][2]=1;
combi[4][3]=3;
//6
combi[5][0]=0;
combi[5][1]=2;
combi[5][2]=3;
combi[5][3]=1;
//7
combi[6][0]=1;
combi[6][1]=0;
combi[6][2]=3;
combi[6][3]=2;
//8
combi[7][0]=1;
combi[7][1]=3;
combi[7][2]=0;
combi[7][3]=2;
//9
combi[8][0]=1;
combi[8][1]=0;
combi[8][2]=2;
combi[8][3]=3;
//10
combi[9][0]=1;
combi[9][1]=3;
combi[9][2]=2;
combi[9][3]=0;
//11
combi[10][0]=1;
combi[10][1]=2;
combi[10][2]=0;
combi[10][3]=3;
//12
combi[11][0]=2;
combi[11][1]=1;
combi[11][2]=3;
combi[11][3]=0;
//13
combi[12][0]=2;
combi[12][1]=0;
combi[12][2]=3;
combi[12][3]=1;
//14
combi[13][0]=2;
combi[13][1]=0;
combi[13][2]=1;
combi[13][3]=3;
//15
combi[14][0]=2;
combi[14][1]=3;
combi[14][2]=1;
combi[14][3]=0;
//16
combi[15][0]=2;
combi[15][1]=0;
combi[15][2]=3;
combi[15][3]=1;
//17
combi[16][0]=2;
combi[16][1]=3;
combi[16][2]=0;
combi[16][3]=1;
//18
combi[17][0]=3;
combi[17][1]=2;
combi[17][2]=0;
combi[17][3]=1;
//19
combi[18][0]=3;
combi[18][1]=1;
combi[18][2]=0;
combi[18][3]=2;
//20
combi[19][0]=3;
combi[19][1]=1;
combi[19][2]=2;
combi[19][3]=0;
//21
combi[20][0]=3;
combi[20][1]=2;
combi[20][2]=1;
combi[20][3]=0;
//22
combi[21][0]=3;
combi[21][1]=0;
combi[21][2]=1;
combi[21][3]=2;
//23
combi[22][0]=1;
combi[22][1]=3;
combi[22][2]=0;
combi[22][3]=2;
//24
combi[23][0]=3;
combi[23][1]=0;
combi[23][2]=2;
combi[23][3]=1;


// 6*4=24

// 8*3=24

// 3*24=72
int [][] verticex1=new int [6][4];
int [][] verticey1=new int [6][4];
int [][] verticez1=new int [6][4];

for (int i=0;i<4;i++){
      for (int j=0;j<6;j++){  
      verticex1[j][i]=(int)(angle[constructor.vortex(constructor.plano(j,i),0)][0]*t+q);
      //vertice0x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][0]*t+q);
      verticey1[j][i]=(int)(angle[constructor.vortex(constructor.plano(j,i),0)][1]*t+q);
      //vertice0y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][1]*t+q);
      verticez1[j][i]=(int)(angle[constructor.vortex(constructor.plano(j,i),0)][2]*t+q);
      //vertice0z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][2]*t+q);
      }
  }
     /*     
      vertice1x1[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),0)][0]*t+q);
      //vertice1x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),1)][0]*t+q);
      vertice1y1[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),0)][1]*t+q);
      //vertice1y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),1)][1]*t+q);
      vertice1z1[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),0)][2]*t+q);
      //vertice1z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),1)][2]*t+q);
      
    vertice2x1[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][0]*t+q);
    //vertice2x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][0]*t+q);
    vertice2y1[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][1]*t+q);
    //vertice2y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][1]*t+q);
    vertice2z1[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][2]*t+q);
    //vertice2z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][2]*t+q);
    
      vertice3x1[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][0]*t+q);
      //vertice3x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][0]*t+q);
      vertice3y1[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][1]*t+q);
      //vertice3y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][1]*t+q);
      vertice3z1[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][2]*t+q);
      //vertice3z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][2]*t+q);
      
      vertice4x1[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][0]*t+q);
      //vertice4x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][0]*t+q);
      vertice4y1[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][1]*t+q);
      //vertice4y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][1]*t+q);
      vertice4z1[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][2]*t+q);
      //vertice4z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][2]*t+q);
      
      vertice5x1[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][0]*t+q);
      //vertice5x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][0]*t+q);
      vertice5y1[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][1]*t+q);
      //vertice5y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][1]*t+q);
      vertice5z1[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][2]*t+q);
      //vertice5z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][2]*t+q);
  
}
*/
    
     //     System.out.println("Para : "+combi[y][0]+","+combi[y][1]+","+combi[y][2]+","+combi[y][3]);
     // vertice2x[combi[y][0]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][0]),0)][0]*t+q);
     // vertice2x[combi[y][1]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][1]),1)][0]*t+q);
     // vertice2x[combi[y][2]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][2]),0)][0]*t+q);
     // vertice2x[combi[y][3]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][3]),1)][0]*t+q);
  
     // vertice2x[2]=(int)(angle[constructor1.vortex(constructor1.plano(2,2),0)][0]*t+q);
     // vertice2x[2]=(int)(angle[constructor1.vortex(constructor1.plano(2,2),1)][0]*t+q);
     // vertice2x[1]=(int)(angle[constructor1.vortex(constructor1.plano(2,1),0)][0]*t+q);
     // vertice2x[1]=(int)(angle[constructor1.vortex(constructor1.plano(2,1),1)][0]*t+q);
     // vertice2x[3]=(int)(angle[constructor1.vortex(constructor1.plano(2,3),0)][0]*t+q);
     // vertice2x[3]=(int)(angle[constructor1.vortex(constructor1.plano(2,3),1)][0]*t+q);
     
      //vertice3x[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][0]*t+q);
      //vertice3x[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][0]*t+q);
      //vertice4x[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][0]*t+q);
      //vertice4x[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][0]*t+q);
      //vertice5x[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][0]*t+q);
      //vertice5x[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][0]*t+q);
      //vertice6x[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),0)][0]*t+q);
      //vertice6x[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),1)][0]*t+q);
      
      
       
      //vertice2y[combi[y][0]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][0]),0)][1]*t+q);
      //vertice2y[combi[y][1]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][1]),1)][1]*t+q);
      //vertice2y[combi[y][2]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][2]),0)][1]*t+q);
      //vertice2y[combi[y][3]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][3]),1)][1]*t+q);
  
  
      //vertice2y[0]=(int)(angle[constructor1.vortex(constructor1.plano(2,0),0)][1]*t+q);
      //vertice2y[0]=(int)(angle[constructor1.vortex(constructor1.plano(2,0),1)][1]*t+q);
     // vertice2y[2]=(int)(angle[constructor1.vortex(constructor1.plano(2,2),0)][1]*t+q);
     // vertice2y[2]=(int)(angle[constructor1.vortex(constructor1.plano(2,2),1)][1]*t+q);
     // vertice2y[1]=(int)(angle[constructor1.vortex(constructor1.plano(2,1),0)][1]*t+q);
     // vertice2y[1]=(int)(angle[constructor1.vortex(constructor1.plano(2,1),1)][1]*t+q);
     // vertice2y[3]=(int)(angle[constructor1.vortex(constructor1.plano(2,3),0)][1]*t+q);
     // vertice2y[3]=(int)(angle[constructor1.vortex(constructor1.plano(2,3),1)][1]*t+q);
      //vertice3y[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][1]*t+q);
      //vertice3y[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][1]*t+q);
      //vertice4y[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][1]*t+q);
      //vertice4y[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][1]*t+q);
      //vertice5y[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][1]*t+q);
      //vertice5y[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][1]*t+q);
      //vertice6y[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),0)][1]*t+q);
      //vertice6y[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),1)][1]*t+q);
    
      
       
     // vertice2z[combi[y][0]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][0]),0)][2]*t+q);
     // vertice2z[combi[y][1]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][1]),1)][2]*t+q);
     // vertice2z[combi[y][2]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][2]),0)][2]*t+q);
    //  vertice2z[combi[y][3]]=(int)(angle[constructor1.vortex(constructor1.plano(2,combi[y][3]),1)][2]*t+q);
  
      //vertice2z[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][2]*t+q);
      //vertice2z[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][2]*t+q);
      //vertice3z[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][2]*t+q);
      //vertice3z[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][2]*t+q);
      //vertice4z[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][2]*t+q);
      //vertice4z[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][2]*t+q);
      //vertice5z[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][2]*t+q);
      //vertice5z[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][2]*t+q);
      //vertice6z[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),0)][2]*t+q);
      //vertice6z[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),1)][2]*t+q);
            
        
        /*
   for (int i=0;i<4;i++){
          
      vertice1x[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),0)][0]*t+q);
      vertice1x[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),1)][0]*t+q);
      vertice2x[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][0]*t+q);
      vertice2x[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][0]*t+q);
      vertice3x[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][0]*t+q);
      vertice3x[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][0]*t+q);
      vertice4x[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][0]*t+q);
      vertice4x[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][0]*t+q);
      vertice5x[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][0]*t+q);
      vertice5x[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][0]*t+q);
      vertice6x[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),0)][0]*t+q);
      vertice6x[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),1)][0]*t+q);
      
      vertice1y[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),0)][1]*t+q);
      vertice1y[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),1)][1]*t+q);
      vertice2y[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][1]*t+q);
      vertice2y[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][1]*t+q);
      vertice3y[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][1]*t+q);
      vertice3y[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][1]*t+q);
      vertice4y[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][1]*t+q);
      vertice4y[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][1]*t+q);
      vertice5y[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][1]*t+q);
      vertice5y[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][1]*t+q);
      vertice6y[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),0)][1]*t+q);
      vertice6y[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),1)][1]*t+q);
    
      vertice1z[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),0)][2]*t+q);
      vertice1z[i]=(int)(angle[constructor1.vortex(constructor1.plano(1,i),1)][2]*t+q);
      vertice2z[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),0)][2]*t+q);
      vertice2z[i]=(int)(angle[constructor1.vortex(constructor1.plano(2,i),1)][2]*t+q);
      vertice3z[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),0)][2]*t+q);
      vertice3z[i]=(int)(angle[constructor1.vortex(constructor1.plano(3,i),1)][2]*t+q);
      vertice4z[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),0)][2]*t+q);
      vertice4z[i]=(int)(angle[constructor1.vortex(constructor1.plano(4,i),1)][2]*t+q);
      vertice5z[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),0)][2]*t+q);
      vertice5z[i]=(int)(angle[constructor1.vortex(constructor1.plano(5,i),1)][2]*t+q);
      vertice6z[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),0)][2]*t+q);
      vertice6z[i]=(int)(angle[constructor1.vortex(constructor1.plano(6,i),1)][2]*t+q);
            
        }
EL PRINCIPIO DE LINEA ES VERTICE0X1 Y EL FINAL DE LINEA ES VERTICE0X2
*/
Polygon []poligono = new Polygon[6];
//for(int y=0;y<2;y++){
for (int j=0;j<6;j++){
poligono[j]=new Polygon(verticex1[j],verticey1[j], 4);
}
/*
poligono[1]=new Polygon(vertice1x1,vertice1y1, 4);
poligono[2]=new Polygon(vertice2x1,vertice2y1, 4);
poligono[3]=new Polygon(vertice3x1,vertice3y1, 4);
poligono[4]=new Polygon(vertice4x1,vertice4y1, 4);
poligono[5]=new Polygon(vertice5x1,vertice5y1, 4);
*/
//}
       
      for (int itv=0; itv <6; itv++) {
        
            if (medio[itv][2]>0){

              
                    switch(itv){
         case 0:
                     g2d.setColor(Color.BLUE);
                         g2d.fillPolygon(poligono[0]);
                       // Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                   break;
        case 1:

                        g2d.setColor(Color.GREEN);
                         g2d.fillPolygon(poligono[1]);
                         //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                        //g2d.fillPolygon(poligono[iw]);
                    break;
         case 2:

                        g2d.setColor(Color.ORANGE);
                        g2d.fillPolygon(poligono[2]);
                       // Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                        //g2d.fillPolygon(poligono[iw]);
                    break;
         case 3:

                        g2d.setColor(Color.YELLOW);
                         g2d.fillPolygon(poligono[3]);
                        //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                    break;
                       

    case 4:

                        g2d.setColor(Color.RED);
                        g2d.fillPolygon(poligono[4]);
                         //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                    break;

    case 5:

                        g2d.setColor(Color.BLACK);
                        g2d.fillPolygon(poligono[5]);
                         //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                    break;
                   
                   

            }
            }
        
              // g2d.fillPolygon(poligono[itv]);         
    }
    /*
                  for(int itv=0;itv<6;itv++){
                    g2d.fillPolygon(poligono[itv]);
                  }
                  /*
                 g2d.fillPolygon(poligono0);

                 g2d.fillPolygon(poligono1);
                 g2d.fillPolygon(poligono2);
                 g2d.fillPolygon(poligono3);
                 g2d.fillPolygon(poligono4);
                 g2d.fillPolygon(poligono5);
                 
                 */
           
        
         
                 
                 



}


@Override
public void run(){
    
   while(mov){

    movecubo();
           // Polygon poligono2 = new Polygon( pointx, pointy, 8 );

 
            try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
throw new RuntimeException(e);
        }
        repaint();
    }
   }


}

public class Mfederico {
     
    public static void main(String[] args)  {
       //setLocationRelativeTo(null);
        /*SwingUtilities.invokelater(new Runnable() {
          @Override
          public void run(){
            new PoligonoEjemplo6();
          }
      });
      */
     // Scanner sc=new Scanner(System.in);
     // System.out.println ("introduzca la permutacion");
     // int number=sc.nextInt();
        PoligonoEjemplo6 poligonoejemplo6 =new PoligonoEjemplo6();


    }
}


/*
        JFrame frame = new JFrame("Dibujo de Polígono");
        PoligonoEjemplo6 poligonoejemplo6 = new PoligonoEjemplo6();
        frame.add(poligonoejemplo6);
        frame.setSize(600, 600);
        frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       hilo =new Thread(this);
       hilo.start();
       /*
        while (true) {
            poligonoejemplo6.movecubo();
            poligonoejemplo6.repaint();
            Thread.sleep(10);
        }
        */
            //movimiento.mover(true,teta, 1,o);

        //PoligonoEjemplo6 panel = new PoligonoEjemplo6();

        
    
    
