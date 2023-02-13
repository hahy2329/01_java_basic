package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03연습 {

	public static void main(String[] args) {
		
		
		/*
		 * #이스케이프 문자(escape sequence)
		 * 
		 * 1) \n : 줄바꿈
		 * 2) \t : tab
		 * 3) \" : 문자 자체 " (문법x)
		 * 
		 * */
		
		System.out.println("안녕\n하세요.");
		System.out.println("안녕\t하세요.");
		System.out.println("C:\\program files\\java");
		System.out.println("\n================\n");
		
		
		/*
		 * 서식 문자 출력
		 * 
		 * 1)%d :정수
		 * 2)%f : 실수
		 * 3) %c : 단일 문자
		 * 4) %s : 문자열 
		 * 5) %.1f: 소수점 1자리 까지 출력(둘째 자리에서 반올림)
		 * 6) %.2f: 소수점 2자리 까지 출력(셋째 자리에서 반올림)
		 * 5) %.3f: 소수점 3자리 까지 출력(넷째 자리에서 반올림)
		 * 
		 * 
		 * 
		 * 
		 * */
		int a = 10;
		double b = 3.14455;
		System.out.printf("%d\n",13);
		System.out.printf("%f\n", 3.1415192);
		System.out.printf("%d\n",a);
		System.out.printf("%f\n",b);
		System.out.printf("%.1f\n",b);
		System.out.printf("%.2f\n",b);
		System.out.printf("%.3f\n",b);
		System.out.printf("%c\n", '#');
		System.out.printf("이름: %s, 나이: %d, 키: %.1f", "홍길동",29,175.5);
		System.out.println();
		
		/*
		 * 
		 *  # 시간 (Timestamp)
		 *  
		 *  1) new Date()
		 *  
		 *   - 현재시간 정보를  생성한다.
		 *   
		 *  	java.util.Date > 날짜 + 시간
		 *  	java.sql.Date  > 날짜
		 *  
		 *  
		 */
		Date time1 = new Date(); // 현재 날짜 및 시간을 찍어줌 
		System.out.println(time1);//Mon Feb 13 20:50:28 KST 2023
		
		/*
		 *  2) System.currentTimeMillis()
		 *   
		 * 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 *   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long으로 저장한다.
		 *   
		 */
		long time2 = System.currentTimeMillis();
		System.out.println(time2);//1676289146209
		System.out.println();
		
		/*
		 *   
		 *  # 시간 출력 형식 SimpleDateFormat
		 *   
		 *   - 날짜 및 시간 출력 서식 지정 방법은 SimpleDateFormat 객체를 사용하여 구현한다.
		 *  - SimpleDateFormat 변수명 = new SimpleDateFormat("날짜 및 시간 서식"); 형태로 객체를 생성한다.
		 *   - sdf.format(date); 메서드를 사용하여 날짜 표현식을 지정한다.
		 *   - 상세 서식은 구글에서 "simpledateformat 형식"을 검색하여 사용한다.
		 *   - 중요)날짜타입 데이터에서 글자타입으로 데이터의 형이 변환된다.
		 *   
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String data1 = sdf1.format(time1);
		String data2 = sdf1.format(time2);
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		
		String data3 = sdf2.format(time1);
		String data4 = sdf2.format(time2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println();
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String data5 = sdf3.format(time1);
		String data6 = sdf3.format(time2);
		System.out.println(data5);
		System.out.println(data6);
		System.out.println();
		
		
		/*
		 * # 숫자 형식
		 * 
		 * 1) DecimalFormat df = new DecimalFormat("숫자 서식");
		 *  - 숫자 서식은  "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여주어 표현한다.
		 *  - .format(숫자데이터); 메서드를 사용하여 숫자 출력형식을 지정한다.
		 *  - 상세 서식은 구글에서 "DecimalFormat 형식"을 검색하여 사용한다.
		 *  - 중요)숫자 타입에서 글자타입으로 데이터의 형이 변환된다.
		 *  
		 * */
		
		int salary = 10000;
		int salary1 = 100000;
		int salary2 = 1000000;
		
		DecimalFormat df =new DecimalFormat("#,##0");
		String number1 =df.format(salary);
		System.out.println("number1 : " + number1);//number1 : 10,000
		System.out.println("number2 : " + df.format(salary1));//number2 : 100,000
		System.out.println("number3 : " + df.format(salary2)); //number3 : 1,000,000
		
		
		
		
		
		
		
		
	}

}
