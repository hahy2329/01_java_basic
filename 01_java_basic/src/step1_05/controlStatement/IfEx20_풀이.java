package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(101) + 150;
		
		int answer = num%100/10;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 숫자중 가운데 숫자를 입력해주세요 : ");
		int userNum  = scan.nextInt();
		
		
		
		if(answer == userNum) {
			System.out.println("같습니다.");
		}
		else if(num<userNum) {
			System.out.println("사용자가 입력한 숫자가 높습니다.");
		}
		else {
			System.out.println("임의의 숫자가 더 높습니다.");
		}
		
		
	}

}
