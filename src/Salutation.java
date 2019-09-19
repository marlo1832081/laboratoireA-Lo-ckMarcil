import java.util.Scanner;

public class Salutation {

    public static void main(String[] args) {

        // Variable
        Scanner scan = new Scanner(System.in);
        String nom = "Loïck";

        //Demande le nom
        System.out.println("Quel est ton nom ?");
        nom = scan.next();

        //Réponse
        System.out.println("Bonjour " +nom);

      scan.close();

    }
}
