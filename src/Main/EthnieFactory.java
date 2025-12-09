package Main;

import java.util.ArrayList;

public class EthnieFactory {
	public static ArrayList<String> getCaracteristiquesEthniques(String Ethnie){
		ArrayList<String> caracteristiquesEthniques = new ArrayList<String>();
		
		switch(Ethnie)
		{
		case "Calishite":
			caracteristiquesEthniques.add("Les Callishites sont plus petits et plus trapus que la plupart des humains. Ils ont la peau bronzée et des cheveux et yeux marrons foncé. On les trouve généralement au sud-ouest de Féérune.");
			caracteristiquesEthniques.add("Noms masculins Callishites : Aseir, Bardeid, Haseid, Khemed, Mehmen, Sudeiman, Zasheir.");
			caracteristiquesEthniques.add("Noms féminins Callishites : Atala, Ceidil, Hama, Jasmal, Melil, Seipora, Yasheira, Zasheida");
			caracteristiquesEthniques.add("Noms de famille : Basha, Dumein, Jassan, Khalid, Mostana, Pashar, Reim");
			break;
		case "Chondantien":
			caracteristiquesEthniques.add("Les Chondatiens présentent une silhouette élancée, une peau tannée et des cheveux châtains allant quasiment du blond au brun. Ils sont généralement de grande taille, avec des yeux verts ou marron, mais cela n'a rien d'imoversel. Les humains d'origine chondatienne dominent le centre de Féérune, autour de la mer intérieure.");
			caracteristiquesEthniques.add("Noms masculins Chondatiens : Darvin, Dorn, Evendur, Gorstag, Grim, Helm, Malark, Morn, Randal, Stedd.");
			caracteristiquesEthniques.add("Noms Féminins Chondatiens : Arveene, Eavele, Jhessail, Kerri, Lureene, Miri, Rowan, Shandri, Tessèle");
			caracteristiquesEthniques.add("Noms de famille Chondatiens : Dragonbrun, Flânecouronne, Grandcerf, Griscastel, Lièvre, Platbois");
			break;
		case "Damarien":
			caracteristiquesEthniques.add("Les Damariens occupent principalement le nord-ouest de Féérune. Ils sont de taille et de corpulence moyennes, leur peau allant du pâle au bronzé. Ils ont des cheveux châtains ou bruns, mais la couleur de leurs yeux varie beaucoup, le marron restant le plus répandu.");
			caracteristiquesEthniques.add("Noms masculins Damariens : Bor, Fodel, Glar, Grigor, Igan, Ivor, Kosef, Mival, Orel, Pavel, Sergor");
			caracteristiquesEthniques.add("Nons féminins Damariens : Aléthre, Kara, Katernine, Mara, Natali, Olma, Tana, Zora");
			caracteristiquesEthniques.add("Noms de famille Damariens : Besk, Chernin, Dorsk, Kulenov, Marsk, Németsk, Shemov, Starag");
			break;
		case "Illuskien":
			caracteristiquesEthniques.add("Les Illuskiens sont des gens de grande taille à la peau claire et aux yeux bleus ou ris acier. La plupart ont des cheveux noirs de jais, mais ceux qui vivent aux confins nord-piest ont des chevelures blondes, rousses ou chatain clair.");
			caracteristiquesEthniques.add("Noms masculins Illuskiens : Andre, Blath, Bran, Frath, Geth, Landre, Luth, Malcre, Stor, Taman, Urth");
			caracteristiquesEthniques.add("Noms féminins Illuskiens : Amafrey, Bèthe, Cefrey, Kethra, Mara, Olfa, Silifrey, Westra");
			caracteristiquesEthniques.add("Noms de famille Illuskiens : Cornecorneille, Manque, Porteur, Rivvent, Souffletempête, Vifbois");
			break;
		case "Mulien":
			caracteristiquesEthniques.add("Les Muliens prédominent sur les rives sud et sud-est de la mer Intérieure. Ils sont généralement grands et minces, dotés d'une peau ambtée et d'yeux noisette ou marron. Leurs cheveux cont du brun au châtain foncé, mais, sur les terres où cette ethnie est majoritaire, les nobles et bien d'autres muliens se rasent le crâne."); 
			caracteristiquesEthniques.add("Noms masculins Muliens : Aoth, Bareris, Ehput-Ki, Kethoth, Mumed, Ramas, So-Kehur, Thazar-de, Urhur");
			caracteristiquesEthniques.add("Noms féminins Muliens : Arizima, Chathi, Nephis, Nulara, Murithi, Sefris, Thola, Umara");
			break;
		case "Rashémi":
			break;
		case "Shou":
			break;
		case "Téthyrien":
			break;
		case "Turami":
			break;
		}
		return caracteristiquesEthniques;
	}
}
