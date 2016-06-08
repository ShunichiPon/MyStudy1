package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4_4 {
	public static void main(String[] args) throws IOException{
		System.out.println("三角形の高さと底辺を入力してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		double a = Integer.parseInt(str1);
		double b = Integer.parseInt(str2);

		System.out.println("三角形の面積は"+ ((a*b)/2));
	}
}
