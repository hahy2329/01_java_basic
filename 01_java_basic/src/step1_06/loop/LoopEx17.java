package step1_06.loop;

import java.util.Scanner;

/*
 *  # 보조 제어문
 * 
 * 	- 반복문 안에서만 동작한다.
 *  - 반복문 안에서 반복문의 역할을 보조한다.
 *  
 * 		break	 : 반복문을 종료한다.
 * 		continue : 반복문의 조건시점으로 점프한다.
 * 
 * */

public class LoopEx17 {

	public static void main(String[] args) {
		
		int i = 0;
		/*
		while(true) {
			
			if(i == 7) {  //if문과 같이 짝꿍입니다.
				break; 
			}
			
			System.out.println(i);
			i++;
			
		}
		*/
		System.out.println();
		
		i = 0;
		while(i < 10) {

			i++;
			
			if(i%2 ==0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//사용예제
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.println("1. 햄버거");
			System.out.println("2. 콜라");
			System.out.println("3. 감자");
			
			System.out.println("메뉴입력 : ");
			int getMenu = scan.nextInt();
			
			if(getMenu > 3 || getMenu <1) {
				System.out.println("1~3번 중에 선택하세요 : ");
				continue;
			}
			
			System.out.println("~~~");
			System.out.println("!!!");
			System.out.println("!!!");
			System.out.println("!!!!");
			System.out.println();
		}
		
		
		
	}

}
