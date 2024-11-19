package Races;

import java.util.List;

public class ElfeSylvestre extends Elfe{
	List<Caractéristique> listeCaractéristiques;
	public ElfeSylvestre(){
		listeCaractéristiques = super.caractéristiques;
		super.setNom("Elfe sylvestre");
		Caractéristique c;
		
		c = new Caractéristique("Augmentation de caractéristique - sous-race", "Votre valeur de Sagesse augmente de 1.");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Entraînement aux armes elfiques", "Vous maîtrisez les épées longues, les épées courtes, les arcs longs et les arcs courts.");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Pied léger", "Votre vitesse de base pase à 10 mètres.");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Cachette naturelle", "Vous pouvez tenter de vous cacher même quand la visibilité n'est que légèrement rédite du fait des frondaisons, d'une forte pluie, de chutes de neige, d'une nappe de brume ou tout autre phénomène naturel.");
		listeCaractéristiques.add(c);
	}
}
