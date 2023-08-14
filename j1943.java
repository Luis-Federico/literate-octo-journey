//package dk.ange.octave;
//import dk.ange.octave.exception.*;
//import dk.ange.octave.exec.*;
//import dk.ange.octave.io.*;
//import dk.ange.octave.type.*;
//import dk.ange.octave.util.*;
//import dk.ange.octave.*;

import java.util.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FilenameFilter;
import java.text.DecimalFormat;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
//import java.awt.List;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
//import javax.script.ScriptEngine;

 //problem: una matriz de rango 5 no simetrica con 2 filas dependientes y 3 columnas dependientes no la hace

 class JOptionPaneConTimeOut
{
    private static JOptionPane option = new JOptionPane("",
            JOptionPane.INFORMATION_MESSAGE);

    private static JDialog dialogo = null;

    /**
     * Solo hace caso a padre la primera vez que se llama a este método. La
     * llamada a este metodo se queda bloqueada hasta que el usuario cierra el
     * JOptionPane o pasa el timeout.
     * 
     * @param padre
     * @param texto
     * @param titulo
     * @param timeout
     *            En mili segundos
     */
    public static void visualizaDialogo(String texto,
            String titulo, final long timeout)
    {
        option.setMessage(texto);
        if ( null == dialogo )
        {
            dialogo = option.createDialog(null, titulo);
        }
        else
        {
            dialogo.setTitle(titulo);
        }

        Thread hilo = new Thread()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(timeout);
                    if ( dialogo.isVisible() )
                    {
                        dialogo.setVisible(false);
                    }
                    
                }
                catch ( InterruptedException e )
                {
                    e.printStackTrace();
                }
            }
        };
        hilo.start();

        dialogo.setVisible(true);
    }
}
class Dibuja{
public static void Matriz (int mat3[][], int number1)
{

/*OtroPaso.Limpieza();*/
System.out.println("   ");
int count=5+number1;
 System.out.print(String.format("\033[%dA",count));
 System.out.print("\033[2K");

System.out.print("    ");
for(int pa=0;pa<number1;pa++)
{
System.out.print(" "+pa+" ");
}
System.out.println(" ");
System.out.print("   "+(char)9487);
for(int pu=0;pu<number1*3;pu++)
{
System.out.print((char)9473);
}
System.out.println((char)9491);

for(int i3=0;i3<number1;i3++)
{
System.out.print("  "+i3+(char)9475);
for(int j3=0;j3<number1;j3++)
{
if (mat3[i3][j3]==1)
{
for(int pi=0;pi<3;pi++)
{
System.out.print((char)9608);
}
}else{
for(int pi=0;pi<3;pi++)
{
System.out.print(" ");
}
}
}
System.out.println((char)9475);

}
System.out.print("   "+(char)9495);
for(int pu=0;pu<number1*3;pu++)
{
System.out.print((char)9473);
}

System.out.println((char)9499);

}

}
class j1943 extends JPanel implements ActionListener
{
static int dormir=500;
static int x1,y1,z1;
  JButton boton1=new JButton( "+ speed" );
  JButton boton2=new JButton( "- speed" );
  JButton boton3=new JButton( "stop" );
  JButton boton4;
 
static String Archivo;
	public static void presionaenter() {
		String seguir;
	    Scanner teclado=new Scanner(System.in);
	    System.out.println("Press enter...");
	    
	        seguir=teclado.nextLine();
	   
	}
	public static void ceromat() {
		for(int i3=0;i3<number1;i3++)
	{
	for(int j3=0;j3<number1;j3++)
	{
	mat3[i3][j3]=0;
	}
	}
}
	public static void Recuperar() {
		int numero=1;
	     n=Entrada.entro(numero);
	     number1=(int)n;
	     numero=2;
	     m=Entrada.entro(numero);
	     number2=(int)m;
	    for(int i=1;i<=number1;i++)
	      {
	          for(int j=1;j<=number2;j++)
	          {
	             numero=numero+1;
	            
	                
	              mat2[i][j]=Entrada.entro(numero);
	             
	            }
	             //System.out.println(" ");
	            }
	             for(int i=0;i<number1;i++)
	      {
	          for(int j=0;j<number2;j++)
	          {
	           
	            
	                
	              mat1[i][j]=mat2[i+1][j+1];
	             //System.out.print(mat1[i][j]+" ");
	            }
	         //System.out.println(" ");
	    }
	    
	}
	static void Matriz1(int mat2[][],int number1)
	{
	DecimalFormat df=new DecimalFormat("###");
	for (int i=0;i<number1;i++)
{
for (int j=0;j<number1;j++)
{
myCanvas.drawString(" "+df.format(mat2[j][i]),255+i*65,343+j*16);
}
}
}
  static void Reload(int terminus[][],int Combinaciones, double gracias,double gaseosa, double gass,boolean espana)
  {
  DecimalFormat ff=new DecimalFormat("###");
  
		 myCanvas1.setFont(new Font("helvetica", Font.BOLD, 14));
        myCanvas1.setForegroundColor(Color.red);
        if (espana==true)
        {
for (int i=0;i<Combinaciones;i++)
{
for (int j=0;j<Combinaciones;j++)
{
myCanvas1.drawString(" "+terminus[j][i],100+i*65,32+j*16);
}
}
}

myCanvas1.drawString("This, reloaded is: "+gracias,650,200);
myCanvas1.drawString("The adjoint determinant was: "+gaseosa,650,250);
myCanvas1.drawString("The original determinant was: "+gass,650,300);
}
	static void Matriz(boolean prime,int mat3[][],int mat4[][],int mat5[][],int mat6[][],int number1,int rango1,int Hola[],boolean nulo,boolean miedo,double gas,double gaseosa,boolean adjunta)
    {
		
		int xPos;
		int yPos;
		int longx;
		int longy;
		int longx2;
		int longy2;
		DecimalFormat df=new DecimalFormat("###");
        if(prime==true)
        {
        myCanvas.setFont(new Font("helvetica", Font.BOLD, 14));
        myCanvas.setForegroundColor(Color.red);

        myCanvas.drawString("Lucar, a region of space...", 20, 30);
        myCanvas.wait(1000);

        //myCanvas.setForegroundColor(Color.black);
        myCanvas.drawString("...in the time.", 60, 60);
        myCanvas.wait(500);
        }
        myCanvas.setForegroundColor(Color.black);
        for(int h=0;h<=number1;h++) {
        myCanvas.drawLine(h*20+100, 100, h*20+100, number1*20+100);
        myCanvas.drawLine(100,h*20+100,number1*20+100,h*20+100);
	}
	if (adjunta==true)
	{
	    for(int h2=0;h2<=number1;h2++) {
			myCanvas.drawLine(h2*15+325,150,h2*15+325,number1*15+150);
			myCanvas.drawLine(325,h2*15+150,number1*15+325,h2*15+150);
		}
	}
	      xPos = 11;
        yPos=11;
        longx=250;
        longy=40;
        longx2=100;
        longy2=100;
       
        Rectangle circ=new Rectangle(xPos,yPos,14,14);
        Rectangle rect = new Rectangle(xPos, yPos, 19, 19);
        Rectangle rect1 = new Rectangle(xPos, yPos, longx, longy);
        Rectangle rect2 = new Rectangle(xPos, yPos, longx2, longy2);
        /*myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(220, 100, 370, 40);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.green);
        myCanvas.drawLine(290, 10, 320, 120);
        myCanvas.wait(1000);*/
        /*myCanvas.setForegroundColor(Color.white);
        xPos = 50;
        yPos=340;
        Rectangle recto = new Rectangle(xPos, yPos, 400, 19);
        
        recto.setLocation(50,340);*/
        
        if (miedo==false){
        if (Hola[rango1]!=0)
        {
        myCanvas.setForegroundColor(Color.white);
     rect2.setLocation(40,450);
     myCanvas.fill(rect2);
        //myCanvas.setForegroundColor(Color.white);
        //myCanvas.drawString("                                                         ",50,340+number1*17);
        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawString("Computing the",50,340+number1*17 );
        myCanvas.drawString(df.format(Hola[rango1]),60,360+number1*17);
        myCanvas.drawString(" minors of range: ",45,380+number1*17);
        myCanvas.drawString(df.format(rango1), 70, 400+number1*17);
	}
	}else{
		 myCanvas.setForegroundColor(Color.black);
		myCanvas.drawString("The drawed in blue is dependent !",50,300);
	}


        // the shape to draw and move
        
        if (nulo==true)
        {
			        myCanvas.setForegroundColor(Color.blue);
				 }else{
		        myCanvas.setForegroundColor(Color.red);
			}
for(int i = 0; i < number1; i ++) {
	for(int j=0;j<number1;j++) {
		 xPos=i*20+101;
            yPos=j*20+101;
            rect.setLocation(xPos, yPos);
		if(mat3[j][i]==1){
            myCanvas.fill(rect);
		}else{
            /*myCanvas.wait(10);*/
            myCanvas.erase(rect);
		}
           
        }
	}
	//tengo que definir rect como circle y llamarla circo
	/*if (nulo==true)
        {
			        myCanvas.setForegroundColor(Color.yellow);
				 }else{
		        myCanvas.setForegroundColor(Color.green);
			}
			 */
			 if (adjunta==true)
			 {
			  myCanvas.setForegroundColor(Color.white);
	for(int i = 0; i < number1; i ++) {
	for(int j=0;j<number1;j++) {
		 xPos=i*15+326;
            yPos=j*15+151;
           
		//if(mat4[j][i]==1){
			 circ.setLocation(xPos, yPos);
            myCanvas.fill(circ);
		//}
		/*else{
            /*myCanvas.wait(10);
            myCanvas.erase(circ);
		}*/
           
        }
	}
	 myCanvas.setForegroundColor(Color.orange);
	for(int i = 0; i < number1; i ++) {
	for(int j=0;j<number1;j++) {
		 xPos=i*15+326;
            yPos=j*15+151;
            if (mat5[j][i]==1){
				circ.setLocation(xPos, yPos);
				myCanvas.fill(circ);
			}
		}
	}
}
        // at the end of the move, draw once more so that it remains visible
        
        myCanvas.setForegroundColor(Color.white);
     rect1.setLocation(320,80);
     myCanvas.fill(rect1);
    myCanvas.setForegroundColor(Color.black);
   
		myCanvas.drawString("Determinant= "+gas,325,100);

    /**
     * Simulate two bouncing balls
     */
     if ((gaseosa!=0) && (adjunta==true)){
		 myCanvas.setForegroundColor(Color.white);
     rect1.setLocation(330,290);
     myCanvas.fill(rect1);
      myCanvas.setForegroundColor(Color.black);
   
		myCanvas.drawString("Attached determinant with formula= "+gaseosa,270,310);
/** Escribir matriz
*/
myCanvas.setForegroundColor(Color.black);
for (int i=0;i<number1;i++)
{
for (int j=0;j<number1;j++)
{
myCanvas.drawString(" "+mat6[j][i],500+i*65,132+j*16);
}
}
  }
}
       static boolean prime=false;
       static boolean adjunta;
       static boolean nulo;
       static Canvas myCanvas1;
	   static Canvas myCanvas;
	    static int opciones;
	    static int elementos;
	    static int N;
	    static int x;
	    static int poro;
	    static int sale;
	    static String salida;
	static boolean cuadrada;
	 static boolean nombre=false;  
	               static int nueva[][]=new int [200][200];
	    static int rango1;    
	    /* public int matriz[]=new int[40400]; */
	     static double det;
	     
	  static int mat1[][]=new int [400][400];
	  static int mat2 [][]=new int [400][400];
	static int mat3[][]=new int [400][400];
	  static int mat4[][]=new int [400][400];
	  static int mat5[][]=new int [400][400];
	  static double gaseosa;
	  static int n,m;
	static int number1, number2;
static boolean miedo;
//static String Koko;
	 /* public int setDatos(int opciones){
	    /* opciones=Integer.parseInt(JOptionPane.showInputDialog("ingrese las opciones"));
	     
	     return opciones;
	       
	       
	       return opciones;*/
	    
	    /* public static int Entrada()
	      {
	          
	         
	        /*Creaperm.Perm(N);/
	        
	       /* for (i=1;i<24;i++){
	        JOptionPane.showComfirmDialog(null, "MATRIZ: "+matriz[i]);
	    }*/
	       
  
 public j1943() {

   
       
     
    boton4=new JButton("Finalizar");
    setLayout(null);
    
    boton4.setBounds(300,250,100,30);
    boton1.setBounds(100,100,95,30);
    boton2.setBounds(200,100,95,30);
    boton3.setBounds(300,100,95,30);
    add( boton1);
    add( boton2);
    add( boton3);
    add( boton4);
     boton4.addActionListener(this);
     boton3.addActionListener(this);
     boton2.addActionListener(this);
     boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton4) {
        System.out.println("Continue ...");
            System.exit(0);
        }
       
        if (e.getSource()==boton3) {
           System.out.println("STOP");
            
            System.exit(0);
        }
        
