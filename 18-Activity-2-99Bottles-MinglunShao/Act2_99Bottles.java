class Act2_99Bottles{

    static void bottleSong(String choice, String name){
        for(int i=99;i>=1;i--){
            System.out.println(String.format("%d bottle%s of %s on the wall", i, 
                (i == 1)?(""):("s"), choice));
        	System.out.println(String.format("%d bottle%s of %s", i, 
                (i == 1)?(""):("s"), choice));
            if (name != ""){
                System.out.println("If " + name + " should drink one of those bottles of pop…");
            } else{
                System.out.println("If one of those bottles should happen to fall,");
            }
            System.out.println(String.format("%d bottle%s of %s on the wall", i - 1, 
                (i -1 == 1)?(""):("s"), choice));
        }
    }
    
	public static void run(){
		// In this activity, you will print the lyrics to 99 Bottles of Pop/Beer On The Wall. 
		// You will use a for loop to print the numbers in each verse.  
		// Use google to find the lyrics if needed.

        int age;
        String choice;
        String[] friends = {"John1", "John2", "John3", "John4", "John5"};
        String[] favPops = {"Crush", "Coke", "Sprite", "Pepsi", "Fanta"};

        for (int i=0;i<5;i++){
            System.out.println(Library.RED + friends[i] 
                + "’s favourite pop is Orange Crush" +
                Library.RESET);
            bottleSong(favPops[i], friends[i]);
        }

        
        System.out.println("How old are you?:");
        age = Library.input.nextInt();
        Library.input.nextLine();
        
        if (age >= 18){
            System.out.println("What is your preffered drink(Pop or Beer)");
            choice = Library.input.nextLine();
        } else if (age >= 10){
            System.out.println("What is your preffered Pop?:");
            choice = Library.input.nextLine();
        } else {
            choice = "Milk";
        }
        bottleSong(choice, "");

	}//end run
	
}//end class