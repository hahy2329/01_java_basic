package step1_03.operator;

/*
 * 
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장			+=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장  	%=
 *  6) 변수의 값에 1을 더한 후 저장	        	++
 *  7) 변수의 값에 1을 뺀 후 저장	        	--
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int orderCnt = 10; 
		
		
		
		orderCnt += 20; // orderCnt = orderCnt + 20 같은 말 입니다.
		System.out.println(orderCnt);
		
		int employeeCnt = 50;
		
		employeeCnt -=5; //employeeCnt = employeeCnt - 5 ;같은 말 입니다.
		System.out.println(employeeCnt);
		
		int balance = 30000;
		balance *=10; //balance = balance * 10;
		
		System.out.println();
		
		//[참고] 변수++, ++변수 or 변수--, --변수의 차이 : 명령어 실행 순서의 차이
		int x = 0; 
		x++; // 순서의 영향이 없음
		System.out.println(x);
		
		++x;//순서의 영향이 없음
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(y++); //sout 명령어를 실행 후 y를 증가
		System.out.println(y);
		System.out.println();
		
		
		int z = 0;
		System.out.println(++z); // z를 증가후 sout 명령어를 실행
		System.out.println(z);
		
		
		
		
		
		
		
	}

}




