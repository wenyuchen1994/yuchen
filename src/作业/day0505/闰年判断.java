package 作业.day0505;
import java.util.*;
public class 闰年判断 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入需要判断的年份");
		int year=scan.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"年，是闰年");
		}else {
			System.out.println(year+"年，不是闰年");
		}

	}

}
