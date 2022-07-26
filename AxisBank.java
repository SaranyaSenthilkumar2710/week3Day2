package week3.Day2.Assignments;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit 10% in Axis bank");
	}
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		ab.fixed();
		ab.saving();
		ab.deposit();
	}
}
