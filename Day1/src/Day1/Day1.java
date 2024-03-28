package Day1;
import java.util.Scanner;

public class Day1 {
	// static = 객체를 생성하지 않고 사용할 수 있는 메소드
	public static double MtoK (int mile) { //메소드
		return mile * 1.6;
	}
	
	public static double KtoM (int Kilo) { //메소드
		return Kilo / 1.6;
	}
	
	public static double CtoF (int C) { //메소드
		return (C*1.8) + 32;
	}
	
	public static double FtoC (int F) { //메소드
		return (F-32) / 1.8;
	}
	
	public static void main(String args[]) {
		/*
		int a = 0;
		double d = 0.5;
		float f = 0;
		boolean b = true;
		char c = 'c';
		String S = "abcd";
		
		var v = 0;
		var V = 'c';
		*/
		/*
		int a = 5;
		int b = 3;
		
		int s;
		s = sum(a,b);
		System.out.println(s);
		
		char c = 'c';
		int x = 1;
		System.out.println("문자" + c + x); //C에서는 출력 안됨
		*/
		
		// 1. 마일 -> 킬로미터 변환, 킬로미터 -> 마일 변환 (1마일 = 1.60934KM)
		// 1_1 입력: : 마일 = 30, / 1_2 입력 : 킬로미터 60
		
		// 2. 섭씨 -> 화씨 변환, 화씨 -> 섭씨 변환 (섭씨*1.8) + 32
		// 2_1 섭씨 : 30 / 화씨 : 30
		
		int Mile = 30;
		int Kilo = 60;
		int C = 30;
		
		System.out.println("M->K : " + MtoK(Mile));
		System.out.println("K->M : " + KtoM(Kilo));
		System.out.println("F->C : " + FtoC(C));
		System.out.println("C->F : " + CtoF(C));
		
				
	}
}
