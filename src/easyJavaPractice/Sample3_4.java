package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_4 {
	public static void main(String[] args) throws IOException{

		System.out.println("円周率の値はいくつですか？");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		double num = Double.parseDouble(str);

		System.out.println("円周率の値は" + num + "です。");
	}
}
