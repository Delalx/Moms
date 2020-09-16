import java.util.Scanner;

public class Moms {

    public static void main(String[] args) {
        plusMoms();

    }

    public static void plusMoms() {
        Scanner in = new Scanner(System.in);
        System.out.println("Indtast købsbeløbet:");
        double købsbeløbet = in.nextDouble();

        double moms = købsbeløbet * 0.25; //Dansk moms er 25%
        System.out.println("Momsen er " + (int) (moms * 100) / 100.0);
    }

}