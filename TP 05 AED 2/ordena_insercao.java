class ordena_insercao{

	public static void main(String[] args){

		int array[] = {10,9,8,7,6,5,4,3,2,1};

		for(int i = 1; i < array.length; i++){

			int tmp = array[i];
			int j = i - 1;

			while(j >= 0 && array[j] > tmp){

				array[j + 1] = array[j];
				j--;

			}

			array[j + 1] = tmp;

		}

		for(int i = 0; i < array.length; i++){

			MyIO.print(array[i]);

		}

	}

}
