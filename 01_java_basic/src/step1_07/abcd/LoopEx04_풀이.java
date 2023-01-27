package step1_07.abcd;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */
//23.01.19 14:13 ~ 14:20


public class LoopEx04_풀이 {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int i = 1;
		int answer = 0;
		int result = 0;
		int answerCount=0;
		int score;
	
		
		while(i<=5) {
			
			int x = ran.nextInt(7)+2;
			int y = ran.nextInt(7)+2;
			result = x * y;
			
			System.out.println("정답을 입력해보세요: ");
			answer = scan.nextInt();
			
			if(result == answer ) {
				answerCount++;
				System.out.println("정답!");
			}
			i++;
			
			
		}
		score = answerCount *20;
		
		System.out.println("당신의 점수는 "+ answerCount+"점 입니다.");
		System.out.println("게임을 종료합니다. ");
		
		
	

	}

}
