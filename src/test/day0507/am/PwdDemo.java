package test.day0507.am;
import java.util.Scanner;
public class PwdDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		boolean flag=true;
		while(i<4) {
			System.out.println("请输入密码");
			int useInput=scan.nextInt();
			if(useInput==123) {
				System.out.println("登陆成功");
				flag=false;
				break;
			}
			System.out.println("密码错误，剩余输入次数为"+(3-i));
			i++;
		}
		if(flag) {
			System.out.println("欢迎下次继续使用");
		}else {
			System.out.println("正在加载，稍后更精彩");
		}
		

	}

}
