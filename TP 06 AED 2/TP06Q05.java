
/**
 * Trabalho Pratico 06 - AEDs II
 * @author Matheus Kraisfeld
 * @version 2017/05
 */

class Matriz{

	Celula inicio;
	int linha;
	int coluna;

	// Construtor sem parametros, cria matriz de dimensoes 3x3

	Matriz(){

		this.linha = this.coluna = 3;
		int linhas = 0, colunas = 0;

		for(Celula i = inicio; linhas < this.linha; linhas++, i = i.inf){

			

			for(Celula j = i; colunas < this.coluna; colunas++, j = j.dir){

				Celula tmp = new Celula();
				tmp.esq = j;
				j.dir = tmp;

			}

			if((linhas + 1) < this.linha){

				Celula novo = new Celula();
				i.inf = novo;
				colunas = 0;

			}

		}

	} // fim construtor

/**
 * Construtor que cria matriz de dimensoes pre definidas
 * @param linhas da matriz
 * @param colunas da matriz
 */

	Matriz(int linhas, int colunas){

		this.linha = linhas;
		this.coluna = colunas;
		this.inicio = new Celula();
		int l = 0, c = 0;

		for(Celula i = inicio; l < this.linha; l++, i = i.inf){

			for(Celula j = i; c < this.coluna; c++, j = j.dir){

				Celula tmp = new Celula();
				tmp.esq = j;
				j.dir = tmp;

			}

			if(l > 0){

				c = 0;

				Celula tmp1 = i.sup;
				Celula tmp2 = i;

				for( ; c < this.coluna; c++){

					tmp1.inf = tmp2;
					tmp2.sup = tmp1;
					tmp1 = tmp1.dir;
					tmp2 = tmp2.dir;
					

				} 

			}

			if((l + 1) < this.linha){

				Celula novo = new Celula();
				i.inf = novo;
				novo.sup = i;
				c = 0;

			}

		}

	} // fim construtor

	// Exibe diagonal principal da matriz corrente

	public void mostrarDiagonalPrincipal(){

		int i = 0, j = 0;
		
		for(Celula ind = inicio; i < this.linha; i++, ind = ind.inf){

			for(Celula aux = ind; j < this.coluna; j++, aux = aux.dir){

				if(i == j){

					aux.imprimir();

				}

			}

			j = 0;

		}

		MyIO.print("\n");

	}

	// Exibe diagonal secundaria da matriz corrente

	public void mostrarDiagonalSecundaria(){

		if(isQuadrada()){

			int i = 0, j = 0;
		
			for(Celula ind = inicio; i < this.linha; i++, ind = ind.inf){

				for(Celula aux = ind; j < this.coluna; j++, aux = aux.dir){

					if((i + j) == this.linha - 1){

						aux.imprimir();

					}

				}

				j = 0;

			}

			MyIO.print("\n");

		}

	}

	// Soma matriz corrente com matriz recebida por parametro e retorna a nova matriz

	public Matriz soma(Matriz m){

		Matriz result = new Matriz(this.linha, this.coluna);

		if(this.linha == m.linha && this.coluna == m.coluna){


			Celula tmp = result.inicio;
			Celula ind2 = m.inicio;
			Celula aux2;
			int i = 0, j = 0;
		
			for(Celula ind = inicio; i < this.linha; i++, ind = ind.inf, ind2 = ind2.inf){

				Celula start = tmp;
				aux2 = ind2;

				for(Celula aux = ind; j < this.coluna; j++, aux = aux.dir, aux2 = aux2.dir){

					tmp.elemento = aux.elemento + aux2.elemento;

					if((j + 1) < this.coluna){

						tmp = tmp.dir;
						

					}

				}
			
				tmp = start.inf;

				j = 0;

			}


		}

		return result;

	}

	// Multiplica matriz corrente com uma recebida por parametro e retorna matriz resultado

	public Matriz multiplicacao(Matriz m){

		Matriz mult = new Matriz(this.coluna, this.linha);
		Celula result = mult.inicio;
		Celula aux = m.inicio;
		int i = 0, j = 0;

		if(this.linha == m.coluna && this.coluna == m.linha){

			for(Celula ind = inicio; i < this.linha; i++, ind = ind.inf, result = result.inf) {

				Celula start = ind;

			        for( ; j < this.linha; j++, aux = aux.dir, result = result.dir) {

					int x = 0;
					Celula start2 = aux;
					start = ind;
					int ac = 0;

			                for( ; x < this.coluna; x++, start = start.dir, start2 = start2.inf) {
                				ac += start.elemento * start2.elemento;


			                } // fim for x

					result.elemento = ac;

            			} // fim for j

				while(result.esq != null) result = result.esq;
				while(aux.esq != null) aux = aux.esq;
				j = 0;

        		} // fim for i


		}

		return mult;

	}

	// Exibe a matriz corrente

	public void mostrar(){

		int i = 0, j = 0;
		
		for(Celula ind = inicio; i < this.linha; i++, ind = ind.inf){

			for(Celula aux = ind; j < this.coluna; j++, aux = aux.dir){

				MyIO.print(aux.elemento + " ");

			}

			MyIO.print("\n");
			j = 0;

		}

	}

	// Verifica se a matriz corrente é quadrada

	public boolean isQuadrada(){

		return (this.linha == this.coluna);

	}

	// Preenche a matriz com valores recebidos da entrada padrao

	public void preencheMatriz(){

		int i = 0, j = 0;
		
		for(Celula ind = inicio; i < this.linha; i++, ind = ind.inf){

			for(Celula aux = ind; j < this.coluna; j++, aux = aux.dir){

				aux.elemento = MyIO.readInt();

			}

			j = 0;

		}

	}

}


/**
 * Trabalho Pratico 06 - AEDs II
 * @author Matheus Kraisfeld
 * @version 2017/05
 */

class Celula{

	int elemento;
	Celula inf, sup, esq, dir;

	// Construtor vazio

	public Celula(){

		this(0, null, null, null, null);

	}

	// Construtor que recebe apenas o elemento

	public Celula(int elemento){

		this(elemento, null, null, null, null);

	}

	// Construtor que recebe todos os parametros para setar os atributos

	public Celula(int elemento, Celula inf, Celula sup, Celula esq, Celula dir){

		this.elemento = elemento;
		this.inf = inf;
		this.sup = sup;
		this.esq = esq;
		this.dir = dir;

	}

	// Exibe o elemento da celula

	public void imprimir(){

		MyIO.print(this.elemento + " ");

	}

	// Cria um novo objeto com os mesmos atributos e retorna

	public Celula clone(){

		Celula clone = new Celula();

		clone.elemento = this.elemento;
		clone.inf = this.inf;
		clone.sup = this.sup;
		clone.esq = this.esq;
		clone.dir = this.dir;

		return clone;

	}

}

/**
 *Classe principal
 *@author Matheus Kraisfeld
 *@version 2017/05
 */

class TP06Q05{

	public static void main(String[] args){

		int entradas = MyIO.readInt();

		do{

			int linhas = MyIO.readInt();
			int colunas = MyIO.readInt();

			Matriz m1 = new Matriz(linhas, colunas);
			m1.preencheMatriz();

			m1.mostrarDiagonalPrincipal();
			m1.mostrarDiagonalSecundaria();

			linhas = MyIO.readInt();
			colunas = MyIO.readInt();

			Matriz m2 = new Matriz(linhas, colunas);
			m2.preencheMatriz();

			Matriz soma = m1.soma(m2);
			soma.mostrar();

			Matriz mult = m1.multiplicacao(m2);
			mult.mostrar();
			

		}while(--entradas > 0);

	}

}
