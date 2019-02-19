
public class Main {

	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		
		CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weather);
		weather.setMeasurements(25.1f, 25.0f, 40.5f);
		display1.display();
		
	}

}
