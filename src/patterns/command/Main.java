package patterns.command;

public class Main {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		
//		remote.setCommand(0, () -> light.on(), new LightOffCommand(light));
		remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		remote.setCommand(1, new StereoOnWithCDCommand(stereo), new StereoOffCommand(stereo));
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
	}
}
