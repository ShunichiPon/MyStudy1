package easyJava.Sample4;

public class Sample4_9 {
	public static void main(String[] args){
		double dnum = 160.5;

		System.out.println("身長は" + dnum + "です。");

		System.out.println("int型の変数に代入します。");
		int inum = (int) dnum; //キャスト演算子　(型名)式

		System.out.println("身長は" + inum + "センチです。");
	}
}