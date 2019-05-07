package test.day0506;
import java.util.*;
public class 月份天数判断 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年份和月份");
		int year=scan.nextInt();
		int month=scan.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("此月天数为31天");
				break;
			case 2:
				System.out.println("此月天数为29天");
				break;
			default:
				System.out.println("此月天数为30天");
			}
		}else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("此月天数为31天");
				break;
			case 2:
				System.out.println("此月天数为28天");
				break;
			default:
				System.out.println("此月天数为30天");
			}
		}

	}

}
