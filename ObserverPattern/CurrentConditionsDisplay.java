
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private Subject subj;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Subject subj) {
		this.subj = subj;
		this.subj.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("CurrentCondiotinsDisplay");
		System.out.println("Temperature: "+ this.temperature);
		System.out.println("humidity: "+ this.humidity);
		System.out.println("pressure: "+ this.pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

}