        if (e.getSource()==boton2) {
            y1=y1+1;
            dormir=dormir+100;
        }
        
        
        if (e.getSource()==boton1) {
        if(dormir>=100)
        {
            x1=x1+1;
            dormir=dormir-100;
        }
        }
       // marco.add(panel2, BorderLayout.SOUTH);
        }
	        public static void main (String [] args)
	        {
	        
	        int mat7[][]=new int [400][400];
				int mat6[][]=new int [400][400];
	           int r=0;
	            int i,j,fact;
	            int loc,l;
	      int Combinaciones;   
	      double luis1=1;
	          int teclo; 
	            /*float matcoef1 []= new float[10];
	            int matcoef2 []= new int [10];
	            float matterm[]=new float[15];
	    
	        /*float [][] mat1  =new float[10][10];*/
	        
//Set<victor> int s1 = new HashSet<victor>();
  //           Set<victor> int s2 = new HashSet<victor>();
	 Set<Integer> s1 =new HashSet<>();
	 Set<Integer> s2 =new HashSet<>();
	// Set<Integer> s3 =new HashSet<>();
	// Set<Integer> s4 =new HashSet<>();
	  int ww1=0;
	   int ww2=0;
int wg1[]=new int [11];
int wg2[]=new int [11];
	// int wf1[]=new int[11];
	// int wf2[]=new int[11];
	 int g1,g2;
	         boolean rangomayor=false;   
	        int federo;
	        int cantidadnulos[]=new int[67600];
	            int signo[]=new int[67600];
	           
	           int matriz[]=new int[260];
	           int menornulo[]=new int[67600];
int Hola[]=new int[10];

	            int A[][][]=new int[67600][9][9];
	            int B[][][]=new int[67600][9][9];
	          
	            double determina[][]=new double[67600][9];
	            int determinaI[][]=new int[67600][9];


	            boolean p1;
	       
	          boolean ana=true; 
	           
	          int menor=0;
	            
	            int combinatoria;
	            
	            String sale1;
	            String sale2;
	            char saleA;
	            char saleB;
	            boolean cono=true;
	            
	            int rango;
	            
	            
	          
	            int mat;
	            int o;
	            int determinacion;
	            int detI;
	        
	           int r2;
	          
	       j1943 panel = new j1943();
	       
	     
	      Scanner sc = new Scanner(System.in);
	      /**
 * Muestra un JOptionPane con un timeout para que se cierre automaticamente.
 * 
 * @author chuidiang
 * 
 */
JOptionPaneConTimeOut.visualizaDialogo("by Luis Federico Berruezo","MATRIX",5000);
//option.setMessage("Wellcome to the matrix program");
//dialogo = option.createDialog(null," Your decision ...");
//hilo.start(5000);
 //dialogo.setVisible(true);
//Object valor = option.getValue();
//dialogo.setTitle(titulo);
//titulo="Your ddecision..."
	       /* System.out.println("Wellcome to the matrix program");
	        System.out.println("IMPORTANT !:");
	        System.out.println("All the inputs of this program have to be enters numbers");
	        System.out.println( "Graphics? 1-yes, another number-no");
	       int fin=sc.nextInt();*/
	       int fin=1;
	        /*i tenia que ser number3*/
	        
    JFrame ventana = new JFrame();
    
    ventana.getContentPane().add( panel,BorderLayout.CENTER );
    
    ventana.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ) {
	System.exit( 0 );
      }
    } );
    
    ventana.setSize( 500,300 );
    ventana.setTitle( "Matrix tridimensional" );
    ventana.setVisible( true );
	        try{
	        Entrada.CreaMatriz();
	    }catch(IOException e){
	        e.printStackTrace();
	    }
	    Recuperar();
	   cuadrada=Entrada.entra();
	   nombre=Entrada.nombrar();
	   if (nombre==true)
	   {
     Archivo=Entrada.nombramiento();
     }
//cuadrada=true;
/*String number=JOptionPane.showInputDialog("Enter the dimension");
int number0=Integer.parseInt(number);
number1=number0;
number2=number0;
n=number1;
m=number2;
 for(i=0;i<n;i++)
	        {
	            for(j=0;j<m;j++)
	            {

	            	mat1[i][j]=(int)(Math.random()*20-10);

	           
	               
	             
	            }
	        }
	        */
	       // Koko=matrizes.matrizas(mat1);
	        
	for(i=0;i<mat1.length;i++)
	{
	for(j=0;j<mat1[i].length;j++)
	{
	mat2[i][j]=mat1[i][j];
	}
	}
	 if (fin==1){
	     myCanvas = new Canvas("MATRIX", 1200, 600);
        myCanvas.setVisible(true);
	     }
	Matriz1(mat2,number1);
	luis1=Determinantes.det(number1,mat2);
	/* OtroPaso.PresionaEnter();
	OtroPaso.Limpieza();
	FormatoMatriz.Salida(mat2,number1,number2);
	OtroPaso.PresionaEnter();
	OtroPaso.Limpieza();*/
	   /* La condicion de que sea cuadrada se ponia aqui, hasta antes del braket del main*/
	/*System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");*/
	    

	        /*System.out.println("Introduce la longitud de las permutaciones (menor que 9):");*/
	    /*    N=input.nextInt();*/
	  
	/*bloque 3*/
	            
	        rango1=number1;
	         /*int i1,i2;
	           for (i1=0;i1<number1;i1++)
	          {
	              for(i2=0;i2<number1;i2++)
	              {
	/* 
	              nueva[i1][i2]=mat1[i1][i2];
	            }
	        }
	        
	        determina[menor][rango1]=Determinante.det(rango1,nueva);
	det=determina[menor][rango1];
	       
	         System.out.println("El determinante total es: " + det);

	     if(det!=0)
	        { 
	          
	            System.out.println("El rango es: " + rango1);
	              
	                   determinaI[menor][rango1]=Inversas.Salida(rango1,nueva);
	detI=determinaI[menor][rango1];
	System.out.println("El determinante total de la inversa es: " + detI);
	                  
	           
	        }
	          else
	    {
	    System.out.println("El rango no es: " + rango1);

	    }

	/* fin bloque 3*/


	     
	    
	   /*   rango1=rango1-1; */

menor=0;


	         while(rango1>=2)
	         {
				 /*System.out.println("Rango menores:"+rango1);*/
		
	          
	      federo=0;
	          elementos=number1;
	          opciones=rango1;
	        
		 
	          if (opciones==10){
	 Combinaciones=1;
	matriz[1]=0;
	}
	else
	{
	            Combinaciones=Combinatoria.Combinaciones(elementos, opciones);
	 



	     int Total=Combinatoria.Total(opciones);
	       salida="";
	       int q=0;
	       int h=0;
	       sale=0;
	       
	          while(sale<Total)     
	          {
	               h=h+1;
	       /*for (h=0;h<=j2;++h){
	       /*ESTE CONTADOR TIENE QUE SER EN BASE M     */
	       /*i=50;                                     */
	       /* String base = Int.toString(i,elementos); */
	       /*salida=Integer.toString(h,elementos);*/
	       
	       /* ESTO ES LO QUE HAY QUE DEJAR*/
	       
	       salida=Integer.toString(h);
	      
	         sale=h; 
	         
	          p1=Combina.Combo(opciones,sale,salida);
	         
	       


	                    if (p1==true) {
	                       q=q+1;
	                    matriz[q]=sale;
	                   
	               }   
	           
	           }
	          /* ESTO ERA LO QUE HAY QUE DEJAR*/
	 }       
	 Hola[rango1]=Combinaciones*Combinaciones;
	        /*System.out.println ("Hay "+ Hola[rango1]+" menores ");*/
	      /* int salefila;
	       int salecolumna;
	       int salefila1;
	       int salecolumna1;
	       int contador3=0;
	int contador4=0;
	* */
	            for(i=1;i<Combinaciones+1;i++)
	            {
	                sale1=String.valueOf(matriz[i]);
	               
	            for(j=1;j<Combinaciones+1;j++)
	            {
	                sale2=String.valueOf(matriz[j]);
	               
	               

	ceromat();
	                  if (opciones==10){
	sale1="9876543210";
	sale2="9876543210";
	}
/*	for (g1=0;g1<number1;g1++)
				{			 
	s3.add(g1);				  
s4.add(g1);	
	}  
	   
	 for (g1=0;g1<rango1;g1++)
	 {
		 salefila=sale1.charAt(g1);
		 salefila1=Character.getNumericValue(salefila);
		 s3.remove(salefila1);
		  for(g2=0;g2<rango1;g2++)
	                    {
							salecolumna=sale2.charAt(g2);
							
	salecolumna1=Character.getNumericValue(salecolumna);
	s4.remove(salecolumna1);
	
}
}
contador3=0;
contador4=0;
for (g1=0;g1<number1;g1++)
{
	if (s3.contains(g1))
	{
		
	wf1[contador3]=g1;
	contador3=contador3+1;
}
}
		for (g2=0;g2<number1;g2++)
		{
			if (s4.contains(g2))
			{
				
wf2[contador4]=g2;
contador4=contador4+1;
}
}
for (g1=0;g1<number1;g1++)
{
	for(g2=0;g2<number1;g2++)
	{
		mat5[g1][g2]=0;
	}
}

	for ( g1=0;g1<contador3;g1++)
	{
		for(g2=0;g2<contador4;g2++)
		{
	mat5[wf1[g1]][wf2[g2]]=1;
	System.out.println(wf1[g1]+"+"+wf2[g2]);
}
}
*/
s1.clear();
s2.clear();
	for (g1=0;g1<number1;g1++)
				{			 
	s1.add(g1);				  
	s2.add(g1);
	}       
	                for (g1=0;g1<rango1;g1++)
	                {
	                     saleA=sale1.charAt(g1);
	                     A[menor][rango1][g1]=Character.getNumericValue(saleA);
	                     
	                   s1.remove(A[menor][rango1][g1]);
	                    for(g2=0;g2<rango1;g2++)
	                    {
	                        saleB=sale2.charAt(g2);
	                        B[menor][rango1][g2]=Character.getNumericValue(saleB);
	                 s2.remove(B[menor][rango1][g2]);
	                /**/
	                nueva[rango1-g1-1][rango1-g2-1]=mat1[A[menor][rango1][g1]][B[menor][rango1][g2]];
	               
	               mat3[A[menor][rango1][g1]][B[menor][rango1][g2]]=1;
	               
	            }
	           
	        }
	        determina[menor][rango1]=Determinantes.det(rango1,nueva);
//determina[menor][rango1]=Determinante.determin(nueva);
	      det=determina[menor][rango1];
	      //luis1=det;
	// System.out.println("The entire determinant is : " + det+"         ");

// Para cada fila (complementario de s1) solo las columnas (complementario de s2) es la matriz mat4
	if (adjunta==true)
{
	for (g1=0;g1<number1;g1++)
{
	if (s1.contains(g1))
	{
		
	ww1=g1;
	
}
}
		for (g2=0;g2<number1;g2++)
		{
			if (s2.contains(g2))
			{
				
ww2=g2;

}
}
for (g1=0;g1<number1;g1++)
{
	for(g2=0;g2<number1;g2++)
	{
		mat5[g1][g2]=0;
		mat4[g1][g2]=1;
		
	}
}

	
	//mat4[ww1[g1]][ww2[g2]]=1;
	//System.out.println(ww1+"+"+ww2);
	mat5[ww1][ww2]=1;
	mat6[ww1][ww2]=(int) det;

}



	/* bloque x*/
	


	/*FormatoMatriz.Salida(nueva,rango1,rango1);*/

	 
	        
	

	/*bloque 6*/
	
	    if((luis1!=0)&&(ana==true)){
			nulo=false;
			rangomayor=true;
           if(ana==true){	
	r=rango1;
	ana=false;
	}
	          /*determinaI[menor][rango1]=Inversas.Salida(rango1,nueva);
	detI=determinaI[menor][rango1];
	System.out.println("El determinante total de la inversa es: " + detI);*/
	           }
	           else
	           {
				if (luis1!=0){
					nulo=false;
					}else{   
	menornulo[federo]=menor;
	federo=federo+1;
			nulo=true;	   
		
		}
	}
// gaseosa=Determinante.det(number1,mat6);
			if (fin==1){	
				miedo=false;
				if (cono=false){Hola[rango1]=0;}
				prime=false;
		Matriz(prime,mat3,mat4,mat5,mat6,number1,rango1,Hola,nulo,miedo,det,0,adjunta);	 
		cono=false;
		prime=false;
			} else{
				Dibuja.Matriz(mat3,number1);
			}
		 
	    /*bloque 6*/
	
	try{
	Thread.sleep(dormir);
	}catch(Exception e){
	System.out.println(e);
	    }
menor=menor+1;  	    
}	    
//gaseosa=Determinante.det(number1,mat1);

//determina[menor][rango1]=Determinante.det(nueva,rango1);
//det=Determinante.determin(mat1);
det=Determinantes.det(rango1,mat1);
			//	gaseosa=Math.pow(det,number1-1);
if (fin==1){	
				miedo=false;
				prime=false;
		Matriz(prime,mat3,mat4,mat5,mat6,number1,rango1,Hola,nulo,miedo,det,0,adjunta);	   
			} else{
				Dibuja.Matriz(mat3,number1);
			}
}	        
	     
	cantidadnulos[rango1]=federo;        
	/*Aqui acaba de hacer todos los menores*/
	      
	/*rango1=rango1-1;*/
	
	
	rango1=rango1-1;

if (rangomayor==true){
JOptionPaneConTimeOut.visualizaDialogo("Adjoint matrix will be computer now...","MATRIX",5000);

//JOptionPane.showMessageDialog(null,"Attached matrix will be computer now...");
	/*System.out.println("Attached matrix: 1-yes, another number-no?");
	int tiempo=sc.nextInt();*/
	int tiempo=1;
	/*try{
	Thread.sleep(2000);
	}catch(Exception e){
	System.out.println(e);
	    }
	    */
	if(tiempo!=1)
	{
			rango1=1;
			//rangomayor=false;
	}	
	//hay que comprobar si esta variable est{a bien definida aqui o dentro del braquet anterior
		else{rangomayor=false;adjunta=true;}
		}
		else{if (rango1==number1-2){rango1=1;}}
		
}

	    
	/* fin del hacer mientras rango1>2 */

