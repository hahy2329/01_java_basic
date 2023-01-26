package step1_06.loop;


import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */
//23.01.25 13:45 ~ 13:55
public class LoopEx25_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maxUserscore = 0; // 가장 큰 값 
		int userCount = 0;
		
		
		for(int i = 1; i<=3; i++) {
			System.out.println("정수를 입력하세요: ");
			int userNum = scan.nextInt();
			
			if(maxUserscore < userNum) {
				maxUserscore = userNum;
				userCount = i;
				
			}
			
			
			
		}
		System.out.println("이로써 가장 큰 값은 사용자는 " + userCount + "번째 사람이고 "  + " 점수는 " + maxUserscore + "점 입니다.");
		
		
		
	}

}
