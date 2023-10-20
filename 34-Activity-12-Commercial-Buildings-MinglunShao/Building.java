class Building {
    private String tenant;
    private int squareFeet;
    private String location;
    private double thisYearsTotalRent;

    public Building(String tenant, int squareFeet, String location){
        this.tenant = tenant;
        this.squareFeet = squareFeet;
        this.location = location;
        thisYearsTotalRent = 0;
    } 

    public String toString(){
        return String.format("The building is in a %s area, is %s square feet, and is owned by %s and the total rent is %s\n", location, squareFeet, tenant, thisYearsTotalRent);
    }

    public void setTenant ( String newT ){
        tenant = newT;
    }

    public void chargeRent() {
        double thisMonthsRent = 0; 
        if (location.equalsIgnoreCase("rural")){
            thisMonthsRent = 0.1*squareFeet;
        } else if (location.equalsIgnoreCase("industrial")){
            thisMonthsRent = 0.15*squareFeet;
        } else{
            thisMonthsRent = 0.25*squareFeet;
        }
        System.out.printf("%s owes $%s in rent this month\n", tenant, thisMonthsRent);
        thisYearsTotalRent += thisMonthsRent;
    }

    public double getThisYearsTotalRent(){
        return thisYearsTotalRent;
    }


}