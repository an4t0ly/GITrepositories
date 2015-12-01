package layout;

public enum TypeOfGoods {
	Weight, Quantity;
	
	private TypeOfGoods tg;
	
	public TypeOfGoods getFieldTG(){
		return tg;
	}
	
	static {
		// do something
		System.out.println("static block enum TG");
	}
	
	public void doSomething(){
		System.out.println("enum OLOLOLO");
	}
}
