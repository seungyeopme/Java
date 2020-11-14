package stream.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try(InputStreamReader irs = new InputStreamReader(System.in)) {
			
			int i = 0;
			while( (i=irs.read()) !=- 1 ) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();
		try {
			//������Ʈ�� �ȿ� �� �ٸ� ������Ʈ���� �� �� �ִ�
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}

//package stream.decorator;
//
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.Socket;
//
//public class InputStreamReaderTest {
//
//	public static void main(String[] args) {
//
//		try(InputStreamReader irs = new InputStreamReader(System.in)) {
//			
//			int i = 0;
//			while( (i=irs.read()) !=- 1 ) {
//				System.out.print((char)i);
//			}
//		}catch(IOException e) {
//			System.out.println(e);
//		}
//		Socket socket = new Socket();
//		try {
//			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	
//	}
//}

//������Ʈ��
//package stream.decorator;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class InputStreamReaderTest {
//
//	public static void main(String[] args) {
//
//		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))) {
//			
//			int i = 0;
//			while( (i=irs.read()) !=- 1 ) {
//				System.out.print((char)i);
//			}
//		}catch(IOException e) {
//			System.out.println(e);
//		}
//	}
//}

//�о�� �� ������ ��
//package stream.decorator;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class InputStreamReaderTest {
//
//	public static void main(String[] args) {
//
//		try(FileInputStream fis = new FileInputStream("reader.txt")) {
//			
//			int i = 0;
//			while( (i=fis.read()) !=- 1 ) {
//				System.out.print((char)i);
//			}
//		}catch(IOException e) {
//			System.out.println(e);
//		}
//	}
//}