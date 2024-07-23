package ch5;

public class Q5_8 {

	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		//전체 합 구하기
		int sum = 0;
		int num = 0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				num++;
			}
		}
		
		System.out.println("전체 합: " + sum);
		
		//전체 평균 구하기
		double avg = (double) sum / num;
		System.out.println("전체 평균: " + avg);
		
	}
}