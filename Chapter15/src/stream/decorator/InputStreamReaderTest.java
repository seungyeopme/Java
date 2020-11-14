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
			//보조스트림 안에 또 다른 보조스트림이 들어갈 수 있다
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

//보조스트림
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

//읽어올 때 깨지는 예
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