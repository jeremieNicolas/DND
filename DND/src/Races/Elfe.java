package Races;

import java.util.ArrayList;
import java.util.List;

public class Elfe extends Race {

	
	public Elfe(){
		super.caractéristiques = new ArrayList<Caractéristique>();
		super.setNom("Elfe");
		super.setDescription("Les elfes forment un peuple magique grâce à la magie surnaturelle. Ils vivent dans un autre monde dont ils ne font pas entièrement partie. Ils résident en des lieux à la beauté éthérée, au coeur d'atiques forêts ou dans des tours d'argent luisant d'un éclat féérique, là où une douce musique flotte dans les airs et une brise parfumée enchante les narines. Les elfes aiment la nature et la magie, les arts et le talent artistique, la musique et la poésie, et toutes les bonnes choses de la vie. ");
		Caractéristique c;
        List<String> nomsEnfant = new ArrayList<>(List.of(
                "Ara", "Bryn", "Del", "Eryn", "Faen", "Innil", "Lael", "Mella", "Naill", 
                "Naéris", "Phann", "Rael", "Rinn", "Sai", "Syllin", "Thia", "Vall"
            ));

            // Liste des noms masculins
            List<String> nomsMasculins = new ArrayList<>(List.of(
                "Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", 
                "Carric", "Ênialis", "Erdan", "Erevan", "Galindan", "Hadaraï", "Heian", 
                "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias", 
                "Pêren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", 
                "Théren", "Varis"
            ));

            // Liste complète combinant les deux
            List<String> nomsFéminins = new ArrayList<>(List.of("Adrie", "Althaéa", "Anastrianne", "Andraste", "Antinua", "Béthrynne", "Birel", "Caélynn", "Drusilia", "Enna", "Félosial", "Iélénia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quélenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastre", "Thia", "Vadania", "Valanthe", "Xanaphie"));

            List<String> nomsFamille = new ArrayList<>(List.of( "Amakiir (Fleurdegemme)", "Amastacie (Fleurstellaire)", "Galanodel (Murmurelunaire)", "Holimion (Roséedediamant)", "Ilphelkiir (Boutondegemme)", "Liadon (Feuilleargent)", "Méliamne (Pieddechêne)", "Naîlo (Brisenocturne)", "Siannodel (Ruisseaulunaire)", "Xiloscient (Pétald'or)"));
            		
		c = new Caractéristique("Augmentation de caractéristiques","Votre dextérité augmente de 2");
		super.caractéristiques.add(c);
		c = new Caractéristique("Âge", "Bien que les elfes atteignent leur maturité physique environ au même âge que les humains, ils considèrent qu'être un adulte dépasse ce simple aspect et prend en compte l'expérience de la vie. Un elfe se déclare généralement adulte vers 100 ans et choisit à ce moment son nom d'adulte. Les elfes peuvent vivre jusqu'à 750 ans.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Alignement","Les elfes sont amoureux de la liberté, de la diversité et de leur liberté d'expression. C'est pourquoi ils tendent vers les aspects les plus modérés du chaos. La liberté des autres a autant de valeur à leurs yeux que la leur et ils sont plutôt enclins à faire le bien. Les drows sont une exception. Leur exil en Ombreterre les ont rendus vicieux et dangereux. Ils sont donc plûtot enclins à faire le mal.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Taille", "Les elfes mesurent généralement entre 1,50 et 1,80 mètres. Ils sont de taille Moyenne.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Vitesse","La vitesse de base des elfes au sol est de 9 mètres.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Vision dans le noir", "Habitué à la pénombre des forêts et au ciel nocturne, l'elfe a une vision supérieure dans l'obscurité et la lumière faible. Dans un rayon de 18 mètres, l'elfe voit dans une zone de lumière faible comme s'il s'agissait de lumière vive et dans l'obscurité comme s'il s'agissait d'une lumière faible. Par contre, vous ne distinguez pas les couleurs dans l'obscurité, seulement des nuances de gris. ");
		super.caractéristiques.add(c);
		c = new Caractéristique("Sens aiguisés","Maitrise de la compétence Perception.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Ascendance féérique","Avantage sur les jets de sauvegarde contre l'effet charmé. Ne peut être contraint à dormir par la magie.");
		super.caractéristiques.add(c);
		c =  new Caractéristique("Transe","Les elfes n'ont pas besoin de dormir. À la place, ils passent 4 heures par jour dahns un état de méditation profonde, tout en restant semi-conscients. (Le mot qui décrit cette méditation en langage commun est Transe). Pendant cette méditation, L'elfe fait de sorte de rêves qui sont en réalité des exercices mentaux devenus réflexes avec les années. Ce transe donne les même avantages que ceux conférés à un humain par 8 heures de sommeil.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Langues", "L'elfe peut parler, lire et écrire le commun et l'elfique. Le langage des elfes est fluide, avec des intonations subtiles et une grammaire élaborée. La littérature des elfes est riche et variée et leurs chansons et poèmes sont populaires parmi les autres races. De nombreux bardes apprennent à parler elfe afin de pouvoir ajouter des ballades elfiques à leur répertoire.");
		super.caractéristiques.add(c);
		c = new Caractéristique("Variante raciale", "D'antiques divisions scindent le peuple elfique en trois variantes raciales principales : les hauts-elfes, les elfes sylvestres et les elfes noirs (drows). Dans certains mondes, elles subissent encore d'autres divisions, il est donc possible d'avoir une variante plus spécifique au besoin.");
		super.caractéristiques.add(c);
	}
	
	
}
