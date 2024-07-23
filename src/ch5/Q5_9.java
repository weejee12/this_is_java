package ch5;

import java.util.Scanner;

public class Q5_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = null;
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int choose = sc.nextInt();
			
			switch(choose) {
				case 1:
					System.out.print("학생 수> ");
					int students = sc.nextInt();
					array = new int[students];
					break;
					
				case 2:
					for(int i=0; i<array.length; i++) {
						System.out.print("scores[" + i + "]: ");
						array[i] = sc.nextInt();
					}
					break;
					
				case 3:
					for(int i=0; i<array.length; i++) {
						System.out.println("scores[" + i + "]: " + array[i]);
					}
					break;
					
				case 4:
					//최고 점수 구하기
					int max = 0;
					int sum = 0;
					for (int i=0; i<array.length; i++) {
						sum += array[i];
						if (array[i] > max) {
							max = array[i];
						}
					}
					System.out.println("최고 점수: " + max);
					
					//평균 점수 구하기
					double avg = (double) sum / array.length;
					System.out.println("평균 점수: " + avg);
					break;
					
				case 5:
					System.out.print("");
					break;
			}
			
			if (choose == 5) {
				System.out.print("프로그램 종료");
				break;
			}
		}
	}
}