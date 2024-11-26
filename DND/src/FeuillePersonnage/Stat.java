package FeuillePersonnage;

public class Stat {
	boolean maitrise;
	int valeur;
	
	Stat(){}
	Stat(boolean maitrise, int valeur)
	{
		this.maitrise = maitrise;
		this.valeur = valeur;
	}
	public boolean isMaitrise() {
		return maitrise;
	}
	public void setMaitrise(boolean maitrise) {
		this.maitrise = maitrise;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
}
