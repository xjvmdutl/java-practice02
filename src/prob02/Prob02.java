package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		for(int i=0;i<intArray.length;++i) {
			System.out.print("���� �Է� : ");
			intArray[i]=in.nextInt();
		}
		for(int i=0;i<intArray.length;++i) {
			sum+=intArray[i];
		}
		System.out.println("����� : "+sum/intArray.length);
		in.close();
	}
}
