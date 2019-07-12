/*
 * A06_ComplexAssignmentOperator
 * 복합 대입연산자
 * += : 두 항의 값을 더해서 왼쪽 항에 대입  A = A + B => A +=B
 * -= : 두 항의 값을 빼서 왼쪽 항에 대입  A = A - B => A -=B
 * *= : 두 항의 값을 곱해서 왼쪽 항에 대입
 * /= : 두 항의 값을 나눠서 왼쪽 항에 대입
 * %= : 왼쪽항을 오른쪽으로 나누어 나머지를 왼쪽에 대입
 * <<= : 비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입
 * >>= : 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입
 * >>>= : 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입 (왼쪽에 채워지는 값은 0이다)
 * &= : 두항의 & 비트 연산후 그 값을 왼쪽항에 대입
 * |= : 두항의 | 비트 연산후 그 값을 왼쪽항에 대입
 * ^= : 두항의 ^ 비트 연산후 그 값을 왼쪽항에 대입
 */

package chapter03;

public class A06_ComplexAssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10, num2=20;
		num1 += 5;
		num2 -= 5;
		System.out.println(num1); // 15
		System.out.println(num2); // 15

	}

}
