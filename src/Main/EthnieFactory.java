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
			caracteristiquesEthniques.add("Les Chondatiens présentent une silhouette");
			break;
		case "Damarien":
			break;
		case "Illuskien":
			break;
		case "Mulien":
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
