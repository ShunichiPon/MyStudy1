package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_3 {
	public static void main(String[] args) throws IOException{

		System.out.println("あなたは何歳ですか？");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int num = Integer.parseInt(str);

		System.out.println("あなたは" + num + "歳です。");
	}
}
