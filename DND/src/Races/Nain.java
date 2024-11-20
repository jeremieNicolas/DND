package Races;

import java.util.ArrayList;

public class Nain extends Race{
	
	public Nain() {
		super.setNom("Nain");
        super.caractéristiques = new ArrayList<>();
        super.setDescription("Des royaumes riches d'une antique splendeur, des salles taillées dans les racines des montagnes, l'écho des pioches et des marteaux dans les profondeurs des mines et au coeur des forges aux flammes crépitantes, un engagement envers le clan et les traditions, une haine farouche envers  les gobelins et les orcs.");
        
        Caractéristique c;
        
        c = new Caractéristique("Bonus de caractéristiques", "La valeur de constitution du nain augmente de 2.");
        caractéristiques.add(c);
        c = new Caractéristique("Âge","Les nains deviennent matures au même rythme que les humains, mais on considère qu'ils sont encore jeunes jusqu'à l'âge de 50 ans. Ils vivent en moyenne 350 ans.");
        caractéristiques.add(c);
        c = new Caractéristique("Alignement","La majorité des nains est d'alignement Loyal et croit profondément aux bienfaits d'une société organisée. Les nains sont plutôt attirés vers le bien, ont un sens inné de ce qui est juste et sont convaincus que tout le monde mérite de partager les bienfaits de l'ordre et de la justice.");
        caractéristiques.add(c);
        c = new Caractéristique("Taille","Les nains mesurent entre 1,20 et 1,5 mètre et pèsent en moyenne 70 kilos. Ils sont de taille Moyenne.");
        caractéristiques.add(c);
        c = new Caractéristique("Vitesse", "Votre vitesse de base au sol est de 7,50 mètres. Vous pouvez porter une armure lourde sans que cela réduise votre vitesse.");
        caractéristiques.add(c);
        c = new Caractéristique("Vision dans le noir", "Habitué à la vie souterraine, vous avez une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, vous pouvez voir dans une zone de lumière faible comme s'il s'agissait d'une lumière vive et dans l'obscurité comme s'il s'agissait d'une lumière faible. Par contre, vous ne distinguez pas les couleurs dans l'obscurité, seulement des nuances de gris.");
        caractéristiques.add(c);
        c = new Caractéristique("Résistance naine","Vous êtes avantagé sur les jets de sauvegarde contre le poison et vous possédez une résistance contre les dégâts de poison.");
        caractéristiques.add(c);
        
    }
}
