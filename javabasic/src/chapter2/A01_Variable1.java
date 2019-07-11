package chapter2;

public class A01_Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int level;  // 정수형 변수 level 선언
        level = 10; //level 변수에 값 10을 대입
        System.out.println(level); //level 출력
        
        // 변수명의 규칙
        // 영문자(대소문자) 숫자로 구성하며 문자로 시작
        // 특수문자는 _ 와 $만 사용 가능
        // 예약어는 사용할 수 없다
        // 변수명의 두 단어는 카멜 방식(낙타등 방식)으로 한다 (첫 단어는 소문자로 시작)
                
        //문자 변수 선언과 값의 대입
        char chval = 'A'; //문자 변수는 작은 따옴표로 감싼다
        System.out.println(chval);
                
	}  //end of main()
} //end of class