/*System.out.println("");
System.out.println("");*/
//	System.out.println("The range is : "+r+"                              ");
	/* fin de la condicion cuadrada*/
	
	if(r!=number1)
	{
		ceromat();
		
	 Dependientes.depende(rango1,number1,mat1);
				   
				  int w1;
				  int con;
				   boolean q3;
				   for(w1=0;w1<number1;w1++){
					q3=Dependientes.filas(w1);
					
					   
						   for (con=0;con<number1;con++){
							  if(q3==true){
							   mat3[w1][con]=1;
							}
						   }
					   }
						   for(w1=0;w1<number1;w1++){
					q3=Dependientes.columnas(w1);
					
					 for (con=0;con<number1;con++){
							 if (q3==true){ 
							   mat3[con][w1]=1;
							}
						   }
					   }
						 if (fin==1){	
							 nulo=true;
							 
							 miedo=true;
					prime=false;		 
		Matriz(prime,mat3,mat4,mat5,mat6,number1,rango1,Hola,nulo,miedo,det,0,false);	
		JOptionPane.showMessageDialog(null,"This is the end of the program.");
		System.exit(0);
			} else{
				Dibuja.Matriz(mat3,number1);
			}
							   
					   
				   
	}
	// matA=mat1;
	
	/*String matA="[";
	for(int ellos=0;ellos<number1;ellos++)
	{
	for(int ellas=0;ellas<number1;ellas++)
	{
	String L=String.valueOf(mat1[ellos][ellas]);
matA=matA+" "+L;
}
if(ellos<number1-1)
{
matA=matA+";";
}
}
matA=matA+"]";
String funcion="x*x";
String a="0";
String b="1";
*/
//int religion;
//OctaveEngine octave =new OctaveEngineFactory().getScriptEngine();
//octave.put(a,new OctaveDouble());
//int matrix[][]=new int [3][3];
//octave.put("fun",new OctaveString(funcion));
//octave.put("0",Octave.scalar(0));
//octave.put("1",Octave.scalar(1));
//octave.eval("result=quad(fun,a,b);");
//no esta mal. Falta codigo
//OctaveDouble resultado =octave.get(OctaveDouble.class,"result");
//double integral=resultado.get(1);
//octave.close();
//Koko=matrizes.matrizas(mat1,number1);

gaseosa=Math.pow(luis1,number1-1);
for(int hola=0;hola<number1;hola++)
{
for(int adios=0;adios<number1;adios++)
{
mat7[hola][adios]=mat6[adios][hola];
}
}
// Ver cual es la matriz correcta!!!!
//FormatoMatriz.Salida(mat6,number1,number1);
det=Determinantes.det(number1,mat6);
//det=determinante(mat1);
/*if (gaseosa==det)
{System.out.println("exito");}
*/
if (fin==1){	
				miedo=false;
				prime=true;
		Matriz(prime,mat3,mat4,mat5,mat6,number1,rango1,Hola,nulo,miedo,det,gaseosa,adjunta);
		prime=false;
			} else{
				Dibuja.Matriz(mat3,number1);
			}
			boolean francisco=false;
			//int buenos=number1-1;
	//	JOptionPaneConTimeOut.visualizaDialogo("the range is : "+r+"... \n \n Attached determinant=(determinant)x... n-1 times ...x(determinant)","MATRIX",5000);	
			JOptionPane.showMessageDialog(null,"the range is : "+r+"... \n \n Adjoint determinant=(determinant)x... n-1 times ...x(determinant)");
			// JOptionPane.showMessageDialog(null,"Now, Give me a name for the adjoint matrix");
			
			if (nombre==false)
			{
			Archivo=JOptionPane.showInputDialog("Enter the name of the matrix");
			
			nombre=true;
			 }
			 do
			 {
			 try{
	 francisco=Archivar.Archivo(number1,number1,mat6,cuadrada,Archivo,1);
	   }catch(IOException e){
	        e.printStackTrace();
	    }
	    }while(francisco==false);
	/*System.out.println("");
	System.out.println("");
	System.out.println("Knowed what the range is : "+r);
	System.out.println("We can computing the determinant through the minors");
	System.out.println("Enter the range of the minors for to computing, please");
	int fines=sc.nextInt();
	*/
	//String number=JOptionPane.showInputDialog(null,"Do you want computing all the ranges?");
	
	// EL YES Y EL CANCEL NO ESTAN IMPLEMENTADOS
	
	int seleccion10 = JOptionPane.showOptionDialog(
   null,  // botonparental
   "Select option LESS  CANCEL", 
   "Compute all the ranges",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    // null para icono por defecto.
   null,   // null para YES, NO y CANCEL
   "NO");
  
	    if (seleccion10 != -1){
   // System.out.println("seleccionada opcion " + (seleccion + 1));
   /*if(seleccion10==0){vaya=1;}
   if (seleccion10==1){vaya=2;}
   if (seleccion10==2){vaya=3;}
*/
seleccion10=seleccion10+1;
}
int numb=number1-3;
if (seleccion10==2)
{ if (number1>=4)
{
	//List<String> ejemplolista = Arrays.asList();
String [] ejemplolisto=new String [11];
//List ejemplolista = new ArrayList<>();
String trewq;
	//String listaE;
	//String listaB="File "+0+" -> "+lista[0];
	//
	//for (int i=0;i<lista.length;i++){
	 //listaE="File "+i+" -> "+lista[i];
	 for(int qwert=2;qwert<=number1-2;qwert++)
	 {
	 
	 trewq=Integer.toString(qwert);
	 
      ejemplolisto[qwert]=trewq;
      }
      //String[] ejemplolisto = new String[ejemplolista.size()];
	Object num = JOptionPane.showInputDialog(
   null,
   "Range of the minors",
   "Your choice... Entire: "+numb,
   JOptionPane.QUESTION_MESSAGE,
   null,  // null para icono defecto
   ejemplolisto, 
   0);
	//String number=JOptionPane.showInputDialog(null,"Enter range of the minors to computing");
	//int fines=Integer.parseInt(number);
	for (int ij=0;ij<=number1;ij++){
	if (num==ejemplolisto[ij])
	{
	rango1=Integer.valueOf(ejemplolisto[ij]);
	
	}
	}
}else{System.exit(0);}
	}
	
	Set<Integer>Totalidad1=new HashSet<Integer>();
	
	Set<Integer>Totalidad2=new HashSet<Integer>();
	
	Set<Integer>Parcial1=new HashSet<Integer>();
	Set<Integer>Parcial2=new HashSet<Integer>();
	
	int terminus[][]=new int [400][400];
   int tractor[][]=new int [400][400];
   int Total=0;
   int q=0;
	       int h=0;
   int AA=0;
   int BA=0;
   int rutenio=0;
   int osmio=0;
   int ui=0;
	int uj=0;
   int ti[]=new int [9];
	int tj[]=new int [9];
	
	int contador1=0;
	int contador2=0;
	int signo1=0;
	int olula=0;
	int tijola=0;
	int lucar=0;
	int oi=0;
	int oj=0;
	boolean unavez=true;
	boolean espana;
	     double gracias;
	     
	     double gass=0;
	boolean chivatico=true;
	if (seleccion10==1)
{ 
 chivatico=true;
 rango1=number1-2;
}else{chivatico=false;}
if (number1>=4)
{
do{


// QUITAR LA REDEFINICION DE TODAS LAS VARIABLES DE ESTE TRIBUCLE


	
	menor=0;
	//rango1=fines;
	
	          elementos=number1;
	          opciones=rango1;
	          Combinaciones=Combinatoria.Combinaciones(elementos, opciones);
	 


	     Total=Combinatoria.Total(opciones);
	       salida="";
	       q=0;
	       h=0;
	       sale=0;
	        ui=0;
	        uj=0;
	
	
	
	          while(sale<Total)     
	          {
	               h=h+1;
	                salida=Integer.toString(h);
	      
	         sale=h; 
	         
	          p1=Combina.Combo(opciones,sale,salida);
	         
	       


	                    if (p1==true) {
	                       q=q+1;
	                    matriz[q]=sale;
	                   
	               }   
	           
	           
	          /* ESTO ERA LO QUE HAY QUE DEJAR*/
	 }       
	 Hola[rango1]=Combinaciones*Combinaciones;
	        /*System.out.println ("Hay "+ Hola[rango1]+" menores ");*/   
	            for(i=1;i<Combinaciones+1;i++)
	            {
	                sale1=String.valueOf(matriz[i]);
	               
	            for(j=1;j<Combinaciones+1;j++)
	            {
	                sale2=String.valueOf(matriz[j]);
	               
	               

	ceromat();
	
	for(rutenio=0;rutenio<number1;rutenio++)
	{
		Totalidad1.add(rutenio);
	}
	Parcial1.removeAll(Totalidad1);
	/*ui=0;*/
	for(osmio=0;osmio<number1;osmio++)
	{
		Totalidad2.add(osmio);
	}
	Parcial2.removeAll(Totalidad2);
	s1.clear();
	s2.clear();
	for (g1=0;g1<number1;g1++)
				{			 
	s1.add(g1);				  
	s2.add(g1);
	}     
	 for (g1=0;g1<rango1;g1++)
	                {
	                     saleA=sale1.charAt(g1);
	                     AA=Character.getNumericValue(saleA);
	                     Parcial1.add(AA);
	                     /*
	                    for(t=0;t<number1;t++)
	                    {
							if (AA!=t){
								ui=ui+1;
								ti[ui]=t;
								}
						}
						uj=0;*/
						 s1.remove(AA);
	                    for(g2=0;g2<rango1;g2++)
	                    {
	                        saleB=sale2.charAt(g2);
	                        BA=Character.getNumericValue(saleB);
	                     
	                     Parcial2.add(BA);
	                     /*   
	                    for(z=0;z<number1;z++)
	                    {
	                        if (BA!=z){
								uj=uj+1;
								tj[uj]=z;
								}                  
	                }*/
	                 s2.remove(BA);
	                nueva[rango1-g1-1][rango1-g2-1]=mat1[AA][BA];
	               
	               mat3[AA][BA]=1;
	            }
	           
	        }
	        
	        /*int u;
	        int contador=0;
	        for (u=0;u<=ui;u++)
	        {
				contador=contador+1;
				if (AA[ui]!=contador)
				{
					ti[ui]=contador;
				}
			}
			contador=0;
			for(u=0;u<=uj;u++)
			{
				contador=contador+1;
				if (BA[uj]!=contador)
				{
					tj[uj]=contador;
				}
			}*/
			//BLOQUE DE MATRIZ COLOREADA:

			 contador1=0;
			 contador2=0;
			for (g1=0;g1<number1;g1++)
{
	if (s1.contains(g1))
	{
		
	wg1[contador1]=g1;
	contador1=contador1+1;
}
}
		for (g2=0;g2<number1;g2++)
		{
			if (s2.contains(g2))
			{
				
wg2[contador2]=g2;
contador2=contador2+1;
}
}
for (g1=0;g1<number1;g1++)
{
	for(g2=0;g2<number1;g2++)
	{
		mat4[g1][g2]=1;
		mat5[g1][g2]=0;
	}
}

	for ( g1=0;g1<contador1;g1++)
	{
		for(g2=0;g2<contador2;g2++)
		{
	//mat4[ww1[g1]][ww2[g2]]=1;
	//System.out.println(wg1[g1]+"+"+wg2[g2]);
	mat5[wg1[g1]][wg2[g2]]=1;
}
}

// FIN DEL BLOQUE DE MATRIZ COLOREADA.
	        //FormatoMatriz.Salida(nueva,rango1,rango1);
    signo1=1;
   
	/*Set<Integer>intersection1=new HashSet<>(Parcial1);
	Set<Integer>intersection2=new HashSet<>(Parcial2);
	intersection1.retainAll(Totalidad);
	intersection2.retainAll(Totalidad);*/
	for(rutenio=0;rutenio<number1;rutenio++)
	{
		Totalidad1.add(rutenio);
	}
	Totalidad1.removeAll(Parcial1);
	for(osmio=0;osmio<number1;osmio++)
	{
		Totalidad2.add(osmio);
	}
	Totalidad2.removeAll(Parcial2);
	
	//System.out.println(Totalidad1);
	//System.out.println(Totalidad2);
	ui=0;
	uj=0;
	 for( olula=0;olula<number1;olula++)
	 {
		 if (Totalidad1.contains(olula))
		 {
			 
			 ti[ui]=olula+1;
			 ui=ui+1;
		 }
		 if (Totalidad2.contains(olula))
		 {
			
			 tj[uj]=olula+1;
			  uj=uj+1;
		 }
		 
	 }
	 for( tijola=0;tijola<number1-rango1;tijola++)
	 {
		 for( lucar=0;lucar<number1-rango1;lucar++)
		 {
		// System.out.println(ti[tijola]+tj[lucar]);
		 signo1=signo1*(int)(Math.pow(-1,ti[tijola]+tj[lucar]));
	 }
		 
	 }
	        signo[menor]=signo1;
	//determina[menor][rango1]=Determinante.determin(nueva);
	
	determina[menor][rango1]=Determinantes.det(rango1,nueva);
	
	      det=determina[menor][rango1];
	      // hay que arreglar estoooooooooooooooo, vamossssss!
	  terminus[i][j]=(int) det;    
	 //System.out.println("The entire determinant is : " + det);
	 if (det!=0){nulo=false;}else{nulo=true;}
	 if (fin==1){	
				miedo=false;
				
				prime=false;
		Matriz(prime,mat3,mat4,mat5,mat6,number1,rango1,Hola,nulo,miedo,det,0,true);	   
			} else{
				Dibuja.Matriz(mat3,number1);
			}
		 
	    /*bloque 6*/
	
	try{
	Thread.sleep(dormir);
	}catch(Exception e){
	System.out.println(e);
	    }
	    menor=menor+1;
	}
}
/*int signo2=1;
int determinantem1=1;
int determinantep=0;
int determinantef=0;
int determinantea=0;
int determinanteb=0;
*/
/*for(int menores=0;menores<=menor-1;menores++)
{
	System.out.println(signo[menores]);
determinantep=determinantep+determina[menores][rango1]*signo[menores];
determinantef=determinantef+determina[menores][rango1];
determinanteb=determinanteb+Math.abs(determina[menores][rango1]);
determinantem1=determinantem1*determina[menores][rango1];
signo2=signo2*-1;
System.out.println("Sign= "+signo2);
determinantea=determinantea+determina[menores][rango1]*signo2;
}
*/
//int gil=Determinante.determin(mat1);
//double gil=Determinantes.det(rango1,mat1);
/*int gol=Inversas.Salida(number1,mat1);*/
//System.out.println("The determinant was : "+gil);
//System.out.println("The determinant m is: "+determinantem1);
/*System.out.println("Y, dividido es:"+determinantem1/determinantef);*/
/*System.out.println("The new determinant, sum of the minors with sign, is NOTE2: "+determinantep);
System.out.println("The new determinant, sum of the absolute values of the minors, is: "+determinanteb);
System.out.println("The determinant, alternate sum of the minors, is: "+determinantea);
System.out.println("The new determinant, sum of the minors without sign, is: "+determinantef);
*/
/*System.out.println("El nuevo determinante, con signo, entre la inversa, es NOTA1: "+determinantep/gol);
System.out.println("El nuevo determinante, sin signo, entre la inversa, es: "+determinantef/gol);
System.out.println("El nuevo determinante, con signo, multiplicación por la inversa es: "+determinantep*gol);
System.out.println("El nuevo determinante, sin signo,  multiplicado por la inversa es: "+determinantef*gol);
*/
//System.out.println("Do you want to save the matrix ? (1-yes, another number-no)?");
 //int atomo=sc.nextInt();
 for ( oi=0;oi<Combinaciones;oi++)
	     {
	     for ( oj=0;oj<Combinaciones;oj++)
	     {
	     tractor[oi][oj]=terminus[oi+1][oj+1];
	     }
	     }
	     
	    gass=Determinantes.det(number1,mat1);
	     if (fin==1){
	    if (Combinaciones<=20)
	    {
	   
 myCanvas.setVisible(false);
	     myCanvas1 = new Canvas("MATRIX RELOADED", 1100, 500);
        myCanvas1.setVisible(true);
	     
 if (Combinaciones<=10)
 {
 espana=true;
 
	     //Hay que hacer el determinante 10x10 como sea !!!!!
	     
	     if (Combinaciones<=9)
	     {
	    gracias=Determinantes.det(Combinaciones,tractor);
	   
	    }else{
	    // Aqui, una formula. 5x5DOS O 5x5TRES
	    gracias=666;
	    }
	     Reload(tractor,Combinaciones,gracias,gaseosa,gass,espana);
	}else{
	// Aqui, otra formula. 6x6DOS o 6x6TRES o 6x6CUATRO (by the moment).
	gracias=666; 
	espana=false;
	Reload(tractor,Combinaciones,gracias,gaseosa,gass,espana);
	}
	}
	}
	JOptionPane.showMessageDialog(null,"Now, I keep the matrix reloaded with a name similar at the original");
	     if (nombre==false)
	     {
	  Archivo=JOptionPane.showInputDialog("Enter the name of the matrix");
	  nombre=true;
	     }
	     
 if (unavez==true)
 {
	 try{
	 francisco=Archivar.Archivo(number1,number2,mat1,cuadrada,Archivo,0);
	   }catch(IOException e){
	        e.printStackTrace();
	    }
	    if (francisco==false)
	    {System.exit(0);}
	    unavez=false;
	}
	try{
	 francisco=Archivar.Archivo(Combinaciones,Combinaciones,tractor,cuadrada,Archivo,number1-rango1);
	   }catch(IOException e){
	        e.printStackTrace();
	    }
	    if (francisco==false)
	    {System.exit(0);}
 if (fin==1)
 {
 if (Combinaciones<=20)
	    {
	   
 myCanvas1.setVisible(false);
 myCanvas.setVisible(true);
 }
 }
 rango1=rango1-1;
	}while((rango1>1) && (chivatico==true));
	}
