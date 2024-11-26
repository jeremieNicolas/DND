package FeuillePersonnage;

import java.util.Scanner;

import Races.Elfe;
import Races.HautElfe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlocVie blocVie;
		IdPersonnage idPersonnage;
		StatsBase statsBase;
		Compétences compétences;
		JetsSauvegarde jetsSauvegarde;
		FeuillePersonnage fp;
		
		Scanner scan = new Scanner(System.in);
		Elfe elfe = new Elfe();
		HautElfe hautElfe = new HautElfe();
		fp.identification = new IdPersonnage();
		fp.identification.setNomJoueur("Jérémie");
		fp.identification.setNomPersonnage("Dalla");
		fp.identification.setRace(hautElfe);
		
		verif(fp);
	}

	private static void verif(IdPersonnage fp) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------");
		System.out.print("Nom joueur : ");
		System.out.println(fp.getNomJoueur());
		System.out.print("Nom du personnage : ");
		System.out.println(fp.getNomPersonnage());
		System.out.print("Race : ");
		System.out.println(fp.getRace().getNom());
		System.out.println("Caractéristiques : ");
		fp.getRace().showCaractéristiques();
		
	}
	

}
