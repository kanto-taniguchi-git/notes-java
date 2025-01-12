package lab.typeconversion.test;

public class TypeConversion {
	public static void main (String[] args) {
		long a = 10L;  // 本来の正しい代入
		long b = 10;   // 自動変換
		System.out.println("左辺と右辺のデータ型は統一する必要がある。\nだが、左辺 > 右辺のメモリサイズの場合自動変換が起こる。"
				+ "\nこれらは整数型と小数点型に対応。");
		// エラー：int c = 10L→右辺 > 左辺
		
		int d = 10;
		long e = 10L;
		long f = d + e;
		System.out.println("整数同士の算術演算は大きいデータ型に統一される。" + f);
	
		// エラー：int f = d + e;
		
		double g = 2.5;
		int h = 2;
		double i = g + h;
		System.out.println("double+整数型はdouble型に統一される。" + i);
		
		// エラー：int i = g + h;
		
		long j = 10L;
		double k = 20;
		double l = j + k;
		System.out.println("long型+double型 = double型" + l);
		
		float m = 10F;
		int n = 10;
		float o = m + n;
		System.out.println("float型 + int型 = float型" + o);
		
		float mm = 10F;
		long nn = 10L;
		float oo = mm + nn;
		System.out.println("小数 > 整数" + oo);
		// エラー：long oo = mm + nn;
		
		int p = 10;
		long q = 10L;
		int r = p + (int)q;
		System.out.println("キャスト：long型(10L)→int型" + r);
		// int型の範囲にlong型が納まっている必要がある
		
		double pp = 10.0;
		int rr = (int)pp;
		System.out.println("double型(10.0)→int型=" + rr);
		
		String aa = "10";
		int bb = Integer.parseInt(aa);
		System.out.println("String(10)からint=" + bb);
		
		char cc = '1';
		// エラー：int dd = Integer.parseInt(cc);
		int ddd = cc;
		System.out.println("char型からint型ではchar型のUnicodeコードポイントの値に変換=" + ddd);
		// char型は16ビットの符号なし、int型は符号付きの32ビットなのでint型はchar型の値域を包括している
		
		/*
		 UnicodeとUTF-8の違い：Unicodeが「何」を表すか（すなわち、各文字にどの番号を割り当てるかUTF-8が「どのように」表す
		 か（その番号をどのようにバイトに変換するか）を決定します。
		*/
		
		int dd = 50;
		String ee = String.valueOf(dd);
		System.out.println("int(50)からString=" + ee);
		
		// プリミティブ型からラッパークラス
		int num = 5;
		Integer integerObject = num;
		System.out.println("これは、オートボクシングといいます" + integerObject);
		
		// ラッパークラスからプリミティブ型
		Integer rapnum = 10;
		int num2 = rapnum;
		System.out.println("これは、アンボクシングといいます" + num2);
		
		// 明示的にすると
		int num3 = 5;
		Integer num4 = Integer.valueOf(num3);
		
		Integer num5 = 10;
		int num6 = num5.intValue();
	}
}
