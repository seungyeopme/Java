package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("���ĺ� �������� ���� ���͸� ��������");
		int i = 0;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//package stream.inputstream;
//
//import java.io.IOException;
//
//public class SystemInTest {
//
//	public static void main(String[] args) {
//
//		System.out.println("���ĺ� �ϳ��� ���� ���͸� ��������");
//		int i = 0;
//		try {
//			i = System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println((char)i);
////		System.out.println(i);
//	}
//
//}