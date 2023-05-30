public class Main {

    public static void main(String[] args) {
        BoatClass FandangoYacht = new BoatClass();
        FandangoYacht.color = "BLUE";
        FandangoYacht.speed = "2km per hour";
        FandangoYacht.price = "15 million";

        System.out.println("Color: " + FandangoYacht.color + "\n" + "Speed: " + FandangoYacht.speed + "\n" + "Price: " + FandangoYacht.price);
        FandangoYacht.MainSailColor();
        FandangoYacht.brand();
        FandangoYacht.drive();
        FandangoYacht.stop();
    }
}