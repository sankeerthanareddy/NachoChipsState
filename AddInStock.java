
public class AddInStock implements State {
	
NachoChips nacho;
	
	public AddInStock(NachoChips nacho)
	{
		this.nacho = nacho;
		
	}
	
	public void ontheShelf()
	{
		System.out.println("Nacho Chips Shelf is not full it is about to end");
	}
	public void soldOut()
	{
		System.out.println("Almost Sold out");
	}
	public void addInStock()
	{
		System.out.println("Nacho Chips are adding ...");
		nacho.getAddInStock();
	}
	
	public String toString() 
	{
		return "Placing more packets on shelf ";
	}

}
