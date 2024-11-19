package FeuillePersonnage;

import java.util.List;

import Races.Caractéristique;
import Races.Race;

public class FeuillePersonnage {
	String nomJoueur;
	String nomPersonnage;
	Race race;

	FeuillePersonnage(){}
	
	FeuillePersonnage(String nomJoueur, String nomPersonnage, Race race)
	{
		this.nomJoueur = nomJoueur;
		this.nomPersonnage = nomPersonnage;
		this.race = race;
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