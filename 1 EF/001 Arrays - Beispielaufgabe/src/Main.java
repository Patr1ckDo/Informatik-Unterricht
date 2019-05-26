import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        System.out.println("Liste: " + Arrays.toString(Liste.liste));
        System.out.println("Minimum: " + Liste.minimum());
        System.out.println("Mittelwert : " + Liste.mittelwert());
        Liste.quadrath();
        System.out.println("Quadrierte Liste: " + Arrays.toString(Liste.liste));
    }

}
