
public class OnTheShelf implements State {
	
	NachoChips nacho;
	
	public OnTheShelf(NachoChips nacho)
	{
		this.nacho = nacho;
		
	}
	
	public void ontheShelf()
	{
		System.out.println("Nacho Chips are available on the shelf");
	}
	public void soldOut()
	{
		System.out.println("Nacho Chips are ready to sale out");
	}
	public void addInStock()
	{
		System.out.println("Nacho Chips Stock is already there...");
	}
	
	public String toString() 
	{
		return "Nacho Chips are available on the Shelf ";
	}

}
