/*
 * A05_LogicalOperator.java
 * 논리연산자
 * && 논리곱 : 두 항이 모두 참일 때 참
 * || 논리합 : 두 항 중 하나가 참이면 참
 * ! 논리부정 : 단항 연산자로 참을 거짓으로, 거짓을 참으로 변경
 */

package chapter03;

public class A05_LogicalOperator {

	public static void main(String[] args) {
				
		System.out.println((10>5)&&(3>1)); //true
		System.out.println((10<5)&&(3>1)); //false
		System.out.println((10<5)||(3>1)); //true
		System.out.println((10<5)||(3<1)); //false
		System.out.println(!(10<5)); // flase를 부정(논리부정) => true
		System.out.println(!(10>5)); // true를 부정 (논리부정) => false

	}

}
