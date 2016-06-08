package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4_3 {
	public static void main(String[] args) throws IOException{
		System.out.println("正方形の辺の長さを入力してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int a = Integer.parseInt(str);


		System.out.println("正方形の面積は" + (a*a) + "です。");
	}
}
