class Ex15_ShipMain {

    public static void run() {

        Ex15_Ship ship1 = new Ex15_Ship("Millenium Falcon", true, "Lando", 1500);
        Ex15_Ship ship2 = new Ex15_Ship("Titanic", false, "White Starline", 0);
        Ex15_Ship ship3 = new Ex15_Ship("Falcon Heavy", false, "Elon", 0);
        System.out.println(ship1);
        System.out.println(ship2);
        System.out.println(ship3);
        ship1.setCaptain("Han Solo");
        ship2.setCaptain("Edward Smith");
        ship1.setCaptainsMom("Jaina");
        ship3.setLifespan(100);
        System.out.println(ship1);
        System.out.println(ship2);
        System.out.println(ship3);

        System.out.println("the captain's mom on ship 1 is " + ship1.getCaptainsMom());
        System.out.println("Before the accident the lifespan of ship 3 was " + ship3.getLifespan());
        ship3.shortenLifespan(13);
        System.out.println("After the accident the lifespan of ship 3 was " + ship3.getLifespan());

    }// run

}// end class
