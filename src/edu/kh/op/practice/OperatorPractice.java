package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void Pr1() { 
		Scanner sc = new Scanner(System.in);
				
		System.out.print("인원 수 :");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int input2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + input2 / input1);
		
		System.out.println("남는 사탕 개수 : " + input2 % input1);
		
	}
	
	public void pr2() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		String input1 = sc.next();
		
		System.out.print("학년 :");
		String input2 = sc.next();
		
		System.out.print("반 :");
		String input3 = sc.next();
		
		System.out.print("번호 :");
		String input4 = sc.next();
		
		System.out.println("성별 : " + " 남학생");
		
		System.out.print("성적 : ");
		double input5 = sc.nextDouble();
		
		System.out.print(input2 + " 학년" + "\s" + input3 + "반" + "\s" + input4 + "번호" + "\s" + 
							"남학생의 성적은" + "\s" + input5 + "이다.");

		}
	
	public void pr3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
			int input1 = sc.nextInt();
		
		System.out.print("영어 :");	
			int input2 = sc.nextInt();
			
		System.out.print("수학 :");
			int input3 = sc.nextInt();
			
		System.out.println("합계 : " + (input2 + input1 + input3));
		System.out.println("평균 : " + (input2 + input1 + input3) / 3);
			
			
			
				
	}
}
