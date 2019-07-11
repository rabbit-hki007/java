package chapter2;

import java.util.Scanner;

public class Ex02_RecArea {

	public static void main(String[] args) {
		int extent = 0;
		int garoLength;
		int seroLength;
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 가로와 세로 입력
		System.out.println("가로 길이를 입력하세요 : ");
		garoLength = sc.nextInt();
		
		System.out.println("세로 길이를 입력하세요 : ");
		seroLength = sc.nextInt();
		// 넓이 계산
		extent = garoLength * seroLength;
		// 결과 화면 출력
		System.out.println(extent);

	}

}
