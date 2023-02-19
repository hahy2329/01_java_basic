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



public class LoopEx21_풀이2 {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int count = 0; 
		
		
		int i = 0;
		
		while(i<5) {
			
			int r = ran.nextInt(9)+1;
			int n = ran.nextInt(9) + 1;
			int result = r*n;
			
			
			System.out.println("정답: " 
			+ r +" * "+  n + "?" );
			
			System.out.println("정답은 ? ");
			int userNum = scan.nextInt();
			
			if(result == userNum) {
				System.out.println("정답!");
				count ++;
			}
			else {
				System.out.println("아쉽게도 실패...!");
				
			}
			
			i++;
			
			
		}
		
		System.out.println("사용자가 맞춘 성적은 : "
				+ count *20+"점 입니다.");
		
		
		
		
	}

}
