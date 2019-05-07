package test.day0507.pm;

public class ContinueDemo {
//循环结构中跳过当前循环
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
