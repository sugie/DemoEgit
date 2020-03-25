package ch6;

public class Demo63Override {

	public static void main(String[] args) {
		LoanableAccount3 la3 = new LoanableAccount3();
		la3.withdraw(100);
	}
}

class SavingAccount3 {
	int withdraw(int amount) {
		System.out.println("#SV12: SavingAccount3 withdraw");
		return 1;
	}
}

class LoanableAccount3 extends SavingAccount3 {
	@Override
	int withdraw(int amount) { // ← アノテーションでチェックしてスーパークラスに該当メソッドがないのでエラーとなる
		// super.withdraw(amount);
		System.out.println("LoanableAccount3 withdraw");
		return 2;
	}
}

