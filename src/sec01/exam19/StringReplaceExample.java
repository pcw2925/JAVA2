package sec01.exam19;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr ="자바는 객체지향 언어입니다. Check this out 나는 정상수.";
		String newStr = oldStr.replace("자바","java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
