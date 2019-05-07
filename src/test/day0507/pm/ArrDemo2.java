package test.day0507.pm;
import java.util.*;
public class ArrDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[5];
		double sum=0.0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个同学的成绩");
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("他们的平均分为："+(sum/arr.length));
		

	}

}
