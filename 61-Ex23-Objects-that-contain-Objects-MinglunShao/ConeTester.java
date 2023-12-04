public class ConeTester{
	public static void run(){
        System.out.println("\n------------Cone Tester------------\n");
		Cone cone = new Cone(1.2, 4.56);
		System.out.println("Cone Area: " + cone.area());
		System.out.println("Cone Volume: " + cone.volume());
		System.out.println("Cone Radius: " + cone.getRadius() );
		System.out.println("Cone Height: " + cone.getHeight() );

cone.setHeight(6.5);

		System.out.println("Cone Height after setter: " + cone.getHeight() );

cone.setRadius(-3.2);
		System.out.println("Cone Radius after setter: " + cone.getRadius() );
		
	}
}