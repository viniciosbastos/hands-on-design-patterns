package patterns.observe;

public class Main {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		new CurrentConditionsDisplay(wd);

		wd.setMeasurements(80.0F, 80.0F, 80.0F);
		wd.setMeasurements(84.0F, 85.0F, 80.0F);
		wd.setMeasurements(78.0F, 60.0F, 80.0F);	
	}
}
