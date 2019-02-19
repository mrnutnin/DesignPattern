import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> members;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.members = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer ob) {
		this.members.add(ob);
		
	}

	@Override
	public void removeObserver(Observer ob) {
		int id = this.members.indexOf(ob);
		if(id > 0 )
			this.members.remove(id);
		
	}

	@Override
	public void notifyObserver() {
		/*for(Observer ob: this.members) {
			ob.update(temperature, humidity, pressure);
		}
		*/
		this.members.forEach(x->x.update(temperature, humidity, pressure));
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;		
		measurementsChanged();
	}
	
	public void measurementsChanged(){
		notifyObserver();
		
	}

}
