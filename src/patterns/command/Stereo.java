package patterns.command;

public class Stereo {

	public void on() {
		System.out.println("Stereo is ON.");
	}
	
	public void off() {
		System.out.println("Stereo is OFF");
	}
	
	public void setCd() {
		System.out.println("Stereo set for CD");
	}
	
	public void setDvd() {
		System.out.println("Stereo set for DVD");
	}
	
	public void setRadio() {
		System.out.println("Stereo set for Radio");
	}
	
	public void setVolume(Integer volume) {
		System.out.println("Volume set for " + volume);
	}
}
