package Classes;

import java.util.ArrayList;
import java.util.List;


public class Barbare extends ClasseBase{

	List<ÉvolutionBarbare> évolutions;
	
	Barbare() {
	    this.évolutions = new ArrayList<>();

	    évolutions.add(new ÉvolutionBarbare(1, 2, "Rage, défense sans armure", 2, 2));
	    évolutions.add(new ÉvolutionBarbare(2, 2, "Témérité, sens du danger", 2,2));
	    évolutions.add(new ÉvolutionBarbare(3, 2, "Voie primitive", 3, 2));
	    évolutions.add(new ÉvolutionBarbare(4, 2, "Amélioration de caractéristiques", 3, 2));
	    évolutions.add(new ÉvolutionBarbare(5, 3, "Attaque supplémentaire, déplacement rapide", 3, 2));
	    évolutions.add(new ÉvolutionBarbare(6, 3, "Aptitude de voie", 4, 2));
	    évolutions.add(new ÉvolutionBarbare(7, 3, "Instinct sauvage", 4, 2));
	    évolutions.add(new ÉvolutionBarbare(8, 3, "Amélioration de carctéristiques", 4, 2));
	    évolutions.add(new ÉvolutionBarbare(9, 4, "Critique brutal (1 dé)", 4, 3));
	    évolutions.add(new ÉvolutionBarbare(10, 4, "Aptitude de voie", 4, 3));
	    évolutions.add(new ÉvolutionBarbare(11, 4, "Rage implacable", 4, 3));
	    évolutions.add(new ÉvolutionBarbare(12, 4, "Amélioration de caractéristiques", 5, 3 ));
	    évolutions.add(new ÉvolutionBarbare(13, 5, "Critique brutal (2 dés)", 5, 3));
	    évolutions.add(new ÉvolutionBarbare(14, 5, "Aptitude de voie", 5, 3));
	    évolutions.add(new ÉvolutionBarbare(15, 5, "Rage ininterrompue", 5, 3));
	    évolutions.add(new ÉvolutionBarbare(16, 5, "Amélioration de caractéristiques", 5, 4));
	    évolutions.add(new ÉvolutionBarbare(17, 6, "Critique brutal (3 dés)", 6, 4));
	    évolutions.add(new ÉvolutionBarbare(18, 6, "Puissance indomptable", 6, 4));
	    évolutions.add(new ÉvolutionBarbare(19, 6, "Amélioration de caractéristiques", 6, 4));
	    évolutions.add(new ÉvolutionBarbare(20, 6, "ChampionPrimitif", 100, 4)); //illimité
	   
	}


	@Override
	public int calculerVieNiveauxSuperieurs(int niveau, List<Integer> résultatsDés) {
		int total = 0;
		//1D12 par niveau + modificateur de constitution par (niveau - 1)
		for (int i=0; i<résultatsDés.size(); i++)
		{
			 total = total + résultatsDés.get(i);
		}
		return total;
	}

	@Override
	public void setMaitrises() {
		// TODO Auto-generated method stub
		//Armures : Armures légères, Armures intermédiaires, Bouclier
		//Armes : Armes courantes, Armes de guerre
		//Jets de sauvegarde : Force, Constitution
		//Compétence : 2 aux choix parmi -> athlétisme, dressage, intimidation, nature, perception, survie.
		
	}
	
	public void choixEquipement(int armure, int arme)
	{
		//une hache a deux mains ou autre arme de guerre au corps à corps
		//Deux hachettes ou n'importe quelle arme courante
		//Paquetage d'explorateur et 4 javelines.
		if (armure == 1)
		{
			
		}
		else if (armure == 2)
		{
			
		}
		else
		{
			return;
		}
		if (arme == 1)
		{
			
		}
		else if (arme == 2)
		{
			
		}
		//ajout de paquetage et des javelines
	}
	

	@Override
	public int calculerVieNiveau1() {
		// TODO Auto-generated method stub
		int pvNiveau1 = 12 ;
		return pvNiveau1;
	}


	@Override
	public void calculerVieNiveauxSuperieurs() {
		// TODO Auto-generated method stub
		
	}
	
	

}
