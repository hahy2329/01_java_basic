package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int num1 = ran.nextInt(11) +1;
		int num2 = ran.nextInt(11)+1;
		
		int Answer = ran.nextInt(4)+1; 
		
		int result = 0;
		if ( Answer == 1) {
			result = num1 + num2;
		}
		else if(Answer == 2) {
			result = num1 - num2;
		}
		else if(Answer == 3) {
			result = num1 * num2;
		
		}
		else {
			result = num1 / num2;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println(num1 + " ? " + num2 + "= "+result);
		System.out.println("1) +, 2)-, 3)*, 4)/ 중 하나를 택하세요 : ");
		int  userAnswer = scan.nextInt();
		
		if(Answer == userAnswer) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답!");
		}
		scan.close();
		
		
	}

}
