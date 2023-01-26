package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

//23.01.18 01:44

public class IfEx14_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자의 0~1까지의 임의의 숫자를 입력해주세요: ");
		int random = scan.nextInt();
		
		
		
		if(coin ==1 && random == 1) {
			System.out.println("동전의 앞면");
		}
		else if(coin == 0 && random == 0) {
			System.out.println("동전의 뒷면");
		}
		
		else {
			System.out.println("서로 짝이 맞지 않습니다.");
		}
		
		scan.close();




	}

}
