import java.util.Scanner;

public class OppgaveO1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn brutto årsinntekt i kroner: ");
        double inntekt = in.nextDouble();

        double skatt = 0;

        if (inntekt < 0) {
            System.out.println("Inntekten kan ikke være negativ.");
        } else {
            // Trinn 5: 17,8 %
            if (inntekt > 1467200) {
                skatt += (inntekt - 1467200) * 0.178;
                inntekt = 1467200;
            }

            // Trinn 4: 16,8 %
            if (inntekt > 980100) {
                skatt += (inntekt - 980100) * 0.168;
                inntekt = 980100;
            }

            // Trinn 3: 13,7 %
            if (inntekt > 725050) {
                skatt += (inntekt - 725050) * 0.137;
                inntekt = 725050;
            }

            // Trinn 2: 4 %
            if (inntekt > 318300) {
                skatt += (inntekt - 318300) * 0.04;
                inntekt = 318300;
            }

            // Trinn 1: 1,7 %
            if (inntekt > 226100) {
                skatt += (inntekt - 226100) * 0.017;
            }

            System.out.printf("Trinnskatten blir %.2f kr.%n", skatt);
        }

        in.close();
    }
}
