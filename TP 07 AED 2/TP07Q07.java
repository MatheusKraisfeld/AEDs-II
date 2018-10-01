/**
 *Trabalho Pratico 03 - AEDs II
 *@author Matheus Kraisfeld
 *@version 2017/05
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

	public Municipio prox;
	public Municipio ant;

	// construtor vazio

	public Municipio(){

		this.ID = this.codigoUF = this.populacao = this.numeroFuncionarios = this.numeroComissionados = this.atualizacaoPlano = this.atualizacaoCadastro = 0;
		this.nome = this.UF = this.escolaridade = this.estagio = this.regiao = "";
		this.consorcio = false;
		this.prox = null;
		this.ant = null;

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
		clone.prox = this.prox;
		clone.ant = this.ant;

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



class HashIndiretoLista{

	Lista tabela[];
	int tamanho;
	final int NULO = -1;

	public HashIndiretoLista(){

		this(21);

	}

	public HashIndiretoLista(int tamanho){

		this.tamanho = tamanho;
		tabela = new Lista[tamanho];
		for(int i = 0; i < tamanho; i++){

			tabela[i] = new Lista();

		}

	}

	public int h(int elemento){

		return elemento % tamanho;

	}

	boolean pesquisar(int elemento){

		int pos = h(elemento);
		return tabela[pos].pesquisar(elemento);

	}

	public void inserirInicio(Municipio elemento){

		int pos = h(elemento.getID());
		try{
			tabela[pos].inserirInicio(elemento);
		}catch(Exception e){
			MyIO.println("Erro inserirInicio");
		}

	}

	/*void remover(int elemento){

		int resp = NULO;
		if (pesquisar(elemento) == false){

			//

		}
		else{

			int pos = h(elemento);
			resp = tabela[pos].remover(elemento);

		}
		return resp;

	}*/

}
class Lista {
    private Municipio primeiro; // Primeira celula: SEM elemento valido.
    private Municipio ultimo; // Ultima celula: COM elemento valido.
 
    /**
     * Construtor da classe: Instancia uma celula (primeira e ultima).
     */
    public Lista() {
        primeiro = new Municipio();
        ultimo = primeiro;
    }
 
    /**
     * Mostra os elementos separados por espacos.
     */
    /*public void mostrar() {
        System.out.print("[ "); // Comeca a mostrar.
        for (Municipio i = primeiro.prox; i != null; i = i.prox) {
            System.out.print(i.elemento + " ");
        }
        System.out.println("] "); // Termina de mostrar.
    }*/
 
    /**
     * Procura um elemento e retorna se ele existe.
     * @param x Elemento a pesquisar.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    public boolean pesquisar(int x) {
        boolean retorno = false;
        for (Municipio i = primeiro.prox; i != null; i = i.prox) {
         if(i.getID() == x){
            retorno = true;
            i = ultimo;
         }
        }
        return retorno;
    }
 
    /**
     * Insere um elemento na primeira posicao da sequencia.
     * @param elemento Elemento a inserir.
     */
    public void inserirInicio(Municipio elemento) {
        Municipio tmp = elemento.clone();
      tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if (primeiro == ultimo) {
            ultimo = tmp;
        }
      tmp = null;
    }
 
    /**
     * Insere um elemento na ultima posicao da sequencia.
     * @param elemento Elemento a inserir.
     */
    /*public void inserirFim(int elemento) {
        Celula tmp = new Celula(elemento);
        ultimo.prox = tmp;
        ultimo = ultimo.prox;
      tmp = null;
    }*/
 
    /**
     * Insere elemento em um indice especifico.
     * Considera que primeiro elemento esta no indice 0.
     * @param x Elemento a inserir.
     * @param posicao Meio da insercao.
     * @throws Exception Se <code>posicao</code> for incorreta.
     */
   /*public void inserirMeio(int x, int posicao) throws Exception {
      Celula i;
      int cont;
 
        // Caminhar ate chegar na posicao anterior a insercao
      for(i = primeiro, cont = 0; (i.prox != ultimo && cont < posicao); i = i.prox, cont++);
         
        // Se indice for incorreto:
        if (posicao < 0 || posicao > cont + 1) {
            throw new Exception("Erro ao inserir (posicao " + posicao + "(cont = " + cont + ") invalida)!");
 
      } else if (posicao == cont + 1) {
         inserirFim(x);
        }else{
         Celula tmp = new Celula(x);
         tmp.prox = i.prox;
         i.prox = tmp;
         tmp = i = null;
      }
   }*/
 
