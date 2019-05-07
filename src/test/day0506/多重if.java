package test.day0506;

import java.util.Scanner;

public class 多重if {
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入您的消费金额");
		int cost=scan.nextInt();
		if(cost>5000) {
			System.out.println("您是钻石VIP");
		}else if(cost>1000) {
			System.out.println("您是铂金VIP");
		}else if(cost>500) {
			System.out.println("您是黄金VIP");
		}else {
			System.out.println("您不是VIP");
		}
	}

}
