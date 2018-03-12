# java-calculates-sales-data

Java console application that calculates sales data.  Prompt for and read the following information from a salesman:
	● Appliance name (Appliance) – the product to be sold.  Use an enumerated type with the following six values: washer, dryer, refrigerator, microwave, toaster, stove.  Use a validation loop to insure that the appliance name is valid.  Hint: use a do-while loop enclosing a try-catch block.
	● Wholesale price (double) – the price Big Shrek’s paid for the appliance.  Use a validation loop to insure that the price is at least zero.
	● Retail price (double) – the price Big Shrek’s is selling the appliance for.  Use a validation loop to insure that the price is at least the wholesale price.

Format the following output in two columns with the first column containing a label and the second column containing the result.  Format any dollar values to two decimal places.
	● The three inputs.
	● The profit Big Shrek’s will earn selling the appliance (Retail – Wholesale).
	● The 2% commission the Big Shrek’s salesman will earn selling the appliance (Profit * 0.02).
	● The 6% Michigan sales tax on the appliance (Retail * 0.06).
	● The total cost to the customer (Retail + SalesTax).
