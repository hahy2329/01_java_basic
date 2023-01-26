package step1_02.variable;


//23.01.16 12:38 ~ 12:48(마친 시간)
public class VariableEx03_풀이 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		
		int money = 2000000;
		double tax = 0.033;
		double result = money *tax;
		System.out.println("프리랜서의 세금은 " + result +"원 입니다.");
		
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		
		int total = 100 + 88 + 92;
		int avg = total/3;
		System.out.println("세 과목의 평균은 " + avg +"입니다.");
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		
		int length = 3;
		int height = 7;
		int area = (length * height) /2;
		
		System.out.println("삼각형의 밑변은 " + length + "이며, 높이는 " + height +"이고, 넓이는 " + area +
				"입니다.");
		//문제4) 100초를 1분 40초로 출력
		int times = 100;
		int minutes = 60;
		
		System.out.println("100초를 1분 40초로 나타내면 " + times/minutes + "분 " + times%minutes+"초 입니다.");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		
		//       100원의 개수 = 3개 
		
		int a = 800;
		int b = 500; 
		int c = 100;
		
		System.out.println(a+"원에서 " +b+ "원짜리 개수는 " + a/b+"개 이며, "+ c+"원은 "+a%b+"개 입니다.");

	}

}
