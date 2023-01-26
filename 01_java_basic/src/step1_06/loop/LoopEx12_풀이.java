package step1_06.loop;

import java.util.Scanner;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_풀이 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		boolean isRun = true;
		
		int userNum = 0;  // 사용자1
		int userNum2 = 0; // 사용자2
		int br = 0; // 누적저장
		int turn = 0; // 각자 턴 기회 
		
		while(isRun) {
			
			if(turn % 2 == 0) {
				System.out.println("주석님의 차례입니다. ");
				userNum = scan.nextInt();
				
				int userNumDivision = userNum /10;
				int userNumMod = userNum%10;
				if(userNumDivision ==3) {
					if(userNumMod == 3 || userNumMod == 6 || userNumMod == 9 ) {
						System.out.println("짝짝");
					}
					else {
						System.out.println("짝");
					}
				}
				
				else if(userNumMod ==3 || userNumMod == 6 || userNumMod == 9) {
					System.out.println("짝");
				}
				else {
					System.out.println(userNum);
				}
				br +=1;
			}
			else {
				System.out.println("승원님의 차례입니다. ");
				userNum2 = scan.nextInt();
				
				int userNum2Division = userNum2 /10;
				int userNum2Mod = userNum2%10;
				if(userNum2Division ==3) {
					if(userNum2Mod == 3 || userNum2Mod == 6 || userNum2Mod == 9 ) {
						System.out.println("짝짝");
					}
					else {
						System.out.println("짝");
					}
				}
				
				else if(userNum2Mod ==3 || userNum2Mod == 6 || userNum2Mod == 9) {
					System.out.println("짝");
				}
				else {
					System.out.println(userNum2);
				}
				
				
				
				br +=1;
			}
			
			turn++;
			System.out.println("현재 게임 중 누적된 횟수 " + br);
			
			if(br>=50) {
				isRun = false;
				System.out.println("게임종료");
			}
		}
		
		
	}

}
