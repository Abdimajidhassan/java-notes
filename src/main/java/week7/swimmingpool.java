package week7;

public class swimmingpool {
    public static void main(String[] args) {
        pool ymca = new pool("ymca", 50);

        double totalswam = ymca.distanceforlaps(6);
        System.out.println("The total distance is " + totalswam + "meters");
        System.out.println(ymca);

        System.out.println();

        pool como = new pool("como", 25);
        System.out.println(como.distanceforlaps(10));
        System.out.println(como);

        System.out.println();

        pool edina = new pool("Edina", 50);
        double totalDistance = edina.distanceforlaps(12);
        System.out.println(totalDistance);
        System.out.println(edina);

    }
}
