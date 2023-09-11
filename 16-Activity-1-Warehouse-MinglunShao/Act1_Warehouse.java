class Act1_Warehouse {
    public static void run(){
        //init variables
        String productType;
        double cost;
        String brandName;
        int numberInShipment;
        double totalValue;
        double value = 1;
        
        final String ONSALE = "Javascript"; 
        boolean anotherProduct = true;

        //print title
		System.out.println();
		Library.colourText("Minglun's Programming Language Monopoly: Pay for Programming", Library.RED_UNDERLINED);
        Library.colourText("Inventory Tracking System", Library.BLACK_BOLD);
        System.out.println();
        //print This month's sale
        Library.colourText("This month's sale: " + ONSALE, Library.BLUE);

        //loop while user wants to enter another product
        while (anotherProduct){
            //ask user what they reveived
    		System.out.println();
            Library.colourText("Please enter the type of product received", Library.GREEN);
    		productType = Library.input.nextLine();

            //check if product is on sale
            if (productType.equals(ONSALE)){
                Library.colourText("This product is on sale.", Library.YELLOW);
            }

            //ask user for price per unit
            System.out.println();
            Library.colourText("Please enter the cost to us for each ______", Library.GREEN);
    		cost = Library.input.nextDouble();

            //markup the value of product based on price
            if (cost < 50){
                value = cost*2;
            } else if (cost >= 50){
                value = cost*1.5;
            }

            //ask user for brand of product
            Library.input.nextLine();
            System.out.println();
            Library.colourText("Please enter the brand name of product", Library.GREEN);
    		brandName = Library.input.nextLine();
            System.out.println();
            //ask user for # of product shipped
            Library.colourText("Please enter the number of product in shipment", Library.GREEN);
    		numberInShipment = Library.input.nextInt();
            Library.input.nextLine();

            //check if there is a Back order warning | if there is too little product
            if (numberInShipment > 5 && numberInShipment < 10){
                System.out.println("Back order warning - Watch inventory level carefully");
            } else if (numberInShipment <= 5){
                System.out.println("Back order warning - Order from different supplier.");
            }

            //calculate the total value of the shipment
            totalValue = value * Double.valueOf(numberInShipment);
            
            //print a summary of the shipment
            System.out.println();
            System.out.println();
            Library.colourText("Shipment Container Summary:", Library.GREEN_BOLD);
            System.out.println("The new product is " + productType);
            System.out.println("This shipment included " + String.valueOf(numberInShipment) + " from " + brandName);
            System.out.println("The value of this container is $" + String.format("%.2f", totalValue));
            System.out.println("Each " + productType + " should be priced at $" + String.format("%.2f", value));

            //ask the user if they want to continue :D
            System.out.println();
            Library.colourText("Would you like to enter another product(true or false)?", Library.BLUE);
            anotherProduct = Library.input.nextBoolean();
            Library.input.nextLine();
        }


    }//end run

}//end class


