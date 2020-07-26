package epamcleancode.houseconstruction;
import java.util.Scanner;
public class Mainhouse {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.err.print("Provide required inputs for house construction:\n1:materials standard\ns or a or h\ns-standard materials as-above standard h-high standard\n");
	char st_materials = s.next().charAt(0);
	System.err.print("Enter the squarefeet of house:\n");
	int sqft=s.nextInt();
	System.err.print("Enter whether fully automated house or not\ny-if yes n-if no\n");
	char fully_automated_or_not = s.next().charAt(0);
	Clienthouse c=new Clienthouse();
	c.housePrice(st_materials,sqft,fully_automated_or_not);
}
}
