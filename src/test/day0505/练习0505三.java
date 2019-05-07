package test.day0505;
import java.util.*;
public class 练习0505三 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入小明百米成绩和跳高成绩");
		double xiaoMingBaiMi=scan.nextDouble();
		double xiaoMingTiaoGao=scan.nextDouble();
		boolean b1=xiaoMingBaiMi<13;
		boolean b2=xiaoMingTiaoGao>2.2;
		System.out.println("小明能进决赛："+(b1||b2));

	}

}
