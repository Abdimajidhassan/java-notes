package week2;

public class oilchange {
    public static void main(String[] args) {
        int millage = 150000;
        int interval = 3000;

        for(int oilchange = 0 ; oilchange < 8; oilchange++) {
            millage = millage + interval;
            System.out.println("get oil change " + millage + " miles");
        }
    }
}
