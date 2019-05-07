package test.day0507.am;
import java.util.Scanner;
public class randomNumDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.println("请输入一个随机的数字");
		int num=scan.nextInt();
		for(int i=1;;i++) {
			if (num%(10^i)/(10^(i-1))==num) {
				break;
			}
			sum=sum+num%(10^i)/(10^(i-1));
			
		}
		System.out.println(sum);

	}

}
