package epamcleancode.houseconstruction;

public class Clienthouse {
	public void housePrice(char st_materials,int sqft,char fully_automated_or_not)
	{
		float result=1;
	    char materials=st_materials;
		int square_feet=sqft;
		char automation=fully_automated_or_not;
		if(materials=='s')
		{
			if(automation=='n')
			{
			result=1200*square_feet;
			}
		}
		else if(materials=='a')
		{
			if(automation=='n')
			{
			result=1500*square_feet;
			}
		}
		else if(materials=='h')
		{
			if(automation=='n')
			{
			result=1800*square_feet;
			}
			else if(automation=='y')
			{
				result=2500*square_feet;
			}
		}
		System.err.print("\nTHE PRICE FOR CONSTRUCTING THE HOUES WITH THE MENTIONED SPECIFICATIONS IS:"+result);
	}
}
