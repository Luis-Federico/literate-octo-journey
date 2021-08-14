
import java.util.*;

import java.io.File;
import java.io.FilenameFilter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;


public class Matrices
{
    static int opciones;
    static int elementos;
    static int N;
    static int x;
    static int poro;
    static int sale;
    static String salida;
static boolean cuadrada;
   
               static float nueva[][]=new float [10][10];
    static int rango1;    
    /* public int matriz[]=new int[40400]; */
     static float det;
  static float mat1[][]=new float [11][11];
  static float mat2 [][]=new float [11][11];
static float mat3[][]=new float [11][11];
  
  static float n,m;
static int number1, number2;

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
        
        public static void main (String [] args)
        {
           
            int i,j,fact;
            int loc,l;
           
           
            float matcoef1 []= new float[10];
            int matcoef2 []= new int [10];
            float matterm[]=new float[15];
    
        /*float [][] mat1  =new float[10][10];*/
        
         

 
            
        
            
           
            int matriz[]=new int[260];
            
          
            int sig;
            
            boolean p1;
       
           
            
            
            int combinatoria;
            
            String sale1;
            String sale2;
            char saleA;
            char saleB;
            int A,B;
            
            int rango;
            
            int g1,g2;
            boolean gh=true;
            int mat;
            int o;
            float determinacion;
            
         int s;
           int t;
           int r2;
           boolean chivato=false;
        boolean verdad;
        boolean perobueno;
        /*System.out.println("Introduce el numero de lineales y enteros ");*/

        

       

        /*System.out.println("Enter second number: enteros ");
        int number2 = input.nextInt();

        
        System.out.println("Introduce los coeficientes lineales");
        for(i=0;i<number1;i++)
        {
            matcoef1[i]=input.nextDouble();
        }
        System.out.println("Introdice los coeficientes enteros");
        for(i=0;i<number2;i++)
        {
            matcoef2[i]=input.nextInt();
        }
        System.out.println("Introdice el numero de restricciones");
        int number3= input.nextInt();
        System.out.println("Introduce los terminos independientes");
        for(i=0;i<number3;i++)
        {
            matterm[i]=input.nextDouble();
        }
        /*System.out.println("Introduce la matriz entera");
        for(i=0;i<number3;i++)
        {
            for(j=0;j<number2;j++)
            {
                mat2[i][j]=input.nextInt();
            }
        }*/
      Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DE MATRICES");
        /*i tenia que ser number3*/
        try{
        Entrada.CreaMatriz();
    }catch(IOException e){
        e.printStackTrace();
    }
    recuperar();
   cuadrada=Entrada.entra();

for(i=0;i<mat1.length;i++)
{
for(j=0;j<mat1[i].length;j++)
{
mat2[i][j]=mat1[i][j];
}
}
OtroPaso.PresionaEnter();
OtroPaso.Limpieza();
FormatoMatriz.Salida(mat2,number1,number2);
    if (cuadrada)
    {
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
      System.out.println("¿ QUIERE SABER EL RANGO ?");
System.out.println("Pulse 1-SI, pulse otro NUMERO-NO");

  int teclo= sc.nextInt();    
       if (teclo==1)
{

        /*System.out.println("Introduce la longitud de las permutaciones (menor que 9):");*/
    /*    N=input.nextInt();*/
     rango=number1;
       
     /* no me gusta, repasar lo de rango==10*/  
     if (rango == 10)
     {
         rango1=rango-1;
        determinacion=0;
         mat=-1;
         for (o=0;o<=9;o++)
         {
             
         for (g1=0;g1<=9;g1++)
         {
            for(g2=1;g2<=9;g2++)
            {
                
                 if (g1==o)
                 {
                     g2=9;
                     g1=g1+1;
                   }
                     nueva[g1][g2]=mat1[o][g2];
                  
               
           }
       }
       det=Determinante.det(rango1, nueva);
       mat=mat*(-1);
       
            determinacion=determinacion+mat1[o][0]*det*mat;
           }
for(i=0;i<rango1;i++)
{
for(j=0;j<rango1;j++)
{
mat2[i][j]=nueva[i][j];
}
}
OtroPaso.PresionaEnter();
OtroPaso.Limpieza();
FormatoMatriz.Salida(mat2, rango1,rango1);
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
               System.out.println("El determinante total es: " + det);
                if(det!=0)
                {
                    System.out.println("El rango es: 10");
                     verdad=false;
                   }
                    else
    {
    System.out.println("El rango no es: 10");
    perobueno= false;
    rango1=10;
    }
   
           }
               
               
       
         if (verdad=true)
         {
             /*el perobueno es ojo con rango=10
                cuando acabe el perobueno entrara el rango 10*/
             if (perobueno=true)
             {
        rango1=rango;
         int i1,i2;
           for (i1=0;i1<number1;i1++)
          {
              for(i2=0;i2<number1;i2++)
              {
              nueva[i1+1][i2+1]=mat1[i1][i2];
            }
        }
        
        det=Determinante.det(rango1,nueva);
        gh=true;
         System.out.println("El determinante total es: " + det);
     if(det!=0)
        { 
          
            System.out.println("El rango es: " + rango1);
            gh=false;
        }
          else
    {
    System.out.println("El rango no es: " + rango1);
    }
}
     rango1=rango1-1; 
     if (gh==true){
         while(rango1>=2)
         {
            
        
        
          
      
          elementos=number1;
          opciones=rango1;
         
          
           int factorialm=1;
       int factorialn=1;
       int factorialmn=1;
       
      
       
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
       combinatoria=factorialm/(factorialn*factorialmn);
       
  
       int Total=1;
       int r;
               for (r=0;r<opciones;++r){
                   Total=Total*10;
               }
                   
           
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
           
           
          
            for(i=1;i<combinatoria+1;i++)
            {
                sale1=String.valueOf(matriz[i]);
               
            for(j=1;j<combinatoria+1;j++)
            {
                sale2=String.valueOf(matriz[j]);
                s=1;
                t=1;
                System.out.println("Probemos con el menor siguiente ");

for(int i3=0;i3<number1;i3++)
{
for(int j3=0;j3<number1;j3++)
{
mat3[i3][j3]=0;
}
}
                
                for (g1=0;g1<rango1;g1++)
                {
                     saleA=sale1.charAt(g1);
                     A=Character.getNumericValue(saleA);
                     t=1;
                    for(g2=0;g2<rango1;g2++)
                    {
                        saleB=sale2.charAt(g2);
                        B=Character.getNumericValue(saleB);
                 
                
                nueva[s][t]=mat1[A][B];
                t=t+1;
               mat3[A][B]=1;
            }
            s=s+1;
        }

for(int i3=1;i3<=rango1;i3++)
{
for(int j3=1;j3<=rango1;j3++)
{
mat2[i3-1][j3-1]=nueva[i3][j3];
}
}
OtroPaso.PresionaEnter();
OtroPaso.Limpieza();
System.out.println("HE AQUÍ EL MENOR:");
System.out.println("   ");
System.out.println("   ");
System.out.print("   "+"T");
for(int pu=0;pu<number1;pu++)
{
System.out.print("-");
}
System.out.println("T");

for(int i3=0;i3<number1;i3++)
{
System.out.print("   |");
for(int j3=0;j3<number1;j3++)
{
if (mat3[i3][j3]==1)
{
System.out.print("#");
}else{
System.out.print(" ");
}
}
System.out.println("|");

}
System.out.print("   L");
for(int pu=0;pu<number1;pu++)
{
System.out.print("-");
}

System.out.println("J");

FormatoMatriz.Salida(mat2,rango1,rango1);
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
         det=Determinante.det(rango1,nueva);
        System.out.println("El determinante total del rango "+rango1+" es: " + det);
     if(det!=0)
        { 
          
            System.out.println("El rango es: " + rango1);
            chivato=true;
            break;
           
        }
          else
    {
    System.out.println("De momento el rango no es: " + rango1);
    chivato=false;
    }
        }
        if (chivato==true)
        {
            break;
        }
        }
       if (chivato==false)
       {
     rango1=rango1-1;
    }
    else
    {
        break;
    }
    }
}
 
}
}
}else{

 System.out.println("Véase el programa del simplex");



}
}
static void recuperar()
{
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
             System.out.println(" ");
            }
             for(int i=0;i<number1;i++)
      {
          for(int j=0;j<number2;j++)
          {
           
            
                
              mat1[i][j]=mat2[i+1][j+1];
             System.out.print(mat1[i][j]+" ");
            }
         System.out.println(" ");
    }
    
}


              
    
      /* opciones3=1;
       for (o=1;o==opciones;o++)
        {
         opciones3=opciones3*10
        }*/
        /*revuelve=Integer.parseInt(devuelve);
             if((revuelve>menor)&&(revuelve<mayor))
           {
                     e=e+1;
                   matrice[e]=revuelve;
                   /*break;*/
                   /*x=fact;
                }*/
            
       
               
        
       
      

    

     /* System.out.println("Todos los números combinatorios entre "+menor+" y "+mayor+" son: "+e);
      System.out.println("Introduzca un número para verlos");
      clave=input.nextInt();
      int ti;
      
               for(ti=1;ti==e;ti++)
         {      
                System.out.println(matrice[ti]);
            }
        */
    

    

       /*System.out.println("Introduce un entero para continuar viendo las permutaciones...");
        clave=input.nextInt();
       
   for (x=1;x<=fact;x++)
  {
      Adperm.Per(N);
      por=Adperm.Porpoco(x);
      
         System.out.println(por);
        
    }*/
  


       
  
   /*public static void main (String[]args){
        int i;
        Entrada();
        
        /*int elementos;
        // initialise instance variables
        /*String opcion;
       
       /* int elementos;
        int N;
        int minimo,maximo;
          Scanner input = new Scanner(System.in);    
        System.out.println("Introduce el número mínimo:");
        minimo =input.nextInt();
    /*if (elementos>10){
        System.out.println("¡ Es erróneo !");
       }
        System.out.println("Introduce el número de elementos para cada combinación.");
           /*System.out.println("El programa, de momento, sólo sirve para combinaciones de, como mucho, 3 elementos.");*/
        
          /*opciones =input.nextInt();
        System.out.println("Es el número de opciones para combinar. Número máximo: 9");
        System.out.println("Menor que el anterior y como mínimo 2");*/
        /*System.out.println("Introduce el número maximo:");
        maximo =input.nextInt();
        
    /*if(opciones>=elementos){
        System.out.println("¡ Es erróneo !");
       }*/
       
       
       /* LO SIGUIENTE ES PROVISIONAL*/
       /*elementos=10;
       /*opcion=minimo+"";
       opciones=opcion.length();
       N=opciones;



/*Creaperm.Perm( N);*/
    


  /*   for(i=1;i<25;i++){ 
       System.out.println(matriz[i]);
    }*/
