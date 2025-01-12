package whiletest;

public class WhileTest {

	public static void main(String[] args) {
		// While文は特定の条件が真である間、ブロック内のコードを繰り返し実行するために使用される
		int i = 0;
		while(i < 100) {  // iが100より小さい限り繰り返す
			System.out.println("現在値" + i + "は100より小さい");
			i += 1;
		}
		System.out.println("100より大きくなりました！");
		
		// Do-While文
		// 最低一度はコードブロックを実行する
		int counter = 10;
		do {
			System.out.println("カウント: " + counter);
			counter --;
		}while(counter > 0);
		System.out.println("ボカン！");
	}
	
}
