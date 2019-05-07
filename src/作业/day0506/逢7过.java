package 作业.day0506;

public class 逢7过 {

	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<101;i++) {
			if(i%7!=0 && i%10!=7 && i/10!=7) {
				System.out.println(i);
				num+=i;
			}
		}
		System.out.println(num);

	}

}
