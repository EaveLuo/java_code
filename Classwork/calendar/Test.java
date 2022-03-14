package calendar;

import java.util.Scanner;
import calendar.Utils;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int nowYear = sc.nextInt();
		System.out.println("Please enter a month: ");
		int nowMonth = sc.nextInt();

		int sumYear = 0, sumDay = 0, nowMonthDay = 0;
		Utils util = new Utils();
		for (int y = 1900; y < nowYear; y++) {
			if (util.JudgeLearYear(y)) {
				sumYear += 366;
			} else {
				sumYear += 365;
			}
		}
		for (int m = 1; m < nowMonth; m++) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10
					|| m == 12) {
				sumDay += 31;
			} else if (m == 2 && util.JudgeLearYear(nowYear)) {
				sumDay += 29;
			} else if (m == 2 && !util.JudgeLearYear(nowYear)) {
				sumDay += 28;
			} else {
				sumDay += 30;
			}
		}
		if (nowMonth == 1 || nowMonth == 3 || nowMonth == 5 || nowMonth == 7
				|| nowMonth == 8 || nowMonth == 10 || nowMonth == 12) {
			nowMonthDay = 31;
		} else if (nowMonth == 2 && util.JudgeLearYear(nowYear)) {
			nowMonthDay = 29;
		} else if (nowMonth == 2 && !util.JudgeLearYear(nowYear)) {
			nowMonthDay = 28;
		} else {
			nowMonthDay = 30;
		}
		sumDay += sumYear;
		int weekDay = sumDay % 7;
		System.out.println("----------------------" + nowYear + "年" + nowMonth
				+ "月" + "----------------------");
		System.out.println(" 日 \t 一 \t 二 \t 三 \t 四 \t 五 \t 六");
		for (int i = 1; i <= weekDay; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= nowMonthDay; i++) {
			if (sumDay % 7 == 6) {
				System.out.print(i + "\n");
			} else {
				System.out.print(i + "\t");
			}
			sumDay++;
		}
	}
}
