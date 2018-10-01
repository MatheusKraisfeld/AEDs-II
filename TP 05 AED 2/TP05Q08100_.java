/**
 *Trabalho Pratico 03 - AEDs II
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

import java.time.*;

class Municipio{

	// atributos da classe

	//variaveisexternas.txt
	private int ID; //A1
	private String nome; //A202
	private String UF; //A201
	private int codigoUF; //A200
	private int populacao; //A204
	private String regiao; //A199

	//recursoshumanos.txt
	private int numeroFuncionarios; //A2
	private int numeroComissionados; //A5

	//planejamentourbano.txt
	private String escolaridade; //A16
	private int atualizacaoPlano; //A19
	
	//gestaoambiental.txt
	private String estagio; //A143

	//recursosparagestao.txt
	private int atualizacaoCadastro; //A63

	//articulacaointerinstitucional.txt
	private boolean consorcio; //A152

	// construtor vazio

	public Municipio(){

		this.ID = this.codigoUF = this.populacao = this.numeroFuncionarios = this.numeroComissionados = this.atualizacaoPlano = this.atualizacaoCadastro = 0;
		this.nome = this.UF = this.escolaridade = this.estagio = this.regiao = "";
		this.consorcio = false;

	}

	// construtor que recebe parametros

	public Municipio(int ID, String nome, String UF, int codigoUF, int populacao, int numeroFuncionarios, int numeroComissionados, String escolaridade, String estagio, int atualizacaoPlano, String regiao, int atualizacaoCadastro, boolean consorcio){

		this.ID = ID;
		this.nome = nome;
		this.UF = UF;
		this.codigoUF = codigoUF;
		this.populacao = populacao;
		this.numeroFuncionarios = numeroFuncionarios;
		this.numeroComissionados = numeroComissionados;
		this.escolaridade = escolaridade;
		this.estagio = estagio;
		this.atualizacaoPlano = atualizacaoPlano;
		this.regiao = regiao;
		this.atualizacaoCadastro = atualizacaoCadastro;
		this.consorcio = consorcio;

	}

/**
 * Cria um clone 
 *
 * @return objeto do tipo municipio igual ao instanciado, ou null se gerar exception
 */

	public Municipio clone(){

		/*try{

			return (Municipio)super.clone();

		}catch(CloneNotSupportedException e){

			MyIO.println("Erro clone");
			return null;

		}*/

		Municipio clone = new Municipio();
		clone.setID(this.getID());
		clone.setNome(this.getNome());
		clone.setUF(this.getUF());
		clone.setCodigoUF(this.getCodigoUF());
		clone.setPopulacao(this.getPopulacao());
		clone.setNumeroFuncionarios(this.getNumeroFuncionarios());
		clone.setNumeroComissionados(this.getNumeroComissionados());
		clone.setEscolaridade(this.getEscolaridade());
		clone.setEstagio(this.getEstagio());
		clone.setAtualizacaoPlano(this.getAtualizacaoPlano());
		clone.setRegiao(this.getRegiao());
		clone.setAtualizacaoCadastro(this.getAtualizacaoCadastro());
		clone.setConsorcio(this.getConsorcio());

		return clone;

	}

	// get/set ID

	public int getID(){

		return this.ID;

	}

	public void setID(int ID){

		this.ID = ID;

	}

	// get/set nome

	public String getNome(){

		return this.nome;

	}

	public void setNome(String nome){

		this.nome = nome;

	}

	// get/set UF

	public String getUF(){

		return this.UF;

	}

	public void setUF(String UF){

		this.UF = UF;

	}

	// get/set codigoUF

	public int getCodigoUF(){

		return this.codigoUF;

	}

	public void setCodigoUF(int codigoUF){

		this.codigoUF = codigoUF;

	}

	// get/set populacao

	public int getPopulacao(){

		return this.populacao;

	}

	public void setPopulacao(int populacao){

		this.populacao = populacao;

	}

	// get/set numeroFuncionarios

	public int getNumeroFuncionarios(){

		return this.numeroFuncionarios;

	}

	public void setNumeroFuncionarios(int numeroFuncionarios){

		this.numeroFuncionarios = numeroFuncionarios;

	}

	// get/set numeroComissionados

	public int getNumeroComissionados(){

		return this.numeroComissionados;

	}

	public void setNumeroComissionados(int numeroComissionados){

		this.numeroComissionados = numeroComissionados;

	}

	// get/set escolaridade

	public String getEscolaridade(){

		return this.escolaridade;

	}

	public void setEscolaridade(String escolaridade){

		this.escolaridade = escolaridade;

	}

	// get/set estagio

	public String getEstagio(){

		return this.estagio;

	}

	public void setEstagio(String estagio){

		this.estagio = estagio;

	}

	// get/set atualizacaoPlano

	public int getAtualizacaoPlano(){

		return this.atualizacaoPlano;

	}

	public void setAtualizacaoPlano(int atualizacaoPlano){

		this.atualizacaoPlano = atualizacaoPlano;

	}

	// get/set regiao

	public String getRegiao(){

		return this.regiao;

	}

	public void setRegiao(String regiao){

		this.regiao = regiao;

	}

	// get/set atualizacaoCadastro

	public int getAtualizacaoCadastro(){

		return this.atualizacaoCadastro;

	}

	public void setAtualizacaoCadastro(int atualizacaoCadastro){

		this.atualizacaoCadastro = atualizacaoCadastro;

	}

	// get/set consorcio

	public boolean getConsorcio(){

		return this.consorcio;

	}

	public void setConsorcio(boolean consorcio){

		this.consorcio = consorcio;

	}

	// FIM GET/SET

