package week3;

import java.util.Arrays;

public class corporateSponsors {
    public static void main(String[] args) {
        String[] sponsers = { "ikea", "at&t", "cvs", "3m"};
        for (int i= 0; i < sponsers.length; i++) {
            //System.out.println(sponsers[i]);
            //String sponsor = sponsers[i];
            //sponsor=sponsor.toUpperCase();
            //sponsers[i] = sponsor;
            sponsers[i] = sponsers[i].toUpperCase();
        }
        System.out.println(Arrays.toString(sponsers));
    }
}
