package test.day0507.pm;

public class shenjinbing {

	public static void main(String[] args) {
		for(double day=1, sum=0,money=1;;day++) {
			sum=sum+money;
			money*=1.5;
			if(day==30) {
				System.out.println("一个月（30天）之后一共存了"+sum+"元");
				break;
			}
		}
		for(double day=1,money=1;;day++) {
			if(money>=10) {
				System.out.println("第"+day+"天的时候，当天存的钱就超过了10块钱");
				break;
			}
			money*=1.5;
		}
		double m=1;
		m=1*1.5;
		m=1.5*1.5;
		m=1.5*1.5*1.5;
		m=1.5*1.5*1.5*1.5;
		System.out.println(m);
		m=1.5*1.5*1.5*1.5*1.5;
		System.out.println(m);
		m=1.5*1.5*1.5*1.5*1.5*1.5;
		System.out.println(m);

	}

}
