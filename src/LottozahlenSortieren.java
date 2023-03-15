import java.lang.Math;
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
                    System.out.println(lottozahlen[z]);
                    whileZaehler++;
                }
            }
        }

    }
}
