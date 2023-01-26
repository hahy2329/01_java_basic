package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

//23.01.18 14:00 ~ 14:04

public class IfEx16_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		Random ran = new Random();
		int random = ran.nextInt(101);
		
		if (choice ==1) {
			if(random %2 ==1) {
				System.out.println("홀수입니다.");
			}
			else {
				System.out.println("해당 숫자는 짝수이므로 홀수에 해당하지 않습니다.");
			}
			
		}
		
		if(choice == 2) {
			if(random %2 == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("해당 숫자는 홀수이므로 짝수에 해당하지 않습니다.");
			}
		}
		
		System.out.println("게임을 종료합니다.");
		scan.close();
		

	}

}
