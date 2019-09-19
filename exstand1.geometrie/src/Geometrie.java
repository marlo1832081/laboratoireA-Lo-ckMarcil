import java.text.DecimalFormat;
import java.util.Scanner;

public class Geometrie {

    public static void main(String[] args) {

        //Decimal
        DecimalFormat decimalformat = new DecimalFormat("###.####");
        //LE CERCLE

        //Variables du cercle
        Scanner scan = new Scanner(System.in);
        double rayon = 10.0;
        double surface;
        double hauteur;
        double volume;
        double apotheme;
        double longueur;


        //Calcul de la surface du cercle
        surface =  (Math.PI * (Math.pow(rayon,2)));

        //Surface
        System.out.println("Le cercle");
        System.out.println("- Rayon : " + rayon);
        System.out.println("- Surface :" + decimalformat.format(surface));


        //LE CUBE

        //Variables du cube
        longueur = 7.0;

        //Calcul de la surface
        surface = 6* (Math.pow(longueur,2));
        volume =  Math.pow(longueur,3);

        //Reponses
        System.out.println("Le cube");
        System.out.println("- Longueur :" + longueur);
        System.out.println("- Surface :" + surface);
        System.out.println("- Volume :" + volume);


        //LE CYLINDRE

        //Variables du Cube
        rayon = 10.0;
        hauteur = 5.0;

       //Calcul de la Surface
       surface = (2* Math.PI * rayon* hauteur)+(2*(Math.PI * (Math.pow(rayon, 2))));

       //Calcul du Volume
       volume = ((Math.PI * (Math.pow(rayon,2)))) * hauteur;

       //Reponse
       System.out.println("Le cylindre");
       System.out.println("- Rayon :" + rayon);
       System.out.println("- Hauteur :" + hauteur);
       System.out.println("- Surface :" + decimalformat.format(surface));
       System.out.println("- Volume :" + decimalformat.format(volume));

       //LE CONE

        //Variables du Cone
        rayon = 3.0;
        hauteur = 7.0;
        apotheme = 7.1589;

        //Calcul de la Surface
        surface = (Math.PI * rayon * apotheme) + (Math.PI*(Math.pow(rayon, 2)));

        //Calcul du Volume
        volume = ((Math.PI*(Math.pow(rayon, 2)))* hauteur)/3;

        //Reponse
        System.out.println("Le cone");
        System.out.println("- Rayon :" + rayon);
        System.out.println("- Hauteur :" + hauteur);
        System.out.println("- apotheme :" + apotheme);
        System.out.println("- Surface :" + decimalformat.format(surface));
        System.out.println("- Volume :" + decimalformat.format(volume));

    }
}

