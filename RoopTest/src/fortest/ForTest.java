package fortest;

import java.util.Arrays;

public class ForTest {

	public static void main(String[] args) {
		// 基本的なfor文
		for(int i = 0; i < 10; i++) {  // 後置インクリメント（基本）
			System.out.println(i);
		}
		
		System.out.println("1回目のループ終了");  
		
		// 前置インクリメント
		for(int j = 0; j < 10; ++j) {  // j < 10は継続条件
			System.out.println(j);
		}
		
		System.out.println("後置、前置関係ない。しかし後置が普及している");
		
		// 拡張for文（配列やコレクションを繰り返すのに便利）
		String[] fruits = {"apple", "banana"};
		String[] testLabels = new String[3];
		
		
		for(String fruit : fruits) {  // このfor文の中でfruits配列に対する変更はしてはいけない
			testLabels[0] = "あああ";
			System.out.println(fruit);
		}
		System.out.println(Arrays.toString(testLabels));
		
		// ※配列のループは基本的なfor文でもできる
		for(int k = 0; k < fruits.length; k++) {
			System.out.println(k + 1 + "番目のフルーツは" + fruits[k] + "です");
		}
		
		// 無限ループ
		int roopNum = 0;
		for(;;) {
			roopNum ++;
			if(roopNum == 10) {
				System.out.println("終了");
				break;  // ループ終了
			}
			System.out.println(roopNum);
		}
		
		// 九九
		for (int l = 1; l < 10; l++) {
			String placeBox = "";
			for (int m = 1; m < 10; m++) {
				placeBox = placeBox + l * m + " ";  // Integer.toString(int)が暗黙的に実行
			}
			System.out.println(placeBox);
		}
		
		//****** ラベル*******
		System.out.println("ラベルのテスト（重要！）");
		end:for(int t1 = 0; t1 < 10; t1++) {
			System.out.println(t1 + "回目のループ---------------------------");
			for(int t2 = 0; t2 < 10; t2++) {
				System.out.println("2つ目のfor文の" + t2 + "回目のループ");
				if(t2 == 5) {
					System.out.println("The End!!");
					break end; // 内側だけではなく外側のfor文も終了させることができる
				}
			}
		}
		con:for(int t3 = 0; t3 < 10; t3++) {
			System.out.println(t3 + "回目のループ--------------------------");
			for(int t4 = 0; t4 < 10; t4++) {
				System.out.println("2つ目のfor文の" + t4 + "回目のループ");
				if(t4 == 5) {
					System.out.println("The End!!");
					continue con;  // 以下は実行されない
				}
				System.out.println("Hello");
			}
		}
		
	}

}
