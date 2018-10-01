#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <malloc.h>


/*char **split(char frase[], char separador)
{
    int i, j, k, contsep = 0;

     for(i=0,contsep=0;i<strlen(frase);i++)
       if(frase[i] == separador)
          contsep++;

    char  aux[contsep][200];
    char **result = (char**)malloc(4000*sizeof(char));
    
    if(contsep)
    {
        for(i=0; i<=contsep; i++ )
          *(result + i) = (char*)malloc(4000*sizeof(char));
        
        for(i=0,k=0,j=0; i < strlen(frase); i++)
           if(frase[i] != separador)
           {
              aux[k][j] = frase[i];
              j++;
           }
           else
           {
              aux[k][j] = 0;
              k++;
              j=0;
           }
        aux[k][j] = 0;
        
        for(i=0;i<=contsep;i++)
          *(result+i) = strcpy(*(result+i), aux[i]);
        
        return result;
    }
    else
        printf("Nenhum Separador Encontrado");
}*/

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

MUNICIPIO city[5800];
MUNICIPIO list[200];
int n;

void start(){

	n = 0;

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

void imprimir(int pos){

        printf("%d %s %s %d %d %d %d %s %s %d %s %d %s\n", list[pos].ID, list[pos].nome, list[pos].UF, list[pos].codigoUF, list[pos].populacao, list[pos].numeroFuncionarios, list[pos].numeroComissionados, list[pos].escolaridade, list[pos].estagio, list[pos].atualizacaoPlano, list[pos].regiao, list[pos].atualizacaoCadastro, list[pos].consorcio);

}//fim imprimir

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Insere um elemento na primeira posicao da lista
 * @param MUNICIPIO x elemento a ser inserido.
 */

void inserirInicio(MUNICIPIO x){

        int i;

        if(n >= 200){

                printf("ERRO! - InserirInicio");
                exit(1);

        }

        for(i = n; i > 0; i--){

                list[i] = list[i-1];

        }

        list[0] = x;
        n++;
}


/**
 * Insere um elemento na ultima posicao
 * @param MUNICIPIO x elemento a ser inserido.
 */

void inserirFim(MUNICIPIO x){

        if(n >= 200){

                printf("ERRO! - InserirFim");
                exit(1);

        }

  	list[n] = x;
        n++;

}


/**
 * Insere um elemento em uma posicao especifica 
 * @param MUNICIPIO x elemento a ser inserido.
 * @param int pos posicao que sera inserido
 */

void inserir(MUNICIPIO x, int pos){

        int i;

        if(n >= 200 || pos < 0 || pos > n){

                printf("ERRO! - Inserir");
                exit(1);

        }

        for(i = n; i > pos; i--){

                list[i] = list[i-1];

        }

        list[pos] = x;
        n++;

}


/**
 * Remove um elemento da primeira posicao da lista 
 * @return MUNICIPIO resp elemento a ser removido.
 */

MUNICIPIO removerInicio(){

        int i;

        if(n == 0){

                printf("ERRO! - RemoverInicio");
                exit(1);

        }

        MUNICIPIO resp = list[0];
        n--;

        for(i = 0; i < n; i++){

                list[i] = list[i+1];

        }

        return resp;

}


/**
 * Remove um elemento da ultima posicao
 * @return MUNICIPIO resp elemento a ser removido.
 */

MUNICIPIO removerFim(){

        if(n == 0){

                printf("ERRO! - RemoverFim");
                exit(1);

        }

        return list[--n];

}


/**
 * Remove um elemento de uma certa posicao
 * @param int pos posicao de remocao.
 * @return MUNICIPIO resp elemento a ser removido.
 */

MUNICIPIO remover(int pos){

        int i;

        if(n == 0 || pos < 0 || pos >= n){

                printf("ERRO! - Remover");
                exit(1);

        }

        MUNICIPIO resp = list[pos];
        n--;

        for(i = pos; i < n; i++){

                list[i] = list[i+1];

        }

        return resp;

}

void mostrar(){

	for(int i = 0; i < n; i++){

		imprimir(i);

	}

}

int main(){

	ler();
	start();
	int entrada;

	do{

		scanf("%d", &entrada);

		if(entrada > 0){

			inserirFim(city[entrada]);

		}

	}while(entrada != 0);

	int tam = 5000;
	char str[tam];
	scanf("%d", &entrada);
	char s[50];

	do{

		fgets(str, tam, stdin);
		char** in = splitES(str);


		if((strstr(str, "II")) != NULL){

			int i = atoi(in[1]);
			inserirInicio(city[i]);

		}
		else if((strstr(str, "IF")) != NULL){

			int i = atoi(in[1]);
			inserirFim(city[i]);

		}
		else if((strstr(str, "I*")) != NULL){

			int i = atoi(in[1]);
			int j = atoi(in[2]);
			inserir(city[j], i);

		}
		else if((strstr(str, "RI")) != NULL){

                        MUNICIPIO x = removerInicio();
                        printf("(R) %s\n", x.nome);

                }
                else if((strstr(str, "RF")) != NULL){

                        MUNICIPIO x = removerFim();
                        printf("(R) %s\n", x.nome);

                }
		else if((strstr(str, "R*")) != NULL){

			int i = atoi(in[1]);
			MUNICIPIO x = remover(i);
			printf("(R) %s\n", x.nome);

		}

	}while(--entrada >= 0);

	mostrar();
		
	return 0;

}
