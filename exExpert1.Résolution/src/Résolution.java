import java.util.Scanner;

public class Résolution {

    public static void main(String [] args) {

        //Sccanner
        Scanner scan = new Scanner(System.in);

        //Variables
        double a, b, c, d, x1, x2;


        //Entree des valeurs
        System.out.println("Quelles sont vos valeurs ?");

        //Variables a
        System.out.print("a > ");
        a = scan.nextInt();

        //Variables b
        System.out.print("b > ");
        b = scan.nextInt();

        //Varibales c
        System.out.print("c > ");
        c = scan.nextInt();


        //Calcul de la fonction
        x1 = (-b + (Math.sqrt((Math.pow(b, 2)- 4*a*c))))/(2*a);
        x2 = (-b - (Math.sqrt((Math.pow(b, 2)- 4*a*c))))/(2*a);

        //Discriminant
        d = (Math.pow(b,2))-4*a*c;


        //Reponse
        System.out.println("Équation : ax2+ bx+ c = 0");
        System.out.println("Discriminnant : " + d);
        System.out.println("x1 : " +x1);
        System.out.println("x2 : " +x2);

        scan.close();

    }
}
