package Classes;

public  class ÉvolutionBarbare {
	int niveau;
	int bonusMaitrise;
	String aptitudes;
	int nbRages;
	int bonusRages;
	
	ÉvolutionBarbare(){}
	
	ÉvolutionBarbare(int niveau, int bonusMaitrise, String aptitudes, int nbRages, int bonusRages)
	{
		this.niveau = niveau;
		this.bonusMaitrise = bonusMaitrise;
		this.aptitudes = aptitudes;
		this.nbRages = nbRages;
		this.bonusMaitrise = bonusMaitrise;
	}


	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getBonusMaitrise() {
		return bonusMaitrise;
	}

	public void setBonusMaitrise(int bonusMaitrise) {
		this.bonusMaitrise = bonusMaitrise;
	}

	public String getAptitudes() {
		return aptitudes;
	}

	public void setAptitudes(String aptitudes) {
		this.aptitudes = aptitudes;
	}

	public int getNbRages() {
		return nbRages;
	}

	public void setNbRages(int nbRages) {
		this.nbRages = nbRages;
	}

	public int getBonusRages() {
		return bonusRages;
	}

	public void setBonusRages(int bonusRages) {
		this.bonusRages = bonusRages;
	}
	
	
}