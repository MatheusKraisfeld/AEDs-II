class binary_insertion{

	public static void main(String[] args){

		int array[] = {10,9,8,7,6,5,4,3,2,1};

		insertionSort(array);

		for(int i = 0; i < array.length; i++){

			MyIO.println(array[i]);

		}

	}

	public static void insertionSort(int array[]){

		for(int i = 1; i < array.length; i++){

			int tmp = array[i];
			int j = i - 1;
			int k = binary_srch(tmp, i, array);

			while(j > k){

				array[j+1] = array[j];
				j--;

			}
			
			array[j+1] = tmp;

		}

	}

	public static int binary_srch(int x, int n, int array[]){

		
	int left = 0, right = n -1, mid;

	do{

		mid = (left + right) / 2;

		if(array[mid] == x){

			left = right + 1;

		}
		else if(array[mid] < x){

			left = mid + 1;

		}
		else{

			right = mid - 1;
			mid--;

		}

	}while(left <= right);

	return mid;

	}


}