    /**
     * Remove um elemento da primeira posicao da sequencia.
     * @return Elemento removido.
     * @throws Exception Se a sequencia nao contiver elementos.
     */
    /*public int removerInicio() throws Exception {
      int resp = -1;
 
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        }else{
         primeiro = primeiro.prox;
         resp = primeiro.elemento;
      }
 
        return resp;
    }*/
 
    /**
     * Remove um elemento da ultima posicao da sequencia.
     * @return Elemento removido.
     * @throws Exception Se a sequencia nao contiver elementos.
     */
    /*public int removerFim() throws Exception {
      int resp =  -1;
      Celula i = null;
 
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        } else {
 
         resp = ultimo.elemento;
 
           // Caminhar ate a penultima celula:
         for(i = primeiro; i.prox != ultimo; i = i.prox);
 
         ultimo = i;
         i = ultimo.prox = null;
      }
 
        return resp;
    }*/
 
    /**
     * Remove elemento de um indice especifico.
     * Considera que primeiro elemento esta no indice 0.
     * @param posicao Meio da remocao.
     * @return Elemento removido.
     * @throws Exception Se <code>posicao</code> for incorreta.
     */
    /*public int removerMeio(int posicao) throws Exception {
      Celula i;
      int resp = -1, cont;
 
        if (primeiro == ultimo){
            throw new Exception("Erro ao remover (vazia)!");
      }else{
 
           // Caminhar ate chegar na posicao anterior a insercao
         for(i = primeiro, cont = 0; (i.prox != ultimo && cont < posicao); i = i.prox, cont++);
 
         // Se indice for incorreto:
           if (posicao < 0 || posicao > cont + 1) {
            throw new Exception("Erro ao remover (posicao " + posicao + " invalida)!");
 
         } else if (posicao == cont + 1) {
            resp = removerFim();
         }else{
            Celula tmp = i.prox;
            resp = tmp.elemento;
            i.prox = tmp.prox;
            tmp.prox = null;
            i = tmp = null;
         }
      }
 
        return resp;
    }*/
} // fim Lista


/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class TP07Q07{

	
	public static void main(String[] args){

		Instant begin = Instant.now();

		Municipio[] city = new Municipio[6000];
		HashIndiretoLista hash = new HashIndiretoLista();
		int i = 0, entrada;

		//MyIO.setCharset("iso-8859-1");

		for(int j = 0; j < city.length; j++){

			city[j] = new Municipio();

		}

		Municipio.ler(city);

		do{

			entrada = MyIO.readInt();

			if(entrada != 0){

				try{

					hash.inserirInicio(city[entrada]);

				}catch(Exception e){

					System.out.println("entrada: " + entrada);
					MyIO.println("Erro inserir");

				}

			}

		}while(entrada > 0);

		int input = MyIO.readInt();

		do{

			String[] split = MyIO.readLine().split(" ");

			if(split[0].equals("I")){

				try{

					int tmp = Integer.parseInt(split[1]);
					hash.inserirInicio(city[tmp]);

				}catch(Exception e){

					MyIO.println("Erro inserir");

				}

			}
			/*else if(split[0].equals("R")){

				try{

					int tmp = Integer.parseInt(split[1]);
					arvore.remover(tmp);

				}catch(Exception e){

					MyIO.println("Erro remover");

				}

			}*/

		}while(--input > 0);

		String search = MyIO.readLine();

		do{

			try{

				if(!search.equals("FIM")){

					int tmp = Integer.parseInt(search);
					boolean resp = hash.pesquisar(tmp);

					if(resp) MyIO.println("SIM");
					else MyIO.println("NAO");

				}

			}catch(Exception e){

				MyIO.println("Erro parse");

			}

			search = MyIO.readLine();

		}while(!search.equals("FIM"));

		Instant end = Instant.now();

		Duration dr = Duration.between(begin, end);
		double sec = dr.toMillis();

		Arq.openWrite("572251_hashIndireta.txt", "utf-8");
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
