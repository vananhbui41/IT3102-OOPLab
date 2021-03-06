
abstract class RegisteredMotorVehicle extends RegisteredVehicle{

	int emptyWeight;
	int lastOdometer;
	RegisteredMotorVehicle(String t, String r,String o,int w, int l){
		super(t,r,o);
		emptyWeight =w;
		lastOdometer = l;
	}
	void reRegister(String r,String o, int l)
		throws RegistrationException{
		if (l<lastOdometer)
			throw new RegistrationException("Invalid odmeter reading.");
		super.reRegister(r,o);
		lastOdometer = l;
	}
	void printRegistration(){
		super.printRegistration();
		System.out.println("Empty weight: "+ emptyWeight);
		System.out.println("Last odometer reading: "+lastOdometer);
	}

}
