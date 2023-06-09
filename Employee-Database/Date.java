package Reg_no_2241007047;

class Date {
	int d,m,y;
	public Date(int d, int m, int y){
		this.m=m;
		this.y=y;
		if(m==1|| m==3|| m==5|| m==7|| m==8|| m==10|| m==12) {
			if(d<=31) {
				this.d=d;
			}
			else {
				System.out.println("Invalid Date(month of 31 days)");
			}
		}
		if(m==4|| m==6|| m==9|| m==11) {
			if(d<=30) {
				this.d=d;
			}
			else {
				System.out.println("Invalid Date(month of 30 days)");
			}
		}
		if(m==2) {
			if(extra.isLeapYear(y)==true) {
				if(d<=29) {
					this.d=d;
				}
				else {
					System.out.println("Invalid Date(month of 29 days)");
				}
			}
			else if(d<=28) {
				this.d=d;
			}
			else {
				System.out.println("Invalid Date(month of 28 Days)");
			}
		}
		
		
	}
	public String getter() {
		return (d+"-"+m+"-"+y);
	}

}
