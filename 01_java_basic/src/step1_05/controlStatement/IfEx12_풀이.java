package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

//23.01.18 01:08 ~ 01:14

public class IfEx12_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력해주세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(b<a && c<a) {
			System.out.printf("가장 큰 수 :%d 입니다.",a);
		}
		
		if(a<b && c<b) {
			System.out.printf("가장 큰 수 : %d 입니다.", b);
		}
		
		if(a<c && b<c) {
			System.out.printf("가장 큰 수 : %d 입니다.", c);
		}
		
		scan.close();
		
		
		}

}
