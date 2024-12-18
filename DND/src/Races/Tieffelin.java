package Races;

import java.util.ArrayList;
import java.util.List;

public class Tieffelin {
	Tieffelin()
	{
		super();
		List<Caractéristique> listCaractéristiques = new ArrayList<Caractéristique>();
		
		listCaractéristiques.add(new Caractéristique("Augmentation de caractéristiques","La valeur de Charisme augmente de 2 et la valeur d'Intelligence augmente de 1."));
		listCaractéristiques.add(new Caractéristique("Âge", "Les tieffelins vieillisent à une vitesse comparable aux humains, mais ils vivent quelques années supplémentaires."));
		listCaractéristiques.add(new Caractéristique("Alignement", "Les tieffelins ont beau ne pas être naturellement attirés vers le mal, la plupart d'entre eux sont quand même d'alignement mauvais. Mais qu'ils soient mauvais ou non, leur nature indépendante les pousse généralement à un comportement chaotique."));
		listCaractéristiques.add(new Caractéristique("Taille", "Les tieffelins sont de taille et de corpulence comparables aux humains. Ils sont de taille Moyenne."));
		listCaractéristiques.add(new Caractéristique("Vitesse", "La vitesse de base d'un tieffelin au sol est de 9 mètres."));
		listCaractéristiques.add(new Caractéristique("Vision dans le noir", "Grâce à son ascendance infernal, le Tieffelin a hérité d'une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, il peut voir dans l'obscurité comme dans la pénombre et dans la pénombre comme dans la lumière vive. Par contre, il ne distingue pas les couleurs dans l'obscurité, seulement des nuances de gris."));
		listCaractéristiques.add(new Caractéristique("Résistance infernale", "Le tieffelin est résistant aux dégâts de feu."));
		listCaractéristiques.add(new Caractéristique("Ascendance infernale","Le tieffelin connait le tour de magie Thaumaturgie. Au niveau 3, le Tieffelin peut lancer une fois le sort Représailles infernales comme sort de niveau 2 grâce à ce trait. Pour pouvoir lancer ce sort à nouveau, il devra faire un repos long. À partir du niveau 5, il peut lancer Ténèbres grâce à ce trait. Il doit toutefois faire un repos long pour relancer ce sort. La caractéristique d'incantation pour ces sorts est le Charisme."));
		listCaractéristiques.add(new Caractéristique("Langues", "Le tieffelin peut parler, lire et écrire le commun et l'infernal."));
	}
}

/*package Races;
import java.util.ArrayList;
import java.util.List;
public class Robuste extends Halfelin{
	Robuste()
	{
		super();
		Caractéristique c;
		List<Caractéristique> listCaractéristiques = new ArrayList<Caractéristique>();
		listCaractéristiques = super.caractéristiques;
		
		c = new Caractéristique("Augmentation de caractéristiques", "Sa valeur de constitution augmente de 1.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Résilience des robustes", "Le Robuste est avantagé lors des jets de sauvegarde contre le poison et est résistant aux dégâts de poison.");
		listCaractéristiques.add(c);
	}
}
*/