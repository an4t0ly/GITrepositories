package layout;

public class Layer {
	private static TypeOfGoods[] ts;

	public static void main(String[] args) {
//		ts = null;
		ts[0] = TypeOfGoods.Quantity;
		ts[1] = TypeOfGoods.Weight;
		System.out.println(ts[0].ordinal());
		System.out.println(ts[1].ordinal());
		
	}
}
