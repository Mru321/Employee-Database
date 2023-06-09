package Reg_no_2241007047;

class extra {
	public static boolean isLeapYear(int year) {
		if(year%400==0) {
			return true;
		}
		else if(year%100==0) {
			return false;
		}
		else if(year%4==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
