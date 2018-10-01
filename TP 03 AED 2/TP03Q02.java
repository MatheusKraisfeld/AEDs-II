/**
 *Trabalho Pratico 03 - AEDs II
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

import java.lang.*;

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

	// imprimir cadastro instanciado

	public void imprimir(){

		MyIO.println(this.ID + " " + this.nome + " " + this.UF + " " + this.codigoUF + " " + this.populacao + " " + this.numeroFuncionarios + " " + this.numeroComissionados + " " + this.escolaridade + " " + this.estagio + " " + this.atualizacaoPlano + " " + this.regiao + " " + this.atualizacaoCadastro + " " + this.consorcio);

	}

	// chama o metodo de leitura de cada arquivo setando os valores do objeto para o da linha recebida

	public void ler(int linha){

		leVariaveisExternas(linha);


		leRecursosHumanos(linha);


		lePlanejamentoUrbano(linha);


		leGestaoAmbiental(linha);


		leRecursosParaGestao(linha);


		leArticulacaoInterinstitucional(linha);


	} // fim ler

	public void leVariaveisExternas(int linha){

		
		Arq.openRead("/tmp/variaveisexternas.txt","ISO-8859-1");
		int i = 0;

		while(i <= linha && Arq.hasNext()){

			if(i == linha){

				String[] temp = Arq.readLine().split("\t");

				try{

					this.setID(Integer.parseInt(temp[0]));

				}
				catch(NumberFormatException e){

					this.setID(0);

				}
				this.setNome(temp[4]);
				this.setUF(temp[3]);

				try{

					this.setCodigoUF(Integer.parseInt(temp[2]));

				}
				catch(NumberFormatException e){

					this.setCodigoUF(0);

				}
				try{

					this.setPopulacao(Integer.parseInt(temp[6]));

				}
				catch(NumberFormatException e){

					this.setPopulacao(0);

				}

				this.setRegiao(temp[1]);

			}
			
			Arq.readLine();
			i++;

		}


	} // fim variaveisExternas

	public void leRecursosHumanos(int linha){

		
		Arq.openRead("/tmp/recursoshumanos.txt","ISO-8859-1");
		//Arq.readLine();

		int i = 0;

		while(i <= linha && Arq.hasNext()){

			if(i == linha){

				String[] temp = Arq.readLine().split("\t");

				try{
			
					this.setNumeroFuncionarios(Integer.parseInt(temp[4]));

				}
				catch(NumberFormatException e){

					this.setNumeroFuncionarios(0);

				}

				try{

					this.setNumeroComissionados(Integer.parseInt(temp[7]));

				}
				catch(NumberFormatException e){

					this.setNumeroComissionados(0);

				}

			}
	
			Arq.readLine();
			i++;

		}


	} //fim recursosHumanos

	public void lePlanejamentoUrbano(int linha){

		
		Arq.openRead("/tmp/planejamentourbano.txt","ISO-8859-1");
		//Arq.readLine();

		int i = 0;

		while(i <= linha && Arq.hasNext()){

			if(i == linha){

				String[] temp = Arq.readLine().split("\t");

				this.setEscolaridade(temp[5]);
				

				try{
	
					this.setAtualizacaoPlano(Integer.parseInt(temp[8]));

				}
				catch(NumberFormatException e){

					this.setAtualizacaoPlano(0);

				}

			}
			Arq.readLine();
			i++;

		}


	} // fim planejamentoUrbano

	public void leGestaoAmbiental(int linha){

		
		Arq.openRead("/tmp/gestaoambiental.txt","ISO-8859-1");
		//Arq.readLine();

		int i = 0;

		while(i <= linha && Arq.hasNext()){

			if(i == linha){

				String[] temp = Arq.readLine().split("\t");

				this.setEstagio(temp[7]);

			}
			Arq.readLine();
			i++;

		}


	} // fim gestaoAmbiental

	public void leRecursosParaGestao(int linha){

		
		Arq.openRead("/tmp/recursosparagestao.txt","ISO-8859-1");
		//Arq.readLine();

		int i = 0;

		while(i <= linha && Arq.hasNext()){

			if(i == linha){

				String[] temp = Arq.readLine().split("\t");

				try{

					this.setAtualizacaoCadastro(Integer.parseInt(temp[6]));

				}
				catch(NumberFormatException e){

					this.setAtualizacaoCadastro(0);

				}

			}
			Arq.readLine();
			i++;

		}


	} // fim recursosParaGestao

	public void leArticulacaoInterinstitucional(int linha){

		
		Arq.openRead("/tmp/articulacaoointerinstitucional.txt","ISO-8859-1");

		int i = 0;

		while(i <= linha && Arq.hasNext()){

			if(i == linha){

				String[] temp = Arq.readLine().split("\t");

				if(temp[5].equals("Sim")){

					this.setConsorcio(true);

				}
				else{

					this.setConsorcio(false);

				}

			}
			Arq.readLine();
			i++;

		}


	} // fim articulacaoInterinstitucional

} // fim class Municipio

/**
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class ListaMunicipios extends Municipio{

	Municipio municipios[];
	int n;

	ListaMunicipios(int tamanho){

		municipios = new Municipio[tamanho];
		this.n = 0;

	}

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

	public void inserirFim(Municipio municipio) throws Exception{

		if(n >= municipios.length){

			throw new Exception("Erro!");

		}

		municipios[n] = municipio;
		n++;

	}

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

	public Municipio removerFim() throws Exception{

		if(n == 0){

			throw new Exception("Erro!");

		}

		return municipios[--n];

	}

	public void mostrar() throws Exception{

		if(n == 0){

			throw new Exception("Erro!");

		}

		for(int i = 0; i < n; i++){

			municipios[i].imprimir();

		}

	}

} // fim class ListaMunicipios

/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/02
 */

