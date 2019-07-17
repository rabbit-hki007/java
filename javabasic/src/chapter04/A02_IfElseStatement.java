<<<<<<< HEAD
/*
 * A02_IfElseStatement.java
 * if ~ else 문
 * if(조건) {
 *   조건이 참일 때 실행하는 문장;
 * } else {
 *   조건이 거짓일 때 실행하는 문장;
 * }
 * 조건과 상관없이 실애하는 문장;
 */
package chapter04;

import java.util.Scanner;

public class A02_IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (10 > 5) {
//			System.out.println("조건이 참일 때 실행하는 문장");
//		} else {
//			System.out.println("조건이 거짓일 때 실행하는 문장");
//		}
//		System.out.println("조건과 상관없이 실행하는 문장");
		
		//키보드로 부터 숫자를 입력하여 홀수 짝수를 판단하여 출력하세요
		int input, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		input = sc.nextInt();
		
		//계산처리
		result = input%2;
		// 결과 출력
		if (result == 1) {  //result에 input%2를 넣어도 된다
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		if ((input%2) == 1) {  //result에 input%2를 넣어도 된다
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
	}

}
=======
/*
 * A02_IfElseStatement.java
 * if ~ else 문
 * if(조건) {
 *   조건이 참일 때 실행하는 문장;
 * } else {
 *   조건이 거짓일 때 실행하는 문장;
 * }
 * 조건과 상관없이 실애하는 문장;
 */
package chapter04;

import java.util.Scanner;

public class A02_IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (10 > 5) {
//			System.out.println("조건이 참일 때 실행하는 문장");
//		} else {
//			System.out.println("조건이 거짓일 때 실행하는 문장");
//		}
//		System.out.println("조건과 상관없이 실행하는 문장");
		
		//키보드로 부터 숫자를 입력하여 홀수 짝수를 판단하여 출력하세요
		int input, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		input = sc.nextInt();
		
		//계산처리
		result = input%2;
		// 결과 출력
		if (result == 1) {  //result에 input%2를 넣어도 된다
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		if ((input%2) == 1) {  //result에 input%2를 넣어도 된다
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
	}

}
>>>>>>> 5297137678c9ed8b8e2670e24601715874bb7137
