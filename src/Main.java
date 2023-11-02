import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        fh.indlæsFil();
        System.out.println(fh.visData());

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Vil du sortere data efter alder eller region? a/r");
        char valg1 = keyboard.next().charAt(0);
        System.out.println("Vil du sortere i alm. eller omvendt rækkefølge? a/o");
        char valg2 = keyboard.next().charAt(0);

        if (valg1 == 'r' && valg2 == 'a') {
            Collections.sort(fh.getCovidList(), new RegionComparator().thenComparing(new AldersGruppeComparator()));
            System.out.println(fh.visData());
        }

        if (valg1 == 'r' && valg2 == 'o') {
            Collections.sort(fh.getCovidList(), new RegionComparator().reversed().thenComparing(new AldersGruppeComparator()));
            System.out.println(fh.visData());

        }

        if (valg1 == 'a' && valg2 == 'a') {

            Collections.sort(fh.getCovidList(), new AldersGruppeComparator().thenComparing(new RegionComparator()));
            System.out.println(fh.visData());

        }

        if (valg1 == 'a' && valg2 == 'o') {

            Collections.sort(fh.getCovidList(), new AldersGruppeComparator().reversed().thenComparing(new RegionComparator()));
            System.out.println(fh.visData());
        }
    }

}