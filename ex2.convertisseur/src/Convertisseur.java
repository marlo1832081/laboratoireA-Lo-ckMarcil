import java.util.Scanner;

public class Convertisseur {

    public static void main(String[] args) {

        //Variables
        Scanner scan = new Scanner(System.in);
        float radian;
        int degre;

        //Demande
        System.out.println("Quel l'angle en radian ?");
        radian = scan.nextFloat();

        //Convertion
        degre = (int) (radian*(180 / Math.PI));

        //Réponse
        System.out.println(" Valeur en degre : " +degre);

        scan.close();
    }
}
