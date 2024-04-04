import java.util.Scanner;

/*
1. 이름 응시번호 6자리, 시험 성적 순서대로 입력
	-> 이름: String
	-> 응시번호(ID): String 으로 받은 뒤 , Integer.valueIf(ID,charAt(ID.length()-1);
		-> 문자열로 이루어진 응시번호를 입력받은 뒤, 해당 값의 제일 마지막 String을 가져와 Int형태로 변환해주는 코드
	->  시험 성적:  
	
2. 응시번호 홀수 = 가 형, 응시번호 짝수 = 나 형
	-> %연산자 사용해서 2로 나눈 뒤에, 0이면 짝수, 아니면 홀수
2_1. 가형(컴퓨터구조, DB, 소프트웨어공학) / 나형(한국어, 영어, 세법)
	-> if문 + && 연산자 사용해서 조건 여러개

3. 시험유형별 점수 출력

4. 평균 점수 출력 + 80점이하 실격
	-> Avg 메소드 따로 구현
	-> PF 메소드 구현하면 편함
*/

public class day2 {
	public static void Even_Subject(String Name, String ID) {	
		Scanner scanner = new Scanner(System.in);
		
		int kor; 
		int eng;
		int low;
		
		int Total = 0;
		
		System.out.print("나형 응시자 입니다. 한국어 성적을 입력하세요 : ");
		kor = scanner.nextInt();
		Total += kor;
		
		System.out.print("영어 성적을 입력하세요 : ");
		eng = scanner.nextInt();
		Total += eng;
		
		System.out.print("세법 성적을 입력하세요 : ");
		low = scanner.nextInt();
		Total += low;
		
		int Avg =  Total / 3;
		
		System.out.println("한국어:" + kor + " 영어:" + eng + " 세법:"+ low + " 입니다");
		
		if (Avg <= 80) {
			System.out.println("평균 점수는 " + Avg + "점으로 실격입니다.");
		}
		else {
			System.out.println("평균 점수는 " + Avg + "점으로 합격입니다.");
		}
	}
	
	public static void Odd_Subject(String Name, String ID) {
		Scanner scanner = new Scanner(System.in);
		
		int CS; 
		int DB;
		int SE;
		int Total = 0;
		
		System.out.print("가형 응시자 입니다. 컴퓨터 구조 성적을 입력하세요 : ");
		CS = scanner.nextInt();
		Total += CS;
		
		System.out.print("데이터 베이스 성적을 입력하세요 : ");
		DB = scanner.nextInt();
		Total += DB;
		
		System.out.print("소프트웨어공학 성적을 입력하세요 : ");
		SE = scanner.nextInt();
		Total += SE;
		
		int Avg =  Total / 3;
		
		System.out.println("컴퓨터 구조:" + CS + " 데이터베이스:" + DB + " 소프트웨어 공학:"+ SE + " 입니다");
		
		if (Avg <= 80) {
			System.out.println("평균 점수는 " + Avg + "점으로 실격입니다.");
		}
		else {
			System.out.println("평균 점수는 " + Avg + "점으로 합격입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Name;
		String ID;
		
		System.out.println("이름, 응시번호, 성적을 차례로 입력하세요. ");
		System.out.print("이름 : ");
		Name = scanner.next();
		System.out.print("응시번호 : ");
		ID = scanner.next();
		
		int ID_num = Integer.valueOf(ID.charAt(ID.length()-1));
		
		if(ID_num % 2 != 0) {
			Odd_Subject(Name, ID);
		}
		else if (ID_num % 2 == 0) {
			Even_Subject(Name, ID);
		}	
		
		
		/*
		System.out.println("이름, 응시번호 6자리, 시험성적을 순서대로 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 :");
		String name = scanner.next();
		
		System.out.print("응시번호 6자리 :");
		String num = scanner.next();
		
		if (num.length() == 6){
			System.out.println("한국어 :");
			int kor = scanner.nextInt();
			
			System.out.println("컴퓨터구조 :");
			int cs = scanner.nextInt();
			
			System.out.println("데이터 베이스 :");
			int db = scanner.nextInt();
			
			System.out.println("소프트웨어 공학 :");
			int sof = scanner.nextInt();
			
			System.out.println(name + "님의 응시번호는 " + num + "이며" + " 한국어:" + kor + " 컴퓨터 구조:" + cs + " 데이터베이스:" + db + " 소프트웨어 공학:"+ sof + " 입니다");
		}
		
		else{
			System.out.println("다시 입력해주세요");
		}
		*/
		
	}

}
