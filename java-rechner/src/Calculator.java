import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Einfacher Rechner");
        System.out.println("Wählen Sie die Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
        System.out.println("5. Rest bei Division");
        
        int wahl = scanner.nextInt();
        System.out.println("Geben Sie die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        double ergebnis = 0;

        switch (wahl) {
            case 1:
                ergebnis = zahl1 + zahl2;
                break;
            case 2:
                ergebnis = zahl1 - zahl2;
                break;
            case 3:
                ergebnis = zahl1 * zahl2;
                break;
            case 4:
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Fehler: Division durch Null.");
                    return;
                }
                break;
            case 5:
                if (zahl2 != 0) {
                    ergebnis = zahl1 % zahl2;
                } else {
                    System.out.println("Fehler: Division durch Null.");
                    return;
                }
                break;
            default:
                System.out.println("Ungültige Auswahl.");
                return;
        }

        
        System.out.println("Ergebnis: " + ergebnis);
    }
}