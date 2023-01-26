package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

//23.01.19 17:30 ~ 17:43
public class LoopEx07_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int minus = 5; // 5점 감점
		int score =100; // 현재 내 점수
		int comNumber = ran.nextInt(100) +1;
		
		
		boolean correct = true;
		
		while(correct) {
			System.out.println("1~100까지 중 하나를 입력해주세요 : ");
			int userNumber = scan.nextInt(); 
			
			if(userNumber == comNumber) {
				System.out.println("정답입니다.");
				correct = false;
			}
			else if(userNumber >comNumber) {
				System.out.println("다운!");
				score -=minus;
			}
			else {
				System.out.println("업!");
				score -=minus;
			}
			
			
			
		}
		scan.close();
		System.out.println("최종 점수는 " + score +"점 입니다.");
		
		
		
	}

}
