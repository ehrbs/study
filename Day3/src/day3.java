import java.util.Scanner;

public class day3 {
	
	public static double add(int a, int b) {
		return a+b;
	}
	public static double sub(int a, int b) {
		return a-b;
	}
	public static double mul(int a, int b) {
		return a*b;
	}
	public static double div(int a, int b) {
		return a/b;
	}
	public static double rem(int a, int b) {
		return a%b;
	}
	
	public static void Menu(int a, int b, String operator) {
		double result = 0;
		
		switch(operator) {
		case "+":
			result = add(a,b);
			break;
		case "-":
			result = sub(a,b);
			break;
		case "*":
			result = mul(a,b);
			break;
		case "/":
			result = div(a,b);
			break;
		case "%":
			result = rem(a,b);
			break;
		default:
			System.out.println("연산자를 다시 입력해주세요.");
			break;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = -1;
		
		while(input != 0) { //0이 아닐때, 즉, 0이면 종료.
			System.out.println("계산기 프로그램에 오신 것을 환영합니다! 종료하려면 0번, 계산기는 1번"); //시작을 알리는 출력문
			System.out.println("0. 종료");
			System.out.println("1. 계산");
			
			input = scanner.nextInt();
			
			switch(input) {
			case 0:
				System.out.println("종료합니다.");
				break;
			case 1:
				System.out.println("Enter mathmatical expression: ");
				int a = scanner.nextInt();
				String operator = scanner.next();
				int b = scanner.nextInt();
				Menu(a, b, operator);
				break;
			}
		}

	}

}
