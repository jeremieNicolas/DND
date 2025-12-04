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
		
		switch(race)
		{
		case "Elfe" : 
			caracteristiquesRace.add("Noms enfants : Ara, Bryn, Del, Éryn, Faen, Innil, Lael, Mella, Naill, Naéris, Phann, Rael, Rinn, Sai, Syllin, Thia, Vall.");
			caracteristiquesRace.add("Noms masculins : Adran, Aélar, Aramil, Arannis, Aust, Beiro, Berrian, Carric, Énialis, Erdan, Erevan, Galinndan, Hadaraï, Heian, Himo, Immeral, Ivellios, Laucian, Mindartis, Paelias, Péren, Quarion, Riardon, Rolen, Soveliss, Thamior, Tarivol, Théren, Varis.");
			caracteristiquesRace.add("Noms féminins : Adrie, Althaéa, Anastrianne, Andraste, Antinua, Béthrynne, Birel, Caélynn, Drusilia, Enna, Délosial, Iélénia, Jelenneth, Keyleth, Leshanna, Lia, Meriele, Mialee, Naivara, Quélenna, Quillathe, Sariel, Shanairra, Shava, Silaqui, Theirastre, Thia, Vadania, Valanthe, Xanaphie");
			caracteristiquesRace.add("Noms de famille (traduction en commun) : Amakiir (Fleurdegemme), Amastacie (Fleurstellaire), Galanodel (Murmurelunaire), Holimion (Roséedediamant), Ilphelkir (Boutondegemme), Liadon (Feuilleargent), Méliamne (Pieddechêne), Naïlo (Brisenocturne), Siannodel (RuisseauLunaire), Xiloscient (Pétald'or)");
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre valeur de Dextérité augmente de 2.");
			çaracteristiquesRace.add("Âge : B")
		}
		switch(classe)
		{}
	}	
}
