package test.day0507.am;
import java.util.*;
public class AvgDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println("请输入第"+i+"个同学的成绩");
			double score=scan.nextDouble();
			sum+=score;
		}
		System.out.println("输入完毕，他们的平均分为"+(sum/5));

	}

}
