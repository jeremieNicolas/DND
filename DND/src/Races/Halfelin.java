package Races;

import java.util.ArrayList;
import java.util.List;

public class Halfelin extends Race{
	
	Halfelin()
	{
		super();
		List<Caractéristique> listCaractéristiques = new ArrayList<Caractéristique>();
		Caractéristique c;
		
        List<String> nomsFéminins = new ArrayList<>(List.of(
                "Andry", "Bree","Callie","Cora", "Euphémie","Jillian", "Kithri","Lavinia","Lidda","Merla",
                "Nedda", "Paèle", "Portia", "Séraphine","Shaena","Trym", "Vani", "Verra"
            ));

            // Liste des noms masculins
            List<String> nomsMasculins = new ArrayList<>(List.of(
            		"Alton","Andre","Cade","Corrin","Eldon","Errich","Finnan","Garret", "Lindal","Lyle",
                    "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby"
            ));
            
            List<String> nomsFamille = new ArrayList<>(List.of("Bontonneau", "Buissons", "Butepavé", "Épine",
            		"Feuilledethé","Grandpré", "Hautecolline","Récoltepinceaux","Roulecolline", "Vertbouteille"));
            // Liste complète combinant les deux
            List<String> tousLesNoms = new ArrayList<>();
            tousLesNoms.addAll(nomsFéminins);
            tousLesNoms.addAll(nomsMasculins);
		
		c = new Caractéristique("Augmentation de caractéristiques", "Votre dextérité augmente de 2");
		listCaractéristiques.add(c);
		c = new Caractéristique("Âge", "Un halfelin atteint la maturité vers 20 ans et vit généralement 150 ans.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Alignement", "La majorité des halfelins est d'alignement Loyal Bon. Ce sont par nature des êtres qui ont bon coeur et qui sont gentils. Ils détestent voir les autres créatures souffrir et ne tolèrent pas l'oppression. Ils sont aussi très organisés et respectueux des traditions. Ils se reposent beaucoup sur leur communauté et le confort apporté par leurs traditions.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Taille", "D'une taille moyenne de 90 centimètres, les halfelins pèsent en moyenne 20 kilos. Ils sont de taille Petite.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Vitesse", "La vitesse de base d'un halfelin est de 7,5 mètres.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Chanceux", "Quand un halfelin fait un 1 sur un D20 pour un jet d'attaque, un test de caractéristique ou d'un jet de sauvegarde, il peut relancer le dé. Toutefois, il doit utiliser le nouveau résultat.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Brave", "L'halfelin a avantage sur les jets de sauvegarde contre la terreur. Il peut donc lancer deux fois le dé 20 et garder le meilleur jet.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Agilité halfeline", "L'halfelin peut traverser n'importe quel emplacement occupé par une créature d'au moins une taille de plus que lui.");
		listCaractéristiques.add(c);
		c = new Caractéristique("Langues", "L'hafelin peut parler, lire et écrire le commun et le halfelin. Bien que la langue des halfelins n'ait rien d'un secret, ils n'aiment pas l'apprendre aux autres. Ils écrivent très peu et dn'ont donc pas énormément de livres. Leur tradition orale est par contre très riche. Presque tous les halfelins parlent le commun, ce qui leur permet de converser avec les gens qui habitent sur les mêmes territoires qu'eux ou dont ils traversent les terres."); 
		listCaractéristiques.add(c);
	}
}


