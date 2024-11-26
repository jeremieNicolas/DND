package FeuillePersonnage;

import java.util.List;

import Classes.ClasseBase;
import Races.Caractéristique;
import Races.Race;

public class IdPersonnage {
	String nomJoueur;
	String nomPersonnage;
	Race race;
	int niveau;
	int xp;
	String alignement;
	ClasseBase Classe;
	String historique;
	public static final int[] SEUILS_XP = {
			 0, 300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000,
		        85000, 100000, 120000, 140000, 165000, 195000, 225000, 265000,
		        305000, 355000};
	IdPersonnage(){}
	
	IdPersonnage(String nomJoueur, String nomPersonnage, Race race, ClasseBase classe, String historique)
	{
		this.nomJoueur = nomJoueur;
		this.nomPersonnage = nomPersonnage;
		this.race = race;
		this.setNiveau(0);
		this.Classe = classe;
		this.historique = historique;
	}
	
	public void getListeCaractéristiquesRaciales()
	{
		for (int i = 0; i<race.caractéristiques.size(); i++)
		{
			System.out.print(i + race.caractéristiques.get(i).getTitre()); 
		}
		System.out.println("Veuillez entrer le numéro de la caractéristique à afficher : ");
	}
	
	public Caractéristique getCaractéristiqueRaciale(int id)
	{
		Caractéristique c = race.caractéristiques.get(id);
		return c;
	}
	
	
	public void addXP(int XPajouté)
	{
		this.xp += XPajouté;
		
		for (int i=0; i<SEUILS_XP.length; i++)
		{
			if (xp < SEUILS_XP[i])
			{
				this.setNiveau(i);
			}
			else 
			{
				continue;
			}
		}
		getBonusMaitrise();
		
	}
	
	
	private int getBonusMaitrise() {
		// TODO Auto-generated method stub
		  if (niveau <= 4) {
	            return 2;
	        } 
		  else if (niveau <= 8) {
	            return 3;
	        } 
		  else if (niveau <= 12) {
	            return 4;
	        } 
		  else if (niveau <= 16) {
	            return 5;
	        } 
		  else {
	            return 6;
	        }
		
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public String getAlignement() {
		return alignement;
	}

	public void setAlignement(String alignement) {
		this.alignement = alignement;
	}

	public ClasseBase getClasse() {
		return Classe;
	}

	public void setClasse(ClasseBase classe) {
		Classe = classe;
	}

	public String getHistorique() {
		return historique;
	}

	public void setHistorique(String historique) {
		this.historique = historique;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public String getNomPersonnage() {
		return nomPersonnage;
	}

	public void setNomPersonnage(String nomPersonnage) {
		this.nomPersonnage = nomPersonnage;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}
	
	
}
