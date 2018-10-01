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

	//public Municipio prox;
	//public Municipio ant;

	// construtor vazio

	public Municipio(){

		this.ID = this.codigoUF = this.populacao = this.numeroFuncionarios = this.numeroComissionados = this.atualizacaoPlano = this.atualizacaoCadastro = 0;
		this.nome = this.UF = this.escolaridade = this.estagio = this.regiao = "";
		this.consorcio = false;
		//this.prox = null;
		//this.ant = null;

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
		//clone.prox = this.prox;
		//clone.ant = this.ant;

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

class CelulaDupla{

	public Municipio municipio;
	public CelulaDupla ant, prox;

	public CelulaDupla(){

		this(null);

	}

	public CelulaDupla(Municipio municipio){

		this.municipio = municipio;
		this.ant = this.prox = null;

	}

}

class ListaMunicipios extends Municipio{

	private CelulaDupla primeiro, ultimo;
	//private int n;

/**
 * Construtor de lista
 * @param tamanho da lista
 */

	ListaMunicipios(){

		/*municipios = new Municipio[tamanho];
		this.n = 0;*/

		primeiro = new CelulaDupla();
		ultimo = primeiro;
		//this.n = 0;

	}

/**
 * Insere um municipio no inicio da lista
 *
 * @param municipio
 */

	/*public void inserirInicio(Municipio municipio){

		Municipio tmp = municipio.clone();
		tmp.ant = primeiro;
		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		//this.n++;
		
		if(primeiro == ultimo){

			ultimo = tmp;

		}
		else{

			tmp.prox.ant = tmp;

		}

	}*/

/**
 * Insere um municipio na posicao desejada
 *
 * @param municipio a ser inserido
 * @param posicao que recebe o municipio
 */

	/*public void inserir(Municipio municipio, int posicao) throws Exception{

		int tamanho = tamanho();

		if(posicao > tamanho || posicao < 0){

			throw new Exception("Erro!");

		}
		else if(posicao == 0){

			inserirInicio(municipio);

		}
		else if(posicao == tamanho){

			inserirFim(municipio);

		}
		else{

			Municipio i = primeiro;
			for(int j = 0; j < posicao; j++, i = i.prox);

			Municipio tmp = municipio.clone();
			tmp.ant = i;
			tmp.prox = i.prox;
			tmp.ant.prox = tmp.prox.ant = tmp;
			i.prox = tmp;
			//this.n++;

		}

	}*/

/**
 * Insere um municipio no fim da lista
 *
 * @param municipio a ser inserido
 */

	public void inserirFim(Municipio municipio){

		//CelulaDupla tmp = municipio.clone();
		ultimo.prox = new CelulaDupla(municipio);
		ultimo.prox.ant = ultimo;
		ultimo = ultimo.prox;

	}

/**
 * Remove o municipio do inicio da lista e o retorna
 *
 * @return municipio
 */

	/*public Municipio removerInicio() throws Exception{

		if(primeiro == ultimo){

			throw new Exception("Erro!");

		}

		Municipio tmp = primeiro;
		primeiro = primeiro.prox;
		primeiro.ant = null;

		return tmp;

	}*/

/**
 * Remove um municipio da posicao desejada
 *
 * @param posicao que sera removida
 * @return municipio removido
 */

	/*public Municipio remover(int posicao) throws Exception{

		int tamanho = tamanho();
		Municipio tmp;

		if(primeiro == ultimo || posicao < 0 || posicao >= tamanho){

			throw new Exception("Erro!");

		}
		else if(posicao == 0){

			tmp = removerInicio();

		}
		else if(posicao == tamanho - 1){

			tmp = removerFim();

		}
		else{

			Municipio i = primeiro.prox;
			for(int j = 0; j < posicao; j++, i = i.prox);

			tmp = i;
			i.ant.prox = i.prox;
			i.prox.ant = i.ant;
			i.prox = i.ant = null;
			i = null;

		}

		return tmp;

	}*/

/**
 * Remove o municipio do fim da lista
 *
 * @return municipio removido
 */

	/*public Municipio removerFim() throws Exception{

		if(primeiro == ultimo){

			throw new Exception("Erro!");

		}

		Municipio tmp = ultimo;
		ultimo = ultimo.ant;
		ultimo.prox.ant = null;
		ultimo.prox = null;
		//this.n--;

		return tmp;

	}*/

/**
 * Mostra todos os elementos da lista
 *
 */

	public void mostrar() throws Exception{

		if(primeiro == ultimo){

			MyIO.println("primeiro = ultimo");
			throw new Exception("Erro!");

		}

		for(CelulaDupla i = primeiro.prox; i != ultimo.prox; i = i.prox){

			i.municipio.imprimir();

		}

	}
	
	public int tamanho(){

		int cont = 0;

		for(CelulaDupla i = primeiro.prox; i != null; cont++, i = i.prox);

		return cont;

	}

	
/**
 * Ordena a lista utilizando o metodo quicksort
 * @param esq primeira posicao da lista
 * @param dir ultima posicao da lista
 */


	/*public void quicksort(){

		
		quicksort(primeiro, ultimo);

	}

	public void quicksort(Municipio primeiro, Municipio ultimo){

		if(primeiro != ultimo.prox){

			Municipio pivo = primeiro.clone();
			Municipio l = primeiro.prox;
			Municipio r = ultimo;

			while(l.getPopulacao() < r.getPopulacao()){

				if(l.getPopulacao() > pivo.getPopulacao()){

					r = r.ant;
					swap(l, r);

				}
				else{

					l = l.prox;

				}

			}

			l = l.ant;
			swap(primeiro, l);
			quicksort(primeiro, l);
			quicksort(r, ultimo);

		}

	}*/


	/*public int getIndex(Municipio x){

		Municipio i = primeiro.prox;
		int cont = 1;

		for( ; i != x; cont++, i = i.prox);

		return cont;

	}

	public void swap(Municipio x, Municipio y){

		Municipio clonex = x.clone();
		x.prox = y.prox;
		x.ant = y.ant;
		y.prox.ant = x;
		y.ant.prox = x;
		clonex.ant.prox = y;
		y.ant = clonex.ant;
		y.prox = clonex.prox;

		MyIO.println("ok");
		

	}

	public boolean verifMenorIgual(Municipio m1, Municipio m2){

		return (getIndex(m1) <= getIndex(m2));

	}

	public boolean verifMaior(Municipio m1, Municipio m2){

		return (getIndex(m1) > getIndex(m2));

	}*/

	public void quicksort() {

        	quicksort(0, tamanho()-1);

    	}
 
	   /**
	    * Algoritmo de ordenacao Quicksort. ( Recebi a ajuda do aluno Jorge Oliveira para a conclusao do exercicio )
	    * @param int left inicio 
   	    * @param int right fim 
	    */
	    public void quicksort(int left, int right) {

	        int i = left, j = right;
	        CelulaDupla esquerda = ponteiroPosicao(i);
 		CelulaDupla direita = ponteiroPosicao(j);

	        int pos = (right + left) / 2;
	        Municipio pivo = posicao(pos);

	        while(i <= j) {

        	    while(getMenor(posicao(i), pivo)) {

	                i++;
	                esquerda = esquerda.prox;

        	    }

	            while(getMaior(posicao(j),pivo)) {

        	        j--;
	                direita = direita.ant;

	            }
	
	            if(i <= j) {

	                swap(i, j);
	                i++;

	                esquerda = esquerda.prox;
	                j--;

	                direita = direita.ant;

	            }
	        }
	
	        if(left < j){

			quicksort(left, j);

		}

	        if(i < right){

			quicksort(i, right);

		}
	    }
	
    /**
     * Troca dois elementos
     * @param i primeira posicao
     * @param j segunda posicao
     */
    public void swap(int i, int j) {

        CelulaDupla primeiro = ponteiroPosicao(i);
        CelulaDupla segundo = ponteiroPosicao(j);
        Municipio municipio = primeiro.municipio.clone();

        primeiro.municipio = segundo.municipio.clone();
        segundo.municipio = municipio.clone();

    }
	/**
	 * Encontra o menor elemento
	 * @param Municipio x primeiro 
	 * @param Municipio y segundo
	 * @return boolean 
	 */ 
	  public boolean getMenor(Municipio x, Municipio y) {

	    boolean resp = false;

	    if(x.getPopulacao() < y.getPopulacao()) {

	        resp = true;

	    } else {

	        resp = getMaiorID(x, y);

	    }

	    return resp;

  }

	  /**
	   * Retorna o municipio de maior populacao
	   * @param Municipio x primeiro
	   * @param Municipio y segundo
	   * @return boolean 
	   */ 
	  public boolean getMaior(Municipio x, Municipio y) {

		    boolean resp = false;

		    if(x.getPopulacao() > y.getPopulacao()) {

		        resp = true;

		    } else {

		        resp = getMaiorID(y,x);

		    }

		    return resp;

	  } 

	  public boolean getMaiorID(Municipio x, Municipio y) {

		return ((x.getPopulacao() == y.getPopulacao()) && (x.getID() > y.getID()));

	  }

	  /**	
	   * 
	   * @param int x valor da posicao
	   * @return tmp 
	   */

	  public Municipio posicao(int x) {

		CelulaDupla i;
		int j = 0;
	
		for(i = primeiro.prox; j < x; i = i.prox, j++);
		Municipio tmp = i.municipio.clone();
	
		return tmp;
	  }

	  /**
	   * Metodo que vai retornar um ponteiro de uma posicao na lista
	   * @param int o valor da posicao procurada
	   * @return CelulaDupla;
	   */

	  public CelulaDupla ponteiroPosicao(int x) {

		  CelulaDupla i;
		  int j = 0;
	
		  for( i = primeiro.prox; j < x; i = i.prox, j++);

		  return i;

	  }

    /**
     * Mostra os elementos da lista e separados por espacos.
     */
   /* public void mostrar() {
        for (Municipio i = primeiro.prox; i != null; i = i.prox) {
            i.imprimir();
        }
    }*/
} // fim class ListaMunicipios

/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class TP06Q04{

	
	public static void main(String[] args){

		Instant begin = Instant.now();

		Municipio[] city = new Municipio[6000];
		ListaMunicipios list = new ListaMunicipios();
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


		list.quicksort();
	
		try{

			list.mostrar();

		}catch(Exception e){

			MyIO.println("Erro mostrar");

		}

		Instant end = Instant.now();

		Duration dr = Duration.between(begin, end);
		double sec = dr.toMillis();

		Arq.openWrite("572251_quicksort2.txt", "utf-8");
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
