
public class Rewind implements State{
	
	private RemoteDevice remote;
	
	public Rewind(RemoteDevice remote) {
		this.remote = remote;
	}

	@Override
	public boolean pressPlay() {
		System.out.println("The player is now playing.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(remote.getPosition()+1);
		
		return true;
	}

	@Override
	public boolean pressPause() {
		System.out.println("The player is paused.");
		remote.setState(remote.getPausedState());
		return true;
	}

	@Override
	public boolean pressStop() {
		System.out.println("The player is stopped.");
		remote.setState(remote.getStoppedState());
		remote.setPosition(0);
		return true;
	}

	@Override
	public boolean pressRewind() {
		System.out.println("The player is already Rewind.");
		return false;
	}

}