class TP03Q02{

	public static void main(String[] args){

		Municipio[] city = new Municipio[1000];
		int i = 0, entrada;		
		ListaMunicipios list = new ListaMunicipios(200);

		do{

			entrada = MyIO.readInt();

			if(entrada > 0){

				city[i] = new Municipio();
				city[i].ler(entrada);
				try{

					list.inserirFim(city[i]);
				}catch(Exception e){

					MyIO.println("Erro!");

				}

			}

			i++;

		}while(entrada != 0 && i < city.length);

		i--;

		/*for(int j = 0; j < i; j++){

			city[j].imprimir();

		}*/

		int entradas = MyIO.readInt();
		//ListaMunicipios list = new ListaMunicipios(entradas);
		Municipio novo;
		String op = "";

		do{

			op = MyIO.readLine();
			String[] tmp = op.split(" ");
			novo = new Municipio();

			switch (tmp[0]) {

				case "II":

					try{

						
						novo.ler(Integer.parseInt(tmp[1]));
						list.inserirInicio(novo);

					}catch(Exception e){

						MyIO.println("Erro INSERIR INICIO");

					}

					break;

				case "I*":
	
					try{					

						
						novo.ler(Integer.parseInt(tmp[2]));
						list.inserir(novo, Integer.parseInt(tmp[1]));

					}catch(Exception e){

						MyIO.println("Erro INSERIR");

					}

					break;

				case "IF":

					try{
						
						novo.ler(Integer.parseInt(tmp[1]));
						list.inserirFim(novo);

					}catch(Exception e){

						MyIO.println("Erro INSERIR FIM");

					}

					break;

				case "RI":

					try{
					
						novo = list.removerInicio();

					}catch(Exception e){

						MyIO.println("Erro REMOVER INICIO");

					}

					MyIO.println("(R) " + novo.getNome());

					break;

				case "R*":

					try{

						novo = list.remover(Integer.parseInt(tmp[1]));

					}catch(Exception e){

						MyIO.println("Erro REMOVER");

					}

					MyIO.println("(R) " + novo.getNome());

					break;

				case "RF":

					try{

						novo = list.removerFim();

					}catch(Exception e){

						MyIO.println("Erro REMOVER FIM");

					}

					MyIO.println("(R) " + novo.getNome());

					break;

				default:

					break;


			} // fim switch

		}while(--entradas > 0);

		try{

			list.mostrar();

		}catch(Exception e){

			MyIO.println("Erro MOSTRAR");

		}

	}

}
