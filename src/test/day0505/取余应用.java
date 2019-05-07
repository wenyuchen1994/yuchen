package test.day0505;
import java.util.*;
public class 取余应用 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个四位的整数");
		int num=scan.nextInt();
		QiuHe(num);

	}
public static void QiuHe(int a) {
	int geWei=a%10;
	int shiWei=a%100/10;
	int baiWei=a%1000/100;
	int qianWei=a/1000;
	System.out.println(geWei+shiWei+baiWei+qianWei);
}
}
