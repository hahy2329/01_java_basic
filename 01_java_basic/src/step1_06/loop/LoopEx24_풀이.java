package step1_06.loop;

import java.util.Random;

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

//23.01.25 13:30 ~ 13:45
public class LoopEx24_풀이 {

	public static void main(String[] args) {
		
		
		
		
		int total = 0; // 총점 
		double avg = 0.0; // 평균 
		int maxStudentScore = 0; // 제일 높은 학생 점수 
		int passStudent = 0; // 합격자 수 
		int studentNum = 0; // 제일 높은 학생 번호
		
		Random ran = new Random();
		
		
		for(int i =1; i<11;i++) {
			
			int studentScore = ran.nextInt(100)+1;
			total += studentScore;
			
			if(studentScore >=60) {
				passStudent++;
				System.out.println("합격!");
				
			}
			else {
				System.out.println("불합격!");
			}
			
			if(maxStudentScore<studentScore) {
				maxStudentScore = studentScore;
				studentNum=i;
			}
			
			
			
		}
		
		avg = total/10;
		
		System.out.println("총점 = " + total + "점");
		System.out.println("평균 = " + avg + "점");
		System.out.println("합격생 수 = " + passStudent + "명");
		System.out.println("1등학생 = " + maxStudentScore + "[" + studentNum + "번]");
		
		
		
		
		
		
		
		

	}

}
