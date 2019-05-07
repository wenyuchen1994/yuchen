package test.day0505;
import java.util.*;
public class IfDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入密码");
		int num=scan.nextInt();
		if(num>=1000 &&num<=9999) {
			System.out.println("会员登陆成功！");
		}

	}

}
