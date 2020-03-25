package ch6;

public class Demo64SansyoKatahenkanB {

	public static void main(String[] args) {
		// ↓↓↓ アップキャスト 子どもから親へ キャスト
		Kodomo kodomo = new Kodomo();
		kodomo.a = 111;
		kodomo.b = 222;
		Oya oya = kodomo;
		System.out.println(oya.a);
		// System.out.println(oya.b);
		kodomo = (Kodomo)oya;

		System.out.println(kodomo.a);
		System.out.println(kodomo.b);
		// ↑↑↑ アップキャスト 子どもから親へ キャスト

		// ↓↓↓ ダウンキャスト 親から子どもへ キャスト
		Oya oya2 = new Oya();
		oya2.a = 333;

		Kodomo kodomo2 = new Kodomo();
		kodomo2 = (Kodomo)oya2;
		System.out.println(kodomo2.a);
		System.out.println(kodomo2.b);
		// ↑↑↑ ダウンキャスト 親から子どもへ キャスト
	}
}

class Oya {
	int a;
}

class Kodomo extends Oya {
	int b;
}