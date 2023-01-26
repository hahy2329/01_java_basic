package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_풀이 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		Random ran = new Random();
		System.out.println("가위(0), 바위(1), 보(2) 랜덤 숫자를 지정하겠습니다.");
		com = ran.nextInt(3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)중 하나를 입력해주세요: ");
		me = scan.nextInt();
		
		if(com == me) {
			System.out.println("서로 비겼습니다.");
			
			
		}
		else if(com == 0 && me ==1) {
			System.out.println("사용자가 이겼습니다.");
		}
		
		else if(com == 1 && me == 2) {
			System.out.println("사용자가 이겼습니다.");
		}
		
		else if(com == 2 && me == 0) {
			System.out.println("사용자가 이겼습니다.");
		}
		else {
			System.out.println("졌습니다.");
		}
		
		
		
		
		
	}

}
