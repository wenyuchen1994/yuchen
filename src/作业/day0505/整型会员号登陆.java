package 作业.day0505;
import java.util.*;
public class 整型会员号登陆 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入你的会员号");
		int idCard=scan.nextInt();
		if(idCard>999&&idCard<10000) {
			System.out.println("登陆成功");
		}else {
			System.out.println("您输入的会员号有误");
		}
		System.out.println("谢谢使用");

	}

}
