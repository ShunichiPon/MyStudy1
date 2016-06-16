package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_2 {
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res%2 == 0){
			System.out.println(res + "は偶数です。");
		}else{
			System.out.println(res + "は奇数です。");
		}
	}

}
