package Races;

import java.util.ArrayList;
import java.util.List;

public class ElfeNoir extends Elfe{
	
	ElfeNoir()
	{
		super();
		Caractéristique c;
		List<Caractéristique> listCaractéristiques = new ArrayList<Caractéristique>();
		listCaractéristiques = super.caractéristiques ;
		c = new Caractéristique("Vision dans le noir supérieure", "Votre vision dans le noir fonctionne dans un rayon de 36 mètres.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Sensibilité à la lumière du soleil", "Vous êtes désavantagé lors des jets d'atttaques et de tests de sagesse(perception) lorsque vous, votre cible ou ce que vous tentez de percevoir se trouve sous la lumière directe du soleil.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Magie drow", "L'elfe noir connait le tour de magie Lumières dansantes. Au niveau 3, il peut aussi lancer Lueurs féériques. Il doit terminer un repos long pour relancer un sort ainsi. Au niveau 5, il peut également lancer Ténèbres. Il doit terminer un repos long avant de relancer ce sort ainsi. Il utilise le charisme comme caractéristique incantatoires pour ces sorts.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Entraînement aux armes drows", "L'elfe noir maitrise les râpières, les épées courtes et les arbalètes de poing.");
		listCaractéristiques.add(c);
	}
}
