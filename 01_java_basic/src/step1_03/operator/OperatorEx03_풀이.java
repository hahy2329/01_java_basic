package step1_03.operator;



//23.01.16 12:23 ~ 12:30(마친 시간)
public class OperatorEx03_풀이 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(10000 - 2800);
		System.out.println("잔돈 = " + (10000 - 2800) + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		System.out.println(2000000*0.033);
		System.out.println("세금 :" + (2000000*0.033)+"원 입니다.");
		
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		System.out.println("세 과목의 평균은 " + (100+88+92)/3 +"입니다.");
		
		
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		System.out.println("삼각형의 넓이는 " + (3+7)/2 + "입니다.");
		
		
		//문제4) 100초를 1분 40초로 출력
		
		System.out.println("100초를 1분 40초로 출력 시 " + (100/60)+"분" + (100%60)+"초 입니다.");
		
		
		//문제5) 800원에서 500원짜리 개수와 100원짜리 개수 출력
		//정답5) 500원 = 1개 
		//		100원 = 3개 
		
		System.out.println("800원에서 500원 짜리 개수는 "+(800/500) +"개 이며, 100원 짜리는 " 
				+ (800%500)+"개 입니다.");
		

	}

}
