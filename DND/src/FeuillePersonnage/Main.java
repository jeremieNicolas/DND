package FeuillePersonnage;

import java.util.Scanner;

import Classes.Barbare;
import Classes.ClasseBase;
import Races.Elfe;
import Races.HautElfe;
import Races.Race;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlocVie blocVie;
		IdPersonnage idPersonnage;
		StatsBase statsBase;
		Compétences compétences;
		JetsSauvegarde jetsSauvegarde;
		FeuillePersonnage fp = new FeuillePersonnage();

		Scanner scan = new Scanner(System.in);
		Elfe elfe = new Elfe();
		HautElfe hautElfe = new HautElfe();
		Barbare barbare = new Barbare();
		fp.identification = new IdPersonnage();
		fp.identification.setNomJoueur("Jérémie");
		fp.identification.setNomPersonnage("Dalla");
		fp.identification.setRace(hautElfe);
		fp.identification.setNiveau(0);
		fp.identification.setXp(0);
		fp.identification.setAlignement("neutre");
		fp.identification.setClasse(barbare);
		verif(fp);
	}
	/*	String nomJoueur;
	String nomPersonnage;
	Race race;
	int niveau;
	int xp;
	String alignement;
	ClasseBase Classe;
	String historique;*/

	private static void verif(FeuillePersonnage fp) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------");
		System.out.print("Nom joueur : ");
		System.out.println(fp.identification.getNomJoueur());
		System.out.print("Nom du personnage : ");
		System.out.println(fp.identification.getNomPersonnage());
		System.out.print("Race : ");
		System.out.println(fp.identification.getRace().getNom());
		System.out.println("Caractéristiques raciales : ");
		fp.identification.getRace().showCaractéristiques();
		System.out.println("Classe : "); 
		fp.identification.getClasse().getNomClasse();
		System.out.println("Caractéristiques de classe : ");
		fp.identification.getClasse().getInfosClasse();
		
	}
	

}
