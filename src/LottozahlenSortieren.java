import java.lang.Math;
import java.util.Arrays;
public class LottozahlenSortieren {
    public static void main(String [] args) {
        int[] lottozahlen = new int[6];
        int zufallsZahlen;
        int whileZaehler = 0;
        boolean exit = false;

        while (whileZaehler < lottozahlen.length) {

            for (int z = 0; z < 6; z++) {
                zufallsZahlen = 1 + (int)(Math.random() * 49);
                  // System.out.println("zufallsZahlen: " + zufallsZahlen);
                lottozahlen[z] = zufallsZahlen;
                boolean schonImArray = false;

                 for (int y = 0; y < z; y++) {
                    if (lottozahlen[y] == lottozahlen[z]) {
                        schonImArray = true;
                    }
                }
                if (schonImArray) {
                    z--;
                } else {
                    /*
                    Zufällige Lottozahlen nach For loop ausgeben
                    System.out.println(lottozahlen[z]);
                     */
                    whileZaehler++;
                }
            }
        }
        sortieren(lottozahlen);

    }
    public static void sortieren (int lottozahlen[]) {
        /*
        // Mit Arrays Sort → aufsteigend sortiert

        System.out.println("\nBefor Sorting...");
        for (int i : lottozahlen) {
            System.out.print(i + " ");
        }
        Arrays.sort(lottozahlen);
        System.out.println("\nAfther Sorting...");
        for (int j : lottozahlen) {
            System.out.print(j + " ");
        }
        */

        // mit eigenem Code → aufsteigend sortiert
        System.out.println("\nBefor Sorting...");
        for (int i : lottozahlen) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < lottozahlen.length; i++) {
            for (int j = 0; j < lottozahlen.length; j++) {
                if (lottozahlen[i] < lottozahlen[j]) {
                    int temp = lottozahlen[i];
                    lottozahlen[i] = lottozahlen[j];
                    lottozahlen[j] = temp;
                }
            }
        }
        System.out.println("\nAfther Sorting...");
        for (int j : lottozahlen) {
            System.out.print(j + " ");
        }

        ausgeben(lottozahlen);
    }
    public static void ausgeben (int lottozahlen[]) {
    }
}
