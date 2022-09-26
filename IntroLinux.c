//Los comentarios son para trasladarlo a libreria java
//Quitar el int main
/* falta arreglar las variables enteras o exactas en la recuperacion
del archivo (poner un chivato).
Y también, modificar la matriz recuperada*/
/* Falta asemejar los archivos al java y
manipulacion de archivos con contraseña de nombre*/
/* Clase de salida para matrices nada mas en recuperacion
Clase salida para sistemas en creacion*/

/* Modificar presentacion*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <termios.h>
#include <stdbool.h>
/*#include "JavaIntroduce.h"*/

// Borrar la pantalla
#define CLEAR() printf("\033[2J")
 
// Desplazamiento superior
#define MOVEUP(x) printf("\033[%dA", (x))
 
// Downlight
#define MOVEDOWN(x) printf("\033[%dB", (x))
 
// Desplazamiento izquierdo
#define MOVELEFT(y) printf("\033[%dD", (y))
 
// movimiento correcto
#define MOVERIGHT(y) printf("\033[%dC",(y))
 
// posicionar el cursor
#define MOVETO(x,y) printf("\033[%d;%dH", (x), (y))
 
// reinicio del cursor
#define RESET_CURSOR() printf("\033[H")
 
// Cursor oculto
#define HIDE_CURSOR() printf("\033[?25l")
 
// mostrar cursor
#define SHOW_CURSOR() printf("\033[?25h")
 
// contrarrestar
#define HIGHT_LIGHT() printf("\033[7m")
#define UN_HIGHT_LIGHT() printf("\033[27m")

#define NUM_MAX 6
 
FILE *fileptr;

char getch(void) {
		struct termios conf_vieja, conf_nueva;
		char c;
		tcgetattr(0,&conf_vieja);
		conf_nueva = conf_vieja;
		conf_nueva.c_lflag &= (~ICANON);
		conf_nueva.c_cc[VTIME] = 0;

		conf_nueva.c_cc[VMIN] = 1;
		tcsetattr(0,TCSANOW,&conf_nueva);
		c = getchar();
		tcsetattr(0,TCSANOW,&conf_vieja);
		return c;
	}
	
void Bienvenido()
{
	
int e;
char nombre[50];


CLEAR();

printf("Introduce tu nombre completo (50 letras máximo) :\n");
scanf("%49[0-9a-zA-Z ]",nombre);
printf("¿Cuántos años tienes , %s ? \n",nombre);
scanf("%d",&e);
printf("Bienvenido al programa de introduccion de sistemas de ecuaciones, programas y matrices\n");
printf("amigo %s de %d años de edad.\n",nombre,e);
CLEAR();
/*printf("Este programa crea y modifica (enteros o continuos)... o solo lee\n");
printf("Pensado para que el java pueda leer tanto enteros como continuos\n");
printf("Pulsa una tecla...\n");
*/


}


char Exactitud()
{
	char Exacto;
	printf("¿Numeros exactos o enteros? e/X\n");
scanf("%s",&Exacto);
return Exacto;
}


void creafuncion(int coef)
{
char juan;
double A;
	
for ( int h=0;h<coef;++h){
printf (" Introduzca el valor para el coeficiente %d .\n",h+1);

scanf("%lf", &A);
fprintf(fileptr,"%f\n", A);

}
printf("Pulse una tecla\n");
juan=getch();

	
CLEAR();
}


	

void crearfuncion(int coef)
{
char juan;
int B;

for ( int h=0;h<coef;++h){
printf (" Introduzca el valor para el coeficiente %d .\n",h+1);

scanf("%d",&B);
fprintf(fileptr,"%d\n", B);	

}
printf("Pulse una tecla\n");
juan=getch();

	
CLEAR();
}

	
void creaobjetivo(int col)
{
char juan;
double A;
	
for ( int h=0;h<col;++h){
printf (" Introduzca el valor para la variable %d .\n",h+1);

scanf("%lf", &A);
fprintf(fileptr,"%f\n", A);

}
printf("Pulse una tecla\n");
juan=getch();

	
CLEAR();
}


	

