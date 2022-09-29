package Abstract;

abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance(){
		System.out.println("$100");
	}
}
class BankB extends Bank{
	void getBalance(){
		System.out.println("$150");
	}
}
class BankC extends Bank{
	void getBalance(){
		System.out.println("$200");
	}
}
public class Assignment01 {

	public static void main(String[] args) {
		BankA banka=new BankA();
		banka.getBalance();
		BankB bankb=new BankB();
		bankb.getBalance();
		BankC bankc=new BankC();
		bankc.getBalance();

	}

}
