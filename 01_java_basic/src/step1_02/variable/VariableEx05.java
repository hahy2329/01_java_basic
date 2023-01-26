package step1_02.variable;



/*
 * 
 *  # 상수 ( constant ) 
 * 
 *  - 값이 변하지 않는 데이터
 *  - final 키워드를 사용하여 만든다.
 * 	- 변경되면 안되는 데이터의 보호를 위해 사용한다.
 *  - 특정데이터를 의미있는 문자로 사용하여 인식하기 쉽게 한다. 
 * 
 * 
 * */

public class VariableEx05 {

	public static void main(String[] args) {
		
		//변수
		int orderOty = 100;
		orderOty =110; //변경 가능
		System.out.println(orderOty);
		
		
		
		//상수 (자료형 앞에 final을 붙여준다)
		// 전부다 대문자로 표기
		final String FILE_REPOSITORY_PATH = "C:\\file_repo";   //(REPOSITORY(리포지토리) : 저장소)
		final int CHARACTER = 1; 
		final int BALL = 9;
		final int GOAL = 7;
		
		
		
		// FILE_REPOSITORY_PATH = "D:\\"; //변경 불가능
		//CHARACTER = 3;
		//BALL = 2;
		//GOAL = 7;
		
		System.out.println(FILE_REPOSITORY_PATH);
		System.out.println(CHARACTER);
		System.out.println(BALL);
		System.out.println(GOAL);
		
		
		
	}

}
