
public class Main {

	public static void main(String[] args) {
		/*
		ChocolateBoiler choco = ChocolateBoiler.getInstance();
		//ChocolateBoiler choco = new ChocolateBoiler();
		choco.fill();
		choco.boil();
		choco.drain();
		
		ChocolateBoiler choco2 = ChocolateBoiler.getInstance();
		System.out.println(choco);
		System.out.println(choco2);
		*/
		
		System.out.println("------SimpleRemotecontrol-----");
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonPressed();
		remote.setCommand(lightOff);
		remote.buttonPressed();
		
		System.out.println("\n\n------MultipleRemotecontrol-----");
		MultipleRemote multipleRemote = new MultipleRemote();
		multipleRemote.setCommand(lightOff, 0);
		multipleRemote.setCommand(lightOn, 1);
		multipleRemote.buttonPressed(0);
		multipleRemote.buttonPressed(1);

	}

}
