package sec01.exam19;

public class StringTrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel1 ="  02";
		String tel2 ="!23   ";
		String tel3 ="    1234    ";
		
		String tel =tel1.trim() +tel2.trim() +tel3.trim();
		System.out.println(tel);
	}

}
