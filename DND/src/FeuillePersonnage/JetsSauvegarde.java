package FeuillePersonnage;

public class JetsSauvegarde {
	Stat force;
	Stat dexterite;
	Stat constitution;
	Stat intelligence;
	Stat sagesse;
	Stat charisme; 
	
	JetsSauvegarde(){}
	JetsSauvegarde(Stat force, Stat dexterite, Stat constitution, Stat intelligence, Stat sagesse, Stat charisme)
	{
		this.force = force;
		this.dexterite = dexterite;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.sagesse = sagesse;
		this.charisme = charisme;
	}
	public Stat getForce() {
		return force;
	}
	public void setForce(Stat force) {
		this.force = force;
	}
	public Stat getDexterite() {
		return dexterite;
	}
	public void setDexterite(Stat dexterite) {
		this.dexterite = dexterite;
	}
	public Stat getConstitution() {
		return constitution;
	}
	public void setConstitution(Stat constitution) {
		this.constitution = constitution;
	}
	public Stat getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Stat intelligence) {
		this.intelligence = intelligence;
	}
	public Stat getSagesse() {
		return sagesse;
	}
	public void setSagesse(Stat sagesse) {
		this.sagesse = sagesse;
	}
	public Stat getCharisme() {
		return charisme;
	}
	public void setCharisme(Stat charisme) {
		this.charisme = charisme;
	}
}
