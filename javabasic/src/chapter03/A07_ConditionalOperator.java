/*
 * A07_ConditionalOperator
 * 조건연산자 (3항 연산자라고 함)
 * 조건식?결과1:결과2;  조건식이 참이면 결과1 조건식이 거짓이면 결과2가 선택됨. 
 */

package chapter03;

import java.util.Scanner;

public class A07_ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int result; result = (10<5)? 100:999; //조건이 참이면 앞의 값을 거짓이면 뒤의 값을
		 * System.out.println(result); //999
		 */
		// 부, 모 의 나이를 입력받아 나이 많으신 분이 누구인지 출력하세요
		int fatherAge, motherAge;
		String result;  //older elder 장로, 연장자
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("아빠 나이를 입력하세요");
		fatherAge = sc.nextInt();
		
		System.out.println("엄마 나이를 입력하세요");
		motherAge =sc.nextInt();
		
		// 3항 연산자로 처리
		result = (fatherAge > motherAge)? "아빠":"엄마";
		
		// 출력
		System.out.println(result + "가 더 많아요");
		
	}

}
