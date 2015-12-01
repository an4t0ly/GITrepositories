package command;

public class CommandXmpl {
	public static void main(String[] args) {
		User u = new User(new StartMachine(), new ResetMachine(), new StopMachine());
		u.startMachine();
		u.resetMachine();
		u.stopMachine();
		User u2 = new User(null, null, new TestMachine());
		u2.stopMachine();
//		u2.startMachine();
		// MUST be write ALL methods!!!
	}	
}
// MAIN execution interface !!!
interface Command{ void execute();}
// Receiver
class Machine{
	void start(){ System.out.println("Start Machine");}
	void reset(){ System.out.println("Reset Machine");}
	void stop(){ System.out.println("Power Off Machine");}
}
//Invoker
class User{
	private Command start;
	private Command reset;
	private Command stop;
	// Constructor
	// INSTANTIATION for ALL fields of the CLASS !!!
	public User(Command start, Command reset, Command stop){
		this.start = start;
		this.reset = reset;
		this.stop = stop;
	}
	// drivers
	void startMachine(){ start.execute();}
	void resetMachine(){ reset.execute();}
	void stopMachine(){ stop.execute();}
}

// Concrete Commands
class StartMachine extends InitMachine implements Command{
	public void execute(){ init().start();}
}

class ResetMachine extends InitMachine implements Command{
	public void execute(){ init().reset();}
}

class StopMachine extends InitMachine implements Command{
	public void execute(){ init().stop();}
}

abstract class InitMachine{
	public Machine init(){ return new Machine();}
}


//test class
class TestMachine extends InitMachine implements Command{
	public void execute(){ init().stop();}
}