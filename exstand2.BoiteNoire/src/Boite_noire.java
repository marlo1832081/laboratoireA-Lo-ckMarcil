import java.text.DecimalFormat;

public class Boite_noire {

    public static void main(String [] args) {

        //Decimal
        DecimalFormat decimalformat = new DecimalFormat("###.####");


        //Variables
        double rayon_Sphere;
        double masse_volumique_Sphere;
        double masse_volumique_SubsIso;
        double poids_Sphere;
        double poids_SubsIso;
        double poids_BoiteNoire;
        double volume_Sphere;
        double volume_BoiteNoire;
        double volume_SubsIso;
        double quantite;
        double poids_total;


        //SPHERE

        //Variables de la sphere
        rayon_Sphere = 2.15;
        masse_volumique_Sphere = 3517;

        //Volume de la sphere
        volume_Sphere = (4*Math.PI*(Math.pow(rayon_Sphere, 3)))/3;

        //Masse de la sphere
        poids_Sphere = masse_volumique_Sphere * volume_Sphere;


        //SUBSTANCE ISOLANTE

        //Variables de la substance isolante
        masse_volumique_SubsIso = 13545.88;
        volume_BoiteNoire = 125;

        //Volume de la substance isolante
            //Volume subs.iso.= (volume boite - volume sphere)
        volume_SubsIso = (125-((4*Math.PI*(Math.pow(rayon_Sphere, 3))))/3);

        //Poids de la substance isolante
            //Poids subs.iso. = Masse volumique * volume
        poids_SubsIso = (masse_volumique_SubsIso * volume_SubsIso);

        //Quantité de la substance isolante
            //Quantité subs.iso = volume * (10 exposant en 3)
        quantite =  volume_SubsIso *  Math.pow(10, 3);


        //BOITE NOIRE

        //Variables de la Boite noire
        poids_BoiteNoire = 375;
        volume_BoiteNoire = 125;

        //Calcul du poids total
        poids_total = poids_Sphere + poids_BoiteNoire + poids_SubsIso;

        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("- RAPPORT D'INFORMATIONS");
        System.out.println(" Sphere");
        System.out.println(" * Masse volumique : " + masse_volumique_Sphere + " kg/m3");
        System.out.println(" * Poids : " + decimalformat.format(poids_Sphere) + " kg");
        System.out.println(" * Rayon : " + rayon_Sphere + " m");
        System.out.println(" * Volume : " + decimalformat.format(volume_Sphere) + " m3");
        System.out.println(" Substance isolante");
        System.out.println(" * Masse volumique : " + masse_volumique_SubsIso + " kg/m3");
        System.out.println(" * Poids : " + decimalformat.format(poids_SubsIso) + " kg");
        System.out.println(" * Volume : " + decimalformat.format(volume_SubsIso) + " m3");
        System.out.println(" * Quantite : " + decimalformat.format(quantite) + " l");
        System.out.println(" Boite noire");
        System.out.println(" * Poids : " + poids_BoiteNoire+ " kg");
        System.out.println(" * Volume : " + volume_BoiteNoire + " m3");
        System.out.println(" * Poids total : " + decimalformat.format(poids_total) + " kg");
        System.out.println("-------------------------------------------");

    }
}