/*for(i=1;i<25;i++){
       System.out.println(matriz3[i]);
    }
    
  */ 
  static public void presionaenter()
{
    String seguir;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Presiona la tecla Enter para continuar...");
    
        seguir=teclado.nextLine();
   
    
}
}
 class Signatura
{
    static float sig;
   public static float Signo(int poro)
   {
   

boolean hacer1, hacer2;


int matriz [][]=new int[9][9];
HashSet<Integer> lista1 = new HashSet<Integer>();
HashSet<Integer> lista2 = new HashSet<Integer>();
HashSet<Integer> lista3 = new HashSet<Integer>(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9}));

 int matem;
       
 String poros;
  poros=Integer.toString(poro);
    
    int loc1,loc2,h;
      
   hacer1=false;
   hacer2=false;
  
   lista1.removeAll(lista3);
   lista2.removeAll(lista3);


  
   
    matem=poros.length();
   
   if (matem<=10)
   {
       hacer1=true;
 for(h=0;h<=matem-1;h++)
   {

            lista1.add(h);
            char lugar1=poros.charAt(h);
            loc1=Character.getNumericValue(lugar1);
            lista2.add(loc1);


            }

           /* if(lista1.equals(lista2))
            {
                
                hacer2=true;
            
            }
            else
            {
                System.out.println(lista1);
                System.out.println(lista2);
                System.out.println(" ¡ No es permutación! ");
                System.out.println(" ¡ It is not a permutation ");
                hacer2=false;

            }
   }
   else
   {
       System.out.println(" ¡ El número tiene que ser de 10 cifras como máximo ! ");
    System.out.println(" ¡ Max length=10 ! ");
       hacer1=false;
   }

   */
   
}
      



       
       
       

        int i,j;
       
       
       
      
        
       
       
       float e=1;
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

            





 
sig=e;


