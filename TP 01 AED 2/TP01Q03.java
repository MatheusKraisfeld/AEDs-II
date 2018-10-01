import java.util.Random;

public class TP01Q03{
	
	public static boolean findEnd(String entrada){

		boolean resp = false;
		String end = "FIM";
		int i = 0;

		if(entrada.length() != 3){

			resp = false;

		}
		else{

			do{

				if(entrada.charAt(i) == end.charAt(i)){

					resp = true;
					i++;

				}
				else{

					resp = false;

				}

			}while(i < entrada.length() && resp); 

		}

		return resp;

	} 

/**
*Metodo que verifica se a palavra recebida eh a palavra FIM e retorna verdadeiro ou falso
*/

	public static void alteracao(String entrada, Random gerador){

		int posicao = 0;
		String tmp = "";
		char c1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
		char c2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
	
		do{
			

			if(entrada.charAt(posicao) != c1){

				tmp += entrada.charAt(posicao);

			}
			else{

				tmp += c2;

			}

			posicao++;

		}while(posicao < entrada.length());

		MyIO.println(tmp);

	}

/**
*Metodo que recebe o objeto gerador e a entrada, sorteia um caracter e substitui as ocorrencias do mesmo por outro sorteado
*/

	public static void main(String[] args){

		
		Random gerador = new Random();
		gerador.setSeed(4);

		String[] entrada = new String[1000];
		int numEntrada = 0;
		boolean end;

		entrada[numEntrada] = MyIO.readLine();
		
		while(!findEnd(entrada[numEntrada])){

			alteracao(entrada[numEntrada], gerador);
			numEntrada++;
			entrada[numEntrada] = MyIO.readLine();

		}

	}

}
