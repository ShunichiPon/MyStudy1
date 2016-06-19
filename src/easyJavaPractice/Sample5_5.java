package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_5 {
	public static void main(String[] args) throws IOException {
		System.out.println("成績を入力して下さい。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch (res) {
		case 1:
			System.out.println("もっと頑張りましょう。");
			break;
		case 2:
			System.out.println("もう少し頑張りましょう。");
			break;
		case 3:
			System.out.println("さらに上を目指しましょう。");
			break;
		case 4:
			System.out.println("大変よくできました。");
			break;
		case 5:
			System.out.println("大変優秀です。");
			break;
		default:
			System.out.println("1から5までの数字を入力してください。");
			break;
		}
	}
}
