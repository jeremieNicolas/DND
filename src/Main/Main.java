package Main;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String nomJoueur;
		String nomPersonnage;
		String race;
		String classe;
		int niveau;
		String historique;
		int xp;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> caracteristiquesRace = new ArrayList<String>();
		ArrayList<String> caracteristiquesClasse = new ArrayList<String>();
		
		System.out.println("Entrer le nom du joueur : ");
		nomJoueur = scan.nextLine();
		System.out.println("Entrer le nom du personnage : ");
		nomPersonnage = scan.nextLine();
		System.out.println("De quelle race sera le personnage?"); 
		race = scan.nextLine();
		System.out.println("De quelle classe sera le personnage?"); 
		classe = scan.nextLine();
		System.out.println("Quel est le niveau de départ du personnage?"); 
		niveau = Integer.parseInt(scan.nextLine());
		System.out.println("Quel historique?"); 
		historique = scan.nextLine();
		xp = 0;
		
		
		switch(classe)
		{}
	}	
}