void crearobjetivo(int col)
{
char juan;
int B;

for ( int h=0;h<col;++h){
printf (" Introduzca el valor para la variable %d .\n",h+1);

scanf("%d",&B);
fprintf(fileptr,"%d\n", B);	

}
printf("Pulse una tecla\n");
juan=getch();

	
CLEAR();
}

char federico()
{
	char fed;
printf("INTRODUCE r PARA RECUPERAR UN ARCHIVO\n");
printf("INTRODUCE c PARA CREAR UN ARCHIVO\n");
printf("Si eliges recuperar se trabajara con doble precision\n");
printf("Pero tienes que tener ya creada la matriz de partida\n");
scanf("%s",&fed);
printf("Espera...\n");
sleep (1);
return fed;
}


	static void modificar(double matrix[10][10],int fil,int col)
	{
		char letra;
		double A;
	CLEAR();
	int x=0;
int y=0;
for (int i=0;i<fil;i++){
	x=4;
	y=y+1;
	for (int j=0;j<col;++j){
		
		
		MOVETO(y,x-3);
		
		printf("%1.f",matrix[y-1][(x/4)-1]);
	
x=x+4;
	}
}
x=1;
y=1;
MOVETO(16,2);
printf("d-down,u-up,l-left,r-right,i-insert,e-end");

do
{
	letra=getch();
	
	if((letra=='d')&&(y<fil))
	{
		MOVELEFT(1);
		
		printf("%1.f",matrix[y-1][(x/4)]);
	
		y=y+1;
	}
	if((letra=='u')&&(y>1))
	{
        MOVELEFT(1);
		
		printf("%1.f",matrix[y-1][(x/4)]);
	
		y=y-1;
	}
	if ((letra=='l')&&(x>1))
	{
		MOVELEFT(1);
		
		printf("%1.f",matrix[y-1][(x/4)]);
	
		x=x-4;
	}
	if((letra=='r')&&(x<((col-1)*4)))
	{
		MOVELEFT(1);
	
		printf("%1.f",matrix[y-1][(x/4)]);
	
		x=x+4;
	}
	if (letra=='i')
	{
		MOVELEFT(1);
		printf("    ");
		MOVELEFT(4);
		
scanf("%lf", &A);
matrix[y-1][(x/4)]=A;

			
		
}
MOVETO(15,2);

printf ("valor para fila %d y columna %d es %f \n",y,(x/4)+1,matrix[y-1][(x/4)]);
MOVETO(y,x);
}while(letra!='e');
MOVELEFT(1);
printf("    ");
MOVELEFT(3);

printf("%1.f",matrix[y-1][(x/4)]);

MOVETO(17,2);

printf("FIN DE LA MODIFICACION\n");
}
 

	
	



	static void modificacion(int matriz[10][10], int fil, int col)
	{
		char letra;
		int B;
	CLEAR();
	int x=0;
int y=0;
for (int i=0;i<fil;i++){
	x=4;
	y=y+1;
	for (int j=0;j<col;++j){
		
		
		MOVETO(y,x-3);
		
		printf("%d",matriz[y-1][(x/4)-1]);
	
x=x+4;
	}
}
x=1;
y=1;
MOVETO(16,2);
printf("d-down,u-up,l-left,r-right,i-insert,e-end");

do
{
	letra=getch();
	
	if((letra=='d')&&(y<fil))
	{
		MOVELEFT(1);
		
		printf("%d",matriz[y-1][(x/4)]);
	
		y=y+1;
	}
	if((letra=='u')&&(y>1))
	{
        MOVELEFT(1);
		
		printf("%d",matriz[y-1][(x/4)]);
	
		y=y-1;
	}
	if ((letra=='l')&&(x>1))
	{
		MOVELEFT(1);
		
		printf("%d",matriz[y-1][(x/4)]);
	
		x=x-4;
	}
	if((letra=='r')&&(x<((col-1)*4)))
	{
		MOVELEFT(1);
		
		printf("%d",matriz[y-1][(x/4)]);
	
		x=x+4;
	}
	if (letra=='i')
	{
		MOVELEFT(1);
		printf("    ");
		MOVELEFT(4);
		
		scanf("%d",&B);
			matriz[y-1][(x/4)]=B;

}
MOVETO(15,2);

	printf ("valor para fila %d y columna %d es %d \n",y,(x/4)+1,matriz[y-1][(x/4)]);
	MOVETO(y,x);

}while(letra!='e');
MOVELEFT(1);
printf("    ");
MOVELEFT(3);

	printf("%d",matriz[y-1][(x/4)]);

MOVETO(17,2);

printf("FIN DE LA MODIFICACION\n");
}
 


