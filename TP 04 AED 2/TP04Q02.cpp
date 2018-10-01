#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

	FILE *arq; //Ponteiro que referencia o arquivo
	int ent = 0, result;
	double num;
	char tmp[100];

	int in; //Numero de entradas

	arq = fopen("tp04q02.txt", "wb+"); //Arquivo aberto em modo de leitura

	if(arq == NULL){ //Se o arquivo nao pode ser aberto, encerrar o programa

		return 0;

	}
	else{

		scanf("%d", &in); //Le o numero de entradas

		int i;

		//Preenche o arquivo com todas entradas
		for(i = 0; i < in; i++){

			scanf("%lf", &num);
			fwrite(&num, sizeof(double), 1, arq);

		}

		i = in - 1;

		fclose(arq); //Fecha o arquivo
		
		arq = fopen("tp04q02.txt", "rb"); //Abre novamente o arquivo em modo escrita

		for(; i >= 0; i--){

			int n = i * sizeof(double); //Posicao do ponteiro 

			fseek(arq, n, SEEK_SET); //Movimenta o ponteiro no arquivo
			fread(&num, sizeof(double), 1, arq); //Le a linha em que o ponteiro se encontra
			printf("%g\n", num); //Printa o numero real da linha

		}
		
		fclose(arq); //Fecha o arquivo

	}
	

	

	return 0;

}
