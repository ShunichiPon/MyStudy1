package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_5 {
	public static void main(String[] args) throws IOException{

		System.out.println("あなたの身長と体重を入力してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);

		System.out.println("身長は" + num1 + "センチです。");
		System.out.println("体重は" + num2 + "キロです。");
	}
}
