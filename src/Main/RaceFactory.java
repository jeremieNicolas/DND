package Main;

import java.util.ArrayList;
import java.util.List;

public class RaceFactory {
	public static List<String> getCaracs(String race)
	{
		List<String> caracteristiquesRace = new ArrayList<String>();
		switch(race)
		{
		case "Elfe" : 
			caracteristiquesRace.add("Noms enfants : Ara, Bryn, Del, Éryn, Faen, Innil, Lael, Mella, Naill, Naéris, Phann, Rael, Rinn, Sai, Syllin, Thia, Vall.");
			caracteristiquesRace.add("Noms masculins : Adran, Aélar, Aramil, Arannis, Aust, Beiro, Berrian, Carric, Énialis, Erdan, Erevan, Galinndan, Hadaraï, Heian, Himo, Immeral, Ivellios, Laucian, Mindartis, Paelias, Péren, Quarion, Riardon, Rolen, Soveliss, Thamior, Tarivol, Théren, Varis.");
			caracteristiquesRace.add("Noms féminins : Adrie, Althaéa, Anastrianne, Andraste, Antinua, Béthrynne, Birel, Caélynn, Drusilia, Enna, Délosial, Iélénia, Jelenneth, Keyleth, Leshanna, Lia, Meriele, Mialee, Naivara, Quélenna, Quillathe, Sariel, Shanairra, Shava, Silaqui, Theirastre, Thia, Vadania, Valanthe, Xanaphie");
			caracteristiquesRace.add("Noms de famille (traduction en commun) : Amakiir (Fleurdegemme), Amastacie (Fleurstellaire), Galanodel (Murmurelunaire), Holimion (Roséedediamant), Ilphelkir (Boutondegemme), Liadon (Feuilleargent), Méliamne (Pieddechêne), Naïlo (Brisenocturne), Siannodel (RuisseauLunaire), Xiloscient (Pétald'or)");
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre valeur de Dextérité augmente de 2.");
			caracteristiquesRace.add("Âge : Bien que les elfes atteignent leur maturité physique environ au même âge que les humains, ils considèrent qu'être un adulte dépasse ce simple aspect et prend en compte l'expérience de la vie. Un elfe se déclare généralement adulte vers 100 ans et choisit à ce moment son nom d'adulte. Les elfes peuvent vivre jusqu'à 750 ans.");
			caracteristiquesRace.add("Taille : Les elfes mesurent généralement entre 1,50 et 1,80 mètre et sont minces. Ils sont de taille Moyenne.");
			caracteristiquesRace.add("Vitesse : La vitesse d'un elfe au sol est de 9 mètres.");
			caracteristiquesRace.add("Vision dans le noir : Habitué à la pénombre des forêts et au ciel nocturne, vous avez une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, vous pouvez voir dans la lumière faible comme s'il s'agissait de lumière vive et dans la pénombre comme s'il s'agissait de lumière faible. Vous ne distinguez toutefois pas les couleurs dans l'obscurité, seulement des nuances de gris.");
			caracteristiquesRace.add("Sens aiguisés : Vous maitrisez la compétence Perception.");
			caracteristiquesRace.add("Ascendance féérique : Vous êtes avantagé sur les jets de sauvegarde contre l'effet charmé et vous ne pouvez être contraint à dormir par la magie.");
			caracteristiquesRace.add("Transe : Les elfes n'ont pas besoin de dormir. À la place, ils passent 4 heures par jour dans un état de méditation profonde, tout en étant semi-conscients (Le mot qui décrit cette méditation profonde en commun est \"transe\". Pendant cette méditation, vous faites une sorte de \"rêve\". Ces rêves sont en réalité des exercices mentaux qui sont devenus des éflexes au bout de plusieurs années de pratique. En vous reposant ainsi, vous bénéficiez des mêmes avantages que ceux conférés à un humain par 8 heures de sommeil.");
			caracteristiquesRace.add("Langues : Vous pouvez parler, lire et écrire le commun et l'elfique. Le langage des elfes est fluide, avec des intonations subtiles et une grammaire élaborée. La littérature des elfes est riche et variée et leurs chansons et po"
					+ "èmes sont populaires parmi les autres races. De nombreux bardes apprennent l'elfique afin de pouvoir ajouter des ballades à leur répertoire.");
			caracteristiquesRace.add("Variante raciale : D'antiques divisions scindent le peuple elfique en trois variantes raciales principales : les Haut-Elfes, les Elfes sylvestres et les Elfes noirs."); 
			break;
		case "Haut-Elfe" : 
			caracteristiquesRace.add("Noms enfants : Ara, Bryn, Del, Éryn, Faen, Innil, Lael, Mella, Naill, Naéris, Phann, Rael, Rinn, Sai, Syllin, Thia, Vall.");
			caracteristiquesRace.add("Noms masculins : Adran, Aélar, Aramil, Arannis, Aust, Beiro, Berrian, Carric, Énialis, Erdan, Erevan, Galinndan, Hadaraï, Heian, Himo, Immeral, Ivellios, Laucian, Mindartis, Paelias, Péren, Quarion, Riardon, Rolen, Soveliss, Thamior, Tarivol, Théren, Varis.");
			caracteristiquesRace.add("Noms féminins : Adrie, Althaéa, Anastrianne, Andraste, Antinua, Béthrynne, Birel, Caélynn, Drusilia, Enna, Délosial, Iélénia, Jelenneth, Keyleth, Leshanna, Lia, Meriele, Mialee, Naivara, Quélenna, Quillathe, Sariel, Shanairra, Shava, Silaqui, Theirastre, Thia, Vadania, Valanthe, Xanaphie");
			caracteristiquesRace.add("Noms de famille (traduction en commun) : Amakiir (Fleurdegemme), Amastacie (Fleurstellaire), Galanodel (Murmurelunaire), Holimion (Roséedediamant), Ilphelkir (Boutondegemme), Liadon (Feuilleargent), Méliamne (Pieddechêne), Naïlo (Brisenocturne), Siannodel (RuisseauLunaire), Xiloscient (Pétald'or)");
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre valeur de Dextérité augmente de 2.");
			caracteristiquesRace.add("Âge : Bien que les elfes atteignent leur maturité physique environ au même âge que les humains, ils considèrent qu'être un adulte dépasse ce simple aspect et prend en compte l'expérience de la vie. Un elfe se déclare généralement adulte vers 100 ans et choisit à ce moment son nom d'adulte. Les elfes peuvent vivre jusqu'à 750 ans.");
			caracteristiquesRace.add("Taille : Les elfes mesurent généralement entre 1,50 et 1,80 mètre et sont minces. Ils sont de taille Moyenne.");
			caracteristiquesRace.add("Vitesse : La vitesse d'un elfe au sol est de 9 mètres.");
			caracteristiquesRace.add("Vision dans le noir : Habitué à la pénombre des forêts et au ciel nocturne, vous avez une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, vous pouvez voir dans la lumière faible comme s'il s'agissait de lumière vive et dans la pénombre comme s'il s'agissait de lumière faible. Vous ne distinguez toutefois pas les couleurs dans l'obscurité, seulement des nuances de gris.");
			caracteristiquesRace.add("Sens aiguisés : Vous maitrisez la compétence Perception.");
			caracteristiquesRace.add("Ascendance féérique : Vous êtes avantagé sur les jets de sauvegarde contre l'effet charmé et vous ne pouvez être contraint à dormir par la magie.");
			caracteristiquesRace.add("Transe : Les elfes n'ont pas besoin de dormir. À la place, ils passent 4 heures par jour dans un état de méditation profonde, tout en étant semi-conscients (Le mot qui décrit cette méditation profonde en commun est \"transe\". Pendant cette méditation, vous faites une sorte de \"rêve\". Ces rêves sont en réalité des exercices mentaux qui sont devenus des éflexes au bout de plusieurs années de pratique. En vous reposant ainsi, vous bénéficiez des mêmes avantages que ceux conférés à un humain par 8 heures de sommeil.");
			caracteristiquesRace.add("Langues : Vous pouvez parler, lire et écrire le commun et l'elfique. Le langage des elfes est fluide, avec des intonations subtiles et une grammaire élaborée. La littérature des elfes est riche et variée et leurs chansons et po"
					+ "èmes sont populaires parmi les autres races. De nombreux bardes apprennent l'elfique afin de pouvoir ajouter des ballades à leur répertoire.");
			caracteristiquesRace.add("Variante raciale : D'antiques divisions scindent le peuple elfique en trois variantes raciales principales : les Haut-Elfes, les Elfes sylvestres et les Elfes noirs."); 
			caracteristiquesRace.add("Augmentation de caractéristiques : Votree valeur d'intelligence augmente de 1");
			caracteristiquesRace.add("Entraînement aux armes elfiques : Vous maîtrisez les épées longues, les épées courtes, les arcs longs et les arcs courts.");
			caracteristiquesRace.add("Sort mineur : Vous connaissez un sort mineur devotre choix parmi la liste de sorts du magicien. La caractéristique incantatoire pour ce sort est l'intelligence.");
			caracteristiquesRace.add("Langue supplémentaire : Vous pouvez parler, lire et écrire une langue supplémentaire au choix.");
			break;
		case "Elfe sylvestre" : 
			caracteristiquesRace.add("Noms enfants : Ara, Bryn, Del, Éryn, Faen, Innil, Lael, Mella, Naill, Naéris, Phann, Rael, Rinn, Sai, Syllin, Thia, Vall.");
			caracteristiquesRace.add("Noms masculins : Adran, Aélar, Aramil, Arannis, Aust, Beiro, Berrian, Carric, Énialis, Erdan, Erevan, Galinndan, Hadaraï, Heian, Himo, Immeral, Ivellios, Laucian, Mindartis, Paelias, Péren, Quarion, Riardon, Rolen, Soveliss, Thamior, Tarivol, Théren, Varis.");
			caracteristiquesRace.add("Noms féminins : Adrie, Althaéa, Anastrianne, Andraste, Antinua, Béthrynne, Birel, Caélynn, Drusilia, Enna, Délosial, Iélénia, Jelenneth, Keyleth, Leshanna, Lia, Meriele, Mialee, Naivara, Quélenna, Quillathe, Sariel, Shanairra, Shava, Silaqui, Theirastre, Thia, Vadania, Valanthe, Xanaphie");
			caracteristiquesRace.add("Noms de famille (traduction en commun) : Amakiir (Fleurdegemme), Amastacie (Fleurstellaire), Galanodel (Murmurelunaire), Holimion (Roséedediamant), Ilphelkir (Boutondegemme), Liadon (Feuilleargent), Méliamne (Pieddechêne), Naïlo (Brisenocturne), Siannodel (RuisseauLunaire), Xiloscient (Pétald'or)");
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre valeur de Dextérité augmente de 2.");
			caracteristiquesRace.add("Âge : Bien que les elfes atteignent leur maturité physique environ au même âge que les humains, ils considèrent qu'être un adulte dépasse ce simple aspect et prend en compte l'expérience de la vie. Un elfe se déclare généralement adulte vers 100 ans et choisit à ce moment son nom d'adulte. Les elfes peuvent vivre jusqu'à 750 ans.");
			caracteristiquesRace.add("Taille : Les elfes mesurent généralement entre 1,50 et 1,80 mètre et sont minces. Ils sont de taille Moyenne.");
			caracteristiquesRace.add("Vitesse : La vitesse d'un elfe au sol est de 9 mètres.");
			caracteristiquesRace.add("Vision dans le noir : Habitué à la pénombre des forêts et au ciel nocturne, vous avez une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, vous pouvez voir dans la lumière faible comme s'il s'agissait de lumière vive et dans la pénombre comme s'il s'agissait de lumière faible. Vous ne distinguez toutefois pas les couleurs dans l'obscurité, seulement des nuances de gris.");
			caracteristiquesRace.add("Sens aiguisés : Vous maitrisez la compétence Perception.");
			caracteristiquesRace.add("Ascendance féérique : Vous êtes avantagé sur les jets de sauvegarde contre l'effet charmé et vous ne pouvez être contraint à dormir par la magie.");
			caracteristiquesRace.add("Transe : Les elfes n'ont pas besoin de dormir. À la place, ils passent 4 heures par jour dans un état de méditation profonde, tout en étant semi-conscients (Le mot qui décrit cette méditation profonde en commun est \"transe\". Pendant cette méditation, vous faites une sorte de \"rêve\". Ces rêves sont en réalité des exercices mentaux qui sont devenus des éflexes au bout de plusieurs années de pratique. En vous reposant ainsi, vous bénéficiez des mêmes avantages que ceux conférés à un humain par 8 heures de sommeil.");
			caracteristiquesRace.add("Langues : Vous pouvez parler, lire et écrire le commun et l'elfique. Le langage des elfes est fluide, avec des intonations subtiles et une grammaire élaborée. La littérature des elfes est riche et variée et leurs chansons et po"
					+ "èmes sont populaires parmi les autres races. De nombreux bardes apprennent l'elfique afin de pouvoir ajouter des ballades à leur répertoire.");
			caracteristiquesRace.add("Variante raciale : D'antiques divisions scindent le peuple elfique en trois variantes raciales principales : les Haut-Elfes, les Elfes sylvestres et les Elfes noirs."); 
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre sagesse augmente de 1.");
			caracteristiquesRace.add("Entrainement aux armes elfiques : Vous maitrisez les épées longues, les épées courtes, les arcs longs et les arcs courts."); 
			caracteristiquesRace.add("Foulée légère : Votre vitesse de base paasse à 10,5 mètres.");
			caracteristiquesRace.add("Cachette naturelle : Vous pouvez tenter de vous cacher même quand la visibilité n'est que légèrement réduite du fait des frondaisons, d'une forte pluie, de chutes de neige, d'une nappe de brume ou de tout autre phénomène naturel.");
			break;
		case "Elfe noir":
			caracteristiquesRace.add("Noms enfants : Ara, Bryn, Del, Éryn, Faen, Innil, Lael, Mella, Naill, Naéris, Phann, Rael, Rinn, Sai, Syllin, Thia, Vall.");
			caracteristiquesRace.add("Noms masculins : Adran, Aélar, Aramil, Arannis, Aust, Beiro, Berrian, Carric, Énialis, Erdan, Erevan, Galinndan, Hadaraï, Heian, Himo, Immeral, Ivellios, Laucian, Mindartis, Paelias, Péren, Quarion, Riardon, Rolen, Soveliss, Thamior, Tarivol, Théren, Varis.");
			caracteristiquesRace.add("Noms féminins : Adrie, Althaéa, Anastrianne, Andraste, Antinua, Béthrynne, Birel, Caélynn, Drusilia, Enna, Délosial, Iélénia, Jelenneth, Keyleth, Leshanna, Lia, Meriele, Mialee, Naivara, Quélenna, Quillathe, Sariel, Shanairra, Shava, Silaqui, Theirastre, Thia, Vadania, Valanthe, Xanaphie");
			caracteristiquesRace.add("Noms de famille (traduction en commun) : Amakiir (Fleurdegemme), Amastacie (Fleurstellaire), Galanodel (Murmurelunaire), Holimion (Roséedediamant), Ilphelkir (Boutondegemme), Liadon (Feuilleargent), Méliamne (Pieddechêne), Naïlo (Brisenocturne), Siannodel (RuisseauLunaire), Xiloscient (Pétald'or)");
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre valeur de Dextérité augmente de 2.");
			caracteristiquesRace.add("Âge : Bien que les elfes atteignent leur maturité physique environ au même âge que les humains, ils considèrent qu'être un adulte dépasse ce simple aspect et prend en compte l'expérience de la vie. Un elfe se déclare généralement adulte vers 100 ans et choisit à ce moment son nom d'adulte. Les elfes peuvent vivre jusqu'à 750 ans.");
			caracteristiquesRace.add("Taille : Les elfes mesurent généralement entre 1,50 et 1,80 mètre et sont minces. Ils sont de taille Moyenne.");
			caracteristiquesRace.add("Vitesse : La vitesse d'un elfe au sol est de 9 mètres.");
			caracteristiquesRace.add("Vision dans le noir : Habitué à la pénombre des forêts et au ciel nocturne, vous avez une vision supérieure dans l'obscurité et dans la lumière faible. Dans un rayon de 18 mètres, vous pouvez voir dans la lumière faible comme s'il s'agissait de lumière vive et dans la pénombre comme s'il s'agissait de lumière faible. Vous ne distinguez toutefois pas les couleurs dans l'obscurité, seulement des nuances de gris.");
			caracteristiquesRace.add("Sens aiguisés : Vous maitrisez la compétence Perception.");
			caracteristiquesRace.add("Ascendance féérique : Vous êtes avantagé sur les jets de sauvegarde contre l'effet charmé et vous ne pouvez être contraint à dormir par la magie.");
			caracteristiquesRace.add("Transe : Les elfes n'ont pas besoin de dormir. À la place, ils passent 4 heures par jour dans un état de méditation profonde, tout en étant semi-conscients (Le mot qui décrit cette méditation profonde en commun est \"transe\". Pendant cette méditation, vous faites une sorte de \"rêve\". Ces rêves sont en réalité des exercices mentaux qui sont devenus des éflexes au bout de plusieurs années de pratique. En vous reposant ainsi, vous bénéficiez des mêmes avantages que ceux conférés à un humain par 8 heures de sommeil.");
			caracteristiquesRace.add("Langues : Vous pouvez parler, lire et écrire le commun et l'elfique. Le langage des elfes est fluide, avec des intonations subtiles et une grammaire élaborée. La littérature des elfes est riche et variée et leurs chansons et po"
					+ "èmes sont populaires parmi les autres races. De nombreux bardes apprennent l'elfique afin de pouvoir ajouter des ballades à leur répertoire.");
			caracteristiquesRace.add("Variante raciale : D'antiques divisions scindent le peuple elfique en trois variantes raciales principales : les Haut-Elfes, les Elfes sylvestres et les Elfes noirs."); 
			caracteristiquesRace.add("Augmentation de caractéristiques : Votre valeur de charisme augmente de 1.");
			caracteristiquesRace.add("Vision dans le noir supérieure : Votre vision dans le noir fonctionne dans un rayon de 36 mètres.");
			caracteristiquesRace.add("Sensibilité au soleil : Vous êtes désavantagé lors des jets d'attaque et de Sagesse (perception) quand vous ou ce que vous tentez de percevoir se trouve sous la lumière directe du soleil.");
			caracteristiquesRace.add("Magie drow : Vous connaissez le sort mineur \"Lumières dansantes\". Quand vous atteignez le niveau 3, vous pouvez aussi lancer \"Lueurs féériques\". Quand vous atteignez le niveau 5, vous pouvez aussi lancer \" Ténèbres\". Vous devez terminer un repos long avant de relancer ce sort ainsi. Vous utilisez le charisme comme caractéristique incantatoire pour tous ces sorts. 0 ");
			caracteristiquesRace.add("Formation martiale drow : Vous maitrisez les rapières, les épées courtes et le arbalètes de poing. ");
			break;
		case "Halfelin" : 
			caracteristiquesRace.add("Noms masculins : Alton, Andre, Cade, Corrin, Eldon, Errich, Finnan, Garret, Lindal, Lyle, Merric, Milo, Osborn, Perrin, Reed, Roscoe, Wellby");
			caracteristiquesRace.add("Noms féminins : Andry, Bree, Callie, Cora, Euphémie, Jillian, Kithri, Lavinia, Lidda, Merla, Nedda, Paèle, Portia, Seraphine, Shaena, Trym, Vani, Verna");
			caracteristiquesRace.add("Noms de famille : Bontonneau, Buissons, Butepavé, Épine, Feuilledethé, Grandpré, Hautecolline, Récoltepinceaux, Roulecolline, Vertbouteille");
			caracteristiquesRace.add("Augmentation de caractéristiques : La valeur de dextérité augmente de 2.");
			caracteristiquesRace.add("Âge : Un halfelin atteint la maturité verrs 20 ans et vit généralement 150 ans.");
			caracteristiquesRace.add("Taille : D'une taille moyenne de 90 centimètres, kes halfelins pèsent environ 20 kilos. Ils sont de taille Petite.");
			caracteristiquesRace.add("Vitesse : La vitesse d'un halfelin au sol est de 7,50 mètres.");
			caracteristiquesRace.add("Chanceux : Quand un Halfelin fait un 1 sur un jet d'attaque, un jet de caractéristiques ou d'un jet de sauvegarde, il peut relancer le dé. Il doit toutefois garder le nouveau résultat.");
			caracteristiquesRace.add("Brave : L'halfelin est avantagé sur les jets de sauvegarde contre la terreur.");
			caracteristiquesRace.add("Agilité halfeline : L'halfelin peut traverser n'importe quel espace occupé par une créature d'au moins une catégorie de taille de moins que lui.");
			caracteristiquesRace.add("Langues : L'halfelin peut parler, lire et écrire le commun et l'halfelin. Bien que la langue des halfelins n'ait rien d'un secret, ils n'aiment pas l'apprendre aux autres. Ils écrivent très peu et n'ont donc pas énormément de livres. Leur tradition orale est par contre très riche. Presque tous les halfelins parlent le commun, ce qui leur permet de converser avec les gens qui habitent sur les mêmes terres qu'eux ou dont ils traversent les terres.");
			break;
		case "Pied-Léger" : 
			caracteristiquesRace.add("Noms masculins : Alton, Andre, Cade, Corrin, Eldon, Errich, Finnan, Garret, Lindal, Lyle, Merric, Milo, Osborn, Perrin, Reed, Roscoe, Wellby");
			caracteristiquesRace.add("Noms féminins : Andry, Bree, Callie, Cora, Euphémie, Jillian, Kithri, Lavinia, Lidda, Merla, Nedda, Paèle, Portia, Seraphine, Shaena, Trym, Vani, Verna");
			caracteristiquesRace.add("Noms de famille : Bontonneau, Buissons, Butepavé, Épine, Feuilledethé, Grandpré, Hautecolline, Récoltepinceaux, Roulecolline, Vertbouteille");
			caracteristiquesRace.add("Augmentation de caractéristiques : La valeur de dextérité augmente de 2.");
			caracteristiquesRace.add("Agumentation de caractéristiques (pied-léger) : ");
			caracteristiquesRace.add("Âge : Un halfelin atteint la maturité verrs 20 ans et vit généralement 150 ans.");
			caracteristiquesRace.add("Taille : D'une taille moyenne de 90 centimètres, les halfelins pèsent environ 20 kilos. Ils sont de taille Petite.");
			caracteristiquesRace.add("Vitesse : La vitesse d'un halfelin au sol est de 7,50 mètres.");
			caracteristiquesRace.add("Chanceux : Quand un Halfelin fait un 1 sur un jet d'attaque, un jet de caractéristiques ou d'un jet de sauvegarde, il peut relancer le dé. Il doit toutefois garder le nouveau résultat.");
			caracteristiquesRace.add("Brave : L'halfelin est avantagé sur les jets de sauvegarde contre la terreur.");
			caracteristiquesRace.add("Agilité halfeline : L'halfelin peut traverser n'importe quel espace occupé par une créature d'au moins une catégorie de taille de moins que lui.");
			caracteristiquesRace.add("Langues : L'halfelin peut parler, lire et écrire le commun et l'halfelin. Bien que la langue des halfelins n'ait rien d'un secret, ils n'aiment pas l'apprendre aux autres. Ils écrivent très peu et n'ont donc pas énormément de livres. Leur tradition orale est par contre très riche. Presque tous les halfelins parlent le commun, ce qui leur permet de converser avec les gens qui habitent sur les mêmes terres qu'eux ou dont ils traversent les terres.");
			break;
		case "Humain": 
			caracteristiquesRace.add("Augmentation de caractéristiques : Toutes les caractéristiques augmentent de 1. ");
			caracteristiquesRace.add("Âge : Les humains deivennent adultes à fin de l'adolescence et vivent moins d'un siècle.");
			caracteristiquesRace.add("Taille : Les humains ont des tailles et des carrures variées. Ils peuvent faire 1,50 mètres comme plus de 1,80 mètres. Les humaisn sont considérés comme de taille moyenne peu importe la taille, le poids ou la carrure. ");
			caracteristiquesRace.add("Vitesse : La vitesse de base d'un humain au sol est de 9 mètres.");
			caracteristiquesRace.add("Langues : Vous pouvez parler, lire et écrire le commun et une autre langue au choix. Les humains apprennent généralement la langue des peuples qu'ils fréquentent, même s'il s'agit parfois d'obscurs dialectes. Ils aiment parsemer leur langue d'expressions empruntés d'Autres races : des jurons orcs, des expressions musicales elfiques, des citations militaires naines, etc.");
			//List<String> caracteristiquesEthniques = getEthnie(ethnie);
			//caracteristiquesRace.addAll(caracteristiquesEthniques);
		}
	return caracteristiquesRace;
		
	}

