package ch6;

public class Demo64SansyoKatahenkanA {

	public static void main(String[] args) {
		LoanableAccount la = new LoanableAccount("山田太郎", 100000, 50000);

		SavingAccount sa = la; // アップキャスト

		la = (LoanableAccount)sa; // ダウンキャスト
	}
}

class SavingAccount {
	public String name;
	public int balance;
}

class LoanableAccount extends SavingAccount {
	public int overdraftLimit;

	LoanableAccount(String name, int balance, int overdraftLimit) {
		// Dummy
	}
}