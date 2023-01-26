package step1_05.controlStatement;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */

//23.01.18 13:47 ~ 13:53


public class IfEx15_풀이 {

	public static void main(String[] args) {
	
		
		Random random = new Random();
		double num = random.nextDouble();
		
		if(num <=0.3) {
			System.out.println("당첨");
			
		}
		if(num >0.3) {
			System.out.println("꽝!!");
		}
		
	}

}
