
public class MultipleRemote {
	
	Command[] slot = new Command[2];

	public MultipleRemote() {}
	
	public void setCommand(Command command,int index) {
		slot[index] = command;
	}

	public void buttonPressed(int index) {
		this.slot[index].execute();
	}
}
