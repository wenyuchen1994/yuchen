package 作业.day0505;
import java.util.*;
public class 三个数的排序 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int max;
		/*if(a>b) {
			max=a;
			a=b;
			if(max>c) {
				b=c;
				c=max;
			}else {
				b=max;
			}
		}else {
			max=b;
			if(max>c) {
				b=c;
				c=max;
			}
		}*/
		if(a>b) {
			max=a;
			a=b;
			b=max;
		}
		if(a>c) {
			max=a;
			a=c;
			c=max;
		}
		if(b>c) {
			max=b;
			b=c;
			c=max;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);

	}

}
