package test.day0507.pm;

public class runDemo {

	public static void main(String[] args) {
		int chaochang=400;//操场一圈400米
		int runlong=10000;//一共要跑10000米
		int time=50;//第一圈需要50秒
		int sum=0;
		for(int i=1;i<=(runlong/chaochang);i++) {
			sum+=time;
			time++;
		}
		System.out.println(sum);

	}

}
