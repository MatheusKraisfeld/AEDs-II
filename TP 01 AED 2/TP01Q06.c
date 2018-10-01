#include <stdio.h>
#include <stdlib.h>

void main(){
	
	char entrada[1000][1000];
	int coluna = 0, final = 0, cont = 0, linhamax = 1000;
	int verificaFim(char entrada[]); 
	int ehPalindromo(char entrada[]);

	do{

		scanf(" %[^\n]s", entrada[cont]);
		final = verificaFim(entrada[cont]);

	}while(final != 1 && cont++ < linhamax);

	cont--;

/*
loop para alimentar o array de entradas ate encontrar a palavra FIM
*/
	
	int i, palindromo;

	for(i = 0; i <= cont; i++){

		palindromo = ehPalindromo(entrada[i]);

		if(palindromo == 1){

			printf("SIM\n");

		}
		else{

			printf("NAO\n");

		}

	}
/*
loop de impressao das saidas de cada posicao do array
*/
	
}

int verificaFim(char entrada[]){
	
	char final[] = "FIM";
	int i = 0, resp = 0;

	while(entrada[i] == final[i] && entrada[i] != '\0'){

		i++;
		
	}
	
/*
loop que verifica se cada posicao do array de entrada eh igual as posicoes do array final, indicando o fim da leitura
*/

	if(i == 3){

		resp = 1;

	}
/*
se o contador for igual a 3, significa que passou pelo loop com todas as posicoes iguais, resultando no final da leitura
*/
	else{

		resp = 0;

	}

	return resp;

}

int ehPalindromo(char entrada[]){
	
	int i = 0, resp = 1, cont = 0;
	char contrario[1000];

	while(entrada[i] != '\0'){

		i++;
		cont++;

	}

/*
loop para verificar a quantidade de elementos presentes no array entrada
*/

	cont--;

	for(i = 0; cont >= 0; i++){

		
		contrario[i] = entrada[cont];
		cont--;

	}

	contrario[i] = '\0';

/*
alimenta o vetor contrario com os elementos do vetor entrada comecando da ultima posicao e acrescenta o \0 para terminar
*/

	i = 0;

	do{
		
		if(entrada[i] == contrario[i]){

			resp = 1;

		}
		else{

			resp = 0;

		}
	
		i++;

	}while(resp == 1 && entrada[i] != '\0');

/*
se percorrer o loop ate a posicao com o \0, a variavel resp tera valor 1, indicando que eh um palindromo
*/

	return resp;

}
