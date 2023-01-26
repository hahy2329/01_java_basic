package step1_05.controlStatement;


import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 직접 값을 지정하는 것이 아닌 계산식으로 요금 계산
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx22_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정거장 수를 입력하세요 : ");
		int busStop = scan.nextInt();
		int money;
		int add=50;
		
		if(busStop>=1 && busStop <= 5) {
			money = 500;
			System.out.println("고객님의 이용금액은 " + money+"원 입니다.");
		}
		else if(busStop >= 6 && busStop <= 10) {
			money = 600;
			System.out.println("고객님의 이용금액은 " + money+"원 입니다.");
		}
		else if(busStop >= 11 && busStop <= 12) {
			money = 600;
			money+=add;
			System.out.println("고객님의 이용금액은 " + money+"원 입니다.");
		}
		else if(busStop >= 13 && busStop <= 14) {
			money = 650;
			money+=add;
			System.out.println("고객님의 이용금액은 " + money+"원 입니다.");
		}
		else {
			money = 700;
			money += add;
			System.out.println("고객님의 이용금액은 " + money+"원 입니다.");
			
		}
		
	}

}