/*JNIEXPORT jint JNICALL Java_JavaIntroduce_Matriz
  (JNIEnv *env, jobject jobj)*/



int main(int argc, char **argv)
{

static int matriz[10][10];
static double matrix[10][10];
double A;
int B;
static int coef,fil,col;
register int i,j,h,g;


char letra;
char federo;

double matcoef[10];
double funcoef[10];
int funccoef[10];
int matrcoef[10];
char nombre[8];
char nombre1[8];

int longo[10];
int longi;
bool rayo;
char caracter;
char Exacto;
char entrar;
char querer;
char querido;
int quiero;
int querida;

Bienvenido();


entrar=federico();
if (entrar=='c')
{

printf("ELIJA EL NOMBRE DEL ARCHIVO A CREAR.\n");
printf("CON EL FORMATO **max8**.DAT\n");
scanf("%s",nombre);

if ((fileptr =fopen(nombre, "w+")) !=NULL)  {

printf (" Introduzca el numero de coeficientes.\n");
scanf("%d", &coef);
fprintf(fileptr,"%d\n",coef);
printf(" Introduzca el numero de VARIABLES.\n");
scanf("%d", &col);
fprintf(fileptr,"%d\n",col);

CLEAR();



printf("Ahora introducimos la matriz...\n");
Exacto=Exactitud();

CLEAR();

fil=coef;

for (i=0;i<fil;++i) {
for (j=0;j<col;++j) {


MOVETO(2,5);

printf (" Introduzca el valor para la fila %d y la columna %d.\n",i+1,j+1);

MOVETO(3,5);
printf("      ");
MOVELEFT(6);
HIGHT_LIGHT();




if (Exacto=='X')
{

scanf("%lf", &A);
matrix[i][j]=A;
MOVETO(i*2+6,j*6+6);
UN_HIGHT_LIGHT();
printf("%f",A);
}
else
{
scanf("%d", &B);
	matriz[i][j]=B;
MOVETO(i*2+6,j*6+6);
UN_HIGHT_LIGHT();
printf("%d",B);
}
}
}
printf("\n");

sleep (3);
MOVETO(16,2);
printf(" Quieres modificar la matriz, s-si/n-no\n");
scanf("%s",&caracter);

if (caracter=='s')
{
	if(Exacto=='e')
		{
			modificar(matrix,fil,col);
			
		}
		else
		{
			modificacion(matriz,fil,col);
			
		}
	
}
printf("¿Quieres introducir el vector de coeficientes s-si/X-no?\n");
scanf("%s",&querer);

printf("¿Quieres introducir una funcion objetivo s-si/X-no?\n");
scanf("%s",&querido);

if (querer=='s')
{
fprintf(fileptr,"%d\n",1);
}
else
{
fprintf (fileptr,"%d\n",0);
}
if (querido=='s')
{
fprintf(fileptr,"%d\n",1);
}
else
{
fprintf (fileptr,"%d\n",0);
}
for(i=0;i<fil;i++)
{
	for(j=0;j<col;j++)
	{
		if(Exacto=='e')
		{
fprintf(fileptr,"%f\n", matrix[i][j]);
}
else
{
	fprintf(fileptr,"%d\n", matriz[i][j]);
}
}
}

if (querer=='s')
{
printf("Para el vector de coeficientes:\n");
Exacto=Exactitud();
if (Exacto=='e')
{
	creafuncion(coef);
}
else
{
	crearfuncion(coef);
}
	}	
if (querido=='s')
{
printf("Para la funcion objetivo:\n");
Exacto=Exactitud();
if (Exacto=='e')
{
	creaobjetivo(col);
}
else
{
	crearobjetivo(col);
}
}	
printf("Fin del programa");	
printf("Pulse una tecla\n");
caracter=getch();

CLEAR();

}
else{
printf("apertura fallida");
}
}
else{
printf("ELIJA EL NOMBRE DEL ARCHIVO A LEER.\n");
printf("CON EL FORMATO **max8**.DAT\n");
scanf("%s",nombre);
	printf(" Procedo a leer el archivo\n");
	printf(" Te aviso que solo lee matrices enteras, de momento");
	sleep (2);
CLEAR();
	if ((fileptr =fopen(nombre, "r")) !=NULL)  {
fscanf(fileptr,"%d\n",&coef);
fscanf(fileptr,"%d\n",&col);
fscanf(fileptr,"%d\n",&quiero);
fscanf(fileptr,"%d\n",&querida);
Exacto='X';
MOVETO(1,1);
fil=coef;

for (i=0;i<fil;++i){
	rayo=false;
	longi=0;
	int juan=1;
int o;
for (j=0;j<col;++j){
fscanf(fileptr,"%d\n",&B);
matriz[i][j]=B;

if ( quiero==1)
{
for ( o= 1;o<=NUM_MAX;o++)
{
	juan=juan*10;
	if(B<juan)
	{
		break;
	}
}
longi=longi+o;
	
if(rayo)
{
printf("+%1.d%c",B,j+97);
}
else
{
	printf("%1.d%c",B,j+97);
	rayo=true;
}
}
else
{
	MOVETO(i*2+6,j*6+6);

printf("%d",B);
}
}
printf("\n");
longo[i]=longi+col*2;

}
sleep (1) ;

if (quiero==1)
{
for (h=0;h<coef;++h){
fscanf(fileptr,"%d\n",&B);

matrcoef[h]=B;

}
for (g=0;g<coef;g++)
{
	MOVETO(g+1,longo[g]);
	printf("=%1.d",matrcoef[g]);
}
}
rayo=false;
if (querida==1)
{
MOVETO(16,2);
printf("Funcion objetivo:\n");
for (j=0;j<col;++j){

fscanf(fileptr,"%d\n",&B);
funccoef[j]=B;
if(rayo)
{
printf("+%1.d%c",B,j+97);
}
else
{
printf("z = %1.d%c",B,j+97);
rayo=true;
}
}
}
printf("\n");
printf("Quieres modificar la matriz s-si,n-no\n");
scanf("%s",&caracter);

if (caracter=='s')
{
	if(Exacto=='e')
		{
			modificar(matrix,fil,col);
			
		}
		else
		{
			modificacion(matriz,fil,col);
			
		}
	
}
printf("ELIJA EL NUEVO NOMBRE DEL ARCHIVO A CREAR.\n");
printf("CON EL FORMATO **max8**.DAT\n");
scanf("%s",nombre1);

if ((fileptr =fopen(nombre1, "w+")) !=NULL)  {
	
	fprintf(fileptr,"%d\n",coef);
	fprintf(fileptr,"%d\n",col);
	if (querer=='s')
{
fprintf(fileptr,"%d\n",1);
}
else
{
fprintf (fileptr,"%d\n",0);
}
if (querido=='s')
{
fprintf(fileptr,"%d\n",1);
}
else
{
fprintf (fileptr,"%d\n",0);
}
	// fprintf(fileptr,"%d\n",0);
	// fprintf(fileptr,"%d\n",0);
	for(i=0;i<fil;i++)
{
	for(j=0;j<col;j++)
	{
		if(Exacto=='e')
		{
fprintf(fileptr,"%f\n", matrix[i][j]);
}
else
{
	fprintf(fileptr,"%d\n", matriz[i][j]);
}
}
}
}
else
{
	printf("apertura fallida");
}

printf("\n");

printf("FIN DEL PROGRAMA\n");
}



else{
printf("apertura fallida");
}
}
fclose(fileptr);
exit(1);
}
