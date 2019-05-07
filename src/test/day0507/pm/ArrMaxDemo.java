package test.day0507.pm;
import java.util.*;
public class ArrMaxDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			arr[i]=scan.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("最大值为"+max);

	}

}
