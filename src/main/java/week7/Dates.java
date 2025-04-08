package week7;


import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        //number of millsec midnight jan 1,1970,UTC
        System.out.println(now.getTime());
        long millseconds = now.getTime();
        System.out.println(millseconds);

        Date dateFromTime = new Date(millseconds);

        long numberofMilliseconds = 12345678765L;
        Date date = new Date(numberofMilliseconds);
        System.out.println(date);

        if (date.before(now)) {
            System.out.println("2009 is earlier than now");
        }

    }
}
