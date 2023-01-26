package step1_05.controlStatement;

import java.util.Scanner;



/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 * 
 */

//23.01.17 14:10 ~ 14:14
public class IfEx04_풀이 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자의 ID와 PW를 입력해주세요: ");
		int userID = scan.nextInt();
		int userPW = scan.nextInt();
		
		if(userID == dbId && userPW ==dbPw) {
			System.out.println("정상적으로 사용자의 로그인이 완료되었습니다.");
		}
		
		else {
			System.out.println("사용자의 ID및 PW를 다시 확인해주세요.");
		}


	}

}
