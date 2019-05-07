package 作业.day0507;

public class ArrMaxHomeWrok {

	public static void main(String[] args) {
		int[] nums={8,7,3,9,5,4,1};
		int max=nums[0];
		int n=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
				n=i;
			}
		}
		System.out.println("最大值的下标为"+n+"，值为"+max);

	}

}
