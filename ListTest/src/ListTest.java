import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListTest {
	public static void main (String[] args) {
		// 配列の宣言
		char[] test1 = new char[3];  // 型名[] 配列変数名 = new 型名[要素数]; 推奨!!
		String test2[] = new String[3];  // 型名 配列変数名[] = new 型名[要素数];
		
		// 代入
		test1[0] = 'S';
		test2[0] = "1";
		test2[1] = "2";
		test2[2] = "3";
		
		// 参照
		System.out.println(test1[0]);
		System.out.println(test2[0]);
		
		// 宣言と同時に値を代入して初期化
		int test3[] = {1, 2, 3};
		int[] test4 = {1, 2, 3};
		
		System.out.println("-------------------------------------------------------------");
		// fillメソッド
		int test5[] = new int[5];
		Arrays.fill(test5, 3);  // import java.util.Arrays;(配列に関するメソッドを提供する)
		System.out.println(test5[0]);
		System.out.println(test5[1]);
		System.out.println(test5[2]);
		System.out.println(test5[3]);
		System.out.println(test5[4]);

		
		// 要素数を取得
		System.out.println(test1.length);
		System.out.println(test5.length);
		
		// 配列のソート
		Arrays.sort(test2);  // 昇順
		
		System.out.println(Arrays.toString(test2));  // 配列のデータを表示
		
		Arrays.sort(test2, Collections.reverseOrder());  // 降順(ラッパークラスでしか使えない)
		System.out.println(Arrays.toString(test2));
		
		System.out.println("ArrayListのテスト-------------------");
		ArrayList<Integer> list = new ArrayList<>();  // ArrayList<オブジェクトの型> 配列名 = new ArrayList<>();
		list.add(10);  // 追加
		list.add(20);
		System.out.println(list.get(0));  // 取得
		System.out.println(list.get(1));  // 取得
		
		list.remove(0); // 削除
		System.out.println("この配列のサイズは" + list.size() + "です");  // 配列のサイズを取得
		System.out.println(list);
		
		// 多次元配列
		int[][] test10 = new int[3][2];  // 要素は0から始まる
		test10[0][0] = 1;
		test10[0][1] = 2;
		test10[1][0] = 3;
		test10[1][1] = 4;
		test10[2][0] = 5;
		test10[2][1] = 6;
		
		System.out.println(Arrays.deepToString(test10));
		
		System.out.println("[0][]の要素数は" + test10[0].length);
		// エラー：System.out.println("[0][1]の要素数は" + test10[0][1].lengs);
		
		// 多次元配列で初期値を代入
		int[][] test11 = {
				{1, 2},
				{1, 2, 3},
				
		};
		
		System.out.println(Arrays.deepToString(test11));
		
		System.out.println("※参照型の注意");
		int[] a= {2};
		int[] b = a;  // bもaと同じ配列を指す
		b[0] = 5;
		System.out.println("b[0]は当然" + b[0] + "しかし参照先のa[0]の値も変更される" + a[0]);  // 参照型はお互いの変更を共有する
		
	}
}
