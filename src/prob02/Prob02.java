package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		for(int i=0;i<intArray.length;++i) {
			System.out.print("정수 입력 : ");
			intArray[i]=in.nextInt();
		}
		for(int i=0;i<intArray.length;++i) {
			sum+=intArray[i];
		}
		System.out.println("평균은 : "+sum/intArray.length);
		in.close();
	}
}
