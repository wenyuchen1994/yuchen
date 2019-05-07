package 作业.day0505;
import java.util.*;
public class 手动输入一个四位数求各位之和 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("请输入一个四位的整数");
			int num=scan.nextInt();
			if(num>999&&num<10000) {
				int ge=num%10;
				int shi=num%100/10;
				int bai=num%1000/100;
				int qian=num/1000;
				System.out.println(ge+shi+bai+qian);
				break;
			}else {
				System.out.println("输入有误，请重新输入");
			}
		}
		

	}

}
