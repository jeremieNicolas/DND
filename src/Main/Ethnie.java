package Main;

import java.util.ArrayList;

public class Ethnie {
	String nomEthnie;
	String caracteristiques;
	ArrayList<String> noms;
	
	Ethnie(){}
	
	Ethnie(String nomEthnie, String caracteristiques, ArrayList<String> noms){
		this.nomEthnie = nomEthnie;
		this.caracteristiques = caracteristiques; 
		this.noms = noms;
	}
}
