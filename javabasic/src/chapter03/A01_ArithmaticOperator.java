/*
 * A01_ArithmaticOperator.java
 * 1. 산술연산자 종류
 * + : 두 합을 더한다.
 * - : 앞에 있는 항에서 뒤에 있는 항을 뺀다.
 * * : 두 항을 곱한다.
 *  / : 앞에 있는 항을 뒤에 있는 항으로 나누어 몫을 구한다.
 *  % : 앞에 있는 항을 뒤에 있는 항으로 나누어 나머지를 구한다.
 *  
 *  2. 우선순위 
 *  일반 수학의 산술 연산과 같다. 
 *  즉  *, /,%   >  +, -
 */

package chapter03;

import java.util.Scanner;

public class A01_ArithmaticOperator {

	public static void main(String[] args) {
		
		String name;
		
		double kor, math, eng, total, average;
		// 스캐너 생성 
		Scanner sc = new Scanner(System.in);
		
		// 이름 입력
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		// 국어 점수
		System.out.println("국어점수를 입력하세요 : ");
		kor = sc.nextDouble();
		// 수학 점수
		System.out.println("수학점수를 입력하세요 : ");
		math = sc.nextDouble();
		//영어 점수
		System.out.println("영어점수를 입력하세요 : ");
		eng = sc.nextDouble();
		
		// 합계 와 평균
		total = kor + math + eng;
		average = total / 3;
		
		//출력
		System.out.println(name + "의 총점은" + total);
		System.out.println(name + "의 평균은" + average);
  
	}

}
