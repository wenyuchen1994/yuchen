package test.day0506;
import java.util.*;
public class 指定形状计算面积 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入你需要的形状：1、长方形  2、正方形  3、三角形  4、圆形");
		int shape=scan.nextInt();
		switch (shape) {
		case 1:
			System.out.println("请输入长和宽");
			double length=scan.nextDouble();
			double width=scan.nextDouble();
			System.out.println("面积为"+length*width);
			break;
		case 2:
			System.out.println("请输入边长");
			double length1=scan.nextDouble();
			System.out.println("面积为"+length1*length1);
			break;
		case 3:
			System.out.println("请输入底和高");
			double base=scan.nextDouble();
			double high=scan.nextDouble();
			System.out.println("面积为"+(base*high/2));
			break;
		case 4:
			System.out.println("请输入半径");
			double r=scan.nextDouble();
			System.out.println("面积为"+(3.14*r*r));
		}

	}

}
