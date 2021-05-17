
public class RegisteredVehicleTest {
	public static void main(String[] args) {
		RegisteredVehicle[] vs = {
				new Truck("abjfak0","sfjg","hfues",2000,20000,Truck.PICKUP),
				new Truck("abjfak0","sfjg","hfues",2000,20000,Truck.BIGRIG)
		};
		try {
			RegisteredMotorVehicle r = (RegisteredMotorVehicle)vs[0];
			r.reRegister("fbfhw", "null",4000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		for (int i = 0; i<vs.length;i++) {
			vs[i].printRegistration();
			System.out.println("Anual fee: $"+vs[i].getAnnualFee());
			System.out.println("");
		}
	}
}
