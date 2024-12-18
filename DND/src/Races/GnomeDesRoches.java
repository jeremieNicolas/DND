package Races;

import java.util.List;

import ClassesSupplémentaires.objetGnomeDesRoches;

public class GnomeDesRoches extends Gnome {

	List<Caractéristique> caractéristiques;
	List<objetGnomeDesRoches> listeObjets;
	public GnomeDesRoches()
	{
		caractéristiques = super.caractéristiques;
		super.setNom("Gnome des roches");
		super.setDescription("Les gnomes des roches sont naturellement plus inventifs et résistants que les autres gnomes. Dans les mondes de DnD, la majorité des gnomes appartiennent à cette catégorie, y compris les gnomes bricoleurs de DragonLance.");
		Caractéristique c;
		
		c = new Caractéristique("Augmentation de  caractéristique", "La valeur de constitution augmente de 1.");
		caractéristiques.add(c);
		c = new Caractéristique("Connaissances en ingénierie","Lorsque le gnome des roches fait un test d'Intelligence(Histoire) relatif aux objets magiques, alchimiques ou technologiques, le joueur ajoute le double du bonus de maîtrise au résultat du test au lieu du bonus de maîtrise normal.");
		caractéristiques.add(c);
		c = new Caractéristique("Bricoleur", "Le gnome maîtrise les outils d'artisan. Grâce à ces outils, il peut passer une heure et investir 10 pièces d'or de matériaux pour construire un mécanisme de taille Très petite (CA 5, 1 pv). Ce mécanisme cesse de fonctionner après une heure, sauf si vous utilisez une action pour le démanteler. Les matériaux vous reviennent donc. trois mécanismes peuvent être possédés à la fois parmi les options. ");
		caractéristiques.add(c);
		
		
		objetGnomeDesRoches o;
		
		o = new objetGnomeDesRoches("Boîte à musique", "Quand elle est ouverte, la boîte à musique joue une mélodie à un volume modéré. La boîte redevient silencieuse à la fin de la mélodie ou quand elle est fermée.");
		listeObjets.add(o);
		o = new objetGnomeDesRoches("Briquet", "Ce mécanisme produit une petite flamme qui peut être utilisée pour allumer une bougie, une torche ou unfeu de camp. L'utilisation du briquet coûte une action.");
		listeObjets.add(o);
		o = new objetGnomeDesRoches("Jouet mécanique", "Ce jouet est un animal, un monstre ou une personne mécanique. Une grenouille, une souris, un dragon ou un soldat, par exemple. Quand il est placé sur le sol, le jouet peut se déplacer de 1,5 mètre dans une direction aléatoire à chaque tour. Il fait un bruit correspondant à la créature qu'il représente.");
		listeObjets.add(o);
		
	}
}
/*
 * public class ElfeSylvestre extends Elfe{
	List<Caractéristique> listeCaractéristiques;
	public ElfeSylvestre(){
		listeCaractéristiques = super.caractéristiques;
		super.setNom("Elfe sylvestre");
		Caractéristique c;
 */
