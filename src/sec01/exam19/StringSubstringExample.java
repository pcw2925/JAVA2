package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		//문자열 추출하기 
		// TODO Auto-generated method stub
		String ssn ="980827-1641421";
		
		String firstNum =ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum =ssn.substring(7);
		System.out.println(secondNum);
	}

}
