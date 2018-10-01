#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <malloc.h>


char **split(char frase[], char separador)
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
}

typedef struct Municipio{

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
	char escolaridade[50]; //A16
	int atualizacaoPlano; //A19

	//gestaoambiental.txt
	char estagio[50]; //A143

	//recursosparagestao.txt
	int atualizacaoCadastro; //A63

	//articulacaointerinstitucional.txt
	char consorcio[10]; //A15

} MUNICIPIO;

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
	MUNICIPIO city[6000];
	int i = 0, num;

	FILE *file = fopen("/tmp/variaveisexternas.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			char **explode = split(tmpstring, '\t');

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

			strcpy(comp, explode[3]);

			if(verificaVazio(comp) == 1){

				city[i].populacao = 0;

			}
			else{

				num = atoi(explode[3]);
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

			char **explode = split(tmpstring, '\t');

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

			char **explode = split(tmpstring, '\t');

			strcpy(city[i].escolaridade, explode[6]);

			strcpy(comp, explode[8]);

			if(verificaVazio(comp)){

				city[i].atualizacaoPlano = 0;

			}
			else{

				num = atoi(explode[8]);
				city[i].atualizacaoPlano = num;

			}

			//printf("%d %s\n", i, city[i].escolaridade);
			i++;

		}

	}

	fclose(file);

	i = 0;

	file = fopen("/tmp/gestaoambiental.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			//strcpy(novo[i], tmpstring);

			char **explode = split(tmpstring, '\t');

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

			char **explode = split(tmpstring, '\t');

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


	/*file = fopen("/tmp/articulacaoointerinstitucional.txt","r");

	if(file != NULL){

		while(fgets(tmpstring, sizeof(tmpstring), file) != NULL){

			//strcpy(novo[i], tmpstring);

			char **explode = split(tmpstring, '\t');

			if(explode[5][0] == 'S' && explode[5][1] == 'i' && explode[5][2] == 'm'){

				strcpy(city[i].consorcio, "true");

			}
			else{

				strcpy(city[i].consorcio, "false");

			}

			i++;

		}

	}

	fclose(file);*/

}

int main(){

	ler();

	return 0;

}
