package step1_06.loop;

import java.util.Scanner;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1; // 반복횟수
		int passCount =0; //합격자수
		int userMax = 0; // 1등 학생
		int sum =0; //전체 총점
		int avg = 0; // 전체 평균
		int maxNum = 0; // 1등 학생의 점수
		int userCount =0; // 각 학생들에게 부여지는 번호
		
		
		while(count<=10) {
			System.out.println("성적을 입력해주세요: ");
			int userScore = scan.nextInt(); // 학생 성적
			userCount++;
			
			if(userScore >=60) {
				passCount +=1;
			}
			
			if(maxNum < userScore) {
				maxNum = userScore;
				userMax = userCount;
			}
			
			sum +=userScore;
			
			
			
			
			count ++;
		}
		avg = sum / 10;
		
		System.out.println("전체 총점: " + sum+"이며, 평균: " + avg);
		System.out.println("합격자 수 :"  + passCount);
		System.out.println("1등 학생은 : " + userMax+"번째이며," + "점수는 " + maxNum+"입니다.");
		
		scan.close();
		
		
	}

}
