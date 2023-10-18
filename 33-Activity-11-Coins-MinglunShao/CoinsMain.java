class CoinsMain {

    public static void run() {
        Coins nCoin = new Coins(10.6, "nickel", 5, 3.95);
        Coins dCoin = new Coins(9.015, "dime", 10, 1.75);
        Coins qCoin = new Coins(11.94, "quarter", 25, 4.4);
        Coins lCoin = new Coins(13.25, "loonie", 100, 6.27);
        Coins tCoin = new Coins(14, "toonie", 200, 6.92);

        Coins[] coins = {nCoin, dCoin, qCoin, lCoin, tCoin};

        for (Coins coin : coins){
            coin.printArea();
            coin.printCircumference();
            coin.printValue();
            System.out.println("OH NO, the value of money has deflated 25%");
            coin.deflate(25);
            coin.printValue();
            System.out.println("OH NO, the value of money has deflated 50%");
            coin.deflate(50);
            coin.printValue();
            System.out.println("\n-----------------------------------------\n");
        }
        
        

    }// end run

}// end class