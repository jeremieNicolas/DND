package Races;
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
