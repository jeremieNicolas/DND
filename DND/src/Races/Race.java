package Races;

import java.util.ArrayList;
import java.util.List;

public abstract class Race {
	String nom;
	private String description;
	public List<Caractéristique> caractéristiques;
	public List<String> nomsSuggérés;
	protected Race(){}
	
	protected Race(String nom)
	{
		this.nom = nom;
		this.caractéristiques = new ArrayList<Caractéristique>();	
	}
	
	public void showCaractéristiques()
	{
		for (int i = 0; i< caractéristiques.size(); i++)
		{
			System.out.println(caractéristiques.get(i).titre + " : " + caractéristiques.get(i).description);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

