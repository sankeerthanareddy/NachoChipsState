
public class NachoChips {
	
	
	State ontheshelf;
	State addinstock;
	State soldout;
	
	State state;
	int numberofpackets=0;
	
	public NachoChips(int numberofpackets)
	{
		ontheshelf = new OnTheShelf(this);
		addinstock = new AddInStock(this);
		soldout = new SoldOut(this);
		
		this.numberofpackets = numberofpackets;
		if(this.numberofpackets > 0)
		{
			state=ontheshelf;
		}
		else
		{
			state=addinstock;
		}
	}
	
	public void ontheShelf()
	{
		state.ontheShelf();
	}
	public void soldOut()
	{
		state.soldOut();
	}
	
	public void nachoSold()
	{
		System.out.println("A Counter top is released from stock");
		if(numberofpackets>0)
		{
			numberofpackets = numberofpackets - 1;
		}
	}
	
	public int getNumberofPackets()
	{
		return numberofpackets;
	}
	
	public void addInStock(int adpackets)
	{
		this.numberofpackets += adpackets;
		System.out.println(adpackets +" more packets are placed on shelf");
		state.addInStock();
	}
	
	
	void setState(State state) 
	{
		this.state = state;
	}
	public State getState() 
	{
        return state;
    }

    public State getOntheShelf() 
    {
        return ontheshelf;
    }

    public State getSoldOut() 
    {
        return soldout;
    }
    public State getAddInStock() 
    {
        return addinstock;
    }
    
    
    public String toString() 
    {
		StringBuffer result = new StringBuffer();
		result.append("\n========== NachoChips Store =============");
		
		result.append("\nTotal number of packets ==> " + numberofpackets + " of NachoChips on Shelf");
		
		result.append("\n");
		result.append("NachoChips are in ==> " + state + "\n");
		return result.toString();
	}
	

}


