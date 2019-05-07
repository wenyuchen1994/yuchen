package test.day0507.pm;

public class woniu {

	public static void main(String[] args) {
		double up=5;//白天往上爬5米
		double down=3.5;//晚上掉3.5米
		double jinshen=56.7;//井深56.7米
		double woNiu=0;
		for(int day=1;;day++) {
			woNiu=woNiu+up;
			if(woNiu>jinshen) {
				System.out.println(day);
				break;
			}
			woNiu=woNiu-down;
		}
		

	}

}
