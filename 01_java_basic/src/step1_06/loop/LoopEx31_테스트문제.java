package step1_06.loop;


/*
 
 	(for문)
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx31_테스트문제 {

	public static void main(String[] args) {
		
	/*
	 * 	문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	 *  답 : 63
	 * */	
		for(int i =9; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(i*j >60 && i*j<=69) {
					System.out.println(i + "*" + j + "=" + i*j);
				}
			}
			
		}
		
		System.out.println();
		
		
		
		
	/*
	 * 	
	 *  문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	 *  답 149
	 * 
	 * 
	 * */
		
		boolean isRun = true;
		int maxNum = 0;
		
		while(isRun) {
			for(int i=1; i<150; i++) {
				if(i%8 ==5) {
					if(maxNum<i) {
						maxNum = i;
					}
				}
				else {
					continue;
				}
				
				
			}
			if(maxNum<150) {
				System.out.println(maxNum);
				isRun = false;
			}
			
		}
		
		System.out.println();
		
		
		/*
		 *  # 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
		 *  # 답 6 (54,63,72,81,90,99) 
		 * 
		 * */
		
		
		int count =0;
		
		for(int i = 50; i<=100; i++) {
			if(i % 9==0) {
				count++;
			}
			
			else {
				continue;
			}
		}
		
		System.out.println("9의 배수는 " + count+"개 입니다.");
		System.out.println();
		
		
		/*
		 *  # 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	     *  # 답 980
	     *  */
		
		
		int maxNum1 = 0;
		boolean isRun1 = true;
		
		while(isRun1) {
			for(int i = 100; i<1000; i++) {
				if(i%28 ==0) {
					if(maxNum1<i) {
						maxNum = i;
						
						
					}
				}
				
				else {
					continue;
				}
					
			}
			if(maxNum <1000) {
				System.out.println(maxNum);
				isRun1 = false;
			}
			
		}
		
		System.out.println();
		
		
		
		/*
		 * # 문제5) 8의 배수를 작은수부터 5개 출력
		 *  # 답 : 0,8,16,24,32 
		 * */
		
		int count1 = 0;
		boolean isRun2 = true;
		int Num =0;
		
		
		for(int i = 0; i<100; i++) {
			if(i%8==0) {
				count1++;
				System.out.println(i);
				if(count1 ==5) {
					break;
				}
			}
				
		}		
			
			
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
