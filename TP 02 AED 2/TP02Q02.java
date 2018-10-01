class TP02Q02{
	
	public static String criptografia(String entrada){

		return criptografia(entrada, 0);

	}

/*
sobrecarga de metodo
*/

	public static String criptografia(String entrada, int posicao){

		String crip = "", tmp = "";

		if(posicao == entrada.length()){

			crip += "";

		}
		else{

			crip += (char)(entrada.charAt(posicao) + 3) + criptografia(entrada, posicao + 1);

		}

		return crip;

	}

/*
-metodo recursivo-
se a posicao passar do ultimo elemento do array, concatena vazio
se nao, string crip recebe o char de numero resultante do char da entrada + 3 mais a chamada do metodo na proxima posicao
*/

	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0;

		do{

			entrada[numEntrada] = MyIO.readLine();

		}while(!entrada[numEntrada++].equals("FIM") && numEntrada < entrada.length);

		numEntrada--;

/*
loop que alimenta o array de entradas ate encontrar a palavra FIM
*/

		for(int i = 0; i < numEntrada; i++){

			MyIO.println(criptografia(entrada[i]));

/*
loop de impressao da saida de cada elemento do array
*/

		} // fim for

	} // fim main

} // fim class
