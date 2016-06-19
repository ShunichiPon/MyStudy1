package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_4 {
	public static void main(String[] args) throws IOException {
		System.out.println("0から10までの整数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int res = Integer.parseInt(str);

		if (res >= 0 && res <= 10) {
			System.out.println("正解です。");
		} else {
			System.out.println("間違いです。");
		}
	}
}
