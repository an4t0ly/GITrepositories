package adapter;

public class NewAdapterXmpl {
	public static void main(String[] args) {
		Worker w = new ManageAdapterInherit();
		w.call();
		w.write();
		
		Worker c = new ManageAdapterComposite();
		c.call();
		c.write();
	}
}

interface Worker{ void call(); void write();}

class ManageAdapterInherit extends Manager implements Worker{
	public void call(){ callToDirector();}
	public void write(){ writeToDirector();}
}

class ManageAdapterComposite implements Worker{
	public void call(){ new Manager().callToDirector();}
	public void write(){ new Manager().writeToDirector();}
}

class Manager{
	void callToDirector(){ System.out.println("Call to Somebody");}
	void writeToDirector(){ System.out.println("Write to Somebody");}
}