package week1.day1;

public class Car {
	public void OpenDoor() {
		System.out.println("OpenDoor");
	}
	public void CloseDoor() {
		System.out.println("CloseDoor");
	}
	public void ApplyBreak() {
		System.out.println("ApplyBreak");
	}
	public void ApplyGear() {
		System.out.println("ApplyGear");
	}
	public void ApplyAcclerate() {
		System.out.println("ApplyAcclerate");
	}
	public void SwitchOnAc() {
		System.out.println("SwitchOnAc");
	}
	
	public static void main(String[] args) {
	
		Car myCar= new Car();
		myCar.OpenDoor();
		myCar.CloseDoor();
		myCar.ApplyBreak();
		myCar.ApplyGear();
		myCar.ApplyAcclerate();
		myCar.SwitchOnAc();
	}
}
		
		
