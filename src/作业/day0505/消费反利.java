package 作业.day0505;
import java.util.*;
public class 消费反利 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入消费金额");
		double cost=scan.nextDouble();
		if(cost*0.8>=1000) {
			System.out.println("获得一张两百的代金券");
		}
		System.out.println("谢谢光临");

	}

}
