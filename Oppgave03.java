import java.util.Scanner;
import java.math.BigInteger;

public class OppgaveO3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn et heltall større enn 0: ");
        int n = in.nextInt();

        while (n <= 0) {
            System.out.print("Ugyldig tall. Skriv inn et heltall større enn 0: ");
            n = in.nextInt();
        }

        BigInteger fakultet = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fakultet = fakultet.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + fakultet);

        in.close();
    }
}
