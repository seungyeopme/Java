package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	
	//생성자 오버로딩(overload)
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
//	public static void main(String[] args) {
//	
//		Student studentLee = new Student();
//		studentLee.studentName = "이순신";
//		studentLee.studentID = 100;
//		studentLee.address = "서울시 영등포구 여의도동";
//		
//		Student studentKim = new Student();
//		studentKim.studentName = "김유신";
//		studentKim.studentID = 101;
//		studentKim.address = "미국 산호세";
//		
//		studentLee.showStudentInfo();
//		studentKim.showStudentInfo();
//	}
	
//	public static void main(String[] args) {
//		
//		Student studentLee = new Student();
//		studentLee.studentName = "이순신";
//		studentLee.address = "서울시 서초구 서초동";
//		
//		studentLee.showStudentInfo();
//	}
}
