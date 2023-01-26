package step1_06.loop;



//23.01.26 12:33 ~ 13:00
// # 삼각형 그리기

public class LoopEx28_풀이 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		

		System.out.println();
		System.out.println("1번 문제");
		
		for(int i = 0; i<3; i++) { // 줄 수 
			for(int j =0; j<3; j++) { // #개수
				if(i == 0) { // 1번째 줄
					if(j ==0) {
						System.out.print("#");
					}
					else if(j==1 || j==2) {
						System.out.print(" ");
						
					}
					
				}
				
				
				if(i==1) { //2번째 줄
					if(j==0 || j ==1) {
						System.out.print("#");
					}
					else if(j==2) {
						System.out.print(" ");
						
					}
					
				}
				
				if(i==2) { //3번째 줄
					System.out.print("#");
				}
				
				
			}
			System.out.println();
		}  
		
		
		System.out.println();
		System.out.println("2번 문제");
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for(int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(i==0) { // 첫 번째 줄
					if(j==0 || j ==1) {
						System.out.print(" ");
					}
					else if(j == 2) {
						System.out.print("#");
					}
				}
				
				if(i==1) {// 2번째 줄
					if(j==0) {
						System.out.print(" ");
					}
					else if(j==1 || j==2) {
						System.out.print("#");
					}
				}
				
				if(i==2) {
					System.out.print("#");
				}
				
				
				
			}
			System.out.println();
		}
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		
		System.out.println();
		System.out.println("3번 문제");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i==0) { // 1번째 줄 
					System.out.print("#");
					
				}
				
				if(i==1) { // 2번째 줄 
					if(j==0 || j ==1) {
						System.out.print("#");
					}
					else if(j==2) {
						System.out.print(" ");
					}
					
				}
				
				if(i==2) { //3번째 줄
					if(j==0) {
						System.out.print("#");
					}
					else if(j==1 || j==2) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		
		
		System.out.println();
		System.out.println("4번 문제");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i==0) { // 1번째 줄 
					System.out.print("#");
					
				}
				
				if(i==1) { // 2번째 줄 
					if(j==0) {
						System.out.print(" ");
					}
					else if(j==1 || j==2) {
						System.out.print("#");
					}
					
				}
				
				if(i==2) { //3번째 줄
					if(j==0 || j==1) {
						System.out.print(" ");
					}
					else if(j==2) {
						System.out.print("#");
					}
				}
			}
			System.out.println();
		}
		

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		
		System.out.println();
		System.out.println("5번 문제");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i==0) { // 1번째 줄
					if(j==0) {
						System.out.print("@");
						
					}
					else if(j==1 || j==2) {
						System.out.print("#");
					}
					
					
				}
				
				if(i==1) { // 2번째 줄 
					if(j==0 || j==1) {
						System.out.print("@");
					}
					else if(j==2) {
						System.out.print("#");
					}
					
				}
				
				if(i==2) { //3번째 줄
					 
					System.out.print("@");
					
					
				}
			}
			System.out.println();
		}

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		
		System.out.println();
		System.out.println("6번 문제");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				if(i==0) { // 1번째 줄
					if(j==0 || j==1||j==3 ||j ==4) {
						System.out.print(" ");
						
					}
					else if(j==2) {
						System.out.print("#");
					}
					
					
				}
				
				if(i==1) { // 2번째 줄 
					if(j==0 || j==4) {
						System.out.print(" ");
					}
					else  {
						System.out.print("#");
					}
					
				}
				
				if(i==2) { //3번째 줄
					 
					System.out.print("#");
					
					
				}
			}
			System.out.println();
		}
		
		
		

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		
		

		System.out.println();
		System.out.println("7번 문제");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				if(i==0) { // 1번째 줄
					System.out.print("#");
					
					
				}
				
				if(i==1) { // 2번째 줄 
					if(j==0 || j==4) {
						System.out.print(" ");
					}
					else  {
						System.out.print("#");
					}
					
				}
				
				if(i==2) { //3번째 줄
					 if(j==2) {
						 System.out.print("#");
					 }
					 else {
						 System.out.print(" ");
					 }
					
				}
			}
			System.out.println();
		}

		
		
	}
}
