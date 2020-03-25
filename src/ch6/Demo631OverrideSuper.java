package ch6;

public class Demo631OverrideSuper {
    public static void main(String[] args) {
        System.out.println("Demo override");
        LoanableAccount62b la = new LoanableAccount62b();
        la.withdraw(100);
    }
}

class SavingAccount63b {
    int withdraw(int amount) {
        System.out.println("#DO11:SavingAccount63b.withdraw(" + amount + ")");
        return 1;
    }

    void someMethod() {
        System.out.println("#DO18: Some method");
    }
}

class LoanableAccount62b extends SavingAccount63b {
    //    double withdraw(int amount) { ← 戻り地を親に合わせないとIDEでエラー、コンパイルでエラー
    int withdraw(int amount) {
        System.out.println("#DO27:LoanableAccount62b.withdraw(" + amount + ")");
        super.withdraw(123);
        super.someMethod();
        return 2;
    }
}
