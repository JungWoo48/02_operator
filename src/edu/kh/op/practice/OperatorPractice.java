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
		
		System.out.print("학년(정수만) :");
		int input2 = sc.nextInt();
		
		System.out.print("반(정수만) :");
		int input3 = sc.nextInt();
		
		System.out.print("번호(정수만) :");
		int input4 = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : " );
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘쨰 자리까지) : ");
		double input5 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",
				input2, input3, input4, input1, gender, input5);//%.2f는 소수점 둘째자리까지 표현한다는 뜻

		}
	
	public void pr3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
			int input1 = sc.nextInt();
		
		System.out.print("영어 :");	
			int input2 = sc.nextInt();
			
		System.out.print("수학 :");
			int input3 = sc.nextInt();
			
			int sum = input1 + input2 + input3;
			double avg = sum / 3;
			
			
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", avg);
			
			

		
		boolean result = (input1 >= 40) && (input2 >= 40) && (input3 >= 40) && (avg >= 60);
		
		System.out.println(result ? "합격" : "불합격");
		//모든 과목의 점수가 40점이 넘고 평균이 60이 넘어야만 합격인 구문
		
		
		
	}
}
