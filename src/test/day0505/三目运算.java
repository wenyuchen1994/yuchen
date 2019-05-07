package test.day0505;
import java.util.*;
public class 三目运算 {
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入总人数和每间宿舍能住的人数");
		int p=scan.nextInt();
		int ep=scan.nextInt();
		int room=(p%ep==0)?p/ep:p/ep+1;
		System.out.println("需要"+room+"间宿舍");
	}

}