System.exit(0);

}	
public static double determinante (int [][] matriz)
	{
		assert matriz != null;
		assert matriz.length>0;
		assert matriz.length == matriz[0].length;
		
		double determinante = 0.0;
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		// Si la matriz es 1x1, el determinante es el elemento de la matriz
		if ((filas==1) && (columnas==1))
			return matriz[0][0];
		

		int signo=1;
		
		for (int columna=0;columna<columnas;columna++)
		{
			// Obtiene el adjunto de fila=0, columna=columna, pero sin el signo.
			int[][] submatriz = getSubmatriz(matriz, filas, columnas,
					columna);
			determinante = determinante + signo*matriz[0][columna]*determinante(submatriz);
			signo*=-1;
		}
		
		return determinante;
	}

	/**
	 * Obtiene la matriz que resulta de eliminar la primera fila y la columna que se
	 * pasa como parámetro.
	 * @param matriz Matriz original
	 * @param filas Numero de filas de la matriz original
	 * @param columnas Numero de columnas de la matriz original
	 * @param columna Columna que se quiere eliminar, junto con la fila=0
	 * @return Una matriz de N-1 x N-1 elementos
	 */
	public static int[][] getSubmatriz(int[][] matriz, 
			int filas,
			int columnas, 
			int columna) {
		int [][] submatriz = new int[filas-1][columnas-1];
		int contador=0;
		for (int j=0;j<columnas;j++)
		{
			if (j==columna) continue;
			for (int i=1;i<filas;i++)
				submatriz[i-1][contador]=matriz[i][j];
			contador++;
		}
		return submatriz;
	}


}		   
	/*fin del main*/
	


 class Combina {
	
	public static boolean Combo (int opciones,int sale,String salida){
		 int g1,g2,g3,g4,g5,g6,g7,g8,g9;
	       
	      char salida1, salida2, salida3, salida4, salida5, salida6, salida7, salida8, salida9;
	     Integer zas1,zas2,zas3,zas4,zas5,zas6,zas7,zas8,zas9;
	     
	   
	      
	       
	       
	   
	      p1=false;
	           switch (opciones){
	           case 1:
	        	   p1=true;
	        	   break;
	           case 2:
	               if (sale>=10){
	                   p1=true;
	           for (g1=salida.length()-2;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-1;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                   zas1=Integer.valueOf(salida1);
	                   zas2=Integer.valueOf(salida2);
	               if (zas1.intValue()>zas2.intValue()){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	               
	           }
	       }
	}
	break;

	case 3:
	           if (sale>=100){
	                p1=true;
	           for (g1=salida.length()-3;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-2;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-1;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                     zas1=Integer.valueOf(salida1);
	                     zas2=Integer.valueOf(salida2);
	                     zas3=Integer.valueOf(salida3);
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           }
	               
	           }
	       }
	}      
	break;
	case 4:
	if (sale>=1000){
	     p1=true;
	           for (g1=salida.length()-4;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-3;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-2;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                   for(g4=g3+1;g4==salida.length()-1;g4++){  
	                       
	                       salida4=salida.charAt(g4);
	                       zas1=Integer.valueOf(salida1);
	                       zas2=Integer.valueOf(salida2);
	                       zas3=Integer.valueOf(salida3);
	                       zas4=Integer.valueOf(salida4);
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())&&(zas3.intValue()>zas4.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           }
	               
	           }
	       }
	       }
	}     
	break;
	case 5:
	if (sale>=10000){
	     p1=true;
	           for (g1=salida.length()-5;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-4;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-3;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                   for(g4=g3+1;g4==salida.length()-2;g4++){  
	                       
	                       salida4=salida.charAt(g4);
	                       for(g5=g4+1;g5==salida.length()-1;g5++){
	                           
	                           salida5=salida.charAt(g5);
	                           zas1=Integer.valueOf(salida1);
	                           zas2=Integer.valueOf(salida2);
	                           zas3=Integer.valueOf(salida3);
	                           zas4=Integer.valueOf(salida4);
	                           zas5=Integer.valueOf(salida5);
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())&&(zas3.intValue()>zas4.intValue())&&(zas4.intValue()>zas5.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           }
	               
	           }
	       }
	}
	       }
	} 
	       break;


	       case 6:
	if (sale>=100000){
	     p1=true;
	           for (g1=salida.length()-6;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-5;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-4;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                   for(g4=g3+1;g4==salida.length()-3;g4++){  
	                       
	                       salida4=salida.charAt(g4);
	                       for(g5=g4+1;g5==salida.length()-2;g5++){
	                           
	                           salida5=salida.charAt(g5);
	                           for(g6=g5+1;g6==salida.length()-1;g6++){
	                               
	                               salida6=salida.charAt(g6);
	                               zas1=Integer.valueOf(salida1);
	                               zas2=Integer.valueOf(salida2);
	                               zas3=Integer.valueOf(salida3);
	                               zas4=Integer.valueOf(salida4);
	                               zas5=Integer.valueOf(salida5);
	                               zas6=Integer.valueOf(salida6);
	                              
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())&&(zas3.intValue()>zas4.intValue())&&(zas4.intValue()>zas5.intValue())&&(zas5.intValue()>zas6.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           
	           
	       }
	               
	           }
	       }
	}
	       }
	} 
	}
	       break;
	       case 7:
	if (sale>=1000000){
	     p1=true;
	           for (g1=salida.length()-7;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-6;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-5;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                   for(g4=g3+1;g4==salida.length()-4;g4++){  
	                       
	                       salida4=salida.charAt(g4);
	                       for(g5=g4+1;g5==salida.length()-3;g5++){
	                           
	                           salida5=salida.charAt(g5);
	                           for(g6=g5+1;g6==salida.length()-2;g6++){
	                               
	                               salida6=salida.charAt(g6);
	                               for(g7=g6+1;g7==salida.length()-1;g7++){
	                                   
	                                   salida7=salida.charAt(g7);
	                                   zas1=Integer.valueOf(salida1);
	                                   zas2=Integer.valueOf(salida2);
	                                   zas3=Integer.valueOf(salida3);
	                                   zas4=Integer.valueOf(salida4);
	                                   zas5=Integer.valueOf(salida5);
	                                   zas6=Integer.valueOf(salida6);
	                                   zas7=Integer.valueOf(salida7);
	                              
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())&&(zas3.intValue()>zas4.intValue())&&(zas4.intValue()>zas5.intValue())&&(zas5.intValue()>zas6.intValue())&&(zas6.intValue()>zas7.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           
	           
	       }
	}
	               
	           }
	       }
	}
	       }
	} 
	}
	       break;
	       case 8:
	if (sale>=10000000){
	     p1=true;
	           for (g1=salida.length()-8;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-7;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-6;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                   for(g4=g3+1;g4==salida.length()-5;g4++){  
	                       
	                       salida4=salida.charAt(g4);
	                       for(g5=g4+1;g5==salida.length()-4;g5++){
	                           
	                           salida5=salida.charAt(g5);
	                           for(g6=g5+1;g6==salida.length()-3;g6++){
	                               
	                               salida6=salida.charAt(g6);
	                               for(g7=g6+1;g7==salida.length()-2;g7++){
	                                   
	                                   salida7=salida.charAt(g7);
	                                   for(g8=g7+1;g8==salida.length()-1;g8++){
	                                       
	                                       salida8=salida.charAt(g8);
	                                       zas1=Integer.valueOf(salida1);
	                                       zas2=Integer.valueOf(salida2);
	                                       zas3=Integer.valueOf(salida3);
	                                       zas4=Integer.valueOf(salida4);
	                                       zas5=Integer.valueOf(salida5);
	                                       zas6=Integer.valueOf(salida6);
	                                       zas7=Integer.valueOf(salida7);
	                                       zas8=Integer.valueOf(salida8);
	                             
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())&&(zas3.intValue()>zas4.intValue())&&(zas4.intValue()>zas5.intValue())&&(zas5.intValue()>zas6.intValue())&&(zas6.intValue()>zas7.intValue())&&(zas7.intValue()>zas8.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           
	           }
	       }
	}
	               
	           }
	       }
	}
	       }
	} 
	}
	       break;
	       case 9:
	if (sale>=100000000){
	     p1=true;
	           for (g1=salida.length()-9;g1==0;--g1){
	                 
	                 salida1=salida.charAt(g1);
	                 
	               for (g2=g1+1;g2==salida.length()-8;g2++){
	                   
	                   salida2=salida.charAt(g2);
	                for(g3=g2+1;g3==salida.length()-7;g3++){ 
	                    
	                     salida3=salida.charAt(g3);
	                   for(g4=g3+1;g4==salida.length()-6;g4++){  
	                       
	                       salida4=salida.charAt(g4);
	                       for(g5=g4+1;g5==salida.length()-5;g5++){
	                           
	                           salida5=salida.charAt(g5);
	                           for(g6=g5+1;g6==salida.length()-4;g6++){
	                               
	                               salida6=salida.charAt(g6);
	                               for(g7=g6+1;g7==salida.length()-3;g7++){
	                                   
	                                   salida7=salida.charAt(g7);
	                                   for(g8=g7+1;g8==salida.length()-2;g8++){
	                                       
	                                       salida8=salida.charAt(g8);
	                                       for(g9=g8+1;g9==salida.length()-1;g9++){
	                                           
	                                           salida9=salida.charAt(g9);
	                                           zas1=Integer.valueOf(salida1);
	                                           zas2=Integer.valueOf(salida2);
	                                           zas3=Integer.valueOf(salida3);
	                                           zas4=Integer.valueOf(salida4);
	                                           zas5=Integer.valueOf(salida5);
	                                           zas6=Integer.valueOf(salida6);
	                                           zas7=Integer.valueOf(salida7);
	                                           zas8=Integer.valueOf(salida8);
	                                           zas9=Integer.valueOf(salida9);
	                              
	               if ((zas1.intValue()>zas2.intValue())&&(zas2.intValue()>zas3.intValue())&&(zas3.intValue()>zas4.intValue())&&(zas4.intValue()>zas5.intValue())&&(zas5.intValue()>zas6.intValue())&&(zas6.intValue()>zas7.intValue())&&(zas7.intValue()>zas8.intValue())&&(zas8.intValue()>zas9.intValue())){
	                   if (p1==true){
	                   p1=true;
	               }
	               else{
	                   p1=false;
	               }

	               }
	               else{
	                   p1=false;
	               }
	           }
	           }
	       }
	}
	               
	           }
	       }
	}
	       }
	} 
	}
	       break;
	       
	}



	       
	                             

	/*return matriz2[260];
	/*}






	/*  public int getMatriz2 ()
	  {
	      return this.matriz2[260];
	    }*/
	    return p1;
	}

	

	static boolean p1;
}

