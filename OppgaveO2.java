import java.util.Scanner;

public class Oppgave O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      
        for (int student = 1; student <= 10; student++) {
            System.out.print("Poengsum for student " + student + ": ");
            int poeng = in.nextInt();

           
            while (poeng < 0 || poeng > 100) {
                System.out.println("Feil! Poengsummen må være mellom 0 og 100.");
                System.out.print("Skriv inn poengsummen på nytt: ");
                poeng = in.nextInt();
            }

            char karakter;

            if (poeng >= 90) {
                karakter = 'A';
            } else if (poeng >= 80) {
                karakter = 'B';
            } else if (poeng >= 60) {
                karakter = 'C';
            } else if (poeng >= 50) {
                karakter = 'D';
            } else if (poeng >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }

            System.out.println("Karakter: " + karakter);
        }

        in.close();
    }
}
