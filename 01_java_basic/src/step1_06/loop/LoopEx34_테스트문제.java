package step1_06.loop;

import java.util.Iterator;

/*
 * 
 *  # 삼각형 출력하기 (for문)
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/


public class LoopEx34_테스트문제 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9 ; i++) {
			for (int j = 0; j <= 9 ; j++) {
				System.out.print(" ");
				
				if(j == 5) {
					for (int j2 = 0; j2 < i; j2++) {
						
						System.out.print(i);
						System.out.print(" ");
						
					}
				}
			}
			System.out.println();
			
			
		}

	}
}

