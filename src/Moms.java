import java.util.Scanner;

public class Moms {

    public static void main(String[] args) {
        plusDanskmoms();
        plusTyskMoms();

    }

    public static void plusDanskmoms() {
        Scanner in = new Scanner(System.in);
        System.out.println("Indtast købsbeløbet:");
        double købsbeløbet = in.nextDouble();

        double moms = købsbeløbet * 0.25; //Dansk moms er 25%
        System.out.println("Momsen er " + (int) (moms * 100) / 100.0);
    }
    public static void plusTyskMoms() {
        Scanner in = new Scanner(System.in);

        System.out.println("Indtast købsbeløbet:");
        double købsbeløbet = in.nextDouble();

        double Tyskmoms = købsbeløbet * 0.16; //Tysk moms er 16%
        System.out.println("Momsen er " + (int) (Tyskmoms * 100) / 100.0);

    }
}