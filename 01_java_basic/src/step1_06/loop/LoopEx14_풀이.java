package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int maxNum = 0;
		int count = 0;
		while(count<3) {
			System.out.println("값을 입력하세요: ");
			int userNum = scan.nextInt();
			if(maxNum<userNum) {
				maxNum = userNum;
				
			}
			count++;
		}
		
		System.out.println("가장 큰 값은 " + maxNum);
	

	}

}

