public class TP01Q04{

	/*public static int not(String tmpstring){

	}*/

	public static boolean algebraBool(String entrada){

		int cont = 0;
		String tmpstring = "";

		char[] tmpchar = new char[1000];

		do{

			if(entrada.charAt(cont) != ' '){
			
				tmpchar[cont] = entrada.charAt(cont);
				cont++;

			}
			else{

				cont++;

			}

		}while(cont < entrada.length());

		cont = 0;

		if(tmpchar[0] == '2'){
	
			while(tmpchar[cont] != 'a' && tmpchar[cont] != 'o' && tmpchar[cont] != 'n'){
				cont++;
			}

			do{

				if(tmpchar[cont] == 'A'){

					tmpstring += tmpchar[0+2];

				}
				else if(tmpchar[cont] == 'B'){

						tmpstring += tmpchar[0+4];

					}
					else if(tmpchar[cont] == ','){

						tmpstring += tmpchar[cont];

					}
				
				cont++;

			}while(cont < tmpchar.length); // armazenar o vetor em nova string substituindo A e B pelos numeros

		}
		else if(tmpchar[0] == '3'){

			while(tmpchar[cont] != 'a' && tmpchar[cont] != 'o' && tmpchar[cont] != 'n'){
				cont++;
			}

			do{

				if(tmpchar[cont] == 'A'){

					tmpstring += tmpchar[0+2];

				}
				else if(tmpchar[cont] == 'B'){

						tmpstring += tmpchar[0+4];

					}
					else if(tmpchar[cont] == 'C'){

							tmpstring += tmpchar[0+6];

						}
						else{

							tmpstring += tmpchar[cont];

						}
				cont++;

			}while(cont < tmpchar.length); //armazenar o vetor em nova string substituindo A B e C pelas entradas

			} // fim if

			// variavel com string sem espacos e com numeros substituidos

		cont = 0;

		do{

			if(tmpstring.charAt(cont) == 'a'){

				if(tmpstring.charAt(cont+1) == 'n'){

					

				}

			} // replace and

			else if(tmpstring.charAt(cont) == 'o'){

					if(tmpstring.charAt(cont+1) == 'r'){

					}

				} //replace or

				else if(tmpstring.charAt(cont) == 'n'){

						if(tmpstring.charAt(cont+1) == 'o'){

						}						

					} // replace not

		}while(cont < tmpstring.length());

		

// ================================================================================================ 

		cont = 0;

		//do{

			

		//}while(tmpstring != '0' && tmpstring != '1');

		return false;

	}
	
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



	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0;
		
		do{

			entrada[numEntrada] = MyIO.readLine(); 

		}while(!findEnd(entrada[numEntrada++]));
		

		numEntrada--;
		
		for(int i = 0; i < numEntrada; i++){

			if(algebraBool(entrada[i])) MyIO.println('1');
			else MyIO.println('0');

		}
		
	}

}
