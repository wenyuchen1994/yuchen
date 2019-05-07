package test.day0507.pm;

public class ArrDemo {
//数组演示
	public static void main(String[] args) {
		int[] arr=new int[6];
		arr[1]=20;
		arr[3]=35;
		arr[arr.length-1]=42;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
