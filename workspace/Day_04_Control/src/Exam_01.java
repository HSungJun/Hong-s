// for문 (초기 조건 증감문을 한번에 선언 가능) / 가장 보편적인 반복문 
// while 문의 경우 중첩시 오류발생 가능, for문은 중첩시 오류 발생이 적음

//for (초기문; 조건문; 증감문;) {실행문}

//break문 반복문이 실행되고 있는 시점에서 가장 근접한 반복문 탈츨
//자신이 속한 딱 하나의 반복문을 특정 상황에서 나가고 싶을 때 사용
//



public class Exam_01 {
	public static void main(String[] args) {

		int i;
		// 변수를 선언한 이후 for문 시작, 또는 초기화문 안에 변수선언과 동시에 초기화
		// 10에서 1씩 증가하는 숫자를 출력하기 위해서는  int a =10; 을 선언 후
		//for문의 지역변수 내 a++; 을 삽입하면 출력 가능
	here:	for(/*int i = 1; 로 초기화문을 변경해도 무관*/i=1; i<=10; i++) { 
			// 초기화, 조건문, 증감문 - 조건문에서 false 도출시 for문 탈출
			System.out.println(i);
			if(i==5) {	
			break here; //break here등의 이름의 특정 위치로 이동 가능
			//label
			}
		} //실행순서 - 초기화 조건문 실행문 증감문, > 조건문 실행문 증감문... 순서로 진행됨
	}
}
 