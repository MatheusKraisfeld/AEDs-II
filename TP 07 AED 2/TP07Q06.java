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

	public Municipio dir;
	public Municipio esq;

	// construtor vazio

	public Municipio(){

		this.ID = this.codigoUF = this.populacao = this.numeroFuncionarios = this.numeroComissionados = this.atualizacaoPlano = this.atualizacaoCadastro = 0;
		this.nome = this.UF = this.escolaridade = this.estagio = this.regiao = "";
		this.consorcio = false;
		this.dir = null;
		this.esq = null;

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
		clone.dir = this.dir;
		clone.esq = this.esq;

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
 *@version 2017/05
 */
class ArvoreBinaria {
    private Municipio raiz; // Raiz da arvore.
 
    /**
     * Construtor da classe.
     */
    public ArvoreBinaria() {
        raiz = null;
    }
 
    /**
     * Metodo publico iterativo para pesquisar elemento.
     * @param x Elemento que sera procurado.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    public boolean pesquisar(int x) {
	MyIO.print("raiz ");
        return pesquisar(x, raiz);
    }
 
    /**
     * Metodo privado recursivo para pesquisar elemento.
     * @param x Elemento que sera procurado.
     * @param i No em analise.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    private boolean pesquisar(int x, Municipio i) {
      boolean resp;
        if (i == null) {
	 MyIO.println("NAO");
         resp = false;
 
      } else if (x == i.getID()) {
	 MyIO.println("SIM");
         resp = true;
 
      } else if (x < i.getID()) {
	 MyIO.print("esq ");
         resp = pesquisar(x, i.esq);
 
      } else {
	 MyIO.print("dir ");
         resp = pesquisar(x, i.dir);
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
    private void mostrarCentral(Municipio i) {
        if (i != null) {
            mostrarCentral(i.esq); // Elementos da esquerda.
            System.out.print(i.getID() + " "); // Conteudo do no.
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
    private void mostrarPre(Municipio i) {
        if (i != null) {
            System.out.print(i.getID() + " "); // Conteudo do no.
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
    private void mostrarPos(Municipio i) {
        if (i != null) {
            mostrarPos(i.esq); // Elementos da esquerda.
            mostrarPos(i.dir); // Elementos da direita.
            System.out.print(i.getID() + " "); // Conteudo do no.
        }
    }
 
 
    /**
     * Metodo publico iterativo para inserir elemento.
     * @param x Elemento a ser inserido.
     * @throws Exception Se o elemento existir.
     */
    public void inserir(Municipio x) throws Exception {
        raiz = inserir(x, raiz);
    }
 
    /**
     * Metodo privado recursivo para inserir elemento.
     * @param x Elemento a ser inserido.
     * @param i No em analise.
     * @return No em analise, alterado ou nao.
     * @throws Exception Se o elemento existir.
     */
    private Municipio inserir(Municipio x, Municipio i) throws Exception {
        if (i == null) {
         i = x;
 
      } else if (x.getID() < i.getID()) {
         i.esq = inserir(x, i.esq);
 
      } else if (x.getID() > i.getID()) {
         i.dir = inserir(x, i.dir);
 
      } else {
         //throw new Exception("Erro ao inserir!");
      }
 
        return i;
    }
 
    /**
     * Metodo publico iterativo para remover elemento.
     * @param x Elemento a ser removido.
     * @throws Exception Se nao encontrar elemento.
     */
    public void remover(int x) throws Exception {
        raiz = remover(x, raiz);
    }
 
    /**
     * Metodo privado recursivo para remover elemento.
     * @param x Elemento a ser removido.
     * @param i No em analise.
     * @return No em analise, alterado ou nao.
     * @throws Exception Se nao encontrar elemento.
     */
    private Municipio remover(int x, Municipio i) throws Exception {
 
        if (i == null) {
         //throw new Exception("Erro ao remover!");
 
      } else if (x < i.getID()) {
         i.esq = remover(x, i.esq);
 
      } else if (x > i.getID()) {
         i.dir = remover(x, i.dir);
 
      // Sem no a direita.
      } else if (i.dir == null) {
         i = i.esq;
 
      // Sem no a esquerda.
      } else if (i.esq == null) {
         i = i.dir;
 
      // No a esquerda e no a direita.
      } else {
         i.esq = antecessor(i, i.esq);
        }
 
        return i;
    }
 
    /**
     * Metodo para trocar no removido pelo antecessor.
     * @param i No que teve o elemento removido.
     * @param j No da subarvore esquerda.
     * @return No em analise, alterado ou nao.
     */
    private Municipio antecessor(Municipio i, Municipio j) {
 
      // Existe no a direita.
        if (j.dir != null) {
         // Caminha para direita.
            j.dir = antecessor(i, j.dir);
 
      // Encontrou o maximo da subarvore esquerda.
        } else {
            i = j.clone(); // Substitui i por j.
            j = j.esq; // Substitui j por j.ESQ.
        }
        return j;
    }
}

/**
 *Classe Hash
 *@author Max do Val Machado
 */

class Hash {
   Municipio tabela[];
   int m1, m2, m, reserva;
   Municipio NULO = null;
 
   public Hash (){
      this(21, 9);
   }
 
   public Hash (int m1, int m2){
      this.m1 = m1;
      this.m2 =  m2;
      this.m = m1 + m2;
      this.tabela = new Municipio [this.m];
      for(int i = 0; i < m; i++){
         tabela[i] = NULO;
      }
      reserva  = 0;
   }
 
   public int h(int elemento){
      return elemento % m1;
   }
 
   public boolean inserir (Municipio elemento){
      boolean resp = false;
 
      if(elemento != NULO){
 
         int pos = h(elemento.getID());
 
         if(tabela[pos] == NULO){
            tabela[pos] = elemento;
            resp = true;
 
         } else if (reserva < m2){
            tabela[m1 + reserva] = elemento;
            reserva++;
            resp = true;
         }
      }
 
      return resp;
   }
 
 
   public boolean pesquisar (int elemento){
      boolean resp = false;
 
      int pos = h(elemento);
 
      if(tabela[pos].getID() == elemento){
         resp = true;
 
      } else {
         for(int i = 0; i < reserva; i++){
            if(tabela[m1 + i].getID() == elemento){
               resp = true;
               i = reserva;
            }
         }
      }
      return resp;
   }
 
   boolean remover (int elemento){
      boolean resp = false;
 
      //...
 
      return resp;
   }
}

/**
 *Classe Hash com Rehash
 *@author Max do Val Machado
 */

class Rehash {
   Municipio tabela[];
   int m;
   Municipio NULO = null;
 
   public Rehash (){
      this(21);
   }
 
   public Rehash (int m){
      this.m = m;
      this.tabela = new Municipio [this.m];
   }
 
   public int h(int elemento){
      return elemento % m;
   }

   public int reh(int elemento){
	return ++elemento % m;
   }
 
   public boolean inserir (Municipio elemento){
      boolean resp = false;
 
      if(elemento != NULO){
 
         int pos = h(elemento.getID());
 
         if(tabela[pos] == NULO){
            tabela[pos] = elemento;
            resp = true;
 
         } else{
	    pos = reh(elemento.getID());
	    if(tabela[pos] == NULO){
           	 tabela[pos] = elemento;
         	 resp = true;
	    }
         }
      }
 
      return resp;
   }
 
 
   public boolean pesquisar (int elemento){
      boolean resp = false;
 
      int pos = h(elemento);
 
      if(tabela[pos].getID() == elemento){
         resp = true;
 
      } else {
	pos = reh(elemento);
	if(tabela[pos].getID() == elemento){
	   resp = true;
	}
      }
      return resp;
   }
 
   boolean remover (int elemento){
      boolean resp = false;
 
      //...
 
      return resp;
   }
}

/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class TP07Q06{

	
	public static void main(String[] args){

		Instant begin = Instant.now();

		Municipio[] city = new Municipio[6000];
		Rehash hash = new Rehash();
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

					hash.inserir(city[entrada]);

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
					hash.inserir(city[tmp]);

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

		Arq.openWrite("572251_hashRehash.txt", "utf-8");
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
