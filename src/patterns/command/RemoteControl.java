package patterns.command;

public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControl() {
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			this.onCommands[i] = noCommand;
			this.offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
		this.undoCommand = this.onCommands[slot]; 
	}
	
	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
		this.undoCommand = this.offCommands[slot]; 
	}
	
	public void undoButtonWasPushed() {
		this.undoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n-------------- Remote Control --------------\n");
		
		for (int i = 0; i < 7; i++) {
			stringBuffer.append(String.format("[slot %d] %s\t%s \n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
		}
		return stringBuffer.toString();
	}
}
