public class CalcTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		int c;
		
		// 加算
		c = a + b;
		System.out.println("a + bの加算結果" + c);
		
		// 減算
		c = a - b;
		System.out.println("a - bの減算結果" + c);
		
		// 乗算
		c = a * b;
		System.out.println("a * bの乗算結果" + c);
		
		// 剰余
		c = a % b;
		System.out.println("a % bの剰余結果" + c);  // 0で割るとエラー
		
		// 除算
		c = a / b;
		System.out.println("a / bの除算結果" + c);  // 小数点以下切り捨て
		
		System.out.println("算術演算時の実証終了");
		
		c = a + b;
		System.out.println("=のテスト" + c);
		
		c += 1;
		System.out.println("+=のテスト" + c);
		
		c -= 1;
		System.out.println("-=のテスト" + c);
		
		c *= 5;
		System.out.println("*=のテスト" + c);
		
		c /= 2;
		System.out.println("/=のテスト" + c);
		
		c %= 2;
		System.out.println("%=のテスト" + c);
		
		System.out.println("代入演算子の実証終了");
		
		int d = 5;
		c = ++d;  // dの位置は変数である必要がある。dの値は6になりその値が代入される
		System.out.println("++(前置き)のテスト d=" + d + " c=" + c);
		
		c = d++;  // dの値は5のまま代入された後、dの値は6になる
		System.out.println("++(後置き)のテスト d=" + d + " c=" + c);
		
		System.out.println("インクリメント演算子の実証終了");
		
		c = --d;
		System.out.println("--(前置き)のテスト d=" + d + " c=" + c);
		
		c = d--;
		System.out.println("--(後置き)のテスト d=" + d + " c=" + c);
		
		System.out.println("デクリメント演算子の実証終了");
		
		int e = 3;
		int f = 1;
		c = e | f;  // ビット論理和
		System.out.println("e | fの論理演算の結果は、00000001 OR 00000011 = " + c);
		
		c = e & f;  // 論理積
		System.out.println("e & fの論理演算の結果は、00000001 AND 00000011 = " + c);
		
		c = e ^ f;  // ビット排他的論理和（ORと一緒だが同じ論理値は偽とする）
		System.out.println("e ^ fの論理演算の結果は、00000001 XOR 00000011 = " + c);
		
		System.out.println("論理演算子の実証終了");
		
		if(a == 10 && b == 1) {  // 両方の条件が成立で真
			System.out.println("True");
		}
		else {
			System.out.println("両方の条件が成立しませんでした");
		}
		
		if(a == 10 || b == 1) {  // どちらかの条件が成立すれば真
			System.out.println("片方の条件が成立しました");
		}
		
		boolean g = false;
		if(!g) {  // booleanのみに使える
			System.out.println("Trueの否定であるFalseでした");
		}
		
		System.out.println("短絡演算子の実証終了");
		
		boolean flg;
		
		flg = a > b;
		System.out.println("a > bは" + flg);
		
		flg = a >= b;
		System.out.println("a >= bは" + flg);
		
		flg = b > a;
		System.out.println("b > aは" + flg);
		
		flg = b >= a;
		System.out.println("b >= aは" + flg);
		
		flg = a == b;
		System.out.println("a == bは" + flg);
		
		flg = a != b;
		System.out.println("a != bは" + flg);
		
		System.out.println("比較演算子の実証終了");
		
		b = a == 10 ? 10:20;
		System.out.println("aの値は10なのでbに10を代入します。b = " + b);
		
		System.out.println("三項演算子の実証終了");
		
		int h = 4;
		int i = 4;
		int j = 5;
		int k = 128;
		h = h << 2;  // 左に2ビットシフト
		System.out.println("00000100を左に2ビットシフトした結果" + h);
		
		i = i >> 2;
		System.out.println("00000100を右に2ビットシフトした結果" + i);
		
		j = j << 2;
		System.out.println("00000101を左に2ビットシフトした結果" + j);
		
		k = k >> 2;  // 右シフトで移動後の左側は最上位ビットで埋まるが、javaでは符号ビットは左側にコピーされない
		System.out.println("10000000を右に2ビットシフトした結果" + k);
		
		System.out.println("参考サイト：https://www.sejuku.net/blog/13030");
	}
}
