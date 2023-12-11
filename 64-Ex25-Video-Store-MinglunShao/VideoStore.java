public class VideoStore {
    public static void run() {
        Video item1 = new Video("Jaws", 120, 600);
        Video item2 = new Video("Star Wars", 12324);

        System.out.println(item1.toString());
        System.out.println(item2.toString());

        // After creating movie class
        Movie item3 = new Movie("Interstellar", 120, "Christopher Nolan", "E", 1200);
        System.out.println(item3);

        // After creating music video class
        MusicVideo item4 = new MusicVideo("Thriller", 14, "Michael Jackson", "Pop", 1800);
        System.out.println(item4);

    }
}
