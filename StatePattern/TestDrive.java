
public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
		RemoteDeviceV1 remote = new RemoteDeviceV1();
		System.out.println(remote);
		remote.pressPlay();	
		remote.pressPause();
		remote.pressStop();
		remote.pressPlay();
		remote.pressPlay();
		
	System.out.println("\n===================================\n");
	
		RemoteDevice remote1 = new RemoteDevice();
		System.out.println(remote1);
		remote1.pressPlay();
		remote1.pressPause();
		remote1.pressStop();
		remote1.pressPlay();
		remote1.pressRewind();
		remote1.pressStop();
		remote1.pressRewind();
		remote1.pressPause();
		remote1.pressRewind();
		remote1.pressStop();
		remote1.pressRewind();
		
	}

}
