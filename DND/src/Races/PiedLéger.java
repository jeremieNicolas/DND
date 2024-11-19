package Races;

import java.util.ArrayList;
import java.util.List;

public class PiedLéger extends Halfelin {
	PiedLéger()
	{
		super();
		Caractéristique c;
		List<Caractéristique> listCaractéristiques = new ArrayList<Caractéristique>();
		listCaractéristiques = super.caractéristiques ;
		c = new Caractéristique("Augmentation de caractéristiques", "La valeur de charisme augmente de 1.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Discrétion naturelle", "Le pied-léger peut tenter de se cacher même quand il est seulement dissimulé par une créature d'au moins une taille de plus que lui.");
		listCaractéristiques.add(c);
	}
}
