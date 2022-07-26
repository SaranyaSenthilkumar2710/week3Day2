package week3.Day2.Assignments;

public class Desktop extends Computer {
	public static void desktopSize() {
		System.out.println("Desktop size is 32 inch");
	}
public static void main(String[] args) {
	
	Computer comp = new Computer();
	
	comp.computerModel();
	desktopSize();
	
}
}
