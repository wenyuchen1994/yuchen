package test.day0506;
import java.util.*;
public class 菜谱 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入1-5之间的一位数");
		int day=scan.nextInt();
		switch(day) {
		case 1: System.out.println("红烧排骨");
		break;
		case 2:System.out.println("水煮鱼");
		break;
		case 3:System.out.println("佛跳墙");
		break;
		case 4:System.out.println("松仁玉米");
		break;
		case 5:System.out.println("猪肉粉条");
		break;
		default:System.out.println("吔屎啦你");
		}

	}

}
