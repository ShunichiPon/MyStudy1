package easyJavaPractice;

public class Sample6_1 {
	public static void main(String[] args) {
		System.out.println("1~10までの偶数を出力します。");

		boolean bl = false;

		for (int i = 1; i <= 10; i++) {

			/****************** 自分の解答*********************** */
			if (bl == false) {
				bl = true;
			} else {
				System.out.println(i);
				bl = false;
			}
		}
		/********************* 模範解答 *********************/

		for (int j = 1; j <= 10; j++) {
			if ((j % 2) == 0) {
				System.out.println(j);
			}
		}
	}
}
