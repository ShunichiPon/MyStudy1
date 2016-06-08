package easyJava.Sample4;

public class Sample4_5 {
	public static void main(String[] args){
		int a = 0;
		int b = 0;

		b = a++;

		System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");

		int c = 0;
		int d = 0;

		d = ++c;

		System.out.println("代入前にインクリメントしたのでdの値は" + d + "です。");
	}
}
