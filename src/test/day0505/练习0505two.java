package test.day0505;
import java.util.*;
public class 练习0505two {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入小明的英语成绩和音乐成绩");
		int xiaoMingEnglishScore=scan.nextInt();
		int xiaoMingMusicScore=scan.nextInt();
		boolean b1=xiaoMingEnglishScore>85;
		boolean b2=xiaoMingMusicScore>60;
		System.out.println("小明能获得一张林肯公园的CD："+(b1&&b2));

	}

}
