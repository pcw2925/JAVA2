package sec01.exam19;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열의 문자수 얻기
		String ssn ="9808271641421";
		int length =ssn.length();
		if(length ==13)
		{ 
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}
	}

}
