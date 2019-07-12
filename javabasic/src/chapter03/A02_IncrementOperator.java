/*
 * A02_IncrementOperator.java
 * 1. 증가연산자와 감소연산자
 * ++ 항의 값에 1을 더한다.
 * -- 항의 값에서 1을 뺀다.
 * 
 * 2. 위치에 따른 의미 차이를 분명히 알아야 한다.
 * int val = 10 일 때
 * int num = ++value 문장과  - 먼저 증가 시키고 대입  num = 11 value 11
 * int num = value++ 문장은 다른 결과를 가진다. 먼저대입시키고 증가 num은 10 value 11
 */

package chapter03;

public class A02_IncrementOperator {

	public static void main(String[] args) {
         int a = 10;
         int b = a++;
         System.out.println("a :" + a); // 11
         System.out.println("b :" + b); // 10
         
         a = 10;
         b = ++a;
         System.out.println("a :" + a); // 11
         System.out.println("b :" + b); // 11

	}

}
