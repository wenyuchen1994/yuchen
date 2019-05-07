package test.day0506;
import java.util.*;
public class 机票价格 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入机票原价、月份");
		double price=scan.nextDouble();
		int month=scan.nextInt();
		System.out.println("请输入折扣类型：1、头等舱   2、经济舱");
		int choice=scan.nextInt();
		switch (month) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			if(choice==1) {
				price*=0.9;
			}else {
				price*=0.85;
			}
		default:
			if(choice==1) {
				price*=0.7;
			}else {
				price*=0.65;
			}
		}
		System.out.println("机票价格为："+price);

	}

}
