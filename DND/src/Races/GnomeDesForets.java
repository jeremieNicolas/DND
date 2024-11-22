package Races;

import java.util.List;

public class GnomeDesForets extends Gnome{
	List<Caractéristique> listeCaractéristiques;
	
	public GnomeDesForets()
	{
		listeCaractéristiques = super.caractéristiques;
		super.setNom("Gnome des forêts");
		super.setDescription("Les gnomes des forêts ont un don naturel pour les illusions et disposent d'une rapidité et d'une discrétion naturelles. Dans les mondes de DnD, ils sont rares et mystérieux.");
		
		Caractéristique c;
		c = new Caractéristique("Augmentation de caractéristiques","La valeur de dextérité augmente de 1");
		caractéristiques.add(c);
		c =  new Caractéristique("Illusionniste-né"," Le gnome des forêts connait le tour de magie illusion mineure et utilisent l'intelligence comme caractéristique d'incantation pour le lancer.");
		caractéristiques.add(c);
		c = new Caractéristique("Communication avec les petits animaux", "À l'aide de bruits et de gestes, le gnome des forêts arrive à transmettre des concepts simples à des bêtes de taille Petite ou inférieure. Les gnomes des forêts aiment les animaux et ont souvent des écureils, des blaireaux, des lapins, des taupes, des pics-verts et d'autres créatures comme compagnons.");
		caractéristiques.add(c);
	}
	
}

