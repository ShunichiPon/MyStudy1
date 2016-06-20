package easyJavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6_2 {
	public static void main(String[] args) throws IOException{
		System.out.println("テストの点数を入力してください。(0で終了)");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		/*****************自分の解答*********************/
		for(int i = 0;;){
			String str = br.readLine();
			int res = Integer.parseInt(str);
			if(res == 0){
				System.out.println("テストの合計点は" + i + "点です。");
				break;
			}else{
				i += res;
			}

			/***********模範解答*********************/
/*
			int num = 0;
			int sum = 0;

			do{
				String str = br.readLine();
				num = Integer.parseInt(str);
				sum += num;
			}while(num !=0);

			System.out.println("テストの合計は" + sum + "点です。");*/


		}
	}
}
