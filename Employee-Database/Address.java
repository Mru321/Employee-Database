package Reg_no_2241007047;

class Address {
	int houseno;
	String areaName, city, state, pincode;
	public Address(int houseno, String areaName, String city, String state, String pincode ) {
		this.houseno=houseno;
		this.areaName=areaName;
		this.city=city;
		this.state=state;
		if(pincode.length()==6) {
			this.pincode=pincode;
		}	
	}
	public void getter() {
		System.out.println("House no.: "+houseno+", Area: "+areaName+", city: "+city+", state: "+state+", pincode: "+pincode);
	}

}
