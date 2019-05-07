package test.day0505;
import java.util.Scanner;
public class 判断Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int xiaoMingScore=80;
		System.out.println("请输入你的成绩");
		int yourScore=scan.nextInt();
		boolean b=xiaoMingScore<yourScore;
		System.out.println("小明的成绩比我低："+b);
		int xiaoHongAge=24;
		System.out.println("请输入你的年龄");
		int yourAge=scan.nextInt();
		boolean b1=xiaoHongAge==yourAge;
		System.out.println("小红和我同岁："+b1);

	}

}
