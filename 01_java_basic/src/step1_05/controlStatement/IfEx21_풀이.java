package step1_05.controlStatement;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(50)+1;
		System.out.println("문제 : " + num);
		
		int location1 = num /10; 
		int location2 = num %10;
		int location = 0;
		
		if(location1 == 3 || location1 ==6 || location1 == 9) {
			location++;
		}
		if(location2 == 3 || location2 == 6 || location2 ==9) {
			location++;
		}
		
		if(location ==2) {
			System.out.println("짝짝");
		}
		else if(location == 1) {
			System.out.println("짝");
		}
		
		else {
			System.out.println(num);
		}
		
		
	
		
		
		
		
	}

}
