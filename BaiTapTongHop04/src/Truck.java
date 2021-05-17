
class Truck extends RegisteredMotorVehicle{
 static final int PICKUP = 0, BIGRIG = 1 ;
 int truckType ;
 Truck(String t,String r,String o,int w,int l,int type) {
 super(t, r, o, w, l) ;
 truckType = type ;
 }
	void printRegistration() {
		super.printRegistration() ;
		switch ( truckType ) {
		case PICKUP : {
		System.out.println("Pickup") ;
		break ;
		 }
		 case BIGRIG : {
		 System.out.println("Big rig") ;
		 break ;
		 }
		 default :
		 System.out.println("Truck") ;
		 }
		 }
		 int getAnnualFee() {
		 int temp ;
		 switch (truckType) {
		 case PICKUP : {
		 temp = (int) (emptyWeight * .05) ;
		 break ;
		 }
		case BIGRIG : {
		temp = (int) (emptyWeight * .01) ;
		 break ;
		}
		 default :
		 temp = (int) (emptyWeight * .10) ;
		}
		 return temp ;
		 }
}

