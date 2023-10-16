public class Ex15_Ship {

    // Instance Variables
    private String name;
    private boolean inSpace;
    private String owner;
    private String captain;
    private int age;
    private int lifespan;
    private String captainsMom;

    // Constructor method
    public Ex15_Ship(String n, boolean s, String o, int a) {
        name = n;
        inSpace = s;
        owner = o;
        captain = o;
        age = a;
    }

    // Instance Methods
    public void setCaptain(String n) {
        captain = n;
    }

    public void setCaptainsMom(String captainsMom){
        this.captainsMom = captainsMom;
    }

    public void setLifespan(int lifespan){
        this.lifespan = lifespan;
    }

    public String getCaptainsMom(){
        return captainsMom;
    }

    public int getLifespan(){
        return lifespan;
    }

    public void shortenLifespan(int shortenedLength){
        lifespan -= shortenedLength;
    }

    public void addYears(int years) {
        age += years;
    }

    public String toString() {
        if (inSpace) {
            return name + " (spaceship)  Owned by: " + owner + "  Captain:" + captain;
        } else {
            return name + "  Owned by: " + owner + "  Captain:" + captain;
        }
    }// toString
}// end ship class