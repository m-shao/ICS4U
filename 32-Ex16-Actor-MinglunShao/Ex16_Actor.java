public class Ex16_Actor{
	//instance variables
	public String name;
	private String role;
	private double sales;
	private boolean isPro;

	//constructor
	public Ex16_Actor(String name, boolean pro){
		this.name = name; 
		role = "unassigned";
		sales = 0;
		isPro = pro;

	}


	//instance methods
	public String toString(){
		return name+"  Role: " + role+"   $" + sales+ "  Professional: " + isPro;

	}

//Settters
	public void setRole(String role){
		this.role = role;
	}

	// public void addSales (double sale){
	// 	sales += sale;
	// }
//getter
	public double getSales(){
	  return sales;
	}

	public void sellTix (int numTix){
		sales += (numTix*15);
	}

	public double pay(){
		double total = 500; // Base pay
		if(isPro){
			total += 200; //Professional bonus
		}

		total += (sales*0.33); //33% commission

		System.out.println(name + " was paid through etransfer: $" +total);
		return total;
	}



}//actor class