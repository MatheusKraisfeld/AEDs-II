public class TP02Q05{

	public static boolean ehVogal(char entrada){

		return (entrada == 'a' || entrada == 'e' || entrada == 'i' || entrada == 'o' || entrada == 'u' || entrada == 'A' || entrada == 'E' || entrada == 'I' || entrada == 'O' || entrada == 'U');

	} // fim ehVogal

/*
verifica se um caracter eh vogal pelo seu valor numerico
*/

	public static boolean soVogais(String entrada){

		return soVogais(entrada, 0);

	} // sobrecarga do metodo soVogais

	public static boolean soVogais(String entrada, int posicao){

		boolean resp = false;

		if(posicao == entrada.length()){

			resp = true;

		}
		else if(ehVogal(entrada.charAt(posicao))){

				resp = soVogais(entrada, posicao + 1);

			}

		return resp;

	} // fim soVogais

/*
executa o metodo ehVogal em todas as posicoes da string entrada para verificar se possui apenas vogais
*/

	public static boolean soConsoantes(String entrada){

		return soConsoantes(entrada, 0);

	} // sobrecarga do metodo soConsoantes

	public static boolean soConsoantes(String entrada, int posicao){

		boolean resp = false;

		if(posicao == entrada.length()){

			resp = true;

		}
		else if(((entrada.charAt(posicao) >= 'a' && entrada.charAt(posicao) <= 'z') || (entrada.charAt(posicao) >= 'A' && entrada.charAt(posicao) <= 'Z')) && !ehVogal(entrada.charAt(posicao))){

				resp = soConsoantes(entrada, posicao + 1);

			}
		
		return resp;

	} // fim soConsoantes

/*
verifica se o caracter de cada posicao da string esta no intervalo de a-z ou A-Z e nao eh uma vogal
*/

	public static boolean ehNumero(char entrada){

		return (entrada >= '0' && entrada <= '9');

	} // fim ehNumero

	public static boolean ehInteiro(String entrada){

		return ehInteiro(entrada, 0);

	} // sobrecarga do metodo ehInteiro

	public static boolean ehInteiro(String entrada, int posicao){

		boolean resp = false;

		if(posicao == entrada.length()){

			resp = true;

		}
		else if(ehNumero(entrada.charAt(posicao))){

				resp = ehInteiro(entrada, posicao + 1);

			}

		return resp;

	} // fim ehInteiro

/*
verifica se cada caracter da entrada esta no intervalo 0-9
*/

	public static boolean ehReal(String entrada){

		return ehReal(entrada, 0, 0);

	} // sobrecarga do metodo ehReal

	public static boolean ehReal(String entrada, int posicao, int contPontos){

		boolean resp = false;

		if(posicao == entrada.length()){

			resp = true;

		}
		else if(ehNumero(entrada.charAt(posicao))){

				resp = ehReal(entrada, posicao + 1, contPontos);

			}
			else if(entrada.charAt(posicao) == ',' || entrada.charAt(posicao) == '.'){

					resp = ehReal(entrada, posicao + 1, contPontos + 1);

				}
		
		if(contPontos > 1){

			resp = false;

		}

		return resp;

	} // fim ehReal

	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0 ;

		do{

			entrada[numEntrada] = MyIO.readLine();

		}while(!entrada[numEntrada++].equals("FIM") && numEntrada < entrada.length);

		numEntrada--;

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
        
                        if(ehInteiro(entrada[i])){

                                inteiro = "SIM";                       
                
                        }                                              
                        else{
                                                                       
                                inteiro = "NAO";
                                                                       
                        }                                              

                        if(ehReal(entrada[i])){                  
                                                                       
                                real = "SIM";                          
                                                                       
                        }
                        else{
        
                                real = "NAO";	
			}

			MyIO.println(vogal + " " + consoante + " " + inteiro + " " + real);

		} // fim for

	} // fim main

} // fim class
