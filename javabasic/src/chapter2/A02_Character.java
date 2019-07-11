/*
데이터 타입
기본 자료형, 참조 자료형
기본자료형은 정수형, 문자형, 실수형, 논리형
정수형 : byte 1byte, short 2byte, int 4byte, long 8byte
문자형 : char 1byte
실수형 : float 4byte, double 4byte
논리형 : boolean
*/

package chapter2;

public class A02_Character {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		// byte의 유효숫자 범위 -2^7 ~ 2^7-1 이 표현 가능
		byte b_num1 = 127; //byte b_num1 = 128;은 안들어감
		System.out.println(b_num1);
		
		// short의 유효숫자 범위 -2^15(32768) ~ 2^15-1(32767) 이 표현 가능
		short s_num2 = -32768; //short s_num2 = -32769; 는 입력불가
		// short s_num2 = 32767;  //short s_num2 = 32767; 는 입력불가
		System.out.println(s_num2);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		// int의 유효숫자 범위 -2^31(-2147483648) ~ 2^31-1(2147483647) 이 표현 가능
		int i_num3 = -2147483648;
		System.out.println(i_num3);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// long의 유효숫자 범위 -2^63(-2147483648) ~ 2^63-1(2147483647) 이 표현 가능
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		short sval = 1;
		int ival = 1;
		//float fval = 1.0f;
		double fval = 1.0;
		
		// 서로 다른 데이터 타입의 데이터를 혼합 연산할때
		// 연산 결과는 범위가 큰 쪽으로 변환되어 처리 된다
		// System.out.println("short형과 int형의 혼합연산" + sval+ival); // 어떻게 나올까?
		System.out.println("short형과 int형의 혼합연산" + (sval+ival));
		System.out.println(ival+fval);
		
		
		/*
		 * 형변환의 두가지 
		 * 묵시적 형변환 : 정수와 실수 연산은 실수로 변환
		 * 명시적 형변환 : (int) 이런건 명시적 형변환
		 */
		char ch1 = 'A';
		System.out.println((int)ch1); // 65
		
		char ch2 = 66;
		System.out.println((char)ch2); // 대문자 B
	
		char ch3 = '가';
		char ch4 = '\u1100'; // 자모를 유니코드로 표시
		System.out.println(ch3);
		System.out.println((int)ch3);
		System.out.println(ch4);
		} // end of main()
} //end of class
