package patterns.command;

public class GarageDoor {

	public void up() {
		System.out.println("Openning garage door.");
	}
	public void down() {
		System.out.println("Closing garage door.");
	}
	public void stop() {
		System.out.println("Stop garage door.");
	}
	public void lightOn() {}
	public void lightOff() {}
}
