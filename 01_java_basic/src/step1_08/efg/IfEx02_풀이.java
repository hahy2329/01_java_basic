package step1_08.efg;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. Scanner로 숫자를 입력받아 me 변수에 저장한다음 아래와 같은 기능을 구현한다.
 * 1) me가 com보다 작으면  Up! 출력 
 * 2) me와 com이 같으면 Bingo! 출력
 * 3) me가 com보다 크면 Down! 출력
 */

//23.01.17 14:00 ~ 14:04

public class IfEx02_풀이 {

	public static void main(String[] args) {
	
		int com = 8;	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int me = scan.nextInt();
		
		if(me<com) {
			System.out.println("Up!");
		}
		else if(me == com) {
			System.out.println("Bingo!!");
		}
		else {
			System.out.println("Down!");
		}
		
	}

}
