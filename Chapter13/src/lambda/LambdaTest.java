package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("test"); //test
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("hello"); 
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2"); //test2
	}

	public static PrintString returnPrint() {
		return s->System.out.println(s + " world"); //hello world
	}
}
