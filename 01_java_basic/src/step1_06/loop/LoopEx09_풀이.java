package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

//23.01.20 13:20 ~ 13: 31

public class LoopEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {     // * 1. 입금,  * . 입금할 금액을 입력받아, myMoney에 입금
				
				System.out.println("입금할 금액을 입력하세요 : ");
				int money = scan.nextInt();
				
				myMoney += money;
				System.out.println("입금이 정상적으로 완료되었습니다.");
				
			}
			else if (selectMenu == 2) {   ///2. 출금, * . 출금할 금액을 입력받아, myMoney에서 출금, 
				System.out.println("출금할 금액을 입력해주세요: "); // 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
				int withdrawal = scan.nextInt();					  
				
				if(withdrawal > myMoney) {
					System.out.println("출금 불가!");
				}
				else {
					myMoney -= withdrawal;
					System.out.println("정상적으로 출금이 완료되었습니다." +
					"현재 잔액은" + myMoney +"원 만큼 남아 있습니다.");
				}
				
				
				
			}
			else if (selectMenu == 3) {  // 3. 이체, * . yourAcc 계좌번호를 입력받아, 이체,  
				 	System.out.println("계좌번호를 입력해주세요.");	// * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
				 	int userPW = scan.nextInt(); //이체 후 yourMoney 잔액 증가
				 	
				 	if(yourAcc == userPW) {
				 		System.out.println("이체할 금액을 입력해주세요: ");
				 		int money = scan.nextInt();
				 		
				 		if(money <= myMoney) {
				 		myMoney -= money;
				 		yourMoney +=money;
				 		System.out.println("정상적으로 이체가 완료되었고, " +
				 		"현재 잔액은" + myMoney + "원 남아있고, "+ "이체한 계좌에는 " + yourMoney +"만큼 남아있습니다.");
				 		}
				 	}
				 	
				 	else {
				 		System.out.println("계좌번호를 다시 입력해주세요.");
				 	}
				
				
			}
			else if (selectMenu == 4) {  // 4. 조회, * . myMoney와 yourMoney 잔액 모두 출력
				
				System.out.println("현재 잔액 조회 결과 " + "내 계좌에는 " + myMoney+"원 만큼 남아있고, " + 
				"상대 계좌에는 " + yourMoney + "원 만큼 남아있습니다.");
				
				
				
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
