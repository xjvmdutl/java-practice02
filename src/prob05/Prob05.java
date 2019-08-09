package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Random r =new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int Low = 1;
			int High = 100;
			int num,count=0;
			int n=r.nextInt(100)+1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			do {
				System.out.println(Low+"-"+High);
				System.out.print(++count+">>");
				num=sc.nextInt();
				if(n>num) {
					System.out.println("더 높게");
					Low=num;
				}
				else {
					High=num;
					System.out.println("더 낮게");
				}
			}while(num!=n);
			System.out.println("맞았습니다");
			System.out.println("다시하시겠습니까?(y/n)");
			String s=sc.next();
			if("n".equals(s))
				break;
		}
	}

}