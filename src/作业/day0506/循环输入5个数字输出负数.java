package 作业.day0506;
import java.util.*;
public class 循环输入5个数字输出负数 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("请输入5个数");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
		System.out.println(a[i]);
			}
		}
	}
}