/*System.out.println("La signatura de la permutación: "+poro+" es: "+sig);*/
      




 


   return sig;
}

}
 class Entrada
{
    static  float mat1[][]=new float [11][11];
    static String mat[][]=new String [15][15];
 
    static int c1,c2;
    static int number1,number2;
static boolean cuadrada;
static String h;
   public static void CreaMatriz() throws IOException
   {
      
       
         String ruta1="Ficheros";
        File ruta =new File(ruta1);
     
       
       int numero;
      
       System.out.println("Pulse 1 para crear una matriz");
        System.out.println("Pulse cualquier otro NUMERO para recuperar una matriz");
        String seguir;
      
    
   
        
        
       
    
    
     Scanner sc = new Scanner(System.in);
     
         int seguir1= sc.nextInt();
     if (seguir1==1)
     {
System.out.println("MATRIZ CUADRADA 1/OTRO-NUMERO MATRIZ NO CUADRADA ");

 int tecla=sc.nextInt();

if (tecla==1){
System.out.println("INTRODUCE LA DIMENSION, max=10 ");
number1= sc.nextInt();
number2=number1;
cuadrada=true;
}else{
 System.out.println("INTRODUCE EL NÚMERO DE FILAS, max=10 ");
       
         number1= sc.nextInt();
 System.out.println("INTRODUCE EL NÚMERO DE COLUMNAS, max=10 ");
         number2= sc.nextInt();
if (number1!=number2){
cuadrada=false;
}
}
int n=number1;
int m=number2;
c1=number1;
c2=number2;
       for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.println("Introduce :"+i+" , "+j+" :");
                mat1[i][j]=sc.nextFloat();
                
            }
        }
    
    
        System.out.println("Pulse 2 para grabar la matriz");
        System.out.println("Pulse otra tecla para seguir");
         seguir1= sc.nextInt();
         if (seguir1==2)
         {
             boolean pq;
             BufferedWriter bw;
             String Archivo;
             do
             {
          System.out.println("¿Con que nombre?");
           Scanner teclado=new Scanner(System.in);
          Archivo=teclado.nextLine();
          /*abre archivo*/
String extension;
if (cuadrada)
{
 extension="_cuadrada.txt";
}else{
extension="_no_cuadrada.txt";
}
          String Archivado="Ficheros/"+Archivo+extension;
          File f =new File(Archivado);
          
            
             if (!f.exists()) {
                  System.out.println("Fichero "+f.getName()+" no existe, procedo a crearlo");
                  
                   if (!ruta.exists()) {
                 System.out.println("Directorio "+ruta.getName()+" no existe, procedo a crearlo");  
                 if (ruta.mkdir()) {
                      System.out.println("Directorio creado");
                       if (f.createNewFile()){
                            System.out.println("Fichero "+f.getName()+" creado");
                            pq=true;
                        }else{
                           System.out.println("Fichero "+f.getName()+" no se ha podido crear"); 
                           pq=false;
                        }
                    }else{
                        System.out.println("Directorio "+ruta.getName()+" no se ha podido crear");
                        pq=false;
                    }
                }else{
                        if(f.createNewFile()){
                              System.out.println("Fichero "+f.getName()+" creado");
                              pq=true;
                            }else{
                                 System.out.println("Fichero "+f.getName()+" no se ha podido crear");
                                 pq=false;
                                }
                }
            }else{
                 System.out.println("Fichero "+f.getName()+" ya existe, no puedo modificarlo");
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
         bw.write(l2);
         bw.write(" ");
         c1=n;
         c2=m;
          for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
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
        System.out.println("¿Que matriz desea recuperar?");
         if (!ruta.exists()) {
             System.out.println("Todavia no hay");
            
            }else{
        /*abre archivo*/
 
       
        
System.out.println("Archivos .txt en el directorio: "+ruta.getAbsolutePath());
String[] lista=ruta.list(new Filtro(".txt"));
if(lista==null){
System.out.println("Total: 0 Archivos");
}else{
for (int i=0;i<lista.length;i++){
System.out.println("Archivo "+i+" -> "+lista[i]);
}
System.out.println("Total: "+lista.length);
}


         System.out.println("Elija...escriba el número del fichero");
          
       
     
         int num= sc.nextInt();
boolean hp=true;
String h1=lista[num];
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
 System.out.println(h);       
         Contenido(h);
         for(int i=0;i<c1;i++)
      {
          for(int j=0;j<c2;j++)
          {
             
              mat1[i+1][j+1]=Float.valueOf(mat[i+1][j+1]);
             
            }
            System.out.println(" ");
        }
if (c1==c2)
{
cuadrada=true;
}else{
cuadrada=false;
 }
    }
    }
}
  static void Contenido(String Archivo) throws FileNotFoundException, IOException {
     String cadena;
   String cadena1[]=new String [102];
    char a;
int dedo=1;
cadena1[1]="";
      FileReader f=new FileReader(Archivo);
      BufferedReader b=new BufferedReader(f);
      cadena=b.readLine();
/*System.out.println(cadena);*/
       b.close();
     for(int o=0;o<cadena.length()-1;o++)
{
a=cadena.charAt(o);
   /*cadena=cadena1.substring(1,cadena.length());*/

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
cadena1[dedo]=cadena1[dedo]+a;
/*System.out.println("indice "+dedo);
System.out.println("cadena "+cadena1[dedo]);*/

}

}

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
float p1,p2;
p1=Float.valueOf(cadena1[1]);
p2=Float.valueOf(cadena1[2]);
c1=(int) p1;
c2=(int) p2;
int g=3;
do
{
/*System.out.println(g);
System.out.println(cadena1[g]);*/
mat[(int)((g-3)/c2)+1][(int)((g-3)%c2)+1]=cadena1[g];
/*System.out.println(mat[(int)((g-3)/c2)+1][(int)((g-3)%c2)+1]);
System.out.println((int)((g-3)/c2)+1);
System.out.println((int)((g-3)%c2)+1);*/
g=g+1;
}while(g<(c1*c2)+3);

   
}
public static boolean entra()
{
return cuadrada;
}
public static float entro (int numero)
{

    if (numero==1)
    {
        return (float)c1;
    }
    if (numero==2)
    {
        return (float)c2;
    }
   
    
    return mat1[(int)((numero-3)/c2)+1][(int)((numero-3)%c2)+1];
}
}

