package sec01.exam19;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr ="�ڹٴ� ��ü���� ����Դϴ�. Check this out ���� �����.";
		String newStr = oldStr.replace("�ڹ�","java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
