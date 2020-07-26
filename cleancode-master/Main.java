package epamcleancode;
import java.io.IOException;
import java.util.Scanner;
import epamcleancode.Interest.*;
public class Main {
  public static void main(String[] args)
  {
	  Scanner s =new Scanner(System.in);
	  System.err.print("SIMPLE INTEREST\n");
	  System.err.print("Enter principal amount,time in years,rate:\n");
	  int p=s.nextInt();
	  int t=s.nextInt();
	  int r=s.nextInt();
	  Interest simple_interest_object=new Interest();
	  simple_interest_object.simpleInterest(p,t,r);
	  System.err.print("\n--------------------------------------------------------------------------------------------\n");
	  System.err.print("COMPOUND INTEREST:\n");
	  System.err.print("Enter p -principal amount,n -where n is no of compounding periods in years,r -is rate\n");
	  int pr=s.nextInt();
	  int n=s.nextInt();
	  float ra=s.nextFloat();
	  Interest compound_interest_object=new Interest();
	  compound_interest_object.compoundInterest(pr,n,ra);
	  //int principal_amount=Integer.parseInt(args[0]);
  }
}
