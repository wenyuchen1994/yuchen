package test.day0506;

import java.util.Scanner;

public class 多重if2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入消费金额和积分");
		double cost=scan.nextDouble();
		int jifen=scan.nextInt();
		if(jifen>2000) {
			cost*=0.7;
		}else if(jifen>1000) {
			cost*=0.8;
		}else if(jifen>600) {
			cost*=0.9;
		}else {
			cost*=1;
		}
		System.out.println("实际消费金额为"+cost);

	}

}