/*public boolean accept(File ruta, String nombre){
return nombre.endsWith(extension);
}*/
 class Filtro implements FilenameFilter{
String extension;
Filtro(String extension){
this.extension=extension;
}

@Override
public boolean accept(File ruta, String nombre){
return nombre.endsWith(extension);
}
}

 class Determinante
{
    static  float nueva[][]=new float [10][10];
    static float det;
    static int rango1;
    static int N,x,e;
    static float sig;
    static int poro;
      public static float det(int rango1, float nueva[][])
    {
    // instance variables - replace the example below with your own
   double valor;  
    
      
     float d;
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
         
       sig=Signatura.Signo(poro);
      
      
      d=1;
      String poros;
         poros=String.valueOf(poro);
                 for(int l=0;l<N;l++)
        {
           
            
           
            char moco=poros.charAt(l);
            int loc=Character.getNumericValue(moco);
           
         
          int i=(e%N)+1;
           e=e+1;
           /*loc=loc-1;*/
          /* valor=mat1[i][loc];*/
          valor=nueva[i][loc];
          /* System.out.println (i+" es i "+loc+" es j y "+valor+" es el valor");*/
             /* d=d*mat1[i][loc];*/
           d=d*nueva[i][loc];
          
        
           
            
    }
    d=d*sig;
            
        det=det+d;
        
}

return det;
}
}

    
    /**
     * Constructor for objects of class Determinante
     */
  
        // initialise instance variables
        
    


    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

 class Combina
{
  
