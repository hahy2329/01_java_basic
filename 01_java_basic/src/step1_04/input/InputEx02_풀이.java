package step1_04.input;

import java.util.Scanner;

//23.01.17 01:15 ~ 01:20
public class InputEx02_풀이 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.");
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		int total = a+b;
		
		System.out.println("숫자 2개의 합은 : " + total + "입니다.");
		System.out.println();
		
		
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.println("숫자 1개를 입력하세요 :");
		int num = scan.nextInt();
		System.out.println(num%2==1);
		System.out.println();
		
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적을 입력하세요 : ");
		int score = scan.nextInt();
		System.out.println(score>=60 && score <= 100);
		
	}
	
}
