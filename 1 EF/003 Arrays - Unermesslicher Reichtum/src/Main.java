public class Main {


    static boolean[] tueren = new boolean[100];     // true: auf   false: zu


    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            for (int j = i - 1; j < 100; j += i) {
                tueren[j] = !tueren[j];
            }
        }

        System.out.print("Offene Tueren:");
        for (int i = 0; i < 100; i++) {
            if (tueren[i]) {
                System.out.print(" " + (++i));
            }
        }
    }

}
