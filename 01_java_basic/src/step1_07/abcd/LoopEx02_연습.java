package step1_07.abcd;

public class LoopEx02_연습 {

	public static void main(String[] args) {
		
		int i = 1; // i, j, k, l, n, m 
		
		while(i<=10) {

			if(i%2 == 1) {
				
				System.out.println(i);
			}
			
			i++;
			
		}
		
		System.out.println();
		
		i = 10;
		while(i >=1) {
			if(i >=3 && i<= 7 ) {
				System.out.println(i);
				
			}
			
			i--;
			
		}
		
		System.out.println();
		
		i = 1;
		int count=0;
		
		while(i<=10000) {
			if(i%7==0) {
				count++;
				
			}
			
			i++;
		}
		
		System.out.println("7의 배수의 개수 : " + count+"개 입니다."
				);
		
		
		
		
	}

}
