class ordena_selecao{

	public static void main(String[] args){

		int array[] = {10,9,8,7,6,5,4,3,2,1};

		for(int i = 0; i < array.length - 1; i++){

			int menor = i;

			for(int j = (i + 1); j < array.length; j++){

				if(array[menor] > array[j]){

					menor = j;

				}

			}

			int tmp = array[i];
			array[i] = array[menor];
			array[menor] = tmp;
			MyIO.print(array[menor] + " ");

		}

		MyIO.print("\n");

	}	

}
