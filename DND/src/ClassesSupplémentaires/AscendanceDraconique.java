package ClassesSupplémentaires;

public class AscendanceDraconique {
	String dragon;
	String typeDégâts;
	String souffle;
	String jetDeSauvegarde;
	
	AscendanceDraconique(){}
	
	public AscendanceDraconique(String dragon, String typeDégâts, String souffle, String jetDeSauvegarde)
	{
		this.dragon = dragon;
		this.typeDégâts = typeDégâts;
		this.souffle = souffle;
		this.jetDeSauvegarde = jetDeSauvegarde;
	}

	public String getDragon() {
		return dragon;
	}

	public void setDragon(String dragon) {
		this.dragon = dragon;
	}

	public String getTypeDégâts() {
		return typeDégâts;
	}

	public void setTypeDégâts(String typeDégâts) {
		this.typeDégâts = typeDégâts;
	}

	public String getSouffle() {
		return souffle;
	}

	public void setSouffle(String souffle) {
		this.souffle = souffle;
	}

	public String getJetDeSauvegarde() {
		return jetDeSauvegarde;
	}

	public void setJetDeSauvegarde(String jetDeSauvegarde) {
		this.jetDeSauvegarde = jetDeSauvegarde;
	}
	
	
}
