import java.util.*;
/**
 * Write a description of class Percom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 class Signatura3
{
   
   public static void main(String[] args)
   {
int luis=0;

int sig;
int poro;
System.out.println("INTRODUCE LA PERMUTACION: ");
   Scanner reader = new Scanner(System.in);
   poro=reader.nextInt();
       
        float loc1,loc2,loc,h;
        float federico;
       
        int matem;
        
        String poros;

        int i,j;
       
       
       
      
        poros=String.valueOf(poro);
        
        matem=poros.length();
       
       
       float e=1;
        for(j=0;j<matem-1;j++)
        {
           
            /*System.out.println("Es j: "+j);*/
           
            char lugar1=poros.charAt(j);
            loc1=Character.getNumericValue(lugar1);

         for(i=j+1;i<matem;i++)
{  

            char lugar2=poros.charAt(i);

            loc2=Character.getNumericValue(lugar2);
            
loc=loc2-loc1;
h=i-j;
 
federico=loc/h;
e=e*federico;

luis=(int) e;
            }
}
System.out.println("La signatura es: "+luis);
      




 
}

}

