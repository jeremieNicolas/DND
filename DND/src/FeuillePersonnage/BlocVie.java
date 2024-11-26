package FeuillePersonnage;

public class BlocVie {
	int classeArmure;
	int pvMax;
	int pvActuels;
	int pvTemporaire;
	int jetContreMortReussite;
	int jetContreMortEchec;
	String déVie;
	
	BlocVie(){}

	public BlocVie(int classeArmure, int pvMax, int pvActuels, int pvTemporaire, int jetContreMortReussite,
			int jetContreMortEchec, String déVie) {
		super();
		this.classeArmure = classeArmure;
		this.pvMax = pvMax;
		this.pvActuels = pvActuels;
		this.pvTemporaire = pvTemporaire;
		this.jetContreMortReussite = jetContreMortReussite;
		this.jetContreMortEchec = jetContreMortEchec;
		this.déVie = déVie;
	}

	public int getClasseArmure() {
		return classeArmure;
	}

	public void setClasseArmure(int classeArmure) {
		this.classeArmure = classeArmure;
	}

	public int getPvMax() {
		return pvMax;
	}

	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}

	public int getPvActuels() {
		return pvActuels;
	}

	public void setPvActuels(int pvActuels) {
		this.pvActuels = pvActuels;
	}

	public int getPvTemporaire() {
		return pvTemporaire;
	}

	public void setPvTemporaire(int pvTemporaire) {
		this.pvTemporaire = pvTemporaire;
	}

	public int getJetContreMortReussite() {
		return jetContreMortReussite;
	}

	public void setJetContreMortReussite(int jetContreMortReussite) {
		this.jetContreMortReussite = jetContreMortReussite;
	}

	public int getJetContreMortEchec() {
		return jetContreMortEchec;
	}

	public void setJetContreMortEchec(int jetContreMortEchec) {
		this.jetContreMortEchec = jetContreMortEchec;
	}

	public String getDéVie() {
		return déVie;
	}

	public void setDéVie(String déVie) {
		this.déVie = déVie;
	}
	
	
}
