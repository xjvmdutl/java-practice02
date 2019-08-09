package prob01;
import java.util.Scanner;
//1
public class Prob01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ�  : ");
		int money = sc.nextInt();
		boolean b= false;
		int num = 50000;
		while(money>0) {
			if(b) {
				System.out.println(num+"�� :"+money/num);
				money=money%num;
				num=num/2;
				b=false;
			}
			else {
				System.out.println(num+"�� :"+money/num);
				money=money%num;
				num=num/5;
				b=true;
			}
		}
		sc.close();
 	}
}