/**
 * Imprime todos os atributos do objeto corrente
 *
 */

	public void imprimir(){

		MyIO.println(this.ID + " " + this.nome + " " + this.UF + " " + this.codigoUF + " " + this.populacao + " " + this.numeroFuncionarios + " " + this.numeroComissionados + " " + this.escolaridade + " " + this.estagio + " " + this.atualizacaoPlano + " " + this.regiao + " " + this.atualizacaoCadastro + " " + this.consorcio);

	}

/**
 * Executa a leitura de todos arquivos e preenche o vetor de municipios
 *
 *@param municipio Vetor de municipios a ser preenchido
 */

	public static void ler(Municipio[] municipio){
		
		Arq.openRead("/tmp/variaveisexternas.txt","ISO-8859-1");
		int i = 0;

		while(Arq.hasNext()){

			String[] temp = Arq.readLine().split("\t");

			try{

				municipio[i].setID(Integer.parseInt(temp[0]));

			}
			catch(NumberFormatException e){

				municipio[i].setID(0);

			}
			municipio[i].setNome(temp[4]);
			municipio[i].setUF(temp[3]);

			try{

				municipio[i].setCodigoUF(Integer.parseInt(temp[2]));

			}
			catch(NumberFormatException e){

				municipio[i].setCodigoUF(0);

			}
			try{

				municipio[i].setPopulacao(Integer.parseInt(temp[6]));

			}
			catch(NumberFormatException e){

				municipio[i].setPopulacao(0);

			}

			municipio[i].setRegiao(temp[1]);

			i++;

		}

		Arq.openRead("/tmp/recursoshumanos.txt","ISO-8859-1");	
		i = 0;

		while(Arq.hasNext()){


			String[] temp = Arq.readLine().split("\t");

			try{
			
				municipio[i].setNumeroFuncionarios(Integer.parseInt(temp[4]));

			}
			catch(NumberFormatException e){

				municipio[i].setNumeroFuncionarios(0);

			}

			try{

				municipio[i].setNumeroComissionados(Integer.parseInt(temp[7]));

			}
			catch(NumberFormatException e){

				municipio[i].setNumeroComissionados(0);

			}

	
			i++;

		}

		
		Arq.openRead("/tmp/planejamentourbano.txt","ISO-8859-1");
		i = 0;

		while(Arq.hasNext()){

			String[] temp = Arq.readLine().split("\t");

			municipio[i].setEscolaridade(temp[5]);
				
			try{
	
				municipio[i].setAtualizacaoPlano(Integer.parseInt(temp[8]));

			}
			catch(NumberFormatException e){

				municipio[i].setAtualizacaoPlano(0);

			}

			i++;

		}


		Arq.openRead("/tmp/gestaoambiental.txt","ISO-8859-1");
		i = 0;

		while(Arq.hasNext()){

			String[] temp = Arq.readLine().split("\t");

			municipio[i].setEstagio(temp[7]);

			i++;

		}


		Arq.openRead("/tmp/recursosparagestao.txt","ISO-8859-1");
		i = 0;

		while(Arq.hasNext()){

			String[] temp = Arq.readLine().split("\t");

			try{

				municipio[i].setAtualizacaoCadastro(Integer.parseInt(temp[6]));

			}
			catch(NumberFormatException e){

				municipio[i].setAtualizacaoCadastro(0);

			}

			i++;

		}


		Arq.openRead("/tmp/articulacaoointerinstitucional.txt","ISO-8859-1");		
		i = 0;

		while(Arq.hasNext()){

			String[] temp = Arq.readLine().split("\t");

			if(temp[5].equals("Sim")){

				municipio[i].setConsorcio(true);

			}
			else{

				municipio[i].setConsorcio(false);

			}

			i++;

		}

	} // fim ler


} // fim class Municipio


