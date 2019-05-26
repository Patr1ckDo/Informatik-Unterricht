public class Liste {


    public static int[] liste = {5, 8, 1, 4, 2, 12, 9, 5, 3, 1};


    public static int minimum() {
        int minimum = liste[0];
        for (int listenelement : liste) {
            if (listenelement < minimum) {
                minimum = listenelement;
            }
        }
        return minimum;
    }


    public static float mittelwert() {

        int summe = 0;
        for (int listenelement : liste) {
            summe += listenelement;
        }
        return (float) summe / liste.length;
    }


    public static void quadrath() {
        for (int i = 0; i < liste.length; i++) {
            liste[i] = (int) Math.pow(liste[i], 2);
        }
    }

}
