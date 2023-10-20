import java.util.ArrayList;

class BuildingMain {
    public static void run(){
        ArrayList<Building> buildings = new ArrayList();
        buildings.add(new Building("Common People Shop", 100, "Rural"));
        buildings.add(new Building("PepsiCo", 10000, "Industrial"));
        buildings.add(new Building("The Green Jar", 3000, "Rural"));
        buildings.add(new Building("Uniflo Inc.", 3000, "Downtown"));
        buildings.add(new Building("Cibc Square", 3500, "Downtown"));
        buildings.add(new Building("Tangerine Bank", 2500, "Downtown"));
        
        System.out.println("Rental Summary - January 1st");
        for (Building building : buildings){
            System.out.println(building);
        }

        System.out.println("\n--------------------------------\n");
        
        for (Building building : buildings){
            building.chargeRent();
        }

        System.out.println("\n--------------------------------\n");
        
        System.out.println("Rental Summary - February 1st");
        for (Building building : buildings){
            System.out.println(building);
        }

        buildings.get(1).setTenant("Coup Industries 3000");

        System.out.println("\n--------------------------------\n");

        for (Building building : buildings){
            building.chargeRent();
        }

        System.out.println("\n--------------------------------\n");

        System.out.println("Rental Summary - March 1st");
        for (Building building : buildings){
            System.out.println(building);
        }

        System.out.println("\n--------------------------------\n");

        System.out.println("This year's total rent for all buildings");
        double totalRent = 0;
        for (Building building : buildings){
            totalRent += building.getThisYearsTotalRent();
        }
        System.out.println(totalRent);
    }
}