package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

// 23.01.25 12:44 ~ 12:50
public class LoopEx22_풀이 {

	public static void main(String[] args) {
		
		int score = 100;
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int ex = ran.nextInt(100) + 1;
		
		for(int i = 0; i<5; i++) {
			System.out.print("정답을 입력해보세요옹 :");
			int userNum = scan.nextInt();
			
			if(ex == userNum) {
				System.out.println("정답!!!!");
			}
			else if (ex < userNum) {
				System.out.println("아쉽지만 입력한 수가 높습니다. Down~~~!!");
				score -=5;
			}
			
			else {
				System.out.println("아쉽지만 입력한 수가 낮습니다. Up~~~!!");
				score -=5;
			}
			
		}
		
		System.out.println("귀하의 최종점수는 " + score +"점 입니다.");
		
		
		
	}

}
