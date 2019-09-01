package patterns.command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Nothing to do here...");
	}

	@Override
	public void undo() {
		System.out.println("Nothing to do here...");
	}

}
