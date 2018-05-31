
public class Program {
	
	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		AirCondition ac = new AirCondition();
		
		// event subscribe
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		String message = "Пожар";
		//message += "!"; 
		
		sw.addElectricityListener(
			new ElectricityListener() {
				public void electricity() {
					System.out.println(message);
				}
			}
		);
		sw.addElectricityListener( ()-> System.out.println(message));
		//sw.addElectricityListener( ()-> ac.on() ); 
		sw.addElectricityListener( ac::on );
		
		sw.switchOn();
	}
}
