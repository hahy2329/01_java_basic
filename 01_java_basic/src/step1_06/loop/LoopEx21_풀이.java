package step1_06.loop;

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


//23.1.25 12:38 ~ 12:44
public class LoopEx21_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		for(int i = 0; i <5; i++) {
			
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			
			int result = a*b;
			
			System.out.println(a + "*" + b + " = " + "result" );
			System.out.print("정답을 입력해주세요 : ");
			int userNum = scan.nextInt();
			
			if(result == userNum) {
				System.out.println("정답!!!");
				score += 20;
			}
			else {
				System.out.println("아쉽지만 실패!");
				
			}
			
			
			
		}
		
		System.out.println("귀하의 점수는 " + score + "점 입니다.");
		
		
		
		
		
		
		
		
	}

}
