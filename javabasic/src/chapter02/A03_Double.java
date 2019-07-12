
/*
 * 실수형 데이터 타입
   float : 4byte (부호비트1, 지수부8, 가수부 23)
   double : 8byte (부호비트1, 지수부11, 가수부 52)
*/
package chapter02;

public class A03_Double {
	public static void main(String[] args) {
		
		//자바에서는 기본 실수형은 double형으로 인식
		double dnum = 3.14;
		
		//실수를 float로 취급하려면 숫자뒤에 f를 붙인다
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);		
		
		//실수를 부동소수점으로 표현하면 생기는 문제
		double dval = 1;
		
		for (int i = 0; i < 10000; i++) {
			dval = dval + 0.1;
		}
		System.out.println(dval);
	}
}
