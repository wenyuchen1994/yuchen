package test.day0505;
import java.util.*;
public class IfDemo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入消费金额");
		double gold=scan.nextDouble();
		if(gold>=1000) {
			gold -=200;
		}
		System.out.println("消费金额为："+gold);
	}

}
