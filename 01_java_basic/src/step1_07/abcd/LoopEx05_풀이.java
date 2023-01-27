package step1_07.abcd;

import java.util.Scanner;



/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */
//23.01.19 14:21 ~ 14:28

public class LoopEx05_풀이 {

	public static void main(String[] args) {
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		Scanner scan = new Scanner(System.in);
		
		int i=1;
		int userOrder = 0;
		int priceMoney=0;
		
		System.out.println("나의 총금액은 :");
		int myMoney = scan.nextInt();
		
		
		while(i<=5) {
			System.out.println("주문하실 메뉴 번호를 입력해주세요 : ");
			userOrder = scan.nextInt();
			
			if(userOrder ==1 ) {
				System.out.println("메뉴선택 1번하셨습니다.");
				priceMoney +=bulgogiBurgerPrice;
			}
			else if(userOrder ==2) {
				System.out.println("메뉴선택 2번하셨습니다.");
				priceMoney +=shrimpBurgerPrice;
			}
			else {
				System.out.println("메뉴 3번을 선택하셨습니다.");
				priceMoney +=colaPrice;
			}
			i++;
			
		}
		
		
		System.out.println("고객님의 총 지불 금액은 " + priceMoney+"입니다.");
		myMoney -= priceMoney;
		
		if(myMoney >=0) {
			
			System.out.println("=== 롯데리아 영수증 === ");
			System.out.println("1. 불고기 버거 : 2개");
			System.out.println("2. 새우    버거 : 2개");
			System.out.println("3. 콜         라 : 1개");
			System.out.println("4. 총금액: " + priceMoney);
			
			System.out.println("5. 잔돈금액 : " + myMoney);
		}
		
		else {
			System.out.println("현금이 부족합니다.");
		}
		

	}

}
