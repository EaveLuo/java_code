package calendar;

public class Utils {
	boolean JudgeLearYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
