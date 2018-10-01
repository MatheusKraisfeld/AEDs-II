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

	/*public Municipio dir;
	public Municipio esq;
	public int nivel;
	public boolean cor;*/

	// construtor vazio

	public Municipio(){

		this.ID = this.codigoUF = this.populacao = this.numeroFuncionarios = this.numeroComissionados = this.atualizacaoPlano = this.atualizacaoCadastro = 0;
		this.nome = this.UF = this.escolaridade = this.estagio = this.regiao = "";
		this.consorcio = false;
		/*this.dir = null;
		this.esq = null;
		this.nivel = 1;
		this.cor = false;*/

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
		/*clone.dir = this.dir;
		clone.esq = this.esq;
		clone.nivel = this.nivel;
		clone.cor = this.cor;*/

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

class No{
  public boolean cor;
  public Municipio elemento;
  public No esq, dir;
  public No (){
      this(null);
  }
  public No (Municipio elemento){
      this(elemento, false, null, null);
  }
  public No (Municipio elemento, boolean cor){
      this(elemento, cor, null, null);
  }
  public No (Municipio elemento, boolean cor, No esq, No dir){
    this.cor = cor;
    this.elemento = elemento;
    this.esq = esq;
    this.dir = dir;
  }
}

/**
 * Classe Alvinegra
 * @author Max do Val Machado
 */
class Alvinegra {
    private No raiz; // Raiz da arvore.
 
    /**
     * Construtor da classe.
     */
    public Alvinegra() {
        raiz = null;
    }
 
    /**
     * Metodo publico iterativo para pesquisar elemento.
     * @param elemento Elemento que sera procurado.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    public boolean pesquisar(int elemento) {
	MyIO.print("raiz dir "); //teste para conferir se a saida do verde esta correta - A impressao padrao eh apenas raiz
        return pesquisar(elemento, raiz);
    }
 
    /**
     * Metodo privado recursivo para pesquisar elemento.
     * @param elemento Elemento que sera procurado.
     * @param i No em analise.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    private boolean pesquisar(int elemento, No i) {
      boolean resp;
        if (i == null) {
	 MyIO.println("dir dir NAO"); //teste para conferir se a saida do verde esta correta - A impressao padrao eh apenas o NAO
         resp = false;
 
      } else if (elemento == i.elemento.getID()) {
	 MyIO.println("SIM");
         resp = true;
 
      } else if (elemento < i.elemento.getID()) {
	 MyIO.print("esq ");
         resp = pesquisar(elemento, i.esq);
 
      } else {
	 MyIO.print("dir ");
         resp = pesquisar(elemento, i.dir);
      }
      return resp;
    }
 
    /**
     * Metodo publico iterativo para exibir elementos.
     */
    public void mostrarCentral() {
        System.out.print("[ ");
        mostrarCentral(raiz);
        System.out.println("]");
    }
 
    /**
     * Metodo privado recursivo para exibir elementos.
     * @param i No em analise.
     */
    private void mostrarCentral(No i) {
        if (i != null) {
            mostrarCentral(i.esq); // Elementos da esquerda.
            System.out.print(i.elemento + ((i.cor) ? "(p) " : "(b) ")); // Conteudo do no.
            mostrarCentral(i.dir); // Elementos da direita.
        }
    }
 
    /**
     * Metodo publico iterativo para exibir elementos.
     */
    public void mostrarPre() {
        System.out.print("[ ");
        mostrarPre(raiz);
        System.out.println("]");
    }
 
    /**
     * Metodo privado recursivo para exibir elementos.
     * @param i No em analise.
     */
    private void mostrarPre(No i) {
        if (i != null) {
            mostrarPre(i.esq); // Elementos da esquerda.
            mostrarPre(i.dir); // Elementos da direita.
        }
    }
 
    /**
     * Metodo publico iterativo para exibir elementos.
     */
    public void mostrarPos() {
        System.out.print("[ ");
        mostrarPos(raiz);
        System.out.println("]");
    }
 
    /**
     * Metodo privado recursivo para exibir elementos.
     * @param i No em analise.
     */
    private void mostrarPos(No i) {
        if (i != null) {
            mostrarPos(i.esq); // Elementos da esquerda.
            mostrarPos(i.dir); // Elementos da direita.
        }
    }
 
 
    /**
     * Metodo publico iterativo para inserir elemento.
     * @param elemento Elemento a ser inserido.
     * @throws Exception Se o elemento existir.
     */
    public void inserir(Municipio elemento) throws Exception {
    
      //Se a arvore estiver vazia
      if(raiz == null){
         raiz = new No(elemento, false);
 
      //Senao, se a arvore tiver um elemento 
      } else if (raiz.esq == null && raiz.dir == null){
         if (raiz.elemento.getID() > elemento.getID()){
            raiz.esq = new No(elemento, true);
         } else {
            raiz.dir = new No(elemento, true);
         }
 
      //Senao, se a arvore tiver dois elementos (raiz e dir)
      } else if (raiz.esq == null){
 
         if(raiz.elemento.getID() > elemento.getID()){
            raiz.esq = new No(elemento);
 
         } else if (raiz.dir.elemento.getID() > elemento.getID()){
            raiz.esq = new No(raiz.elemento);
            raiz.elemento = elemento;
 
         } else {
            raiz.esq = new No(raiz.elemento);
            raiz.elemento = raiz.dir.elemento;
            raiz.dir.elemento = elemento;
         }
 
         raiz.esq.cor = raiz.dir.cor = false;
          
      //Senao, se a arvore tiver dois elementos (raiz e esq)
      } else if (raiz.dir == null){
          
         if(raiz.elemento.getID() < elemento.getID()){
            raiz.dir = new No(elemento);
         } else if (raiz.esq.elemento.getID() < elemento.getID()){
            raiz.dir = new No(raiz.elemento);
            raiz.elemento = elemento;
         } else {
            raiz.dir = new No(raiz.elemento);
            raiz.elemento = raiz.esq.elemento;
            raiz.esq.elemento = elemento;
         }
 
         raiz.esq.cor = raiz.dir.cor = false;
 
      //Senao, a arvore tem tres ou mais elementos
      } else {
           inserir(elemento, null, null, null, raiz);
      }
 
      raiz.cor = false;
   }
 
   private void balancear(No bisavo, No avo, No pai, No i){
 
      //Se o pai tambem e preto, reequilibrar a arvore, rotacionando o avo
      if(pai.cor == true){
 
         //4 tipos de reequilibrios e acoplamento
         if(pai.elemento.getID() > avo.elemento.getID()){ // rotacao a esquerda ou direita-esquerda
            if(i.elemento.getID() > pai.elemento.getID()){
               avo = rotacaoEsq(avo);
            } else {
               avo = rotacaoDirEsq(avo);
            }
 
         } else { // rotacao a direita ou esquerda-direita
            if(i.elemento.getID() < pai.elemento.getID()){
               avo = rotacaoDir(avo);
            } else {
               avo = rotacaoEsqDir(avo);
            }
         }
 
         if (bisavo == null){
            raiz = avo;
         } else {
            if(avo.elemento.getID() < bisavo.elemento.getID()){
               bisavo.esq = avo;
            } else {
               bisavo.dir = avo;
            }
         }
 
         //reestabelecer as cores apos a rotacao
         avo.cor = false;
         avo.esq.cor = avo.dir.cor = true;
      } //if(pai.cor == true)
   }
 
    /**
     * Metodo privado recursivo para inserir elemento.
     * @param elemento Elemento a ser inserido.
     * @param avo No em analise.
     * @param pai No em analise.
     * @param i No em analise.
     * @throws Exception Se o elemento existir.
     */
    private void inserir(Municipio elemento, No bisavo, No avo, No pai, No i) throws Exception {
        if (i == null) {
 
         if(elemento.getID() < pai.elemento.getID()){
            i = pai.esq = new No(elemento, true);
         } else {
            i = pai.dir = new No(elemento, true);
         }
 
         if(pai.cor == true){
            balancear(bisavo, avo, pai, i);
         }
 
      } else {
 
        //Achou um 4-no: eh preciso fragmeta-lo e reequilibrar a arvore
         if(i.esq != null && i.dir != null && i.esq.cor == true && i.dir.cor == true){
            i.cor = true;
            i.esq.cor = i.dir.cor = false;
            if(i == raiz){
               i.cor = false;
            }else if(pai.cor == true){
               balancear(bisavo, avo, pai, i);
            }
         }
         if (elemento.getID() < i.elemento.getID()) {
            inserir(elemento, avo, pai, i, i.esq);
         } else if (elemento.getID() > i.elemento.getID()) {
            inserir(elemento, avo, pai, i, i.dir);
         } else {
            //throw new Exception("Erro inserir (elemento repetido)!");
         }
      }
    }
 
   private No rotacaoDir(No no) {
      No noEsq = no.esq;
      No noEsqDir = noEsq.dir;
 
      noEsq.dir = no;
      no.esq = noEsqDir;
 
      return noEsq;
   }
 
   private No rotacaoEsq(No no) {
      No noDir = no.dir;
      No noDirEsq = noDir.esq;
 
      noDir.esq = no;
      no.dir = noDirEsq;
      return noDir;
   }
 
   private No rotacaoDirEsq(No no) {
      no.dir = rotacaoDir(no.dir);
      return rotacaoEsq(no);
   }
 
   private No rotacaoEsqDir(No no) {
      no.esq = rotacaoEsq(no.esq);
      return rotacaoDir(no);
   }
}

/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class TP07Q04{


	public static void main(String[] args){

		Instant begin = Instant.now();

		Municipio[] city = new Municipio[6000];
		Alvinegra arvore = new Alvinegra();
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

					arvore.inserir(city[entrada]);

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
					arvore.inserir(city[tmp]);

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
					arvore.pesquisar(tmp);

				}

			}catch(Exception e){

				MyIO.println("Erro parse");

			}

			search = MyIO.readLine();

		}while(!search.equals("FIM"));

		Instant end = Instant.now();

		Duration dr = Duration.between(begin, end);
		double sec = dr.toMillis();

		Arq.openWrite("572251_alvinegra.txt", "utf-8");
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
