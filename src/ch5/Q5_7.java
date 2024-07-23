package ch5;

public class Q5_7 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max_num = 0;

		for (int i=0; i<array.length; i++) {
			if (array[i] > max_num) {
				max_num = array[i];
			}
		}
		
		System.out.println(max_num);
	}
}