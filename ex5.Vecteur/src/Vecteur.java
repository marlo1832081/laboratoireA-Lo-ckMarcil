import java.util.Scanner;

public class Vecteur {

    public static void main (String [] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Variables
        float xa;
        float ya;
        float za;
        float xb;
        float yb;
        float zb;
        float x;
        float y;
        float z;
        double ab;


        //Demande les variables a

        //Variable xa
        System.out.print("Quel est le point Xa ?");
        xa = scan.nextFloat();

        //Variable ya
        System.out.print("Quel est le point Ya ?");
        ya = scan.nextFloat();
        //Variable za
        System.out.print("Quel est le point Za ?");
        za = scan.nextFloat();

        System.out.println("Le point A :" + xa + "," + ya + "," + za);


        //Demande les variables b

        //Variable xb
        System.out.print("Quel est le point Xb ?");
        xb = scan.nextFloat();

        //Variable yb
        System.out.print("Quel est le point yb ?");
        yb = scan.nextFloat();

        //Variable zb
        System.out.print("Quel est le point zb ?");
        zb = scan.nextFloat();

        System.out.println("Le point B :" + xb + "," + yb + "," + zb);


        //Calcul de la distance
        x = (float) Math.pow((xb - xa),2);
        y = (float) Math.pow((yb - ya), 2);
        z = (float) Math.pow((zb - za), 2);
        ab = (float) Math.sqrt(x + y + z);

        //Reponse
        System.out.println("distance = SQRT(POW(" + xb + "-" + xa + ") + POW(" + yb + "-" + ya + ") + POW(" + zb + "-" + za + "))");
        System.out.println("= SQRT(POW(" + Math.sqrt(x) + ") + POW(" + Math.sqrt(y) + ") + POW(" + Math.sqrt(z) + "))");
        System.out.println("= SQRT(" + x + "+" + y + "+" + z + ")");
        System.out.println("= SQRT (" +(x+y+z)+ ")");
        System.out.println("=" +ab);

    }
}
