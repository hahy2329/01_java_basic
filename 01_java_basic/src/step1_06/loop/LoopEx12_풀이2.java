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

public class LoopEx12_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean isRun = true;
		
		int userNum1 = 0; // 사용자 1
		int userNum2 = 0; // 사용자 2
		int br = 0; // 누적 저장
		int turn = 0;
		
		while(true) {
			if(turn % 2 == 0) {
				System.out.println("주석님의 차례입니다.");
				userNum1 = scan.nextInt();
				
				int userNum1Division = userNum1 / 10 ;
				int userNum1Mod = userNum1 % 10;
				
				if(userNum1Division == 3) {
					if(userNum1Mod == 3 || userNum1Mod == 6 || userNum1Mod == 9) {
						System.out.println("짝짝");
					}
					
					else {
						System.out.println("짝");
					}
				}
				
				else if(userNum1Mod == 3 || userNum1Mod == 6 || userNum1Mod == 9) {
					System.out.println("짝");
				}
				
				else {
					System.out.println(userNum1);
				}
				turn++;
				br +=1;
				
			}
			
			else if(turn %2 == 1) {
				System.out.println("승원님의 차례입니다.");
				int user2Num = scan.nextInt();
				int user2NumDivision = user2Num / 10;
				int user2NumMod = user2Num % 10;
				
				if(user2NumDivision == 3) {
					if(user2NumMod == 3 || user2NumMod == 6 || user2NumMod == 9) {
						System.out.println("짝짝");
					}
					
					else {
						System.out.println("짝");
					}
				}
				else {
					if(user2NumMod == 3 || user2NumMod == 6 || user2NumMod == 9) {
						System.out.println("짝");
					}
					else {
						System.out.println(user2Num);
					}
					
					
					turn ++;
					br +=1;
				}
				
				
			}
			
			if(br >=50) {
				System.out.println("프로그램 종료");
				break;
				
			}
		}
		
	}

}
