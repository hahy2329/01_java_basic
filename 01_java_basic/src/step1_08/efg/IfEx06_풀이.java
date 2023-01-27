package step1_08.efg;

import java.util.Scanner;


//23.01.17 14:32 ~ 14:36
/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int i = scan.nextInt();
		
		System.out.println("숫자를 입력하세요 : ");
		int j = scan.nextInt();
		
		int result = i * j;
		
		System.out.println("정답을 입력하세요: ");
		int num = scan.nextInt();
		
		if(result == num) {
			System.out.println("정답입니다.");
		}
		if(result !=num) {
			System.out.println("오류입니다.");
		}
		
		

	}

}
