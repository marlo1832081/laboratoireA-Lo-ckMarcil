import java.util.Scanner;

public class Pythagore {

    public static void main (String [] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);


        //Variables du triangle
        int a;
        int b;
        double hypothenuse;

        //Demande les variables

        //Variables a
        System.out.print("Quel est la valeur du côté a ?");
        a = scan.nextInt();

        //Variables b
        System.out.print("Quel est la valeur du côté b ?");
        b = scan.nextInt();

        //Calcul de l'hypothénuse
        hypothenuse = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        //Reponse
        System.out.print("Valeur de l'hypothénuse :" + hypothenuse);

        scan.close();
    }
}
