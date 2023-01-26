package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */
//23.01.19 11:50 ~ 12:00
public class IfEx19_풀이 {

	public static void main(String[] args) {
		
		int myMoney = 8700; // 내가 현재 가지고 있는 돈 
		
		int yourAcc = 4321;
		int yourMoney = 12000; // 현재 계좌에 들어있는 돈 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계좌번호를 입력하세요 : ");
		int bankAccountNumber = scan.nextInt();
		
		if(yourAcc == bankAccountNumber) {
			System.out.println("이체할 금액을 적어주세요 : ");
			int transMoney = scan.nextInt();
			if (myMoney > transMoney){
				myMoney -= transMoney;
				yourMoney +=transMoney;
				System.out.println("정상적으로 계좌이체가 되었으며, 계좌에 남은 돈은 " + yourMoney+"이고, 현재 시중에 있는 돈은 " + myMoney +"입니다.");
			}
			
			else {
				System.out.println("시중에 있는 금액을 초과하였습니다.");
			}
		
		
		}
		
		else {
			System.out.println("계좌번호가 동일하지 않습니다.");
		}
		
		scan.close();
		
		
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
	}

}
