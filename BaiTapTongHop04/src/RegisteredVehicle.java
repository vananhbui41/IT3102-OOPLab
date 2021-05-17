
abstract class RegisteredVehicle {
	String tag;
	String registeredTo;
	String owner;
	RegisteredVehicle(String t, String r, String o) {
		tag = t;
		registeredTo = r;
		owner = o;
	}
	void reRegister(String r, String o) {
		registeredTo = r;
		owner = o;
	}
	void printRegistration() {
		System.out.println("*Tag: "+tag);
		System.out.println("Registered to: "+registeredTo);
		System.out.println("Owner: "+owner);
	}
	abstract int getAnnualFee();

}
