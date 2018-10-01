import java.lang.*;

public class TP01Q05{

	public static boolean isVogal(char entrada){

		return (entrada == 'a' || entrada == 'e' || entrada == 'i' || entrada == 'o' || entrada == 'u' || entrada == 'A' || entrada == 'E' || entrada == 'I' || entrada == 'O' || entrada == 'U');

	}

	// metodo que verifica se o caracter eh vogal pelo seu valor numerico na tabela ASCII
	// fim isVogal

	public static boolean soLetras(String entrada){

		boolean maiuscula, minuscula, resp = false;
		int i = 0;

		do{

			maiuscula = false;
			minuscula = false;

			if(entrada.charAt(i) >= 'A' && entrada.charAt(i) <= 'Z'){

				maiuscula = true;

			}
			else if(entrada.charAt(i) >= 'a' && entrada.charAt(i) <= 'z'){

				minuscula = true;

			}

			i++;

		}while((maiuscula || minuscula) && i < entrada.length());

		if((maiuscula || minuscula) == true){

			resp = true;

		}

		return resp;

	}
	
	// metodo que verifica se um caracter eh letra pelo seu valor numerico entre A e Z, ou a e z
	// fim soLetras

	public static boolean ehNumero(String entrada){

		boolean resp = false;
		int i = 0;

		do{

			if((int)entrada.charAt(i) >= '0' && (int)entrada.charAt(i) <= '9'){

				resp = true;

			}
			else{

				resp = false;

			}

			i++;

		}while(resp && i < entrada.length());

		return resp;

	}

	// metodo que verifica se um caracter eh numero pelo seu valor numerico na tabela ASCII
	// fim ehNumero

	public static boolean soVogais(String entrada){

		boolean resp = false;
		int i = 0;

		if(soLetras(entrada)){

			do{

				if(isVogal(entrada.charAt(i))){

					resp = true;

				}
				else{

					resp = false;

				}

				i++;
			
			}while(resp && i < entrada.length());


		}

		return resp;

	}

	// metodo que verifica se um caracter eh vogal chamando o metodo isVogal para cada posicao da string 
	// fim soVogais

	public static boolean soConsoantes(String entrada){

		for(int i = 0; i < entrada.length(); i++){

                        if(isVogal(entrada.charAt(i))){

                                return false;

			}

			if((entrada.charAt(i) < 'A' || (entrada.charAt(i) > 'Z' && entrada.charAt(i) < 'a') || entrada.charAt(i) > 'z')){

				return false;

			}                       


                }

                return true;

	} 
	
	// metodo que verifica se um caracter eh consoante retornando falso se for vogal ou estiver fora do intervalo das letras na tabela
	// ASCII
	// fim soConsoantes
	
	
	public static boolean verificaReal(String entrada){

		double tmp;
		char[] vetEntrada = new char[entrada.length()];
	
		for(int i = 0; i < entrada.length(); i++){

			if(entrada.charAt(i) == ','){

				vetEntrada[i] = '.';
			}
			else{
				
				vetEntrada[i] = entrada.charAt(i);

			}

		}
		
		String novaString = "";

		for(int i = 0; i < vetEntrada.length; i++){

			novaString += vetEntrada[i];

		}

		try{
			
			tmp = Double.parseDouble(novaString);

		}
		catch(NumberFormatException e){
			
			return false;

		}

		return true;

	}

	// metodo que substitui o caracter , por . e verifica se pode ser convertido para double retornando true se sim, ou false se gerar
	// excecao
	// fim verificaReal

	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0;

		do{

			entrada[numEntrada] = MyIO.readLine();

		}while(!entrada[numEntrada++].equals("FIM"));

		numEntrada--;
		
		// loop de leitura de entradas enquanto nao ler FIM

		String vogal, consoante, inteiro, real;

		for(int i = 0; i < numEntrada; i++){


			if(soVogais(entrada[i])){

				vogal = "SIM";
			
			}
			else{

				vogal = "NAO";

			}

			if(soConsoantes(entrada[i])){

                                consoante = "SIM";

                        }
                        else{

                                consoante = "NAO";

                        }

			if(ehNumero(entrada[i])){

                                inteiro = "SIM";

                        }
                        else{

                                inteiro = "NAO";

                        }

			if(verificaReal(entrada[i])){

                                real = "SIM";

                        }
                        else{

                                real = "NAO";

                        }

			MyIO.println(vogal + " " + consoante + " " + inteiro + " " + real);

		} 

		// loop para retornar a saida de cada entrada
		// fim for
	

	} // fim main

} // fim classe
