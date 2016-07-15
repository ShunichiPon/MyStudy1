package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6_5 {
	public static void main(String[] args) throws IOException {
		System.out.println("2以上の整数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		for (int i = 2; i <= res; i++) {
			if (i == res) {
				System.out.println(res + "は素数です。");
			} else if (res % i == 0) {
				System.out.println(res + "は素数ではありません。");
				break;
			}
		}
	}
}
