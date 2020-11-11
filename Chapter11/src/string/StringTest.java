package string;

public class StringTest {

	public static void main(String[] args) {
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1 == str2); //false
//		
//		String str3 = "abc";
//		String str4 = "abc";
//		System.out.println(str3 == str4); //true
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str2);
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}