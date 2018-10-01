public class TP01Q01{

	public static boolean verificaPalindromo(String entrada){

		int x = 0, y = entrada.length() - 1;

		do{
			
			if(entrada.charAt(x) != entrada.charAt(y)) return false;
						
			x++;
			y--;

		}while(x <= y);
		// enquanto o contador x(comeca na primeira letra) for menor ou igual ao y(comeca na ultima letra) comparar as duas letras

		return true;

	}
	
	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0;
		
		do{

			entrada[numEntrada] = MyIO.readLine(); // alimenta o array de strings

		}while(!entrada[numEntrada++].equals("FIM"));
		// Enquanto entrada diferente de FIM o loop e executado

		numEntrada--;
		// desconsidera a palavra FIM presente na ultima posicao

		for(int i = 0; i < numEntrada; i++){

			if(verificaPalindromo(entrada[i])) MyIO.println("SIM");
			else MyIO.println("NAO");

		}
		// percorre o array retornando SIM ou NAO para a verificacao de palindromo

	}

}
