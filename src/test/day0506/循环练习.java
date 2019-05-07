package test.day0506;

public class 循环练习 {

	public static void main(String[] args) {
		/*int i=1;
		int sum=0;
		while(i<101) {
			 sum=sum+i;
			 if(sum>1000) {
				 System.out.println(i);
				 break;
			 }
			 i++;
		}
		System.out.println(sum);*/
		int i=1;
		int sum=0;
		do {
			sum+=i;
			if(sum>1000) {
				System.out.println(i);
				break;
			}
			i++;
		}while(i<101);
		System.out.println(sum);
	}

}