  static boolean p1;
  
  /* public Combina ()
   
   {
       this.matriz2[260]=0;   
    }
     public Combina (int matriz2[])
    {
          this.matriz2[260]=matriz2[260];
        
    }*/
    public static boolean Combo (int opciones,int sale,String salida)
    {
        int g1,g2,g3,g4,g5,g6,g7,g8,g9;
        int g6a,g6b,g7a,g7b,g8a,g8b;
      char salida1, salida2, salida3, salida4, salida5, salida6, salida7, salida8, salida9;
     
     
   
      
       
       
   
      p1=false;
           switch (opciones){
           case 2:
               if (sale>=10){
                   p1=true;
           for (g1=salida.length()-2;g1==0;--g1){
                 
                 salida1=salida.charAt(g1);
                 
               for (g2=g1+1;g2==salida.length()-1;g2++){
                   
                   salida2=salida.charAt(g2);
                   
               if (Integer.valueOf(salida1)>Integer.valueOf(salida2)){
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
               if ((Integer.valueOf(salida1)>Integer.valueOf(salida2))&&(Integer.valueOf(salida2)>Integer.valueOf(salida3))){
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
               if ((Integer.valueOf(salida1)>Integer.valueOf(salida2))&&(Integer.valueOf(salida2)>Integer.valueOf(salida3))&&(Integer.valueOf(salida3)>Integer.valueOf(salida4))){
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
               if ((Integer.valueOf(salida1)>Integer.valueOf(salida2))&&(Integer.valueOf(salida2)>Integer.valueOf(salida3))&&(Integer.valueOf(salida3)>Integer.valueOf(salida4))&&(Integer.valueOf(salida4)>Integer.valueOf(salida5))){
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
                               
                               g6a=Integer.valueOf(salida2);
                               g6b=Integer.valueOf(salida3);
               if ((Integer.valueOf(salida1)>g6a)&&(g6a>g6b)&&(g6b>Integer.valueOf(salida4))&&(Integer.valueOf(salida4)>Integer.valueOf(salida5))&&(Integer.valueOf(salida5)>Integer.valueOf(salida6))){
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
                               
                               g6a=Integer.valueOf(salida2);
                               g6b=Integer.valueOf(salida3);
                               g7a=Integer.valueOf(salida4);
                               g7b=Integer.valueOf(salida5);
               if ((Integer.valueOf(salida1)>g6a)&&(g6a>g6b)&&(g6b>g7a)&&(g7a>g7b)&&(g7b>Integer.valueOf(salida6))&&(Integer.valueOf(salida6)>Integer.valueOf(salida7))){
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
                               
                               g6a=Integer.valueOf(salida2);
                               g6b=Integer.valueOf(salida3);
                               g7a=Integer.valueOf(salida4);
                               g7b=Integer.valueOf(salida5);
                               g8a=Integer.valueOf(salida6);
                               g8b=Integer.valueOf(salida7);
               if ((Integer.valueOf(salida1)>g6a)&&(g6a>g6b)&&(g6b>g7a)&&(g7a>g7b)&&(g7b>g8a)&&(g8a>g8b)&&(g8b>Integer.valueOf(salida8))){
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
                               
                               g6a=Integer.valueOf(salida2);
                               g6b=Integer.valueOf(salida3);
                               g7a=Integer.valueOf(salida4);
                               g7b=Integer.valueOf(salida5);
                               g8a=Integer.valueOf(salida6);
                               g8b=Integer.valueOf(salida7);
               if ((Integer.valueOf(salida1)>g6a)&&(g6a>g6b)&&(g6b>g7a)&&(g7a>g7b)&&(g7b>g8a)&&(g8a>g8b)&&(g8b>Integer.valueOf(salida8))&&(Integer.valueOf(salida8)>Integer.valueOf(salida9))){
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

}


class Adperm
{ 
   static int matriz[]=new int[40400];
   static String mmatriz;
    // instance variables - replace the example below with your own
  
    public static void Per(int N)
    {
        int n;
       
       
        int i,j,j1,k,l,z;
        int fact;
        int factn;
        
        
        String nmatrix;
        
        int cuenta;
        
        int nmatriz[]=new int[362881];
        
       
        int matrix;
       
        fact=1;
        for(j=1;j<=N;j++){
            
        fact=fact*j;
    }
       
       
        for  (n=1;n<=N;n++){
        switch (n){
            case 1:
            matriz[1]=1;
            break;
            case 2:
            matriz[1]=12;
            matriz[2]=21;
            break;
            case 3:
            cuenta=0;
         
            for(l=1;l<=2;l++){
                
                String mmatriz=nmatriz[l]+"";
                
                 for (k=1;k<=3;k++){
                      cuenta=cuenta+1;
                      if (k==1){
                          nmatrix="3"+mmatriz;
                        }
                        else
                        {
                 if (k==2){     
                nmatrix=mmatriz.substring(0,k-1)+"3"+mmatriz.substring(k-1,mmatriz.length());
            }
            else{
                nmatrix=mmatriz+"3";
            }
        }
                matriz[cuenta]=Integer.parseInt(nmatrix);
                
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
                          nmatrix="4"+mmatriz;
                        }
                        else
                        {
                if((1<k)&&(k<4)){      
                nmatrix=mmatriz.substring(0,k-1)+"4"+mmatriz.substring(k-1,mmatriz.length());
                
            }
            else
            {
                 nmatrix=mmatriz+"4";
            }
        }
            matriz[cuenta]=Integer.parseInt(nmatrix);
                
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
                          nmatrix="5"+mmatriz;
                        }
                        else
                        {
                      if((1<k)&&(k<5)){
                nmatrix=mmatriz.substring(0,k-1)+"5"+mmatriz.substring(k-1,mmatriz.length());
                
            }
            else
            {
                 nmatrix=mmatriz+"5";
            }
        }
            matriz[cuenta]=Integer.parseInt(nmatrix);
                
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
                          nmatrix="6"+mmatriz;
                        }
                        else
                        {
                      if((1<k)&&(k<6)){
                nmatrix=mmatriz.substring(0,k-1)+"6"+mmatriz.substring(k-1,mmatriz.length());
                
            }
            else
            {
                 nmatrix=mmatriz+"6";
            }
        }
            matriz[cuenta]=Integer.parseInt(nmatrix);
                
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
                          nmatrix="7"+mmatriz;
                        }
                        else
                        {
                      if ((1<k)&&(k<7)){
                
                       nmatrix=mmatriz.substring(0,k-1)+"7"+mmatriz.substring(k-1,mmatriz.length());
                    }
                    else
            {
                 nmatrix=mmatriz+"7";
            }
        }
                       matriz[cuenta]=Integer.parseInt(nmatrix);
                
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
                          nmatrix="8"+mmatriz;
                        }
                        else
                        {
                      if((1<k)&&(k<8)){
                nmatrix=mmatriz.substring(0,k-1)+"8"+mmatriz.substring(k-1,mmatriz.length());
            }
            else
            {
                 nmatrix=mmatriz+"8";
            }
        }
                matriz[cuenta]=Integer.parseInt(nmatrix);
                
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
                matriz[cuenta]=Integer.parseInt(nmatrix);
               
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


public static int Porpoco(int x)
 {
     return matriz[x];
    }

}

class FormatoMatriz 
{
  static public void Salida(float mat2[][], int c1, int c2)
{
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

class OtroPaso
{
static public void PresionaEnter()
{
 String seguir;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Presiona la tecla Enter para continuar...");
    
        seguir=teclado.nextLine();
   
}

static public void Limpieza()
{
for(int i=1;i<24;i++)
{
 System.out.println(" ");
}
}
}