/**
 *@author Matheus Kraisfeld
 *@version 2017/02
 */


class ListaMunicipios extends Municipio{

	Municipio municipios[];
	int n;

/**
 * Construtor de lista
 * @param tamanho da lista
 */

	ListaMunicipios(int tamanho){

		municipios = new Municipio[tamanho];
		this.n = 0;

	}

/**
 * Insere um municipio no inicio da lista
 *
 * @param municipio
 */

	public void inserirInicio(Municipio municipio) throws Exception{


		if(n >= municipios.length){

			throw new Exception("Erro!");

		}

		for(int i = n; i > 0; i--){

			municipios[i] = municipios[i-1];

		}

		municipios[0] = municipio;
		n++;

	}

/**
 * Insere um municipio na posicao desejada
 *
 * @param municipio a ser inserido
 * @param posicao que recebe o municipio
 */

	public void inserir(Municipio municipio, int posicao) throws Exception{


		if(n >= municipios.length || posicao < 0 || posicao > n){

			throw new Exception("Erro!");

		}

		for(int i = n; i > posicao; i--){

			municipios[i] = municipios[i-1];

		}

		municipios[posicao] = municipio;
		n++;

	}

/**
 * Insere um municipio no fim da lista
 *
 * @param municipio a ser inserido
 */

	public void inserirFim(Municipio municipio) throws Exception{

		if(n >= municipios.length){

			throw new Exception("Erro!");

		}

		municipios[n] = municipio;
		n++;

	}

/**
 * Remove o municipio do inicio da lista e o retorna
 *
 * @return municipio
 */

	public Municipio removerInicio() throws Exception{

		if(n == 0){

			throw new Exception("Erro!");

		}

		Municipio tmp = municipios[0];
		n--;

		for(int i = 0; i < n; i++){

			municipios[i] = municipios[i+1];

		}

		return tmp;

	}

/**
 * Remove um municipio da posicao desejada
 *
 * @param posicao que sera removida
 * @return municipio removido
 */

	public Municipio remover(int posicao) throws Exception{


		if(n == 0 || posicao >= n || posicao < 0){

			throw new Exception("Erro!");

		}

		Municipio tmp = municipios[posicao];
		n--;

		for(int i = posicao; i < n; i++){

			municipios[i] = municipios[i+1];

		}

		return tmp;

	}

/**
 * Remove o municipio do fim da lista
 *
 * @return municipio removido
 */

	public Municipio removerFim() throws Exception{

		if(n == 0){

			throw new Exception("Erro!");

		}

		return municipios[--n];

	}

/**
 * Mostra todos os elementos da lista
 *
 */

