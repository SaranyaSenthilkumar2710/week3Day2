package week3.Day2.Assignments;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Student Id :"+id);
}
public void getStudentInfo(int id,String name) {
	System.out.println("Student Id :"+id);
	System.out.println("Student Name :"+name);
}
public void getStudentInfo(String email,long phNo) {
	System.out.println("Student Email :"+email);
	System.out.println("Student Mobile Number :"+phNo);
}
public static void main(String[] args) {
	Students stud = new Students();
	stud.getStudentInfo(10);
	stud.getStudentInfo(10, "Yazhini");
	stud.getStudentInfo("yazh.sen@gmail.com", 97908888);
	
}
}
