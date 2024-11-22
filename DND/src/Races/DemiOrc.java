package Races;

import java.util.ArrayList;
import java.util.List;

public class DemiOrc extends Race{
	public DemiOrc()
	{
		super.setNom("Demi-orc");
		super.caractéristiques = new ArrayList<>();
		super.setDescription("Qu'elles soient unies sous les ordres d'un puissant sorcier ou qu'elles se soient battues pendant des années jusqu'à en arriver à un statu quo, il arrive que des tribus orques et humaines fassent alliance et unissent leurs forces pour terroriser les contrées civilisées voisines. Et quand ces alliances sont scellées par un mariage, il naît des demi-orcs. Certains s'élèvent au rang de puissant chef de clan, leur sang humain leur donnant un certain avantage sur leurs rivaux purement orcs. D'autres sillonnent le monde afin de prouver leur valeur parmi les humains et les autres races plus civilisées. Nombre d'entre ceux-là optent pour une carrière d'aventurier. Ils atteignent la grandeur par leurs tours de force et la notoriété par leurs traditiosn barbares et leurs férocité sauvage.");
		ArrayList<String> nomsMasculins = new ArrayList<String>();
		ArrayList<String> nomsFéminins = new ArrayList<String>();
		nomsMasculins.addAll(List.of("Dench","Feng","Gell","Henk","Holg","Imsh","Keth","Krusk","Mhurren","Ront","Shump","Thokk"));
		nomsFéminins.addAll(List.of("Baggi","Émen","Engong","Kansif","Myev","Neega","Ovak","Ownka","Shautha","Sutha","Vola","Volen","Yevelda"));
		Caractéristique c;
		
		c = new Caractéristique("Augmentation de caractéristiques","La valeur de force augmente de 2 et la valeur de constitution augmente de 1");
		caractéristiques.add(c);
		c = new Caractéristique("Âge", "Les demi-orcs deviennent matures un peu plus vite que les humains. Ils sont considérés comme adultes vers 14 ans. Par contre, ils vieillissent plus vite et vivent rarement plus de 75 ans.");
		caractéristiques.add(c);
		c = new Caractéristique("Alignement","Les demi-orcs héritent d'une tedance au chaos de leur parent orc et ils ne sont pas forcément enclins au bien. Les demi-orcs élevés parmi les orcs et qui souhaitent continuer de vivre avec eux ont généralement un alignement Mauvais.");
		caractéristiques.add(c);
		c = new Caractéristique("Taille","Les demi-orcs sont plus larges et plus corpulents que les humains. Les plus petits d'entre eux mesurent 1,50 mètre et les plus grands dépassent facilement 1,80 mètre. Ils sont de taille Moyenne.");
		caractéristiques.add(c);
		c = new Caractéristique("Vitesse","La vitesse de base d'un demi-orc au sol est de 9 mètres.");
		caractéristiques.add(c);
		c = new Caractéristique("Vision dans le noir", "Grâce à son sang orc, le demi-orc a hérité d'une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, il peut voir dans une zone de lumière faible comme s'il s'agissait d'une lumière vive et dans l'obscurité comme s'il s'agissait d'une lumière faible. Par contre, le demi-orc ne voit pas les couleurs dans l'obscurité, seulement des nuances de gris.");
		caractéristiques.add(c);
		c = new Caractéristique("Menaçant", "Le demi-orc gagne la maîtrise de la compétence Intimidation.");
		caractéristiques.add(c);
		c = new Caractéristique("Acharnement","Quand le demi-orc se retrouve à 0 point de vie mais qu'il n'est pas tué sur le coup, il peut choisir d'être réduit à 1 point de vie à la place. Il ne peut réutiliser cette aptitude qu'après avoir terminé un repos long.");
		caractéristiques.add(c);
		c = new Caractéristique("Sauvagerie", "Lors de la réussite d'un coup critique avec une arme de corps à corps, le demi-orc peut relancer l'un des dés de dégâts et l'additioner aux dégâts supplémentaires du coup critique.");
		caractéristiques.add(c);
		c = new Caractéristique("Langues", "Le demi-orc peut parler, lire et écrire le commun et l'orc. La langue orc a une sonorité dure et cetains sons évoquent des grincements. Les orcs n'ont pas d'alphabet propre et utilisent donc l'alphabet nain.");
		caractéristiques.add(c);
	}
}

