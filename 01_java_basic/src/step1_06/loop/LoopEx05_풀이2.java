package step1_06.loop;

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


public class LoopEx05_풀이2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		int total = 0;
		int change = 0;
		int bulCount = 0;
		int shrimpCount = 0;
		int colaCount = 0;
		
		while(true) {
			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
			System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
			System.out.println("3.콜         라 : " + colaPrice + "원");
			System.out.println("4.영수증 출력");
			System.out.println("5. 프로그램 종료 ");
			System.out.println();
			
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("불고기 버거를 선택하셨습니다. 가격은 "+ bulgogiBurgerPrice+"원 입니다.");
				System.out.println();
				total += bulgogiBurgerPrice;
				bulCount++;
				
			}
			
			else if(menu == 2) {
				System.out.println("새우 버거를 선택하셨습니다. 가격은 " + shrimpBurgerPrice +"원 입니다.");
				System.out.println();
				total += shrimpBurgerPrice;
				shrimpCount++;
				
			}
			
			else if(menu == 3) {
				System.out.println("콜라를 선택하셨습니다. 가격은 " + colaPrice +"원 입니다.");
				System.out.println();
				total += colaPrice;
				colaCount++;
				
			}
			/*
			 * * === 롯데리아 영수증 ===
			 * 1. 불고기 버거 : 2개
			 * 2. 새우    버거 : 2개
			 * 3. 콜         라 : 1개
			 * 4. 총   금   액 : 31300원
			 * 5. 잔         돈 : 700원
			 */
			
			
			else if(menu == 4) {
				System.out.println("결제를 도와드리겠습니다.");
				System.out.println();
				System.out.println("소지하고 계신 금액을 입력해주세요.");
				int money = scan.nextInt();
				change = money - total;
				if(money >= total) {
					System.out.println(" === 롯데리아 영수증 ===");
					System.out.println("1. 불고기 버거 : " + bulCount+"개");
					System.out.println("2. 새우 버거 : " + shrimpCount+"개");
					System.out.println("3. 콜라 : " + colaCount+"개");
					System.out.println("4. 총 금액 : " + total+"원");
					System.out.println("5. 잔돈 : " + change+"원" );
					System.out.println();
				}
				
				
			}
			
			
			
			else if(menu == 5) {
				System.out.println("키오스크를 종료하겠습니다.");
				break;
			}
		
		}
		
		
	}

}
