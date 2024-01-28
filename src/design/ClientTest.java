package design;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		Elevator el=new Elevator(6);
	  Request erq=new ExternalRequest(3,Direction.DOWN);
	//  Request nerq=new ExternalRequest(1,Direction.UP);
	   el.openGate();
	   el.closeGate();
	  el.openGate();
	 //  el.closeGate();
	   System.out.println(el.elevatorStatusDescription());

	}

}
