package sec02.exam08;

public class ArrayCapyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 5};
		int[] newIntArray = new int [5]; //5층
		
		for(int i=0; i<oldIntArray.length; i++){
			newIntArray[i] = oldIntArray[i];
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