class Adperm {
	public static String Porpoco (int x){
		 return matriz[x];
	}
	public static void Per (int N){
		int n;
	       
	       
        int i,j,j1,k,l,z;
        int fact;
        int factn;
        
        
        String nmatrix;
        
        int cuenta;
        
        String nmatriz[]=new String[362881];
        
       
        int matrix;
       
        fact=1;
        for(j=1;j<=N;j++){
            
        fact=fact*j;
    }
       
       
        for  (n=1;n<=N;n++){
        switch (n){
            case 1:
            matriz[1]="0";
            break;
            case 2:
            matriz[1]="01";
            matriz[2]="10";
            break;
            case 3:
            cuenta=0;
         
            for(l=1;l<=2;l++){
                
                String mmatriz=nmatriz[l]+"";
                
                 for (k=1;k<=3;k++){
                      cuenta=cuenta+1;
                      if (k==1){
                          nmatrix="2"+mmatriz;
                        }
                        else
                        {
                 if (k==2){     
                nmatrix=mmatriz.substring(0,k-1)+"2"+mmatriz.substring(k-1,mmatriz.length());
            }
            else{
                nmatrix=mmatriz+"2";
            }
        }
                /*matriz[cuenta]=Integer.parseInt(nmatrix);*/
                matriz[cuenta]=nmatrix;
            }
           
        
    }
     break;
     case 4:
     cuenta=0;
            
            for(l=1;l<=6;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=4;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="3"+mmatriz;
                        }
                        else
                        {
                if((1<k)&&(k<4)){      
                nmatrix=mmatriz.substring(0,k-1)+"3"+mmatriz.substring(k-1,mmatriz.length());
                
            }
            else
            {
                 nmatrix=mmatriz+"3";
            }
        }
           /* matriz[cuenta]=Integer.parseInt(nmatrix);*/
              matriz[cuenta]=nmatrix;   
            }
               
        
    }
    break;
    case 5:
    cuenta=0;
            
            for(l=1;l<=24;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=5;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="4"+mmatriz;
                        }
                        else
                        {
                      if((1<k)&&(k<5)){
                nmatrix=mmatriz.substring(0,k-1)+"4"+mmatriz.substring(k-1,mmatriz.length());
                
            }
            else
            {
                 nmatrix=mmatriz+"4";
            }
        }
           /* matriz[cuenta]=Integer.parseInt(nmatrix);*/
                matriz[cuenta]=nmatrix;
            }
               
        
    }
    break;
    case 6:
    cuenta=0;
            
            for(l=1;l<=120;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=6;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="5"+mmatriz;
                        }
                        else
                        {
                      if((1<k)&&(k<6)){
                nmatrix=mmatriz.substring(0,k-1)+"5"+mmatriz.substring(k-1,mmatriz.length());
                
            }
            else
            {
                 nmatrix=mmatriz+"5";
            }
        }
           /* matriz[cuenta]=Integer.parseInt(nmatrix);*/
                matriz[cuenta]=nmatrix;
            }
               
        
    }
    break;
    case 7:
    cuenta=0;
            
            for(l=1;l<=720;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=7;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="6"+mmatriz;
                        }
                        else
                        {
                      if ((1<k)&&(k<7)){
                
                       nmatrix=mmatriz.substring(0,k-1)+"6"+mmatriz.substring(k-1,mmatriz.length());
                    }
                    else
            {
                 nmatrix=mmatriz+"6";
            }
        }
                      /* matriz[cuenta]=Integer.parseInt(nmatrix);*/
                matriz[cuenta]=nmatrix;
            }
               
        
    }
    break;
    case 8:
    cuenta=0;
            
            for(l=1;l<=5040;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=8;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="7"+mmatriz;
                        }
                        else
                        {
                      if((1<k)&&(k<8)){
                nmatrix=mmatriz.substring(0,k-1)+"7"+mmatriz.substring(k-1,mmatriz.length());
            }
            else
            {
                 nmatrix=mmatriz+"7";
            }
        }
/*                matriz[cuenta]=Integer.parseInt(nmatrix);*/
                matriz[cuenta]=nmatrix;
            }
               
        
    }
    break;
    case 9:
    cuenta=0;
            
            for(l=1;l<=40320;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=9;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="8"+mmatriz;
                        }
                        else{
                      if((1<k)&&(k<9)){
                nmatrix=mmatriz.substring(0,k-1)+"8"+mmatriz.substring(k-1,mmatriz.length());
            }
            else
            {
                 nmatrix=mmatriz+"8";
            }
        }
  /*              matriz[cuenta]=Integer.parseInt(nmatrix);*/
               matriz[cuenta]=nmatrix;
            }
               
        
    }
    break;
     case 10:
    cuenta=0;
            
            for(l=1;l<=362880;l++){
               
                String mmatriz=nmatriz[l]+"";
                 for (k=1;k<=9;k++){
                      cuenta=cuenta+1;
                      
                      if (k==1){
                          nmatrix="9"+mmatriz;
                        }
                        else{
                      if((1<k)&&(k<9)){
                nmatrix=mmatriz.substring(0,k-1)+"9"+mmatriz.substring(k-1,mmatriz.length());
            }
            else
            {
                 nmatrix=mmatriz+"9";
            }
        }
                /*matriz[cuenta]=Integer.parseInt(nmatrix);*/
                matriz[cuenta]=nmatrix;
            }
               
        
    }
    break;
    }
        if (n<N){
            factn=1;
        for(j1=1;j1<=n;j1++){
            
        factn=factn*j1;
    }
            for (i=1;i<=factn;i++){
                nmatriz[i]=matriz[i];
            }
        }
    
        
   
}


	}
	static String matriz[]=new String[362881];
	   static String mmatriz;
	   
}

class Combinatoria {

	public static int Combinaciones  (int elementos, int opciones){
		 int i;
	        int factorialm=1;
	        int factorialn=1;
	         int factorialmn=1;
	         int Combinaciones;
	         
	        for(i=1;i<=elementos;i++)
	         {
	            factorialm=factorialm*i;
	         }
	         for(i=1;i<=opciones;++i)
	         {
	            factorialn=factorialn*i;
	         }
	         for(i=1;i<=(elementos-opciones);++i)
	         {
	            factorialmn=factorialmn*i;
	         }
	         Combinaciones=factorialm/(factorialn*factorialmn);
	         return Combinaciones;
	}

	public static int Total (int opciones){
		 int Total=1;
         int r;
                 for (r=0;r<opciones;++r){
                     Total=Total*10;
                 }
                 return Total;
	}

}


 class Determinantes {
	public static double det(int rango1, int nueva[][]) {
		 /* double valor;*/
	    int e=0;
	      
	     double d;
	/*     int e=rango1;*/
	     int j;
	     
	      int fact=1;
	          int N=rango1;
	        for( j=1;j<=N;j++)
	        {
	            
	        fact=fact*j;
	    }
	    det=0;
	       for (x=1;x<=fact;x++)
	  {
	      Adperm.Per(N);
	     poro=Adperm.Porpoco(x);
	     
	      /*mat=matriz[i];
	        /* devuelve=Percom.devolver(por,mat);*/
	         
	       /*sig=Signatura.Signo(poro);*/
	       int sig=Signatura.Signo(poro);
	 /*BigDecimal bd=new BigDecimal(sig).setScale(1, RoundingMode.HALF_UP);
	 double sig1= bd.doubleValue();
*/
	      int sig1=sig;
	      d=1;
	      String poros;
	         poros=String.valueOf(poro);
	                 for(int l=0;l<N;l++)
	        {
	           
	            
	           
	            char moco=poros.charAt(l);
	            int loc=Character.getNumericValue(moco);
	           
	         
	          int i=(e%N);
	           e=e+1;
	           /*loc=loc-1;*/
	           /*valor=nueva[i][loc];*/
	       
	           /*System.out.print ("[("+i+","+loc+")="+valor+"]");*/
	             /* d=d*mat1[i][loc];*/
	           d=d*nueva[i][loc];
	          
	        
	           
	            
	    }
	                 /*System.out.println("");
	                 System.out.print(d+"*"+sig1);*/
	    d=d*sig1;
	            /*System.out.println("="+d);*/
	        det=det+d;
	        
	}

	return det;
	
	}

	static int nueva[][]=new int [10][10];
    static double det;
    static int rango1;
    static int N,x;
   
  
	static String poro;
}

