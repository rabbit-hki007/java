/*
 * A08_BitOperator
 * 비트 논리 연산자 : &, |, ^, ~
 * 비트 이동 연산자(시프트연산자) : <<, >>, >>>  
 
 System.out.printf("%X",number); // A로 출력 16진수로 10을 표시
 
		 * %[-][0][m][.n] 
		 *                d : 10진수 
		 *                c : 문자
		 *                s : 문자열
		 *                f : 실수
		 *                b : boolean
		 *                o : 8진수
		 *                x : 16진수
		 *                e : 지수형
		 *               [-] : 왼쪽정렬 빈칸은 공백으로 채워서 출력
		 *               [0] : 오른쪽정렬 빈칸 0으로 채워서 출력
		 *               [m] : 전체 자리수
		 *               [.n] : 소수점 이하 자리수
		 */  

package chapter03;

public class A08_BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int number = 5; //0b는 이진수,  
		int number = 0b101;
//		System.out.println(number); // 5
//		
//		number = 012; //0는 8진수,  0x는 16진수
//      System.out.println(number); // 10
//        
//      number = 0xA; //0x는 16진수
//      System.out.println(number); // 10 (1.2.3.4.5.6.7.8.9.A.B.C.D.E.F)
		number = 10; //0x는 16진수
        System.out.printf("%x",number); // a로 출력 16진수로 10을 표시
        System.out.printf("\n");
        System.out.printf("%X",number); // A로 출력 16진수로 10을 표시
        System.out.printf("\n");
        /*
         *  * %[-][0][m][.n] 
		 *                d : 10진수 
		 *                c : 문자
		 *                s : 문자열
		 *                f : 실수
		 *                b : boolean
		 *                o : 8진수
		 *                x : 16진수
		 *                e : 지수형
		 *               [-] : 왼쪽정렬 빈칸은 공백으로 채워서 출력
		 *               [0] : 오른쪽정렬 빈칸 0으로 채워서 출력
		 *               [m] : 전체 자리수
		 *               [.n] : 소수점 이하 자리수
		 */  
        double number1 = 10.123;
        System.out.printf("%5.2f",number1); // 10.12
        System.out.printf("\n");
        System.out.printf("%010.2f",number1); // 0000010.12
		System.out.printf("\n");
		
		byte num1 = 0b00000101;
		byte num2 = 0b00001010;
		
		int result = num1 & num2;
		System.out.println(result); // 0
		
		result = num1 | num2;
		System.out.println(result); // 15
		
		result = num1 ^ num2; // 익스클루시브 오아 햇트 연산자 같은 0이면 0으로 다른 0과 1이면 1로 바뀜
		System.out.println(result); // 15
		
		result = ~num1; //틸드 연산자 : 반전연산  0은 1로 1은 0으로
		System.out.println(result); //- 6
		
		result = 0;
		int num3 = 10;
		result = num3 << 2;
		System.out.println(result); //40
		
		/*
		 * 단항 연산자가 가장 높고 이항, 삼항 연산자 순서입니다
		 * 대입 연산자의 우선 순위가 가장 낮습니다
		 * 산술, 관계, 논리, 대입 연산자 순서로 우선순위를 가진며 ()의 우선순위가 제일 높다
		 */
			 
	}

}
