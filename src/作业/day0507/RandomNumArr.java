package 作业.day0507;
import java.util.*;
public class RandomNumArr {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(10);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[i]) {
					arr[j]=arr[i];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("总和为"+sum);
		System.out.println("平均数为"+(sum/arr.length));

	}

}
