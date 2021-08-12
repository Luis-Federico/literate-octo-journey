import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

/*He modificado la variable sig de float a double en Signatura y se pasa a entero (ademas de mejorarla) */

public class Combinatoria
{
    static String variacion;
    static int combinatoria;
 public static void main (String [] args)
        {
            int y=0;
            String poro;
            int i;
            int matriz[]=new int[260];
            
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el numero de elementos");
 int elementos= sc.nextInt();
System.out.println("elementos>opciones");
 System.out.println("Introduce el numero de opciones");
 int opciones= sc.nextInt();
  
  
      
       combinatoria=Combinaciones.combinatoria(elementos,opciones);
       
       System.out.println("Las "+combinatoria+" combinaciones sin repeticion de: "+elementos+" elementos tomados de "+opciones+" en "+opciones+" son...:");
            presionaenter();
  
       int Total=1;
       int r;
               for (r=0;r<opciones;++r){
                   Total=Total*10;
               }

       String salida="";
       int q=0;
       int h=0;
       int sale=0;
       boolean p1;
          while(sale<Total)     
          {
               h=h+1;
     
       salida=Integer.toString(h,elementos);
       
    
         sale=Integer.parseInt(salida);
         
          p1=Combina.Combo(opciones,sale,salida);
         
       


                    if (p1==true) {
                          if (q<combinatoria)
                          {
                       q=q+1;
                     matriz[q]=sale;
                   
                   System.out.println(sale);
                }
               }   
           }
           int factorialn=1;
          for(i=1;i<=opciones;++i)
       {
          factorialn=factorialn*i;
       }
System.out.println("Las "+factorialn+" permutaciones sin repeticion de: "+elementos+" elementos son...:");
                      presionaenter();
            
        Adperm.Per(opciones);
             for (int x=1;x<=factorialn;x++)
  {
     
     poro=Adperm.Porpoco(x);
     System.out.print("[  ");
            for(int l=0;l<opciones;l++)
        {
            char moco=poro.charAt(l);
            int loc=Character.getNumericValue(moco);
            System.out.print(loc+"  ");
    }
     System.out.print("]   ");
  
       double sig=Signatura.Signo(poro);
       BigDecimal bd=new BigDecimal(sig).setScale(1, RoundingMode.HALF_UP);
       double sig1= bd.doubleValue();
       
       int sig2=(int)sig1;
   System.out.print("  Con signatura: "+sig2);
      if(sig2<0) {
          System.out.print("    ");
        }
        else
        {
          System.out.print("     ");
        }
     
       System.out.println(" ");
              
}

int variaciones=factorialn*combinatoria;
System.out.println("Las "+variaciones+" variaciones sin repeticion de: "+elementos+" elementos tomados de "+opciones+" en "+opciones+" son...:");
presionaenter();
q=0;
h=0;
sale=0;
 while(sale<Total)     
          {
               h=h+1;
     
       salida=Integer.toString(h,elementos);
       
    
         sale=Integer.parseInt(salida);
         
          p1=Combina.Combo(opciones,sale,salida);
         
       


                    if (p1==true) {
                          if (q<combinatoria)
                          {
                       q=q+1;
                     matriz[q]=sale;
                   
                   
                
                 
           
 for (int x=1;x<=factorialn;x++)
  {
      
     poro=Adperm.Porpoco(x);
      y=y+1;
variacion=Variaciones.variacion(sale,poro);
 System.out.print("Variacion :"+y+" :"); 
     System.out.println(variacion);
}
}
}
}
System.out.println("ESO ES TODO.");
    }
    
    
    static public void presionaenter()
{
    String seguir;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Presiona la tecla Enter para continuar...");
    
        seguir=teclado.nextLine();
   
    
}
}

 class Adperm
{ 
   static String matriz[]=new String[362881];
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

public static String Porpoco(int x)
 {
     return matriz[x];
    }
}

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
    public static boolean Combo(int opciones,int sale,String salida)
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

class Combinaciones
{
    static  int combinatoria;
    public static int combinatoria(int elementos, int opciones)
    {
   int factorialm=1;
       int factorialn=1;
       int factorialmn=1;
       
       
      
       
       for(int i=1;i<=elementos;i++)
       {
          factorialm=factorialm*i;
       }
       for(int i=1;i<=opciones;++i)
       {
          factorialn=factorialn*i;
       }
       for(int i=1;i<=(elementos-opciones);++i)
       {
          factorialmn=factorialmn*i;
       }
       combinatoria=factorialm/(factorialn*factorialmn);
       return combinatoria;
}
}

class Signatura
{
    static double sig;
   public static double Signo(String poro)
   {
   

boolean hacer1, hacer2;


int matriz [][]=new int[9][9];
String poros;
poros=poro;
int matem;
matem=poros.length();
int loc1,loc2;
/*HashSet<Integer> lista1 = new HashSet<Integer>();
HashSet<Integer> lista2 = new HashSet<Integer>();
HashSet<Integer> lista3 = new HashSet<Integer>(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9}));


 
    
    
      
   hacer1=false;
   hacer2=false;
  
   lista1.removeAll(lista3);
   lista2.removeAll(lista3);


  
   
   int h;
   
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
}
   */
   

      



       
       
       

        int i,j;
       
       
       
      
        
       
       
       double e=1;
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

class Variaciones
{
    static String variacion;
   
    public static String variacion (int sale,String poro)
    {
          int loc1,loc2,h;
         
          
          String a=sale+"";
          variacion="";
      
  int matriz []=new int[9];
  /*
  HashSet<String> lista1 = new HashSet<String>();
 
  HashSet<String> lista3 = new HashSet<String>(Arrays.asList(new String[]{"0","1","2","3","4","5","6","7","8","9"}));
   lista1.removeAll(lista3);
  */


  
   
   
   
   for(int l=0;l<a.length();l++)
        {
            /* Aqui se cojn los caracteres de la combinacion */
            char moco=a.charAt(l);
            int loc=Character.getNumericValue(moco);
           
 
       /* Aqui se cojen los caracteres de la permutacion */
            char mocos=poro.charAt(l);
            int loco=Character.getNumericValue(mocos);
           
           matriz[loco]=loc;
           
        }
           for(int l=0;l<a.length();l++)
           {
               
           String b=matriz[l]+"";
           /*lista1.add(b);*/
           variacion=variacion+b;
        }
           
         /*System.out.println(lista1);*/
 
     return variacion;
    
            
        }
         

                
           }
           
