package patterns.observe;

public class CurrentConditionsDisplay implements IDisplayElement, IObserver {
	private Float temperature;
	private Float humidity;
	private ISubject subject;

	public CurrentConditionsDisplay(ISubject subject) {
		this.subject = subject;
		this.subject.subscribe(this);
	}
	
	@Override
	public void update(Float temp, Float humidity, Float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println(String.format("Current conditions: %fF degrees and %f%% humidity", this.temperature, this.humidity));
	}

}
