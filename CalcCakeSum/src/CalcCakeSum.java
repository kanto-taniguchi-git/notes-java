
public class CalcCakeSum {

	public static void main(String[] args) {
		// 条件 : 商品名 個数
		String[] itemInfo = args;
		int flg = 0;  // 配列の要素番号が偶数・奇数かを判断
		int itemPrice = 0;  // 商品 * 個数
		int num = 0;  // 個数
		double discountAmount = 0.0; // 割引額
		
		for(int i = 0; i < itemInfo.length; i ++) {
			flg = i % 2;
			if(flg != 0) {
				num = Integer.parseInt(args[i]);
				if(args[i - 1].equals("ショートケーキ")) {
					itemPrice = itemPrice + (320 * num);
				}
				else if(args[i - 1].equals("モンブラン")) {
					itemPrice = itemPrice + (350 * num);
				}
				else if(args[i - 1].equals("チョコレートケーキ")) {
					itemPrice = itemPrice + (370 * num);
				}
				else if(args[i - 1].equals("いちごのタルト")) {
					itemPrice = itemPrice + (400 * num);
				}
				else if(args[i - 1].equals("チーズケーキ")) {
					itemPrice = itemPrice + (300 * num);
				}
			}
		}
		// 条件2 : 合計金額が1000円以上の場合2割引
		if(itemPrice >= 1000) {
			discountAmount = itemPrice * 0.2;
			itemPrice = itemPrice - (int)discountAmount;
		}
		// 条件3 : 消費税は8%
		itemPrice = itemPrice + (int)(itemPrice * 0.08);
		System.out.println("合計金額は" + itemPrice + "です。");
	}

}
