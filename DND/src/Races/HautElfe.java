package Races;

import java.util.ArrayList;
import java.util.List;

public class HautElfe extends Elfe{
	List<Caractéristique> listeCaractéristiques;
	public HautElfe(){
		listeCaractéristiques = super.caractéristiques;
		super.setNom("Haut-elfe");
		super.setDescription("Les haut-elfes ont l'esprit vif et maîtrisent au moins les bases de la magie. Dans de nombreux mondes de DND, on trouve deux types de haut-elfes. Les premiers sont hautains et secrets, ils sont convaincus d'être supérieurs aux autres races et même aux autres elfes. Les seconds sont plus nombreux et plus amicaux, et on les trouve souvent parmi les humains et les autres races. \n \n Les elfes du soleil de Féérune, aussi appelés elfes d'or ou elfes de l'aube, ont la peau couleur de bronze et les cheveux cuivrés, noirs ou blonds tandis que leurs yeux sont dorés, argentés ou noirs. Les elfes de la lune (aussi appelés ekfes d'argents ou elfes gris) sont plus pâles, avec une peau d'albâtre parfois teintée de bleu et des cheveux blanc-argenté, noirs ou bleus, bien que l'on trouve assez fréquemment du blond, du brun et du roux. Leurs yeux sont verts ou bleux, pailletés d'or.");
		Caractéristique c = new Caractéristique("Augmentation de caractéristiques 2", "La valeur d'intelligence augmente de 1.\n");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Entraînement aux armes elfiques", "Vous maîtrisez les épées longues, les épées courtes, les arcs longs et les arcs courts.\n");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Tour de magie", "Vous connaissez le tour de magie de votre choix parmi la liste de sorts de magicien. Votre caractéristique d'incantation pour ce tour de magie est l'intelligence.");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Entraînement aux armes elfiques","Vous maîtrisez les épées longues, les épées courtes, les arcs longs et les arcs courts.");
		listeCaractéristiques.add(c);
		c = new Caractéristique("Langue supplémentaire", "Vous pouvez parler, lire et écrire une langue supplémentaire au choix.");
		listeCaractéristiques.add(c);
	}
}