	public void mostrar() throws Exception{

		if(n == 0){

			throw new Exception("Erro!");

		}

		for(int i = 0; i < n; i++){

			municipios[i].imprimir();

		}

	}

/**
 * Pesquisa a ocorrencia do parametro recebido na lista
 *
 * @param ID atributo a ser verificado
 * @return true caso encontrado, ou false se nao encontrado
 */

	public boolean pesquisaSequencial(int ID){

		boolean resp = false;
		int i = 0;

		while((municipios[i].getID() <= ID) && (resp == false) && (i < municipios.length)){

			if(municipios[i++].getID() == ID){

				resp = true;

			}

		}

		return resp;

	}

	public boolean pesquisaBinaria(int ID){

		boolean resp = false;
		int left = 0, right = n - 1, mid;

		do{

			mid = left + (right - left) / 2;

			if(municipios[mid].getID() > ID){

				right = mid - 1;

			}
			else if(municipios[mid].getID() < ID){

					left = mid + 1;

				}

				else{

					resp = true;

				}

		}while(left <= right && resp == false);

		return resp;

	}

/**
 * Utiliza o metodo de selecao pra ordenar a lista
 *
 */

	public void ordenaSelecao(){

		for(int i = 0; i < n - 1; i++){

			int menor = i;

			for(int j = (i + 1); j < n; j++){


				if(municipios[menor].getAtualizacaoPlano() > municipios[j].getAtualizacaoPlano()){

					menor = j;

				}

			}

			Municipio tmp = municipios[i].clone();
			municipios[i] = municipios[menor].clone();
			municipios[menor] = tmp;

		}

		
		for(int i = 0; i < n - 1; i++){

			int menor = i;

			for(int j = (i + 1); j < n; j++){


				if(municipios[menor].getAtualizacaoPlano() == municipios[j].getAtualizacaoPlano()){

					if(municipios[menor].getID() > municipios[j].getID()){

						menor = j;

					}

				}

			}

			Municipio tmp = municipios[i].clone();
			municipios[i] = municipios[menor].clone();
			municipios[menor] = tmp;

		}

	} //fim ordenaSelecao

/**
 * Ordena a lista com o metodo de insercao
 *
 */

	public void ordenaInsercao(){

		for(int i = 1; i < n; i++){

			Municipio tmp = municipios[i].clone();
			int j = i - 1;

			while(j >= 0 && municipios[j].getNome().compareTo(tmp.getNome()) >= 1){

				municipios[j+1] = municipios[j].clone();
				j--;

			}

			municipios[j+1] = tmp.clone();

		}

	}

/**
 * Ordena a lista utilizando o metodo shellsort
 */

	public void shellsort(){

		int h = 1;

		do{

			h = (h * 3) + 1;

		}while(h < n);

		do{

			h /= 3;

			for(int cor = 0; cor < h; cor++){

				insercaoPorCor(cor, h);

			}

		}while(h != 1);

	} //fim shellsort

/**
 * Metodo de insercao baseado em grupos
 * @param cor define o grupo usado
 * @param h define a quantidade de grupos, e o passo do loop
 */

	public void insercaoPorCor(int cor, int h){

		for(int i = (h + cor); i < n; i += h){

			Municipio tmp = municipios[i].clone();
			int j = i - h;

			while((j >= 0) && (municipios[j].getUF().compareTo(tmp.getUF()) >= 1)){
				municipios[j + h] = municipios[j].clone();
				j -= h;
			}

			municipios[j + h] = tmp.clone();

		}

	} // fim insercaoPorCor

/**
 * Ordena a lista com o metodo de heapsort
 *
 */

	public void heapsort(){

		// Move todos elementos da lista uma posicao para a frente
		for(int i = n; i > 0; i--){

			municipios[i] = municipios[i - 1].clone();

		}

		// Construcao do heap
		for(int tam = 2; tam <= n; tam++){

			constroi(tam);

		}

		// Ordenacao
		int tam = n;

		while(tam > 1){

			Municipio tmp = municipios[1].clone();
			municipios[1] = municipios[tam].clone();
			municipios[tam] = tmp.clone();
			tam--;
			reconstroi(tam);

		}

		// Move todos elementos da lista uma posicao para tras
		for(int i = 0; i < n; i++){

			municipios[i] = municipios[i + 1].clone();

		}

	} //fim heapsort

/**
 * Efetua a construcao do heap
 */

