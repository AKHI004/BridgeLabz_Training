package ProgrammingElements.Level1;

public class Ques_7 {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + String.format("%.2f", volumeKm3));
        System.out.println("The volume of Earth in cubic miles is " + String.format("%.2f", volumeMiles3));
    }
}
