public class IfTest {

	public static void main(String[] args) {
		// 条件分岐
		int num = 10;
		if(num > 0) {
			System.out.println("変数は正の数です");
		}
		
		int num2 = 0;
		if(num2 > 0) {
			System.out.println("負");
		}
		else if(num2 == 0){  // 条件を書くのを忘れない！
			System.out.println("値は0");
		}
		else {  // 条件書かない
			System.out.println("正");
		}
		
		// ブール値を使用する方法
		boolean isHappy = true;
		if(isHappy) {
			System.out.println("I am Happy!!");
			isHappy = false;
		}

		if(!isHappy) {
			System.out.println("I am no Happy.");
		}
		
		// Switch文の練習
		System.out.println("Switch文の練習-------------");
		int tNum1 = 2;
		switch(tNum1) {
			case 1:  // マジックナンバー
				System.out.println("非常に不満");
				break;  // Switch文を抜ける為に必須
			
			case 2:
				System.out.println("少し不満");
				break;  // 2で一致処理される。breakがないと3も出力される
			case 3:
				System.out.println("どちらとも言えない");
				break;
			case 4:
				System.out.println("満足");
				break;
			case 5:
				System.out.println("大変満足");
				break;
			default:  // どのcaseにも当てはまらない場合（省略可）
				System.out.println("満足度は1～5で答えて下さい");
				break;
		}
	}

}
