package 作业.day0505;
import java.util.*;
public class 商城周年庆打折活动 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		//int zhekou=(int)(Math.random()*10);
		int zhekou;
		while(true) {
			zhekou=rand.nextInt(10);
			if(zhekou!=0||zhekou!=10) {
				break;
			}else {
				zhekou=rand.nextInt(10);
			}
		}
		System.out.println("请输入消费金额");
		double cost=scan.nextDouble();
		System.out.println("抽到的折扣为："+zhekou+"折，折后价格为："+zhekou*cost*0.1);

	}

}
