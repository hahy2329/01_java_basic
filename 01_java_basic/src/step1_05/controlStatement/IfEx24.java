package step1_05.controlStatement;
/*
 * 
 * # switch ~ case문
 * 
 *  [형식]
 *  
 *  switch(변수) {
 *  
 *  case 값:
 *     명령어;
 *     break;
 *  case 값:
 *     명령어;
 *     break;
 *  case 값:
 *     명령어;
 *     break;
 *  default:
 *     명령어;
 *  
 *  }
 *  
 *  - if문과 다르게 범위 형태로 직접적으로 분기하지 않고 값을 기준으로 분기한다.
 *  - switch 기준변수에는 정수, 문자, 문자열 자료형을 사용할 수 있다.
 *  - 해당 case의 아래 case까지 모두 수행한다.
 *    이것을 원치 않을 경우 의도적으로 break 명령어를 작성한다.
 *  - default는 위의 케이스들 중 해당되는 곳이 없을때 분기되는 곳이다.
 *  
 * */

public class IfEx24 {

	public static void main(String[] args) {
		
		int selectMenu = 1;
		
		
		
		
		switch(selectMenu) {  //조건식에 예를들어 100보다 크다, 100보다 크면서 200보다 작다 등 이런걸 못쓰고 하나의 값(1,2,3,50등등)만 들어갈 수 있다.  
								// switch문의 괄호안의 int, char,String 이렇게 세가지 자료형만 들어올 수 있다.
		case 1: 
			System.out.println("1번 메뉴를 선택하셨습니다.");
			break;
		case 2: 
			System.out.println("2번 메뉴를 선택하셨습니다.");
			break;
		case 3: 
			System.out.println("3번 메뉴를 선택하셨습니다.");
			break;
		default: //else문에 해당(조건식에서 정 없으면~)
			System.out.println("1~3번 메뉴를 선택하세요.");
			break; //default문의 break는 써도 되고 안써도 된다.
			
		}
		
		
		//switch문의 괄호안에 숫자가 있을때 case문에서 해당되는 숫자부분에 들어가게되고 그 밑에 case문도 쫙 들리게 된다. -> 그래서 break문을 붙여줘야 안들리고 딱 떨어짐
		
		
		
	}

}
