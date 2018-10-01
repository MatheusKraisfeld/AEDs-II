#include <stdlib.h>
#include <stdio.h>

void main(){

	char entrada[1000][1000];
	int linhamax = 1000, final = 0, cont = 0;
	int ehPalindromo(char entrada[], int inicio, int fim);
	int verificaFim(char entrada[], int inicio);

	do{

		scanf(" %[^\n]s", entrada[cont]);
		final = verificaFim(entrada[cont], 0);

	}while(final != 1 && cont++ < linhamax);

	cont--;

/*
loop para alimentar o array de entradas ate encontrar a palavra FIM
*/

	int i, palindromo, tamanho;

	for(i = 0; i <= cont; i++){

		tamanho = 0;

		while(entrada[i][tamanho] != '\0'){

                	tamanho++;

        	}

		tamanho--;

		palindromo = ehPalindromo(entrada[i], 0, tamanho);

		if(palindromo == 1){

			printf("SIM\n");

		}
		else{

			printf("NAO\n");

		} // fim if else

/*
loop que retorna a saida de cada elemento do array
*/

	} // fim for

} // fim main
              
int verificaFim(char entrada[], int posicao){

	int resp = 0;
	char final[] = "FIM";

	if(entrada[posicao] == final[posicao] && entrada[posicao] == '\0'){

		resp = 1;

	}
	else if(entrada[posicao] == final[posicao]){

			resp = 0 + verificaFim(entrada, posicao + 1);

		}

	return resp;

} // fim verificaFim

/*
caso base --- se entrada for \0 e entrada for igual a final, significa que percorreu o vetor todo
se entrada for igual a final, retorna 0 + a chamada do metodo na proxima posicao
*/

int ehPalindromo(char entrada[], int inicio, int fim){

	int resp = 0;

	if(inicio > fim){

		resp = 1;

	}
	else if(entrada[inicio] == entrada[fim]){

			resp = 0 + ehPalindromo(entrada, inicio + 1, fim - 1);

		}

	return resp;

}

/*
caso base -- inicio ser maior que fim, pois as comparacoes se repetem
se a posicao inicio for igual a fim, resp recebe 0 mais o proximo caso
*/

