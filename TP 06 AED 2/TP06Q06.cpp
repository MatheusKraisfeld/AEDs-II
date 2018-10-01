#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <malloc.h>


/**
 * Os dois metodos split a seguir foram feitos com a ajuda da aluna
 * Stefany Gaspar
 */

char** split(char* sFrase){                                                                           
        char** t1 = (char**) malloc(16*sizeof(char*));                                            
        char *tmp;                                                                              
        tmp = strtok(sFrase, "\t\r\n\f\v");                                                     
        int i = 0;                                                                                    
        while(tmp){                                                                             
                t1[i] = (char*) malloc(sizeof(char*));                                            
                t1[i] = tmp;                                                                
                tmp = strtok('\0', "\t\r\n\f\v");                                               
                i++;                                                                                  
        }                                                                                             
        return t1;                                                                                
}                                                                                                     
                                                                                                      
char** splitES(char* sFrase){                                                                         
        char** t1 = (char**) malloc(16*sizeof(char*));                                            
        char *tmp;                                                                              
        tmp = strtok(sFrase, " ");                                                              
        int i = 0;                                                                                    
        while(tmp){                                                                             
                t1[i] = (char*) malloc(sizeof(char*));                                            
                t1[i] = tmp;                                                                
                tmp = strtok('\0', " ");                                                        
                i++;                                                                                  
        }                                                                                             
        return t1;                                                                                
}                        

typedef struct MUNICIPIO{

	//variaveisexternas.txt
	int ID; //A1
	char nome[200]; //A202
	char UF[3]; //A201
	int codigoUF; //A200
	int populacao; //A204
	char regiao[50]; //A199

	//recursoshumanos.txt
	int numeroFuncionarios; //A2
	int numeroComissionados; //A5

	//planejamentourbano.txt
	char escolaridade[100]; //A16
	int atualizacaoPlano; //A19

	//gestaoambiental.txt
	char estagio[100]; //A143

	//recursosparagestao.txt
	int atualizacaoCadastro; //A63

	//articulacaointerinstitucional.txt
	char consorcio[10]; //A15

} MUNICIPIO;

typedef struct Celula{

	MUNICIPIO elemento;
	struct Celula* prox;

} Celula;

Celula* novaCelula(MUNICIPIO municipio){

	Celula* nova = (Celula*) malloc(sizeof(Celula));
	nova->elemento = municipio;
	nova->prox = NULL;
	return nova;

}

Celula* topo;

MUNICIPIO city[5800];


void start(){

	topo = NULL;

}

int verificaVazio(char frase[]){

	char vazio[] = " ";
	char hifen[] = " -";
	int resp = 0;

	if(strcmp(frase, vazio) == 0){

		resp = 1;

	}
	else{

		if(strcmp(frase, hifen) == 0){

			resp = 1;

		}

	}

	return resp;

}

