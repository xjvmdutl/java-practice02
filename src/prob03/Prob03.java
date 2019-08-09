package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		
		// �썝�옒 諛곗뿴 �썝�냼 異쒕젰
		printCharArray(c);

		// 怨듬갚 臾몄옄 諛붽씀湲�
		replaceSpace(c);

		// �닔�젙�맂 諛곗뿴 �썝�냼 異쒕젰
		printCharArray(c);
	}

	public static void replaceSpace(char c[]) {
		for(int i=0;i<c.length;++i) {
			if(c[i]==' ')
					c[i]=',';
		}
	}

	public static void printCharArray(char c[]) {
		for(int i=0;i<c.length;++i)
			System.out.print(c[i]);
		System.out.println();
	}
}
