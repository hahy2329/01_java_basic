package step1_02.variable;

/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */
public class VariableEx01 {

	public static void main(String[] args) {
		
		//1. 정수 : Integer (int)
		int memberAge; // 변수 선언(메모리 주소라 생각하면 됨. 메모리 주소 대체)
		memberAge = 20; // 변수 초기화 (데이터 대입)
		System.out.println(memberAge);
		
		
		
		//2. 실수 : double
		
		double memberWeight = 80.14; // 변수의 선언과 데이터 대입
		System.out.println(memberWeight);
		
		
		
		
		//3. 문자 : Charater (char)  ex) 'a', 'b', '안'
		char memberGenderEng = 'm';
		System.out.println(memberGenderEng);
		
		char memberGenderKor = '남';
		System.out.println(memberGenderKor);
		
		//4. 문자열(글자) : String  
		String str = "웹개발";
		System.out.println(str);
		
		
		//5. 참과 거짓 : boolean (true : 1, false: 0)
		
		boolean isMember = true;
		System.out.println(isMember);
		
		// 변수의 특징 (고유성 <=> 유니크(unique)하다, only one)
		int goodsPric = 20000;
		// int goodsPric = 22000; 똑같은 이름의 변수 생성은 안된다.
		
		goodsPric = 22000;//자료형을 생략했으므로 기존의 변수의 값을 수정한다.
		goodsPric = 25000;
		
		System.out.println(goodsPric); // 가장 최근값 1개만 저장되어 있다. 
		
		// 변수의 초깃값(처음 집어넣는 값)
		int deliveryPrice; 
		// System.out.println(deliveryPrice); //변수의 초깃값을 지정하지 않으면 가비지(쓰레기) 데이터가 변수에 들어가 있다.
		
		int tax = 0; // 0으로 int 변수 초깃값 지정
		int addTax = 0;
		int totalPrice = 0;
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		

	}

}
