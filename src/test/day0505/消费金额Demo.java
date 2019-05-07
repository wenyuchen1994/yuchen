package test.day0505;
import java.util.*;
public class 消费金额Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入消费金额");
		double cost=scan.nextDouble();
		if(cost>999) {
			cost *=0.8;
		}else {
			cost *=0.9;
		}
		System.out.println("消费金额为："+cost);

	}

}