	public List<String> getEthnies(String ethnie)
	{
		List<String> caracteristiquesEthniques = new ArrayList<String>();
		
		switch (ethnie)
		{
		case "callishite" :
			caracteristiquesEthniques.add("Les Calishites sont plus petits et plus trapus que la plupart des humains. Ils ont la peau bronzée et des cheveux et yeux marron foncé. On les trouve pincipalement aux sud-ouest de Féérune.");
			caracteristiquesEthniques.add("Noms masculins : Aseir, Bardeid, Haseid, Khemed, Mehmen, Sudeiman, Zasheir");
			caracteristiquesEthniques.add("Noms féminins : Atala, Ceidil, Hama, Jasmal, Meilil, Seipora, Yasheira, Zasheida");
			caracteristiquesEthniques.add("Noms de famille :  Basha, Dumein, Jassan, Khalid, Mostana, Pashar, Rein");
			break;
		case "Chondatien":
			caracteristiquesEthniques.add("Les Chondatiens présentent une silhouette élancée, une peau tannée et des cheveux châtains allant quasiment du blond au brun. Ils sont généralement de grande taille, avec des yeux verts ou marron, mais cela n'a rien d'unniversel. Les humains d'origine chondathienne dominent le centre de Féérune, autour de la mer Intérieure.");
			caracteristiquesEthniques.add("Noms masculins : Darvin, Dorn, Evendor, Gorstag, Grim, Helm, Malark, Morn, Randal, Stedd");
			caracteristiquesEthniques.add("Noms féminins : Arveene, Esvele, Jhessail, Kerri, Lureeene, Miri, Rowan, Sjamdro. Tessèle");
			caracteristiquesEthniques.add("Noms de famille : Dragonbrun, Flanecouronne, Grandcerf, Griscastel, Lièvre, Platbois");
			break;
		case "Damarien" : 
			caracteristiquesEthniques.add("Les Damariens occupent principalement le nord-ouest de Féérune. Ils sont de taille et de corpulence moyennes, leur peau allant du pâle au bronzé. Ils ont des cheveux châtains ou bruns, mais la couleur de leurs yeux varie beaucoup, le marron restant le plus répandu.");
			
		}
		return caracteristiquesEthniques;
	}

	}

