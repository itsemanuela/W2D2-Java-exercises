package entities;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EsercizioUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // controllo perchè voglio avere solo numeri e non stringhe al primo giro di domande
        int num1 = 0;
        boolean valoreValido = false;

        while (!valoreValido) {
            try {
                System.out.println("Devi inserire un numero");
                num1 = input.nextInt();
                valoreValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Errore, non hai inserito un numero");
            } finally {
                input.nextLine();
            }
        }

        // creo i due set
        Set<String> paroleDiverse = new HashSet<>();
        Set<String> paroleUguali = new HashSet<>();
        System.out.println("Inserisci" + " " + num1 + " " + "parole:");

        for (int i = 0; i < num1; i++) {
            boolean parolaValida = false;
            String parole = "";

            // Questo ciclo si ripete finché l'utente inserisce numeri o caratteri non validi
            while (!parolaValida) {
                System.out.print("Parola " + (i + 1) + ": ");
                parole = input.nextLine();

                // CONTROLLO: Se la stringa contiene SOLO lettere (dalla a alla z, maiuscole o minuscole)
                if (parole.isEmpty()) {
                    System.out.println("Errore: devi inserire una stringa e basta (niente numeri o simboli)!");
                } else {
                    boolean soloLettere = true;

                    // Esamino la parola carttere x carattere
                    for (int j = 0; j < parole.length(); j++) {
                        char c = parole.charAt(j);
                        if (!Character.isLetter(c)) {
                            soloLettere = false;
                            break;
                        }
                    }
                    //ho visto metodo regex .matches("[a-zA-Z]+") = fa stessa cosa di char
                    if (soloLettere) {
                        parolaValida = true;
                    } else {
                        System.out.println("Errore: devi inserire una stringa e basta (niente numeri o simboli)!");
                    }
                }
            }

            // ora controllo con if le parole diverse
            if (!paroleDiverse.add(parole)) {
                paroleUguali.add(parole);
            }
        }

        // stampo i risultati
        System.out.println("Risultati");
        System.out.println("Uguali: " + paroleUguali);
        System.out.println("Diverse: " + paroleDiverse);
        System.out.println("Numero di parole diverse" + " " + paroleDiverse.size());
        System.out.println("Numero di parole uguali" + " " + paroleUguali.size());

        input.close();
    }
}