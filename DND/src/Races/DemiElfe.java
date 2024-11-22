package Races;

import java.util.ArrayList;

public class DemiElfe extends Race{
	
	public DemiElfe()
	{
		super.setNom("Demi-elfe");
		super.caractéristiques = new ArrayList<>();
		super.setDescription("Issus de deux mondes sans vraiment appartenir à aucu, les demi-elfes combinent ce que certains disent être les meilleures qualités de leurs parents humains et elfes : la curiosité, l'inventivité et l'ambition des humains, tempérées par le sens du raffinement, l'amour de la nature et les goûts artistiques des elfes. Certains demi-elfes vivent parmi les humains, mis à l'écart à cause de leurs différences émotionnelles et physiques, condamnés à voir ceux qu'ils aiment vieillir alorsq eu le temps les effleure à peine. D'autres vivent avec les elfes et se laissent gagner par la fébrilité quand ils atteignent l'âge adulte dans les royaumes intemporels des elfes où leurs camarades continuent de vivre comme des enfants. De nombreux demi-elfes se révèlent incapables de s'intégrer pleinement dans la société d'un de leurs parents et optent pour une vie de vagabondages solitaires ou rejoignent d'autres marginaux et optent pour une vie de vagabondages solitaires ou rejoignent d'autres marginaux et exilés pour mener une vie d'aventures.");
		
		Caractéristique c;
		c = new Caractéristique("Augmentation de caractéristiques","Votre valeur de charisme augmente de 2. La valeur de deux caractéristiques au choix augmentent de 1.");
		caractéristiques.add(c);
		c = new Caractéristique("Âge", "Les demi-elfes grandissent au même rythme que les humains et deveinnent matures vers 20 ans. Par contre, ils vivent bien plus longtemps que les humains et il n'est pas rare qu'ils dépassent les 180 ans.");
		caractéristiques.add(c);
		c = new Caractéristique("Alignement", "Les demi-elfes partagent les tendances chaotiques de leurs ancêtres elfiques. Ils apprécient leur liberté et la créativité et n'ont aucune envie de suivre un leader ou d'en devenir un eux-mêmes. Ils n'apprécient pas qu'on leur impose des règles ou qu,on attendent des choses d'eux et se montrent parfois indignes de confiance ou tout au moins imprévisibles.");
		caractéristiques.add(c);
		c = new Caractéristique("Taille", "Les demi-elfes sont de taille similaire aux humains. Ils font entre 150 et 180 centimètres et sont de taille moyenne.");
		caractéristiques.add(c);
		c = new Caractéristique("Vitesse", "La vitesse des demi-elfes au sol est de 9 mètres.");
		caractéristiques.add(c);
		c = new Caractéristique("Vision dans le noir", "Grâce à son sang elfique, les demi-elfes ont hérité d'une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, il peut voir dans une zone de lumière faible comme s'il s'agissait d'une lumière vive et dans une zone d'obscurité comme s'il s'agissait d'une lumière faible. Par contre, le demi-elfe ne distingue pas les couleurs dans l'obscurité, seulement des nuances de gris.");
		caractéristiques.add(c);
		c = new Caractéristique("Ascendance féérique", "Le demi-elfe est avantagé sur les jets de sauvegarde contre l'effet charmé et ne peut être contraint à dormir par la magie.");
		caractéristiques.add(c);
		c = new Caractéristique("Polyvalence", "Le demi-elfe gagne la maîtrise de deux compétences au choix. ");
		caractéristiques.add(c);
		c = new Caractéristique("Langues", "Le demi-elfe peut parler, lire et écrire le commun, l'elfique et une autre langue au choix.");
		caractéristiques.add(c);
	}

}


