
public class DemoState {

	public static void main(String[] args) 
	{
		NachoChips nacho = new NachoChips(30);
		
		System.out.println(nacho);
		nacho.ontheShelf();
		nacho.soldOut();
		
		System.out.println(nacho);
		nacho.ontheShelf();
		nacho.soldOut();
		nacho.addInStock(12);
		
		System.out.println(nacho);
		nacho.ontheShelf();
		nacho.soldOut();
		
		System.out.println(nacho);

	}

}
