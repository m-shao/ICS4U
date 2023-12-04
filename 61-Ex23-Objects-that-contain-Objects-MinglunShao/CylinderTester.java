public class CylinderTester {
    public static void run() {
        System.out.println("\n------------Cylinder Tester------------\n");

        Cylinder cylinder = new Cylinder(1.2, 4.56);

        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        cylinder.setHeight(123);
        cylinder.setRadius(12);

        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());

    }
}