	public void constroi(int tam){

		for(int i = tam; (i > 1) && (municipios[i].getCodigoUF() > municipios[i/2].getCodigoUF()); i /= 2){

			Municipio tmp = municipios[i].clone();
			municipios[i] = municipios[i/2].clone();
			municipios[i/2] = tmp.clone();

		}

	} // fim constroi

/**
 * Reorganiza o heap
 *
 */

	public void reconstroi(int tam){

		int i = 1, filho;

		while(i <= (tam / 2)){

			filho = getMaiorFilho(i, tam);

			if(municipios[i].getCodigoUF() < municipios[filho].getCodigoUF()){

				Municipio tmp = municipios[i].clone();
				municipios[i] = municipios[filho].clone();
				municipios[filho] = tmp.clone();
				i = filho;

			}
			else{

				i = tam;

			}

		}

	}

/**
 * Verifica qual o maior filho em relacao ao codigoUF
 * @param i posicao atual
 * @param tam tamanho do heap
 * @return maior filho
 */

	public int getMaiorFilho(int i, int tam){

		int maior;

		if(municipios[2 * i].getCodigoUF() > municipios[2 * i+1].getCodigoUF() || 2 * i == tam){

			maior = 2 * i;

		}
		else{

			maior = 2 * i + 1;

		}

		return maior;

	}

/**
 * Ordena a lista utilizando o metodo quicksort
 * @param esq primeira posicao da lista
 * @param dir ultima posicao da lista
 */


	public void quicksort(int left, int right){

		int i = left, j = right, pivo = municipios[(i+j)/2].getPopulacao();

		while(i <= j) {

			while(municipios[i].getPopulacao() < pivo){

				i++;

			}

			while(municipios[j].getPopulacao() > pivo){

				j--;

			}

			if(i <= j){

				Municipio tmp = municipios[i].clone();
				municipios[i] = municipios[j].clone();
				municipios[j] = tmp;
				i++;
				j--;

			}

		}

		if(j > left){

			quicksort(left, j);

		}

		if(i < right){

			quicksort(i, right);

		}

	}

} // fim class ListaMunicipios

/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class TP05Q08{

	public static void main(String[] args){

		Instant begin = Instant.now();

		Municipio[] city = new Municipio[6000];
		ListaMunicipios list = new ListaMunicipios(200);
		int i = 0, entrada;

		MyIO.setCharset("iso-8859-1");

		for(int j = 0; j < city.length; j++){

			city[j] = new Municipio();

		}

		Municipio.ler(city);

		do{

			entrada = MyIO.readInt();

			if(entrada != 0){

				try{

					list.inserirFim(city[entrada]);

				}catch(Exception e){

					MyIO.println("Erro inserirFim");

				}

			}

		}while(entrada > 0);

		/*String in;

		do{

			in = MyIO.readLine();

			if(isNumber(in)){

				if(list.(Integer.parseInt(in))){

					MyIO.println("SIM");

				}
				else{

					MyIO.println("NÃO");

				}

			}

		}while(!in.equals("FIM"));*/

		list.quicksort(0, list.n - 1);
	
		try{

			list.mostrar();

		}catch(Exception e){

			MyIO.println("Erro mostrar");

		}

		Instant end = Instant.now();

		Duration dr = Duration.between(begin, end);
		double sec = dr.toMillis();

		Arq.openWrite("matricula_quicksort.txt", "utf-8");
		Arq.println("572251\t" + sec/1000 + "\t");
		Arq.close();

	} // fim main

/**
 * Verifica se uma string eh composta apenas por numeros
 *
 * @param in String a ser verificada
 * @return resp retorna true para verdadeiro, e false se nao for numero
 */

	public static boolean isNumber(String in){

		boolean resp = false;

		try{

			Integer.parseInt(in);
			resp = true;

		}catch(Exception e){

			resp = false;

		}

		return resp;

	}

}
