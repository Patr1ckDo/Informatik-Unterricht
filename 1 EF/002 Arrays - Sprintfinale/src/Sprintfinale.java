public class Sprintfinale {


    public static final double[] zeiten = {0, 9.98, 11.99, 9.8, 9.75, 9.79, 9.63, 9.88, 9.94};


    public static double schnellsteZeit() {
        double schnellsteZeit = 0;
        for (double listenelement : zeiten) {
            if (schnellsteZeit == 0 && listenelement != 0 || schnellsteZeit != 0 && listenelement < schnellsteZeit) {
                schnellsteZeit = listenelement;
            }
        }
        return schnellsteZeit;
    }


    public static void ausgabe() {
        for (int i = 0; i < zeiten.length; i++) {
            if (zeiten[i] != 0) {
                System.out.println("Bahn " + (i + 1) + ": " + zeiten[i] + " s");
            }
        }
    }

}
