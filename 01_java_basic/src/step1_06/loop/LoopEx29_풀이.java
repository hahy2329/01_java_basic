package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx29_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 한 개를 입력해주세요: ");
		int userNum = scan.nextInt();
		
		
		
		for(int i=2; i<=userNum; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count == 2) {
				System.out.println(i);
			}
			else {
				System.out.println("소수가 아닙니다.");
			}
		}
		
		System.out.println("끝");
		
		
		
		
	}
	
}
