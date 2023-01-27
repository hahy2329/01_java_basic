package step1_08.efg;

/*
 * 
 *  # 조건문 if 
 * 
 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  
 *  	조건식이 true일때 실행할 명령어;
 *  
 *  }
 * 
 * 
 * */


public class IfEx01 {

	public static void main(String[] args) {
		
		/*if(~~~한다면) {
			~~하겠다.
		}
		*/
		
		if(true) { // if문에 속한 명령어는 tab으로 들여쓰기 한다.
			System.out.println("명령어1");
			System.out.println("명령어2");
			System.out.println("명령어3");
			System.out.println("명령어4");
		}
		
		if(false) { // if문에 속한 명령어는 tab으로 들여쓰기 한다.
			System.out.println("명령어4");
			System.out.println("명령어5");
			
			
			System.out.println("명령어6");
			System.out.println("명령어7");
		}
		
		int salary = 2000000;
		//[option] if안에 속한 명령어가 1줄이면 {} 생략할 수 있다. 사용자 마음입니다..ㄹ  
		if (salary >=1000000 && salary<2000000) 
			System.out.println("세금 면제");
		
		
		if(salary >= 2000000 && salary<3000000) 
			System.out.println("세율 10%");
			
		
		
		if(salary >= 3000000 && salary<4000000) 
			System.out.println("세율 20%");
			
		
		
		

	}

}