/*class Dibuja {

	public static void Matriz (int mat3[][], int number1){
		OtroPaso.Limpieza();
		System.out.println("   ");
		System.out.print("    ");
		for(int pa=0;pa<number1;pa++)
		{
		System.out.print(" "+pa+" ");
		}
		System.out.println(" ");
		System.out.print("   "+(char)9487);
		for(int pu=0;pu<number1*3;pu++)
		{
		System.out.print((char)9473);
		}
		System.out.println((char)9491);

		for(int i3=0;i3<number1;i3++)
		{
		System.out.print("  "+i3+(char)9475);
		for(int j3=0;j3<number1;j3++)
		{
		if (mat3[i3][j3]==1)
		{
		for(int pi=0;pi<3;pi++)
		{
		System.out.print((char)9608);
		}
		}else{
		for(int pi=0;pi<3;pi++)
		{
		System.out.print(" ");
		}
		}
		}
		System.out.println((char)9475);

		}
		System.out.print("   "+(char)9495);
		for(int pu=0;pu<number1*3;pu++)
		{
		System.out.print((char)9473);
		}

		System.out.println((char)9499);
		}
		
	}

*/

 class Entrada {
 static boolean nombre;
 static String Archivo;
 static boolean cuadrada;
	public static int entro (int numero){
		 if (numero==1)
		    {
		        return (int)c1;
		    }
		    if (numero==2)
		    {
		        return (int)c2;
		    }
		   
		    
		    return mat1[(int)((numero-3)/c2)+1][(int)((numero-3)%c2)+1];
	}
	public static boolean entra() {
	if (cuadrada)
	{
return true;
}else{return false;}
	}
	public static void CreaMatriz() throws IOException {
		 String ruta1="Files";
	        File ruta =new File(ruta1);
	     
	       
	       int numero;
	      
	       //System.out.println("Enter 1 for to create a matrix");
	       //System.out.println("Enter 2 for to create a random matrix");
	        //System.out.println("Enter any number for to load a matrix");
	        String seguir;
	      int seleccion0 = JOptionPane.showOptionDialog(
   null,  // botonparental
   "Select option", 
   "Choose the alternatives",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    // null para icono por defecto.
   new Object[] { "CREATE", "RANDOM", "LOAD" },   // null para YES, NO y CANCEL
   "RANDOM");
  int seguir1=2;
	    if (seleccion0 != -1){
   // System.out.println("seleccionada opcion " + (seleccion + 1));
   if(seleccion0==0){seguir1=1;}
   if (seleccion0==1){seguir1=2;}
   if (seleccion0==2){seguir1=3;}
}
		    Scanner sc = new Scanner(System.in);
	     
	      //   int seguir1= sc.nextInt();
	      //int seguir1=2;

	     if ((seguir1==1)||(seguir1==2))
	     {
			 
			 //NO SQUARE MATRIX NOT YET
			 
	// System.out.println("SQUARE MATRIX 1/ANOTHER NUMBER - NO SQUARE MATRIX ");

	 //int tecla=sc.nextInt();

      int tecla=1;

	if (tecla==1){
	//System.out.println("ENTER THE DIMENSION, max=10 ");
	String number3=JOptionPane.showInputDialog("Enter the dimension");
int number4=Integer.parseInt(number3);
	//number1= sc.nextInt();
	number1=number4;
	number2=number1;
	cuadrada=true;
	}else{
	 System.out.println("ENTER THE NUMBER OF ROWS, max=10 ");
	       
	         number1= sc.nextInt();
	 System.out.println("ENTER THE NUMBER OF COLUMNS, max=10 ");
	         number2= sc.nextInt();
	if (number1!=number2){
	cuadrada=false;
	}
	}
int n=number1;
	int m=number2;
	int i,j;
	c1=number1;
	c2=number2;
	String holas;
	int olas;
	       for(i=1;i<=n;i++)
	        {
	            for(j=1;j<=m;j++)
	            { if (seguir1==2){

	            	mat1[i][j]=(int)(Math.random()*20-10);

	            }
	            else
	            {
	                //System.out.println("ENTER :"+i+" , "+j+" :");
	                 holas=JOptionPane.showInputDialog("ENTER :"+i+" , "+j+" :");
	                 olas=Integer.valueOf(holas);
	                mat1[i][j]=olas;
	            }   
	            }
	        }
	        boolean dependence=false;
	        int simetric=0;  
			int diez;
			//int contador1;
			int juan;
			int anion;
int guapa1[]=new int[11];
int guapa2[]=new int[11];
boolean dependiente=true;
int dependientes;
int dependientes1=0;
int dependientes2=0;
Set<Integer> sola =new HashSet<>();
Set<Integer> solo =new HashSet<>();

if (seguir1==2)
{

int seleccion1 = JOptionPane.showOptionDialog(
   null,  // botonparental
   "Select option", 
   "Choose the alternatives",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    // null para icono por defecto.
   new Object[] { "simetric", "no simetric", "antisimetric" },   // null para YES, NO y CANCEL
   "no simetric");

if (seleccion1 != -1){
   // System.out.println("seleccionada opcion " + (seleccion + 1));
   if(seleccion1==0){simetric=1;}
   if (seleccion1==1){simetric=0;}
}
int seleccion2 = JOptionPane.showOptionDialog(
   null,  // botonparental
   "Select option", 
   "Choose the alternatives",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    // null para icono por defecto.
   new Object[] { "dependence", "no dependence" },   // null para YES, NO y CANCEL
   "no dependence");

if (seleccion2 != -1){
   // System.out.println("seleccionada opcion " + (seleccion + 1));
   if(seleccion2==0){dependence=true;}
   if(seleccion2==1){dependence=false;}
}
   //simetric=sc.nextInt();
	// int bueno1, bueno2;
	
	
	do
	{
//System.out.println("Number of denpendents rows?, maximum=dimension-1");
//System.out.println("If your choice was simetric the columns will be the same number...");
if (dependence==true)
{
String number7=JOptionPane.showInputDialog("Number of denpendents rows?, maximum=dimension-1 \n (If your choice was simetric the columns will be the same number...)");
int number8=Integer.valueOf(number7);
dependientes1=number8;}
else{dependientes1=0;}
// System.out.println(dependientes1);
//dependientes1=sc.nextInt();
if (dependientes1>n-1)
{
	//System.out.println(" The number of dependent rows must to be less than: "+n+"-1");
	JOptionPane.showMessageDialog(null,"The number of dependent rows must to be less than: "+m+"-1");
	dependiente=false;
}
else
{
	dependiente=true;
}
}while(dependiente==false);
if (simetric!=1)
{
	do
	{
	if (dependence==true)
	{
	String number6=JOptionPane.showInputDialog("Number of denpendents columns?, maximum=dimension-1");
//System.out.println("Number of dependents columns?, maximum=dimension-1");
int number9=Integer.valueOf(number6);
dependientes2=number9;}
else{dependientes2=0;}
//dependientes2=sc.nextInt();
if (dependientes2>m-1)
{
	//System.out.println(" The number of dependent columns must to be less than: "+m+"-1");
	JOptionPane.showMessageDialog(null,"The number of dependent columns must to be less than: "+m+"-1");
	dependiente=false;
}
else
{
	dependiente=true;
}
}while(dependiente==false);
}else{
	dependientes2=dependientes1;
}

	//                                     OJO AQUI! (ERA dependientes2=0)
	        if (dependientes1!=0)
	        {
			guapa1[1]= (int)(Math.random()*number1+1);
			// System.out.println("Primera fila dependiente:"+guapa1[1]);
			sola.add(guapa1[1]);
				for(int sultan1=2;sultan1<=dependientes1;sultan1++)
				{
				
				
				
				
				do
				{
				//contador1=0;	
//dependiente=false;
	        guapa1[sultan1]= (int)(Math.random()*number1+1);
                
	            
	          /*   if 
{
dependiente=false;
}
else
{
dependiente=true;
}
 
	        /* for(diez=1;diez<sultan1;diez++)
	         {
	         if (guapa1[diez]!=guapa1[sultan1])
	         {
				  contador1=contador1+1;
				  
			  }
		  }
		  if (contador1==sultan1-1)
		  {
			  dependiente=true;
		  }
*/
			  }while(sola.contains(guapa1[sultan1]));
sola.add(guapa1[sultan1]);
			   // System.out.println(sultan1+" fila dependiente: "+guapa1[sultan1]);
			  }
			  for(j=1;j<=n;j++)
			  {
				  mat1[guapa1[1]][j]=(int)(Math.random()*20-10);
			  }
			  for (juan=2;juan<=dependientes1;juan++)
			  {
				 // bueno1=(int)(Math.random()*20-10);
				 // bueno2=(int)(Math.random()*20-10);
	            for(j=1;j<=n;j++)
	            {
					
					
					/*if (dependientes2==0)
					{
						mat1[guapa1[juan]][j]=mat1[guapa1[1]][j]*bueno1+bueno2;
					}
else
{
*/
mat1[guapa1[juan]][j]=mat1[guapa1[1]][j];
//}
				}
	    }
	    
	    //algo falla desde aqui
	    
	    int six;
boolean claro=true;
boolean oscuro=true;
	if (simetric==1)
{

int sex=(int)(Math.random()*20-10);

	for(juan=1;juan<=dependientes1;juan++)
	{
		
		for(six=1;six<=dependientes1;six++)
		{
		mat1[guapa1[juan]][guapa1[six]]=sex;
		
	}
	
}
for(juan=1;juan<=dependientes1;juan++)
{
for(i=1;i<=n;i++)
{
/*for(six=1;six<=dependientes1;six++)
{
if(i!=guapa1[six])

{
claro=true;
}else{
claro=false;
break;
}
}
if (claro=true)
{
*/
// System.out.println("Invirtiendo filas para: "+guapa1[juan]);
mat1[i][guapa1[juan]]=mat1[guapa1[juan]][i];
//}
}

}	

	
}
	//hasta aqui
	
}



/* PRINCIPIO DEL BLOQUE DE LAS COLUMNAS*/



	 
	      
	        if (dependientes2!=0)
	        {
			guapa2[1]= (int)(Math.random()*number1+1);
			solo.add(guapa1[1]);
			for(int sultan2=2;sultan2<=dependientes2;sultan2++)
				{
				
				
				// dependiente=false;
				 
				do
				{
				//contador1=0;
	        guapa2[sultan2]= (int)(Math.random()*number1+1);
	         
	       
			  }while(sola.contains(guapa2[sultan2]));
sola.add(guapa2[sultan2]);
			  
			  }
			  for(j=1;j<=n;j++)
			  {
				  mat1[j][guapa2[1]]=(int)(Math.random()*20-10);
			  }
			  for (juan=2;juan<=dependientes2;juan++)
			  {
				  // bueno1=(int)(Math.random()*20-10);
				  // bueno2=(int)(Math.random()*20-10);
	            for(j=1;j<=n;j++)
	            {
					
					mat1[j][guapa2[juan]]=mat1[j][guapa2[1]];
					/*if (dependientes1==0)
					{
						mat1[j][guapa2[juan]]=mat1[j][guapa2[1]]*bueno1+bueno2;
					}
					*/
				}
	    }
	}
	if ((dependientes1!=0)&&(dependientes2!=0))
	{    
	    int valor=(int)(Math.random()*20-10);
	    for(int h1=1;h1<=dependientes1;h1++)
	    {
			for(int h2=1;h2<=dependientes2;h2++)
			{
				mat1[guapa1[h1]][guapa2[h2]]=valor;
			}
		}
	
			 /*  valor=(int)(Math.random()*20-10);
			 
				for(j=1;j<=m;j++)
			  { 
		 
		 
			  for (juan=1;juan<=dependientes2;juan++)
			  {
				   
				  
	            contador2=false;
					 for (anion=1;anion<=dependientes1;anion++)
				  {
					  if (guapa1[anion]==j)
					  {
					contador2=true;
			  }
		  }
		   if (contador2==false)
				 
				 {
				  valor=(int)(Math.random()*20-10);
			  }
					mat1[j][guapa2[juan]]=valor;
				
			
	  
			}
	    }
	    
	    
	}*/

}
}

	/* FIN DEL BLOQUE DE LAS COLUMNAS */
	
	// IMPLEMENTATION OF THE SYMMETRIC MATRIX NOT YET

/*	boolean dependientesfin;
	if ((dependientes1==0)&&(dependientes2==0))
	{
		dependientesfin=true;
	}
	else
	{
		dependientesfin=false;
	}
if ((cuadrada=true)&&(dependientesfin=true))
{
	System.out.println("Do you want that the matrix be symmetric yes-1, no-another number?");
	symmetric=sc.nextInt();
}
else
{
	symmetric=0;
}
*/
if (simetric==1)
{
	for (i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{

//if((i!=guapa1[juan])&&(j!=guapa1[juan]))
if ((sola.contains(i))||(sola.contains(j)))
{
// System.out.println("i:"+i+"j:"+j+"No se toca");
}else
{





			mat1[i][j]=mat1[j][i];


}
		
	}
}
}

	        //System.out.println("Enter 2 for to save the matrix");
	        //System.out.println("Enter another number for to continue.");
	        // seguir1= sc.nextInt();
	        seguir1=6;
	         if (seguir1==2)
	         {
				 /*Archivar.archivo(n,m,mat1);*/
	             boolean pq;
	             BufferedWriter bw;
	             //String Archivo;
	             do
	             {
	          //System.out.println("Enter the name for the matrix?");
	          Archivo=JOptionPane.showInputDialog("Enter the name for the matrix?");
	          //boolean nombre=true;
	           //Scanner teclado=new Scanner(System.in);
	          //Archivo=teclado.nextLine();
	          /*abre archivo*/
	          
	          String extension1=Integer.toString(0);
	String extension;
	if (cuadrada)
	{
	 extension="_square.txt";
	}else{
	extension="_no_square.txt";
	}
	Archivo=Archivo+extension1;
	          String Archivado="Files/"+Archivo+extension;
	          File f =new File(Archivado);
	          
	            
	             if (!f.exists()) {
	                  //System.out.println("File "+f.getName()+" does not exist, I proceed to create it");
	                  
	                   if (!ruta.exists()) {
	                 //System.out.println("Directory "+ruta.getName()+" does not exist, I proceed to create it");  
	                 if (ruta.mkdir()) {
	                      //System.out.println("Directory created");
	                       if (f.createNewFile()){
	                            //System.out.println("File "+f.getName()+" created");
	                            pq=true;
	                        }else{
	                           //System.out.println("File "+f.getName()+" could not create"); 
	                           JOptionPane.showMessageDialog(null,"File "+f.getName()+" could not create");
	                           pq=false;
	                        }
	                    }else{
	                        //System.out.println("Directory "+ruta.getName()+" could not create");
	                        JOptionPane.showMessageDialog(null,"File "+ruta.getName()+" could not create");
	                        pq=false;
	                    }
	                }else{
	                        if(f.createNewFile()){
	                              //System.out.println("File "+f.getName()+" created");
	                              pq=true;
	                            }else{
	                                 //System.out.println("File "+f.getName()+" could not create");
	                                 JOptionPane.showMessageDialog(null,"File "+f.getName()+" could not create");
	                                 pq=false;
	                                }
	                }
	            }else{
	                 //System.out.println("File "+f.getName()+" it already exist, i can't modify it");
	                 JOptionPane.showMessageDialog(null,"File "+f.getName()+" it already exist, i can't modify it");
	                 pq=false;
	                /*escribe en fichero
	                FileWriter f1= new FileWriter("Nombres.txt");*/
	              
	            }
	        }while(pq==false);
	        
	         /*FileWriter f1= new FileWriter(Archivo);*/
	         bw =new BufferedWriter(new FileWriter(Archivo));
	         String l1=Integer.toString(n);
	         String l2=Integer.toString(m);
	         bw.write(l1);
	         bw.write(" ");
	         //bw.write(l2);
	         //bw.write(" ");
	         
	         c1=n;
	         c2=m;
	          for( i=1;i<=n;i++)
	        {
//	            for( j=1;j<=m;j++)
	         for(j=1;j<=n;j++)
	            {
	              mat[i][j]=mat1[i][j]+"";  
	         bw.write(mat[i][j]);
	 bw.write(" ");
	        }
	    }
	         bw.close();
	    }
	  }      
	                
	                
	            
	                     

	         
	    
	    else
	    {
	        boolean bq;
	        //System.out.println("What matrix do you want to load");
	        //JOptionPane.showMessageDialog(null,"What matrix do you want to load");
	         if (!ruta.exists()) {
	             //System.out.println("There are not any yet !");
	            JOptionPane.showMessageDialog(null,"There are not any yet !");
	            }else{
	        /*abre archivo*/
	 
	       
	        
	//System.out.println("Files .txt in the directory: "+ruta.getAbsolutePath());
	//JOptionPane.showMessageDialog(null,"Files .txt in the directory: "+ruta.getAbsolutePath());
	String[] lista=ruta.list(new Filtro(".txt"));
	int nume=0;
	if(lista==null){
	//System.out.println("Entire: 0 Files");
	JOptionPane.showMessageDialog(null,"Entire: 0 Files");
	}else{
	/*List<String> ejemploLista = new ArrayList<String>();
	String listaE;
	String listaB="File "+0+" -> "+lista[0];
	*/
	/*for (int i=0;i<lista.length;i++){
	 listaE="File "+i+" -> "+lista[i];
      ejemploLista.add(listaE);
     
	}*/
	Object num = JOptionPane.showInputDialog(
   null,
   "What matrix do you want to load",
   "Files .txt in the directory: "+ruta.getAbsolutePath()+" Entire: "+lista.length,
   JOptionPane.QUESTION_MESSAGE,
   null,  // null para icono defecto
   lista, 
   0);
	//System.out.println("File "+i+" -> "+lista[i]);
	
	//System.out.println("Entire: "+lista.length);
	
	for (int i=0;i<lista.length;i++){
	if (num==lista[i])
	{
	nume=i;
	
	}
	}
	}


	         //System.out.println("Choose...write the file number");
	          
	       
	     
	         //int num= sc.nextInt();
	boolean hp=true;
	String h1=lista[nume];
	Archivo=h1;
	         /*String b="Ficheros/"+seguir+".txt";*/
	        for (int s=1; s<=h1.length();s++)
	{


	if(h1.charAt(s)==(char)95)
	{
	h=h1.substring(0,s);
	hp=false;

	break;
	}
	}
	if (hp==true)
	{
	h=h1.substring(0,h1.length()-1);
	}
	// System.out.println(h);       
	         Contenido(h);
/*	         for(int i=0;i<c1;i++)
	      {
	          for(int j=0;j<c2;j++)
	          {
	             
	             mat1[i+1][j+1]=(int) Double.parseDouble(mat[i+1][j+1]);
	             // mat1[i+1][j+1]=mat[i+1][j+1];
	            }
	           // System.out.println(" ");
	        }
	        */
	if (c1==c2)
	{
	cuadrada=true;
	}else{
	cuadrada=false;
	 }
	    }
	    }
	}
	public static boolean nombrar(){
	if (nombre==true)
	{return true;}else{return false;}
	
	}
	public static String nombramiento(){
	return Archivo;
	}
	  static void Contenido(String Archivo) throws FileNotFoundException, IOException {
	    int numeroEntero;
	    int dimension=0;
	    int dimension1=0;
	    int dimension2=0;
	    int n,m;
	    File felipe =new File(Archivo);
	    Scanner entrada =new Scanner(felipe);
	    numeroEntero=entrada.nextInt();
	    n=numeroEntero;
	    numeroEntero=entrada.nextInt();
	    m=numeroEntero;
	    c1=n;
	    c2=m;
	    while(entrada.hasNextInt()){
			numeroEntero=entrada.nextInt();
			
			
			
			
				dimension1=(int)(dimension/n)+1;
				dimension2=(dimension%m)+1;
dimension=dimension+1;
// System.out.println("Matriz["+dimension1+"]["+dimension2+"]="+numeroEntero);
	    mat1[dimension1][dimension2]=numeroEntero;
	}
	    
/*	     String cadena;
	   String cadena1[]=new String [102];
	    char a;
	int dedo=1;
	cadena1[1]="";
	      FileReader f=new FileReader(Archivo);
	      BufferedReader b=new BufferedReader(f);
	      cadena=b.readLine();
	//System.out.println(cadena);
	       b.close();
	     for(int o=0;o<cadena.length()-1;o++)
	{
	a=cadena.charAt(o);
	   //cadena=cadena1.substring(1,cadena.length());

	if (a==(char)32)
	{
	dedo=dedo+1;
	cadena1[dedo]="";
	}
	else
	{
	/*if(a==(char)46)
	{
	a=((char)44);
	}*/
//	cadena1[dedo]=cadena1[dedo]+a;
	/*System.out.println("indice "+dedo);
	System.out.println("cadena "+cadena1[dedo]);*/

//	}

//	}

	   /*cadena=cadena1.substring(1,cadena1.length());
	StringTokenizer tokens=new StringTokenizer(cadena," ");
	String[] newCadena =new String[tokens.countTokens()];
	newCadena[1]=tokens.nextToken();
	c1=Integer.valueOf(newCadena[1]);
	newCadena[2]=tokens.nextToken();
	c2=Integer.valueOf(newCadena[2]);  
	 System.out.println("Matriz de dimensiones : "+c1+" * "+c2);
	     
	      int yo=2;
	for(int i=1;i<=c1;i++){
	for(int j=1;j<=c2;j++){
	     
	yo=yo+1;
	newCadena[yo]=tokens.nextToken();
	              mat[i][j]=newCadena[yo];
	            }
	        }
	     */
/*	double p1,p2;
	p1=Double.valueOf(cadena1[1]);
	p2=Double.valueOf(cadena1[2]);
	/*c1=p1.intValue();
	c2=p2.intValue();*/
/*	c1=(int) p1;
	c2=(int) p2;
	int g=3;
	do
	{
	/*System.out.println(g);
	System.out.println(cadena1[g]);*/
//	mat[(int)((g-3)/c2)+1][(int)((g-3)%c2)+1]=cadena1[g];
	/*System.out.println(mat[(int)((g-3)/c2)+1][(int)((g-3)%c2)+1]);
	System.out.println((int)((g-3)/c2)+1);
	System.out.println((int)((g-3)%c2)+1);*/
//	g=g+1;
//	}while(g<(c1*c2)+3);

	   
	
	}
	static  int mat1[][]=new int [11][11];
    static String mat[][]=new String [15][15];
 
    static int c1,c2;
    static int number1,number2;

static String h;
}

