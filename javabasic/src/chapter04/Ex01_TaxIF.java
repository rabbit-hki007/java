package chapter04;

import java.util.Scanner;

public class Ex01_TaxIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age, money;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		//조건에 따른 입장료 계산
		if (age <= 10) {
			money = 1000;
		} else if( age <= 20) {
			money = 2000;
		} else {
			money = 3000;
		}
		
		//출력
		System.out.println("입장료는" + money + "입니다");
	}
}
