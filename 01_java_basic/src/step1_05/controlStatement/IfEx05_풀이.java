package step1_05.controlStatement;

import java.util.Scanner;


//23.01.17 14: 28 ~ 14:32
/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_풀이 {

	public static void main(String[] args) {
		
		int dbId = 0;
		int dbPw = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가입할 ID를 입력해주세요 : ");
		dbId = scan.nextInt();
		
		System.out.println("가입할 PW를 입력해주세요 : ");
		dbPw = scan.nextInt();
		
		System.out.println("가입이 성공적으로 이루어졌습니다.");
		
		System.out.println("가입한 ID를 입력해주세요 : ");
		int userID = scan.nextInt();
		
		System.out.println("가입한 PW를 입력해주세요 : ");
		int userPW = scan.nextInt();
		
		if(userID == dbId && userPW == dbPw) {
			System.out.println("로그인 성공!");
		}
		
		if(userID != dbId || userPW != dbPw) {
			System.out.println("로그인 실패!");
		}
		

		
		
		
	}

}
