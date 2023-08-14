#include <stdio.h>
void enteroACadena(int numero, char *bufer);
int main(void)
{
char file[10];
printf("Enter the name of the file: \n");
scanf("%s",file);
FILE *fp;
 FILE *graf;
 graf=popen("octave","w");
 fprintf(graf,"clear; \n");
 	int buffer[50][50];
 	int g;
 	fp = fopen ( file, "r" );
 	fscanf(fp, "%d", &g);
 	for(int r1=1;r1<g+1;r1++)
 	{
 	for(int r2=1;r2<g+1;r2++)
 	{
 	fscanf(fp, "%d" ,&buffer[r1][r2]);
 	char cadena[11]; // 11, porque puede medir hasta 10 y necesitamos un adicional para el carácter de terminación
        char cadena1[3];
        char cadena2[3];
        enteroACadena(buffer[r1][r2], cadena);
        enteroACadena(r1, cadena1);
        enteroACadena(r2, cadena2);
 	fprintf(graf,"matriz(%s,%s)=%s;\n",cadena1,cadena2,cadena);
 	//printf("matriz(%s,%s)=%s;  ",cadena1,cadena2,cadena);
 	}
        printf("\n");
        }
 
 fprintf(graf,"d=det(matriz) \n");
 fprintf(graf,"save %s.det d \n",file);
pclose(graf);

fclose ( fp );

return 0;
}
void enteroACadena(int numero, char *bufer){
    // Recuerda: u es para un unsigned int
    sprintf(bufer, "%d", numero);
}
