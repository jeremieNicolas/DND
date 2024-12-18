package Classes;

import java.util.List;

import Races.Caractéristique;

public abstract class ClasseBase {
	String nomClasse;
	String description;
	List<Caractéristique> caracteristiques; 
	public abstract int calculerVieNiveau1();
	public abstract void calculerVieNiveauxSuperieurs();
	public abstract void setMaitrises();
	public void calculerVieNiveauxSuperieurs(int niveau) {
		// TODO Auto-generated method stub
		
	}
	public int calculerVieNiveauxSuperieurs(int niveau, List<Integer> résultatsDés) {
		int vie = 0;
		
		for(int i = 0; i<résultatsDés.size(); i++)
		{
			vie += résultatsDés.get(i);
		}
		
		return vie;
		// TODO Auto-generated method stub
		
	}
	
	public List<Caractéristique> getInfosClasse()
	{
		return this.caracteristiques;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Caractéristique> getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(List<Caractéristique> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	

}
