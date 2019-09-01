package patterns.observe;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject{
	private Float temp;
	private Float humidity;
	private Float pressure;
	private List<IObserver> observers;
	
	public WeatherData() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public Float getTemp() {
		return temp;
	}
	public void setTemp(Float temp) {
		this.temp = temp;
	}
	public Float getHumidity() {
		return humidity;
	}
	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}
	public Float getPressure() {
		return pressure;
	}
	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}
	public void setMeasurements(Float temp, Float humidity, Float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measureChanged();
	}
	public void measureChanged() {
		notifySubscribers();
	}

	@Override
	public void subscribe(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void unsubscribe(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		for (IObserver observer : this.observers) {
			observer.update(getTemp(), getHumidity(), getPressure());
		}
	}
	
}
