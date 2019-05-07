package test.day0506;

public class 循环练习3 {

	public static void main(String[] args) {
		/*int sum=0;
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);*/
		int sum=0;
		int i=1;
		do {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}while(i<101);
		System.out.println(sum);

	}

}
