/**********************************************************************************
 
//
// Title:      Calculate Sales Data
// Course:     CSC 3020
// Homework:   3-1
// Author:     Gayatari patel
// Date:       2 October 2016
// Description:
//   This Java application that analyzes the characters in a sentence 
//
//**********************************************************************************
 */
// package
package calculates_Sales_Data;

//scanner
import java.util.Scanner;


// class
public class calculates_Sales_Data{

      // enumerated variable
	enum product { washer, dryer, refrigerator, microwave, toaster, stove}
	//constants variable
	public static double tax;
	public static double totalprice;
	
	
	
	public static void main (String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in); 
		
		// variables 
		boolean error=true;  
		String proName;
		double wholeSale_Price;
		double Retail_price;
		System.out.println("\n Welcome To Calculate Sales Data");
		System.out.println("************************************\n");
		System.out.print("Enter Appliance name: ");
		proName=keyboard.nextLine();
		//do-while loop enclosing a try catch block
		do{
		try {
			 
			error=false;
			  
		}
		catch (IllegalArgumentException e)
		{
            System.out.println("Error: invalid Appliance Name.");
            System.out.print("Enter valid Appliance name: ");
            proName=keyboard.nextLine();
		}
		 
		}	
		while (error);
		
		// Information for Whole sale price
		System.out.print("\nEnter Wholesale price: $");
		wholeSale_Price=keyboard.nextDouble();
		while   (wholeSale_Price <0 ) 
		 {
			 System.out.print("price cannot be less then Zero, please! Enter valid price.\nagian! Enter Wholesale price: $  ");
			 wholeSale_Price=keyboard.nextDouble();
		 }
		 System.out.print("valid Price"); 
		 
		 
		 // retail price loop and information
		 System.out.print("\nEnter Retail price: $ ");
		 Retail_price=keyboard.nextDouble();
		while  (Retail_price<wholeSale_Price)
		 
		 {
			 System.out.print("sorry! Retail Price has to be at list the Wholesale price.\nPlease Enter Retail price Again: $  ");
			 Retail_price=keyboard.nextDouble();
		 }
		 System.out.print("you have enterd valid price.");
		 
		 // assigning variables to get correct out put
		double profit= Retail_price-wholeSale_Price;
		double commission=profit*0.02;
		 tax=Retail_price*0.06;
	     totalprice=Retail_price+tax;
	     // printing results
	     System.out.println();
		System.out.println("\n");
		System.out.printf("%-35s%18s\n", "Appliance Name:", proName);
		System.out.printf("%-35s%13s%2.2f\n", "Wholesale price:","$",  wholeSale_Price);
		System.out.printf("%-35s%13s%2.2f\n", "Retail price:","$", +Retail_price);
		System.out.printf("%-35s%13s%2.2f\n", "Profit:","$", +profit);
		System.out.printf("%-35s%13s%2.2f\n", "commission:","$", +commission);
		System.out.printf("%-35s%13s%2.2f\n", "sales tax:","$",+ tax);
		System.out.printf("%-35s%13s%2.2f\n", "Total Price:","$", totalprice);
		System.out.println("\n End Of Calculate Sales Data");
		System.out.println("************************************\n");
		// keyboard close
		keyboard.close();
	}
}