class Filtro implements FilenameFilter{
	String extension;
	Filtro(String extension){
	this.extension=extension;
	}

	public boolean accept(File ruta, String nombre){
	return nombre.endsWith(extension);
	}
}


 class FormatoMatriz {

	public static void Salida (double mat2[][], int c1, int c2){
		String g=" ";
		for (int k=12;k>=c1;k--)
		{
		System.out.println(" ");
		}
		for (int k=12;k>=c2*6;k--)
		{
		g=g+" ";
		}
		 DecimalFormat df=new DecimalFormat("###.##");
		for(int i=0;i<c1;i++)
		{
		for (int j=0;j<c2;j++)
		{
		System.out.print(g+df.format(mat2[i][j])+"   ");
		}
		System.out.println(" ");
		}
		
		}
	}


/*class Inversas {
	 public static double Salida (int rango1, double nueva[][]) {
		 double matriz[]=new int[260];
         double nueva1[][]=new int [9][9];
         double nueva2[][]=new int [10][10];
         double nueva3[][]=new int [10][10];
        rang =rango1-1;
       int elementos=rango1;
        int opciones=rang;
       double det;
        int i,j;
         int Combinaciones=Combinatoria.Combinaciones(elementos, opciones);
    
     int ha,hb;
    
     
     int Total=Combinatoria.Total(opciones);
     
     

    
                 
         
     String salida="";
     int q=0;
     int h=0;
     int sale=0;
        while(sale<Total)     
        {
             h=h+1;
    
     
     salida=Integer.toString(h);
   
    
       sale=h; 
       boolean p1;
       
        p1=Combina.Combo(opciones,sale,salida);
       
     


                  if (p1==true) {
                     q=q+1;
                   matriz[q]=sale;
                 
             }   
         
         }
        String sale1;
        String sale2;
        char saleA;
        char saleB;
        int A,B;
          for(i=1;i<Combinaciones+1;i++)
          {
              sale1=String.valueOf(matriz[i]);
             
          for(j=1;j<Combinaciones+1;j++)
          {
              sale2=String.valueOf(matriz[j]);
              
             
              int o;
              ha=0;
              hb=0;
              
              /*for( o=0;o<rango1;o++) {
                  String ok=String.valueOf(o);
                 if(!ok.equals(sale1)) {ha=0;}*/
 /*             
              for( o=0;o<rango1;o++) {
                  String k=Integer.toString(o);
                  
             if (!sale1.contains(k))  {ha=o;}
              }
              
              for( o=0;o<rango1;o++) {
                  String k=Integer.toString(o);
             
             if (!sale2.contains(k))  {hb=o;}
              }
         
           int g1,g2;
              for (g1=0;g1<rang;g1++)
              {
                   saleA=sale1.charAt(g1);
                   A=Character.getNumericValue(saleA);
                 
                  for(g2=0;g2<rang;g2++)
                  {
                      saleB=sale2.charAt(g2);
                      B=Character.getNumericValue(saleB);
              
             
              nueva1[rang-g1-1][rang-g2-1]=nueva[A][B];
             
            
          }
         
      }
            
             double signo=Math.pow(-1, ha+hb);
              nueva2[ha][hb]=signo*Determinante.det(rang,nueva1);
              
          }
          }
          det=Determinante.det(rango1,nueva);
          for(int a=0;a<rango1;a++) {
              for(int b=0;b<rango1;b++)
          nueva3[a][b]=nueva2[b][a]/det;
          }
          FormatoMatriz.Salida(nueva3, rango1,rango1);
determinaI=Determinante.det(rango1,nueva3);
return determinaI;
          
    }


	
	static int rang;
	    static double determinaI;
	    
}

*/
class OtroPaso {

	public static void Limpieza (){
		for(int i=1;i<24;i++)
		{
		 System.out.println(" ");
		}
	}

	public static void PresionaEnter() {
		 String seguir;
		    Scanner teclado=new Scanner(System.in);
		    System.out.println("Press enter for to continue...");
		    
		        seguir=teclado.nextLine();
	}

}

class Signatura {
	public static int Signo (String poro) {
		


		String poros;
		poros=poro;
		int matem;
		matem=poros.length();
		int loc1,loc2;
		int i,j;
		         
		        double e=1;
		        int e1;
		            /*System.out.println("Resolviendo...");
		            System.out.println(lista2);*/
		        for(j=0;j<matem-1;j++)
		        {
		           
		            /*System.out.println(lista2);*/
		            char lugar1=poros.charAt(j);
		            loc1=Character.getNumericValue(lugar1);

		         for(i=j+1;i<matem;i++)
		{  

		            char lugar2=poros.charAt(i);

		            loc2=Character.getNumericValue(lugar2);
		            

		 

		e=e*(loc2-loc1)/(i-j);
		}
		}
		e1=(int) e;
		sig=e1;
		 return sig;
		
	}

	static int sig;
}



/**
 * Class BallDemo - provides two short demonstrations showing how to use the 
 * Canvas class. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */

 

    
    

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
  /*  public static void 
    {
        myCanvas = new Canvas("MATRICES", 600, 500);
        myCanvas.setVisible(true);
        drawDemo();
    }*/
    
class Canvas
{
    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColor;
    private Image canvasImage;

    /**
     * Create a Canvas with default height, width and background color 
     * (300, 300, white).
     * @param title  title to appear in Canvas Frame     
     */
    public Canvas(String title)
    {
        this(title, 300, 300, Color.white);        
    }int mat5[][]=new int [11][11];

    /**
     * Create a Canvas with default background color (white).
     * @param title  title to appear in Canvas Frame
     * @param width  the desired width for the canvas
     * @param height  the desired height for the canvas
     */
    public Canvas(String title, int width, int height)
    {
        this(title, width, height, Color.white);
    }

    /**
     * Create a Canvas.
* @param title  title to appear in Canvas Frame
     * @param width  the desired width for the canvas
     * @param height  the desired height for the canvas
     * @param bgClour  the desired background color of the canvas
     */
    public Canvas(String title, int width, int height, Color bgColor)
    {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        canvas.setPreferredSize(new Dimension(width, height));
        backgroundColor = bgColor;
        frame.pack();
    }

