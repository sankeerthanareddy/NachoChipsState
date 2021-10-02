
public class SoldOut implements State{
	
NachoChips nacho;
	
	public SoldOut(NachoChips nacho)
	{
		this.nacho = nacho;
		
	}
	
	public void ontheShelf()
	{
		System.out.println("Nacho Chips are available on the shelf and they are selling");
	}
	public void soldOut()
	{
		System.out.println("Nacho Chips are ready to sale out");
		nacho.nachoSold();
	}
	public void addInStock()
	{
		System.out.println("Enough of stock Nacho Chips Stock is already there...");
	}
	
	public String toString() 
	{
		return "Nacho Chips are Selling ..";
	}

}
