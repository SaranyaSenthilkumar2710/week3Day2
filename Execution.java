package week3.Day2.Assignments;

public class Execution extends MultiLanguage implements Language,TestTool{

	public void selenium() {
		System.out.println("Test tool is Selenium!");
		
	}

	public void java() {
		System.out.println("Test Language is Java!");
		
	}

	@Override
	public void ruby() {
		System.out.println("Test Language is Ruby!");
		
	}
	public static void main(String[] args) {
		Execution ex = new Execution();
		ex.selenium();
		ex.java();
		ex.python();
		ex.ruby();
	}

}
