public class Tree {
    private double x;
    private double y;
    private double z;
    private Cone branches;
    private Cylinder trunk;

    // constructor
    public Tree(double trRad, double trHeight, double brRad, double brHeight, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        trunk = new Cylinder(trRad, trHeight);
        branches = new Cone(brRad, brHeight);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Cone getBranches() {
        return branches;
    }

    public Cylinder getTrunk() {
        return trunk;
    }

    public double area() {
        double trunkFace = trunk.getRadius() * trunk.getRadius() * Math.PI;
        double totalArea = trunk.area() + branches.area() - trunkFace * 2;

        return totalArea;
    }

    public double volume() {
        double totalVolume = trunk.volume() + branches.volume();

        return totalVolume;
    }

    public void grow(double rate) {
        // increase all dimensions by rate
        branches.setHeight(branches.getHeight() * (1.0 + rate));
        branches.setRadius(branches.getRadius() * (1.0 + rate));

        trunk.setHeight(trunk.getHeight() * (1.0 + rate));
        trunk.setRadius(trunk.getRadius() * (1.0 + rate));
    }

    @Override
    public String toString() {
        double totalHeight = branches.getHeight() + trunk.getHeight();
        double width = branches.getRadius() * 2.0;
        double area = area();
        double volume = volume();

        return "Height: " + totalHeight + " Width: " + width + " Area: " + area + " Volume: " + volume;
    }
}