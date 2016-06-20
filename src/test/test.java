package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) throws IOException {

		System.out.println("残念ながら自分の無知より小数や分数その他もろもろ（整数以外）のエラーを防ぐことはできませんでした。ご了承下さい");
		System.out.println();
		System.out.println("ではいきますか!");
		System.out.println();
		System.out.println("条件：1<=a<=179  1<=b<=179  2<=a+b<=179  a,bは正の整数");
		System.out.println("条件に従い、aとbそれぞれの値を順に正の整数で入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (;;) {

			String str1 = br.readLine();
			String str2 = br.readLine();

			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);

			if (a > 0 && b > 0) {
				if ((1 <= a && a <= 179) && (1 <= b && b <= 179)) {
					if (2 <= a + b && a + b <= 179) {
						System.out.println((180 - (a + b)) + "=180-(a+b)");
						break;
					} else {
						System.out.println("さて再入力といきすか！a+bの値が大きすぎたんだね！");
						System.out.println("与えるものしっかり与えてくれないとまともな計算ができないよ。。。(; ･`д･´)");
					}
				} else {
					System.out.println("いや確かに正の整数だけど。。。ごめん！条件通りにしてほしいな~");
					System.out.println("気を取り直して、もう一度入力だよ('ω')");
				}
			} else if (a <= 0 && b <= 0) {
				System.out.println("aとｂには正の整数を入力してください。");
				System.out.println("さあ！再入力です！aとbを整数で入力しましょう。因みに「0(zero)」は正の整数ではないですぞw(。-`ω-)");
			} else if (a <= 0 && b >= 1) {
				System.out.println("aの値を正の整数で入力してください。");
				System.out.println("なななんでaは正の整数じゃないの？！え？！bだけかよ！wやり直しです~( ﾟДﾟ)");
			} else if (a >= 1 && b <= 0) {
				System.out.println("bの値を正の整数で入力してください。");
				System.out.println("おいおいおいaを正の整数で入力したのにbはなんで正の整数じゃないんだよ！( ;∀;)もう一度正の整数で入力しよう！");
			} else {
				System.out.println("小数や分数その他もろもろの防ぎ方を知ったら追記する。");
			}
		}
		System.out.println("ありがとう！！おかげでうまく計算できたよ！そんじゃまたそのうち！ ^^) _旦~~");
	}
}