    /**
     * Set the canvas visibility and brings canvas to the front of screen
     * when made visible. This method can also be used to bring an already
     * visible canvas to the front of other windows.
     * @param visible  boolean value representing the desired visibility of
     * the canvas (true or false) 
     */
    public void setVisible(boolean visible)
    {
        if(graphic == null) {
            // first time: instantiate the offscreen image and fill it with
            // the background color
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
 graphic = (Graphics2D)canvasImage.getGraphics();
            graphic.setColor(backgroundColor);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(true);
    }

    /**
     * Provide information on visibility of the Canvas.
     * @return  true if canvas is visible, false otherwise
     */
    public boolean isVisible()
    {
        return frame.isVisible();
    }

    /**
     * Draw the outline of a given shape onto the canvas.
     * @param  shape  the shape object to be drawn on the canvas
     */
    public void draw(Shape shape)
    {
        graphic.draw(shape);
        canvas.repaint();
    }
 
    /**
     * Fill the internal dimensions of a given shape with the current 
     * foreground color of the canvas.
     * @param  shape  the shape object to be filled 
 */
    public void fill(Shape shape)
    {
        graphic.fill(shape);
        canvas.repaint();
    }

    /**
     * Fill the internal dimensions of the given circle with the current 
     * foreground color of the canvas.
     */
    public void fillCircle(int xPos, int yPos, int diameter)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos, diameter, diameter);
        fill(circle);
    }

    /**
     * Fill the internal dimensions of the given rectangle with the current 
     * foreground color of the canvas. This is a convenience method. A similar 
     * effect can be achieved with the "fill" method.
     */
    public void fillRectangle(int xPos, int yPos, int width, int height)
    {
        fill(new Rectangle(xPos, yPos, width, height));
    }

    /**
     * Erase the whole canvas.
     */
    public void erase()
    {
 Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Erase the internal dimensions of the given circle. This is a 
     * convenience method. A similar effect can be achieved with
     * the "erase" method.
     */
    public void eraseCircle(int xPos, int yPos, int diameter)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos, diameter, diameter);
        erase(circle);
    }

    /**
     * Erase the internal dimensions of the given rectangle. This is a 
     * convenience method. A similar effect can be achieved with
     * the "erase" method.
     */
    public void eraseRectangle(int xPos, int yPos, int width, int height)
    {
        erase(new Rectangle(xPos, yPos, width, height));
    }

    /**
     * Erase a given shape's interior on the screen.
     * @param  shape  the shape object to be erased 
*/
    public void erase(Shape shape)
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.fill(shape);              // erase by filling background color
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Erases a given shape's outline on the screen.
     * @param  shape  the shape object to be erased 
     */
    public void eraseOutline(Shape shape)
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.draw(shape);  // erase by drawing background color
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Draws an image onto the canvas.
     * @param  image   the Image object to be displayed 
     * @param  x       x co-ordinate for Image placement 
     * @param  y       y co-ordinate for Image placement 
     * @return  returns boolean value representing whether the image was 
     *          completely loaded 
     */
public boolean drawImage(Image image, int x, int y)
    {
        boolean result = graphic.drawImage(image, x, y, null);
        canvas.repaint();
        return result;
    }

    /**
     * Draws a String on the Canvas.
     * @param  text   the String to be displayed 
     * @param  x      x co-ordinate for text placement 
     * @param  y      y co-ordinate for text placement
     */
    public void drawString(String text, int x, int y)
    {
        graphic.drawString(text, x, y);   
        canvas.repaint();
    }

    /**
     * Erases a String on the Canvas.
     * @param  text     the String to be displayed 
     * @param  x        x co-ordinate for text placement 
     * @param  y        y co-ordinate for text placement
     */
    public void eraseString(String text, int x, int y)
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.drawString(text, x, y);   
        graphic.setColor(original);
  canvas.repaint();
    }

    /**
     * Draws a line on the Canvas.
     * @param  x1   x co-ordinate of start of line 
     * @param  y1   y co-ordinate of start of line 
     * @param  x2   x co-ordinate of end of line 
     * @param  y2   y co-ordinate of end of line 
     */
    public void drawLine(int x1, int y1, int x2, int y2)
    {
        graphic.drawLine(x1, y1, x2, y2);   
        canvas.repaint();
    }

    /**
     * Sets the foreground color of the Canvas.
     * @param  newColor   the new color for the foreground of the Canvas 
     */
    public void setForegroundColor(Color newColor)
    {
        graphic.setColor(newColor);
    }

    /**
     * Returns the current color of the foreground.
     * @return   the color of the foreground of the Canvas 
     */
    public Color getForegroundColor()
    {
  return graphic.getColor();
    }

    /**
     * Sets the background color of the Canvas.
     * @param  newColor   the new color for the background of the Canvas 
     */
    public void setBackgroundColor(Color newColor)
    {
        backgroundColor = newColor;   
        graphic.setBackground(newColor);
    }

    /**
     * Returns the current color of the background
     * @return   the color of the background of the Canvas 
     */
    public Color getBackgroundColor()
    {
        return backgroundColor;
    }

    /**
     * changes the current Font used on the Canvas
     * @param  newFont   new font to be used for String output
     */
    public void setFont(Font newFont)
    {
        graphic.setFont(newFont);
    }

    /**
     * Returns the current font of the canvas.
 * @return     the font currently in use
     **/
    public Font getFont()
    {
        return graphic.getFont();
    }

    /**
     * Sets the size of the canvas.
     * @param  width    new width 
     * @param  height   new height 
     */
    public void setSize(int width, int height)
    {
        canvas.setPreferredSize(new Dimension(width, height));
        Image oldImage = canvasImage;
        canvasImage = canvas.createImage(width, height);
        graphic = (Graphics2D)canvasImage.getGraphics();
        graphic.drawImage(oldImage, 0, 0, null);
        frame.pack();
    }

    /**
     * Returns the size of the canvas.
     * @return     The current dimension of the canvas
     */
    public Dimension getSize()
    {
        return canvas.getSize();
    }
/**
     * Waits for a specified number of milliseconds before finishing.
     * This provides an easy way to specify a small delay which can be
     * used when producing animations.
     * @param  milliseconds  the number 
     */
    public void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (InterruptedException e)
        {
            // ignoring exception at the moment
        }
    }

    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class CanvasPane extends JPanel
    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }
}

class Dependientes{
	 static boolean fila[]=new boolean [10];
	 static boolean columna[]=new boolean [10];
	public static void depende(int r,int number1,int mat1[][])
	{
		int rabia;
		for (rabia=0;r<number1;r++)
		{
			fila[r]=false;
		}
		for (rabia=0;r<number1;r++)
		{
			columna[r]=false;
		}
		/*double mat4[][]=new double [10][10];
		int o,p;
		/*calcula que filas o-y filas son dependientes
		 *fila/columna(x)-dependiente =true; independiente=false
		 * donde r es el rango, Hola[r] es la cantidad de menores que hay para rango r
		 * A[a][b][c] son los subindices de las filas de la matriz completa 
		 * para el menor a de rango b y fila c 
		 * mat1[A[a][b][c]] señala la fila para el ( si A[][][2] vale 5
		 * es que la segunda fila del menor es la 5)
		 * menornulo[a] ea el numero del menor nulo a (dentro de todos los menores)
		 * cantidadnulos[r] para cada rango r */
	
		 /*Conjunto[] arr=new Conjunto[10];*/
		 
		 
		
		 
		/* Integer sy[]=new Integer[10];
		/* for (t=0;t<cantidadnulos[r];t++){
			 
		 Set<Integer> s[]=new HashSet<Integer>[10]();
	 }
	  for (t=0;t<cantidadnulos[r];t++){
			*/ 
			
			
		int a,i,j,g;	
		int contador;		
		
contador=0;

 int fact=0;
 for (int f=0;f<=number1-1;f++)
 {
	 fact=fact+f;
 }
	 	
	 for( a=0;a<number1-1;a++)
 {
	for(i=a;i<number1-1;i++)
	{
		
		
		 for ( g=0;g<number1-1;g++)
	 {
		 for (j=g;j<number1-1;j++)
		 {
		 
		 if (mat1[a][g]*mat1[i+1][j+1]-mat1[i+1][g]*mat1[a][j+1]==0)
		 {
			 
			 contador=contador+1;
			 
		 }
	 }
	 
	 }
	
	 

if (contador==fact){
	fila[a]=true;
	fila[i+1]=true;
}


contador=0;
}		
}
contador=0;
  for( a=0;a<number1-1;a++)
 {
	for(i=a;i<number1-1;i++)
	{
		
		
		 for ( g=0;g<number1-1;g++)
	 {
		 for (j=g;j<number1-1;j++)
		 {
		 
		 if (mat1[g][a]*mat1[j+1][i+1]-mat1[g][i+1]*mat1[j+1][a]==0)
		 {
			 
			 contador=contador+1;
			 
		 }
	 }
	 
	 }
	
	 

if (contador==fact){
	columna[a]=true;
	columna[i+1]=true;
}


contador=0;
}		
}

 /*for(a=0;a<number1-1;a++)
 {	 
 for ( i=a;i<number1-1;i++)
	 {
		
		 for (g=0;g<number1-1;g++)
	 {
		 if (mat1[g][a]*mat1[g+1][i+1]-mat1[g+1][a]*mat1[g][i+1]==0)
		 {
			 columna[i]=true;
			 columna[i+1]=true;
		 }
		 else
		 {
			 columna[i+1]=false;
			 break;
		 }
	 }
 }
 }
 
  

*/		
}
	public static boolean filas(int y1)
	{
		
		 return fila[y1];
	}
	public static boolean columnas(int y2)
	{	
		
		 return columna[y2];
	}
}

/*class Conjunto(int r,int cantidadnulos[],int menornulo[],int C[][][]){
        public Set<Integer>s1=new HashSet<>();		
           Conjunto (Set s1){
           this.s1;
           }

}
*/
class Archivar
{
	
	public static boolean Archivo(int n, int m, int mat1[][],boolean cuadrada,String Archivo,int rangos) throws IOException {
	/*public static void Archivo(int n, int m, int mat1[][],boolean cuadrada)
	{
	 */
	 String mat[][]=new String[200][200];
		String ruta1="Files";
		 File ruta =new File(ruta1);
		boolean pq;
	             BufferedWriter bw;
	             
	             
	          //System.out.println("With what name ?");
	          
	         //  Scanner teclado=new Scanner(System.in);
	         // Archivo=teclado.nextLine();
	          /*abre archivo*/
	          String extension1=Integer.toString(rangos);
	String extension;
	if (cuadrada)
	{
	 extension="_square.txt";
	}else{
	extension="_no_square.txt";
	}
	Archivo=Archivo+extension1;
	          String Archivado="Files/"+Archivo+extension;
	          File f =new File(Archivado);
	          
	            
	             if (!f.exists()) {
	                  //System.out.println("File "+f.getName()+" does'nt exist, i proceed to create it");
	                  
	                   if (!ruta.exists()) {
	                 //System.out.println("Directory "+ruta.getName()+" does'nt exist , proceed to create it");  
	                 if (ruta.mkdir()) {
	                      //System.out.println("Directory created");
	                       if (f.createNewFile()){
	                            //System.out.println("File "+f.getName()+" create");
	                            pq=true;
	                        }else{
	                           //System.out.println("File "+f.getName()+" could not cretae"); 
	                           JOptionPane.showMessageDialog(null,"File "+f.getName()+" could not create");
	                           pq=false;
	                        }
	                    }else{
	                        //System.out.println("Directory "+ruta.getName()+" could not create");
	                        JOptionPane.showMessageDialog(null,"Directory "+ruta.getName()+" could not create");
	                        pq=false;
	                    }
	                }else{
	                        if(f.createNewFile()){
	                              //System.out.println("File "+f.getName()+" create");
	                              pq=true;
	                            }else{
	                                 //System.out.println("File "+f.getName()+" could not create");
	                                 JOptionPane.showMessageDialog(null,"File "+f.getName()+" could not create");
	                                 pq=false;
	                                }
	                }
	            }else{
	                 //System.out.println("File "+f.getName()+" it already exist, i can't modify it ");
	                 JOptionPane.showMessageDialog(null,"File "+f.getName()+" it already exist, i can't modify it ");
	                 pq=false;
	                /*escribe en fichero
	                FileWriter f1= new FileWriter("Nombres.txt");*/
	                
	            }
	        if (pq==true)
	        {
	        
	         /*FileWriter f1= new FileWriter(Archivo);*/
	         bw =new BufferedWriter(new FileWriter(Archivo));
	         String l1=Integer.toString(n);
	         String l2=Integer.toString(m);
	         bw.write(l1);
	         bw.write(" ");
	         bw.write(l2);
	         bw.write(" ");
	         
	          for(int i=0;i<n;i++)
	        {
//	            for(int j=1;j<=n;j++)
	for(int j=0;j<n;j++)
	            {
	              mat[i][j]=mat1[i][j]+"";  
	         bw.write(mat[i][j]);
	 bw.write(" ");
	        }
	    }
	         bw.close();
	         {return true;} 
	    }
	            else{return false;}
	                
	       }         
	           
	           
	                     

		 }
/*	 class matrizes
{
static String Koko;
public static String matrizas(int matrizas[][],int number1)
{
String koko="[";
for(int io=0;io<number1;io++)
{
for(int jo=0;jo<number1;jo++)
{
//matrizas[io][jo]=(int)(Math.random()*20-10);
String Locas=String.valueOf(matrizas[io][jo]);
koko=koko+Locas;
if(jo<2)
{
koko=koko+" ";
}
}
if(io<2)
{
koko=koko+";";
}
}
koko=koko+"]";
// System.out.println(matriz);
// System.out.println(k);
return Koko;
}

}
*/
 class Determinante
{

public static int[][] submatrize(int matriz[][], int x, int y)
 {
  int submatriz[][] = new int[matriz.length-1][matriz.length-1];
  int i, j, cur_x=0, cur_y=0;
  for (i=0;i<matriz.length;i++)
  {
   if (i != x)
   {
    cur_y=0;
    for (j=0;j<matriz.length;j++)
    {
     if (j != y)
     {
      submatriz[cur_x][cur_y] = matriz[i][j];
      cur_y++;
     }
    }
    cur_x++;
   }
  }
  return submatriz;
 }

 public static int determin(int matriz[][])
 {
  int deter=0;
  int i, mult = 1;
  if (matriz.length > 2)
  {
   for (i=0;i<matriz.length;i++)
   {
    deter += mult * matriz[i][0] * determin(submatrize(matriz,i,0));
    mult *= -1;
   }
   return deter;
  }else
   return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
 }
 }
 /*
 class reduccion
 {
 static void bloques (int matriz[][],int rango, int tamano)
 {
 */
