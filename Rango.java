import java.util.*;
/**
 * Write a description of class Adperm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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



 class Determinante
{
    static  float nueva[][]=new float [10][10];
    static float det;
    static int rango1;
    static int N,x,e;
    static float sig;
    static String poro;
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
    /* poro=Integer.ParseInt(poro)*/
      /*mat=matriz[i];
        /* devuelve=Percom.devolver(por,mat);*/
         
       sig=Signatura.Signo(poro);
      
      
      d=1;
      String poros;
         poros=poro;
                 for(int l=0;l<N;l++)
        {
           
            
           
            char moco=poros.charAt(l);
            int loc=Character.getNumericValue(moco);
           
         
          int i=(e%N);
           e=e+1;
           /*loc=loc-1;*/
          /* valor=mat1[i][loc];*/
          valor=nueva[i][loc];
           System.out.println (i+" es i "+loc+" es j y "+valor+" es el valor");
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
   public class Rango
{
    static int opciones;
    static int elementos;
    static int N;
    static int x;
    static int poro;
    static int sale;
    static String salida;
   
               static float nueva[][]=new float [10][10];
	static int rango1;	
    /* public int matriz[]=new int[40400]; */
     static float det;
 

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
            float mat1[][]=new float [10][10];
           
            float matcoef1 []= new float[10];
            int matcoef2 []= new int [10];
            float matterm[]=new float[15];
	
	    /*float [][] mat1  =new float[10][10];*/
	    
	     

 
	        
	    int mat2 [][]=new int [10][10];
            
           
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

		

		System.out.println("Enter a number de lineales n, tal que (nxn), max=10 ");
		Scanner sc = new Scanner(System.in);
		int number1= sc.nextInt();

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
		number1=number1;
		System.out.println("Introduce la matriz cuadrada lineal");
		/*i tenia que ser number3*/
		for(i=0;i<number1;i++)
		{
			for(j=0;j<number1;j++)
			{
			    System.out.println("introduce el término ("+i+" , "+j+" ) : ");
				mat1[i][j]=sc.nextFloat();
				System.out.println(mat1[i][j]);
			}
		}
	
            
	    /*System.out.println("Introduce la longitud de las permutaciones (menor que 9):");*/
	/*    N=input.nextInt();*/
	 rango=number1;
       
	 /* no me gusta, repasar lo de rango==10*/  
	 /*if (rango == 10)
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
	           
	    /*EL PROGRAMA ESTÁ MAL: REVISA LAS BOOLEANAS Y EL BUCLE DE CREACIÓN DE 'NUEVA'
	     * EN LA PRÓXIMA SEGUNDA CONDICIONAL ¡TIENE QUE CREAR 10*10 MATRICES 'NUEVA'
	     * POR ÚLTIMO ALMACENA LAS NUEVAS MATRICES DE RANGO MÁXIMO
	     * Y CONSTRUYE CON ELLAS LAS FILAS Y LAS COLUMNAS INDEPENDIENTES Y/O DEPENDIENTES.
	     */       
	   
	    /*if (verdad=true)
	     {
	         /*el perobueno es ojo con rango=10
	            cuando acabe el perobueno entrara el rango 10*/
	      /*   if (perobueno=true)
	         {*/
        rango1=rango;
         int i1,i2;
         /*  for (i1=0;i1<number1;i1++)
          {
              for(i2=0;i2<number1;i2++)
              {
              nueva[i1+1][i2+1]=mat1[i1][i2];
            }
        }*/
         for (i1=0;i1<number1;i1++)
          {
              for(i2=0;i2<number1;i2++)
              {
              nueva[i1][i2]=mat1[i1][i2];
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
/*}*/
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
	   salida=Integer.toString(h,elementos);
	   
	   /* ESTO ES LO QUE HAY QUE DEJAR*/
	   
	   /*salida=Integer.toString(h);*/
	  
	     /*sale=h;*/
             sale=Integer.parseInt(salida); 
	     
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
                s=0;
                t=0;
                /*System.out.println("Probemos con la matriz siguiente, introduzca un entero: ");
                int r1= sc.nextInt();*/
                for (g1=0;g1<rango1;g1++)
                {
                     saleA=sale1.charAt(g1);
                     A=Character.getNumericValue(saleA);
                     t=0;
                    for(g2=0;g2<rango1;g2++)
                    {
                        saleB=sale2.charAt(g2);
                        B=Character.getNumericValue(saleB);
                 
                
                nueva[s][t]=mat1[A][B];
                t=t+1;
               
            }
            s=s+1;
        }
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
        
        if (chivato==true)
        {
            break;
            
        }
        
        
      /* if (chivato==false)
       {
     rango1=rango1-1;
    }
    else
    {
        break;
    }*/

rango=rango-1;
    }
if (chivato==false)
{
System.out.println("El rango es: " + rango1);
}

}
 
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
    }*/
 class Signatura
{
    static float sig;
   public static float Signo(String poro)
   {
   

boolean hacer1, hacer2;


int matriz [][]=new int[9][9];
HashSet<Integer> lista1 = new HashSet<Integer>();
HashSet<Integer> lista2 = new HashSet<Integer>();
HashSet<Integer> lista3 = new HashSet<Integer>(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9}));

 int matem;
       
 String poros;
  poros=poro;
    
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


System.out.println("La signatura de la permutación: "+poro+" es: "+sig);
      




 


   return sig;
}

}
    
  
