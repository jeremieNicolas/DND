package Races;

import java.util.ArrayList;
import java.util.List;

import ClassesSupplémentaires.AscendanceDraconique;

public class Sangdragon extends Race{
	
	List<Caractéristique> listeCaractéristiques;
	List<String> nomsMasculins;
	List<String> nomsFéminins;
	List<String> nomsEnfant;
	List<String> nomsClan;
	List<AscendanceDraconique> ascendances;
	public Sangdragon()
	{
		super.setNom("Sangdragon");
		super.setDescription("Nés d'un dragon, comme leur nom le proclame, les sangdragons parcourent fièrement un monde qui les accueille avec une incompréhension mêlée de crainte. Façonnés par les dieux draconiques ou par les dragons eux-mêmes, les sangdraggons sont éclos d'oeufs de dragon afin de créer une race unique, combinant le meilleur des dragons et des humanoïdes. Certains sont de fidèles serviteurs des véritables dragons, d'autres forment la piétaille de grandes armées et d'autres encore errent sans vocation. ");
		nomsMasculins.addAll(List.of("Arjhan", "Balasar","Bharash","Donaar","Ghesh","Heskan","Kriv","Medrash","Méhen","Nadarr","Pandjed","Patrin","Rhogar","Shamash","Shedinn","Tarhun","Torinn"));
		nomsFéminins.addAll(List.of("Akra","Biri","Daar","Farideh","Harann","Havilar","Jheri","Kava","")); 
		nomsEnfant.addAll(List.of("Grimpeur","Mordeur-de-Bouclier", "Perce-Oreille","Dévot","Sauteur","Zélé"));
		nomsClan.addAll(List.of("Clethtinthiallor","Daardendrian", "Delmirev","Drachendandion","Fenkenkabradon","Kepeshkmolik","Kerrhylon","Kimbatuul","Linxakasendalor","Myastan","Nemmonis","Norixius","Ophinshtalajiir","Prexijandilin","Shestendeliath","Turnuroth","Verthisathurgiesh","Yarjerit"));
		ascendances = new ArrayList<AscendanceDraconique>();
		
		super.caractéristiques = new ArrayList<Caractéristique>();
		caractéristiques.add(new Caractéristique("Augmentation de caractéristiques","La valeur de force du personnage augmente de 2 et son charisme augmente de 1."));
		caractéristiques.add(new Caractéristique("Âge", "Les sangdragons grandissent vite. Une fois qu'ils ont éclos, il ne leur faut que quelques heures pour savoir marcher. Ils atteignent une taille et un niveau de développement équivalent à un humain de 10 ans en seulement 3 ans. On les considère adultes vers 15 ans et ils vivent environ 80 ans."));
		caractéristiques.add(new Caractéristique("Alignement","Les sangdragons préfèrent généralement les extrêmes et choisissent constamment leur camp dans la guerre cosmique qui oppose le bien et le mal, respectivement représentés par Bahamut et Tiamat. La plupart des sangdragons sont Bons, mais ceux qui rejoignent le camp de Tiamat font de terribles adversaires."));
		caractéristiques.add(new Caractéristique("Souffle", "Le sangdragon peut utiliser son action pour exhaler une vaque d'énergie destructrice. La taille, la forme, et le type de dégâts causés sont liés à l'ascendance draconique. Lors de l'utilisation du souffle, chaque créature dans la zone affectée doit faire un jet de sauvegarde dont le type est détermin dans l'ascendance. Le DD de ce jet est de 8 + modifConsti + bonusMaitrise. Une créature qui rate son jet subit 2d6 de dégâts. Elle en subit seulement la moitié si réussite. Les dégâts augmentent à 3d6 au niveau 6, 4d6 au niveau 11, et 5d6 au niveau 16. Si le souffle est utilisé, il n'est plus possible de l'utiliser avant un repos."));
		caractéristiques.add(new Caractéristique("Résistance aux dégâts", "Le Sangdragon possède une résistance au type de dégâts associé par son ascendance draconique."));
		caractéristiques.add(new Caractéristique("Langues","Le sangdragon peut lire, parler et écrire le commun et le draconique. Le draconique est considéré comme une des langues les plus anciennes et est souvent utilisée pour étudier la magie. C'est une langue composée de consonnes dures et de sifflements, qui semble rude à la plupart des créatures."));
				
		ascendances.add(new AscendanceDraconique("Airain", "Feu", "Ligne de 1m5 sur 9 mètres.", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Argent", "Froid", "Cône de 4,5 mètres", "Constitution"));
		ascendances.add(new AscendanceDraconique("Blanc", "Froid", "Cône de 4,5 mètres", "Constitution"));
		ascendances.add(new AscendanceDraconique("Bleu", "Foudre", "Ligne de 1,5 sur 9 mètres", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Bronze","Foudre", "Ligne de 1,5 sur 9 mètres", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Cuivre", "Acide", "Ligne de 1,5 sur 9 mètres", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Noir", "Acide", "Ligne de 1,5 sur 9 mètres", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Or", "Feu", "Cône de 4,5 mètres.", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Rouge", "Feu", "Cône de 4,5 mètres.", "Dextérité"));
		ascendances.add(new AscendanceDraconique("Vert", "Poison", "Cône de 4 mètres.", "Constitution."));
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
