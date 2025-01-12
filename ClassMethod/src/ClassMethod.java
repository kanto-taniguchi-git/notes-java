public class ClassMethod {
	/* 
	 * クラス名=ファイル名
	 * オブジェクトを作るための設計図がクラス
	 * オブジェクトが持つデータをフィールド
	 * オブジェクトが出来る動作がメソッド
	 * メソッドの中にメソッドは禁止
	*/
	
	private int instanceNum = 100;  // インスタンス変数
	static int staticNum = 200;  // クラス変数

	public static void main(String[] args) {
		int add = add(10, 20);
		int subtract = subtract(100, 20);
		System.out.println(add);
		System.out.println(subtract);
		
		System.out.println("ここからはオーバーロードの演習");
		ClassMethod overR1 = new ClassMethod();  // インスタンスの生成は”クラスからオブジェクトを作ること”
		overR1.display();  // 実行
		System.out.println(overR1.display(2, "戻り値がvoidではない"));
		
		System.out.println("スコープとローカル変数の演習----------------");
		boolean scope1 = true;
		if(scope1) {
			int sNum = 0;  // ローカル変数。ブロック外からはアクセスできない。
			System.out.println(sNum);
		}
		// System.out.println(sNum); →エラー
		
		// System.out.println(this.instanceNum);  // エラー。thisは非静的コンテキスト(インスタンスメソッド)でのみ利用可能
		System.out.println(overR1.instanceNum);  // 正しいインスタンス変数へのアクセス
		System.out.println(staticNum);
	}
	// メソッドの規則 ： アクセス修飾子 戻り値の型（ない場合はvoid） メソッド名 引数
	public static int add(int num1, int num2) {  // staticメソッド
		int result = num1 + num2;
		return result;
	}
	
	public static int subtract(int a, int b) {  // staticメソッド
		return a - b;
	}
	// オーバーロード（引数の型や引数の数が違えばクラス内で同名のメソッドを複数定義出来る）
	public void display() {  // 引数なし
		System.out.println("戻り値なし。");
	}
	
	public void display(int a) {  // 整数型の引数
		System.out.println("提供された整数は" + a + "です！");
	}
	
	public void display(String a) {  // 文字列
		System.out.println("提供された文字列は" + a + "です！");
	}
	public String display(int a, String b) {
		return "渡された数値と文字列は\"" + a + "と\"" + b + "\"です。";
	}
	
}
