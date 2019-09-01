package patterns.observe;

public interface IObserver {
	void update(Float temp, Float humidity, Float pressure);
}
