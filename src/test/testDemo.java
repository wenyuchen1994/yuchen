package test;
import java.util.Scanner;
import java.util.Random;
public class testDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int aa = rand.nextInt(100);
		System.out.println(aa);
		if(aa<=50) {
			while(true) {
				System.out.println("请输入要输出的内容：");
				String a=scan.next();
				if(a.equals("0")) {
					System.out.println("欢迎再次使用！");
					break;
				}else {
					System.out.println(a);
				}
			}
		}else {
			System.out.print("人品不好回家等死");
		}
		
		

	}

}
