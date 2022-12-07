package edu.kh.op.ex;

//예제 코드 작성용 클래스
public class OpExample {
	
	public void ex1() {
		// 기능 메소드 : 객체지향 프로그래밍에서
		//객체와 관련된 서브루틴 or 함수
		// void : return 값이 없는 메소드에 작성한다
			System.out.println("OpExample 클래스에 ex1() 기능 수행");
	}
		 
			// 하나의 메소드 안에는 하나의 기능만 정의한다
			public void ex2() {
				int iNum1 = 10;
				int iNum2 = 10;
				
				iNum1++;
				iNum2--;
				
				System.out.println("iNum1:" + iNum1); //10
				System.out.println("iNum2:" + iNum2); //10
	}

			
	public void ex3() {
		//전위연산 : ++3, --2 연산자가 앞쪽에 배치-> 다른연산보다 먼저 계산
		int temp1 = 5;
		System.out.println(++temp1 + 5);
			// (6 + 5) == 11
		
		//후위연산 : 10++, 5-- 연산자가 뒤쪽에 배치 -> 다른 연산자보다 나중에 계산
		int temp2 = 3;
		System.out.println(temp2-- + 2); //5
		              // 1. 3+2 =5
		              // 2. temp2 -> 2 (1감소)
		// 연산에서는 5이지만 temp2는 2이다 이 계산은 후위에 하게된다.
		
	}
	
	public void ex4() {
		
		//비교연산자 : 비교할떄 쓰이며 결과값은 논리값(true, false)이다
		//비교 연산자 : >,<,>=,<=,==,!=
		//등호(=)가 포함된 연산자에서 등호는 항상 오른쪽에 있어야한다.
		
		// =는 대입 연산자 ==가 같다는 연산자이다
		
		int a = 10;
		int b = 20;
		
		System.out.println( a > b ); // f
		System.out.println( a < b ); // t
		System.out.println( a != b);// t
		System.out.println( (a == b) == false); // t // false == false는 true다
			// 괄호 안에 있는것을 먼저 연산
		
		int c = 4;
		int d = 5;
		System.out.println( c + 1 <= d ); // t
		 	//산술연산이 비교연산보다 우선순위가 높기때문
		
		int temp = 723;
		
		System.out.println("temp는 짝수인가?" + (temp % 2 == 0)); //나누어서 0이 아니면 홀수다
		
	}
	
	public void ex5 () {
		//논리 연산자 : ||(or) &&(and)
		// :&& 둘다 true면 true
		
		int a = 101;
		// a는 100이상이면서 짝수인가?
		
		System.out.println( a >= 100); // t
		System.out.println( a % 2 == 0); //f
		//합치면
		System.out.println(( a >= 100) && ( a % 2 == 0)); // f
		
		
		// || :둘중 하나만 true여도 true
		int c = 10;
		// c는 10을 초과했거나 짝수인가?
		System.out.println(( c > 10) || ( c % 2 ==0));// t
		// 홀수인지를 알려면 ==1을 쓰거나 !==0를 쓸것
	}
	
	public void ex6 () {
		//논리 부정 연산자
		//논리값을 반대로 바꾸는 연산자
		
		boolean bool1 = true;
		System.out.println(!bool1); //f
		
	}
	
	public void ex7 () {
		//복합대입 연산자 : +=, -=, *=, /=, %=
		// 피연산자가 자신과 연산후 결과를 다시 자신에게 대입
		
		int a = 10;
		
		a++; // 11
		
		a += 4; // 15{(10+1)+4}
		System.out.println("a += 4 :" + a);
		
		a -= 10; // 
		System.out.println("a -= 10 :" + a);
		
		a *= 3;
		System.out.println("a *= 3 :" + a);
		
		a /= 6;
		System.out.println("a /= 6 :" + a);
		
		a %= 2;
		System.out.println("a &= 2 :" + a);
		
		
	}
	
	public void ex8 () {
		//삼항 연산자
		//조건식 식1 : 식2 --> 조건식 결과가 true면 식1 false면 식2
		int Num = 30;
		String str1 = "Num은 30보다 크다";
		String str2 = "Num은 30 이하다";
		
	
	
	}
}
