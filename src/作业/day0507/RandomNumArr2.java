package 作业.day0507;
import java.util.*;
public class RandomNumArr2 {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] arr=new int[5];
		int n;
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(10)+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
						arr[i]=rand.nextInt(10)+1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
