package easyJava.Sample4;

public class Sample4_11 {
	public static void main(String[] args){

		int num1 = 5;
		int num2 = 4;

		//失敗のパターン
		double div = num1/num2;

		System.out.println("5/4は" + div + "です。");

		//成功のパターン1
		double div2 = (double)num1/num2;

		System.out.println("5/4は" + div2 + "です。");

		//成功のパターン2
		double div3 = num1/(double)num2;

		System.out.println("5/4は" + div3 + "です。");

		//成功のパターン3
		double div4 = (double)num1/(double)num2;

		System.out.println("5/4は" + div4 + "です。");
	}
}
