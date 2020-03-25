package ch6;

public class DemoInterfaceExtends {
	public static void main(String[] args) {
		DemoInt demoInt = new DemoInt();
		System.out.println("aaa="+demoInt.aaa);
	}

}

interface iAaa {
	static int aaa =0;
}

interface iBbb extends iAaa{
	int bbb = 2;
}

interface iCcc {
//	int aaa = 1;
}

class DemoInt implements iAaa, iCcc {

}
