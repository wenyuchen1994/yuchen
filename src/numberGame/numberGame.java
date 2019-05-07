package numberGame;
import java.util.Random;
import java.util.Scanner;
public class numberGame {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		System.out.println("请选择模式：1、次数挑战   2、无限模式");
		while(true) {
			int choseOne=scan.nextInt();
		if(choseOne==1) {
			int cout=1;
			boolean flag=false;
			int randomNum=rand.nextInt(100);
			System.out.println("请输入一个0-99之间的整数，剩余次数为5次。");
			int useInput=scan.nextInt();
			while(true) {
				if(useInput==randomNum) {
					flag=true;
					break;
				}else {
					if(cout==5) {
						System.out.println("正确结果为："+randomNum);
						break;
					}
				System.out.println("剩余次数为："+(5-cout)+"次");
				if(useInput>randomNum) {
						System.out.println("太大了");
						useInput=scan.nextInt();
						cout++;
					}else {
						System.out.println("太小了");
						useInput=scan.nextInt();
						cout++;
					}
				}
				
			}
			Flag(flag);
			break;
		}else if(choseOne==2) {
			boolean flag=false;
			int randomNum=rand.nextInt(1000);
			System.out.println("请输入一个0-999之间的整数，次数无限，输入-1退出。");
			int useInput=scan.nextInt();
			while(true) {
				if(useInput==randomNum) {
					flag=true;
					break;
				}else if(useInput==-1) {
					System.out.println("正确答案为："+randomNum);
					break;
				}else if(useInput>randomNum) {
					System.out.println("太大了");
					useInput=scan.nextInt();
				}else {
					System.out.println("太小了");
					useInput=scan.nextInt();
				}
			}
			Flag(flag);
				break;
		}else {
			System.out.println("输入有误，请重新选择！");
		}
		}
	}
	public static void Flag(boolean flag) {
		if(flag==true) {
			System.out.println("恭喜你猜对了！");
		}else {
			System.out.println("很遗憾，下次努力！");
		}
	}
}	
	