void ler(){

	char tmpstring[2000];
	char comp[2000];
	//MUNICIPIO city[6000];
	int i = 0, num;

	FILE *file = fopen("/tmp/variaveisexternas.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			char **explode = split(tmpstring);

			strcpy(comp, explode[0]);

			if(verificaVazio(comp) == 1){

				city[i].ID = 0;

			}
			else{

				num = atoi(explode[0]);
				city[i].ID = num;

			}

			strcpy(city[i].nome, explode[4]);
			strcpy(city[i].UF, explode[3]);

			strcpy(comp, explode[2]);

			if(verificaVazio(comp) == 1){

				city[i].codigoUF = 0;

			}
			else{

				num = atoi(explode[2]);
				city[i].codigoUF = num;

			}

			strcpy(comp, explode[6]);

			if(verificaVazio(comp) == 1){

				city[i].populacao = 0;

			}
			else{

				num = atoi(explode[6]);
				city[i].populacao = num;

			}

			strcpy(city[i].regiao, explode[1]);

			i++;

		}

	}

	//fclose(file);

	i = 0;

	file = fopen("/tmp/recursoshumanos.txt", "r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			char **explode = split(tmpstring);

			strcpy(comp, explode[4]);

			if(verificaVazio(comp) == 1){

				city[i].numeroFuncionarios = 0;

			}
			else{

				num = atoi(explode[4]);
				city[i].numeroFuncionarios = num;

			}

			strcpy(comp, explode[7]);

			if(verificaVazio(comp) == 1){

				city[i].numeroComissionados = 0;

			}
			else{

				num = atoi(explode[7]);
				city[i].numeroComissionados = num;

			}

			i++;

		}

	}

	i = 0;
	
	file = fopen("/tmp/planejamentourbano.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			//strcpy(novo[i], tmpstring);

			char **explode = split(tmpstring);

			strcpy(city[i].escolaridade, explode[5]);

			strcpy(comp, explode[8]);

			if(verificaVazio(comp)){

				city[i].atualizacaoPlano = 0;

			}
			else{

				num = atoi(explode[8]);
				city[i].atualizacaoPlano = num;

			}

			i++;

		}

	}

	fclose(file);

	i = 0;

	file = fopen("/tmp/gestaoambiental.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			//strcpy(novo[i], tmpstring);

			char **explode = split(tmpstring);

			strcpy(city[i].estagio, explode[7]);

			i++;

		}

	}

	fclose(file);

	i = 0;

	file = fopen("/tmp/recursosparagestao.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			//strcpy(novo[i], tmpstring);

			char **explode = split(tmpstring);

			strcpy(comp, explode[6]);

			if(verificaVazio(comp)){

				city[i].atualizacaoCadastro = 0;

			}
			else{

				num = atoi(explode[6]);
				city[i].atualizacaoCadastro = num;

			}

			i++;

		}

	}

	fclose(file);

	i = 0;


	file = fopen("/tmp/articulacaoointerinstitucional.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			//strcpy(novo[i], tmpstring);

			char **explode = split(tmpstring);

			if(explode[5][0] == 'S' && explode[5][1] == 'i' && explode[5][2] == 'm'){

				strcpy(city[i].consorcio, "true");

			}
			else{

				strcpy(city[i].consorcio, "false");

			}

			i++;

		}

	}

	fclose(file);

}



void inserir(MUNICIPIO x){

	Celula* tmp = novaCelula(x);
	tmp->prox = topo;
	topo = tmp;
	tmp = NULL;

}

MUNICIPIO remover(){

	if(topo == NULL){

		printf("Erro");

	}

	MUNICIPIO resp = topo->elemento;
	Celula* tmp = topo;
	topo = topo->prox;
	tmp->prox = NULL;
	free(tmp);
	tmp = NULL;
	return resp;

}

void imprimir(MUNICIPIO x){

	printf("%d %s %s %d %d %d %d %s %s %d %s %d %s\n", x.ID, x.nome, x.UF, x.codigoUF, x.populacao, x.numeroFuncionarios, x.numeroComissionados, x.escolaridade, x.estagio, x.atualizacaoPlano, x.regiao, x.atualizacaoCadastro, x.consorcio);

}

void mostrar(Celula* index){

	if(topo == NULL){

		printf("Erro");

	}
	else if(index == NULL){

		return;

	}
	else{

		mostrar(index->prox);

	}
	
	imprimir(index->elemento);

}

int main(){

	ler();
	start();
	int entrada;

	do{

		scanf("%d", &entrada);

		if(entrada > 0){

			inserir(city[entrada]);

		}

	}while(entrada != 0);

	int tam = 5000;
	char str[tam];
	scanf("%d", &entrada);
	char s[50];

	do{

		fgets(str, tam, stdin);
		char** in = splitES(str);


		if((strstr(str, "I")) != NULL){

			int i = atoi(in[1]);
			inserir(city[i]);

		}
		else if((strstr(str, "R")) != NULL){

			MUNICIPIO tmp = remover();
			printf("(R) %s\n", tmp.nome);

		}

	}while(--entrada >= 0);

	mostrar(topo);
		
	return 0;

}
