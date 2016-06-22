package easyJavaPractice;

public class Sample6_3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j == 9){
					System.out.println((i * j));
				}else{
					System.out.print((i * j) + "\t");
				}
			}
		}
	}
}