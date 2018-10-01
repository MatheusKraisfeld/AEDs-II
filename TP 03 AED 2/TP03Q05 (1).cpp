#include <string.h>
#include <stdlib.h>
#include <stdio.h>

typedef struct Municipio{

	//variaveisexternas.txt
	int ID = 0; //A1
	String nome = ""; //A202
	String UF = ""; //A201
	int codigoUF = 0; //A200
	int populacao = 0; //A204
	String regiao = ""; //A199

	//recursoshumanos.txt
	int numeroFuncionarios = 0; //A2
	int numeroComissionados = 0; //A5

	//planejamentourbano.txt
	String escolaridade = ""; //A16
	int atualizacaoPlano = 0; //A19

	//gestaoambiental.txt
	String estagio = ""; //A143

	//recursosparagestao.txt
	int atualizacaoCadastro = 0; //A63

	//articulacaointerinstitucional.txt
	String consorcio = "false"; //A15

} MUNICIPIO;

struct Municipio ler(int linha){

	struct Municipio tmp;

	FILE *file = fopen("/tmp/variaveisexternas.txt","r");

	if(file != NULL){

		while(fscanf(file, " %[\n]s", tmp) != null){

			fscanf(file, " %[\n]s", tmp);

		}

	}

	fclose(file);

	//tmp.ID

}

void main(){

	struct Municipio city[1000]
	int i = 0, entrada;
	//ListaMunicipios list = new ListaMunicipios(200);

	do{

		scanf("%d", &entrada);

		if(entrada > 0){

			city[i] = new Municipio();
			city[i].ler(entrada);

		}

		i++;

	}while(entrada != 0);

	scanf("%d", &entrada);
	Municipio novo;
	String op = "";

	do{

		scanf("%s", op);
		String[]

	}while();

}
