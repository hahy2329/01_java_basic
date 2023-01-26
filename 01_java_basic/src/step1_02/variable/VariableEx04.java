package step1_02.variable;

/*
 * 
 * 
 * 
 * # 변수의 생명주기(Life Cycle, Scope) 
 * 
 * 
 * 
 * 
 * 
 */


public class VariableEx04 {

	public static void main(String[] args) {
		
		int x = 12; 
		
		if(true) {
			int y = 3; // y는 if문 안에서 끝이 난다. 밖에선 출력 안됨
			System.out.println(x);
			System.out.println(y);
			// System.out.println(z);
		}
		
		if(true) {
			int z = 7; // z 또한 if문 안에서 끝이 난다. 밖에선 출력 안됨 
			System.out.println(x);
			// System.out.println(y);
			System.out.println(z);
			
		}
		
		System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);
		

	}

}
