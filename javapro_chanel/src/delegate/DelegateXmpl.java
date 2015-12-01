package delegate;

public class DelegateXmpl {
	public static void main(String[] args) {
		Worker w = new Worker();
		w.setReception(new Security());
		w.call();
		w.setReception(new Director());
		w.call();
	}
}

interface Reception { void call();}

class Director implements Reception {
	public void call(){ System.out.println("Call Director");}
}

class Security implements Reception {
	public void call(){ System.out.println("Call Security");}
}

class Worker {
	private Reception reception;
	void setReception(Reception r){ this.reception = r;}
	void call(){ reception.call();}
}