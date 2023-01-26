package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


//23.01.18 12:45 ~ 12:49
public class IfEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이용자의 키를 입력하세요: ");
		double tall = scan.nextInt();
		
		if (tall >=120) {
			System.out.println("놀이기구 입장 가능합니다.");
		}
		if(tall <120) {
			System.out.println("부모님과 함께 오셨나요 : (1:yes, 2:no)");
			int answer = scan.nextInt();
			if(answer == 1 ) {
				System.out.println("동반 입장 가능합니다.");
				
			}
			else {
				System.out.println("입장이 불가합니다.");
			}
		}
		scan.close();
		
		
		
		
		
	
	}

}
