package step1_06.loop;


/*
 * # 2���� �ݺ���
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) �����ʹ������� ������� ���
 * 2) ���ʹ����� ������� ���
 * 
 * 1)2) 5�� �ݺ�
 * 
 */
public class LoopEx30_풀이 {

	public static void main(String[] args) {
		
		int start = 1; // ��������
		int end = 5; //��������
		
		
		
		/*
		 * * 1 2 3 4 5
		 * 10 9 8 7 6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
		
		for(int i =0; i<5; i++) {
			if(i%2==0) {
				for(int j = start; j<=end; j++) {
					System.out.print(j + " ");
				}
			}
			
			else{
				for(int j=end; j>=start; j--) {
					System.out.print(j+ " ");
				}
			}
			
			System.out.println();
			start = end+1;
			end = end+5;
			
			
		}
			
			
	}
		

	

}
