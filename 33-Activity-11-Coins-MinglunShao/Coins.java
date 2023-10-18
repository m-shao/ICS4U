class Coins {
	private double radius;
    private String coinName;
    private double value;
    private double weight;

    public Coins(double radius, String coinName, double value, double weight){
        this.radius = radius;
        this.coinName = coinName;
        this.value = value;
        this.weight = weight;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setCoinName(String coinName){
        this.coinName = coinName;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getRadius(){
        return radius;
    }

    public String getCoinName(){
        return coinName;
    }

    public double getValue(){
        return value;
    }

    public void deflate(double percentage){
        value = value * (100 - percentage) * 0.01;
        if (value < weight){
            value = weight;
        }
    }

    public void printCircumference(){
        double circumference = 2*radius*Math.PI;
        System.out.printf("A %s’s circumference is %.2f millimetres\n", coinName, circumference);
    } 

    public void printArea(){
        double area = radius*radius*Math.PI;
        System.out.printf("The surface area of one side of a %s is %.2f millimetres squared\n", coinName, area);
    }

    public void printValue(){
        System.out.printf("A %s has a value of %s cents\n", coinName, value);
    }


}//end class