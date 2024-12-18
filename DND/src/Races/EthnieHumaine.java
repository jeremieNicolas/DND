package Races;

import java.util.ArrayList;
import java.util.List;

public class EthnieHumaine {
	String nomEthnie;
	String description;
	List<String> prénomsMasculinsSuggérés;
	List<String> prénomsFémininsSuggérés;
	List<String> nomsFamilleSuggérés;
	List<String> prénomsEnfantsSuggérés;
	EthnieHumaine(String string, String string2, List<String> nomsMasculins, List<String> nomsFéminins, List<String> nomsFamille){}
	
	EthnieHumaine(String nomEthnie, String description)
	{
		this.nomEthnie = nomEthnie;
		this.description = description;
		this.prénomsMasculinsSuggérés = new ArrayList<String>();
		this.prénomsFémininsSuggérés = new ArrayList<String>();
		this.nomsFamilleSuggérés = new ArrayList<String>();
		this.prénomsEnfantsSuggérés = new ArrayList<String>();
	}

	public String getNomEthnie() {
		return nomEthnie;
	}

	public void setNomEthnie(String nomEthnie) {
		this.nomEthnie = nomEthnie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
