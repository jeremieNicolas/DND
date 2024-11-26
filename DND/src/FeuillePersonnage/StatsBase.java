package FeuillePersonnage;

public class StatsBase {
	int force;
	int dexterite;
	int constitution;
	int intelligence;
	int sagesse;
	int charisme;
	
	int modifForce;
	int modifDexterite;
	int modifConstitution;
	int modifIntelligence;
	int modifSagesse;
	int modifCharisme;
	
	StatsBase(){}
	StatsBase(int force, int dexterite, int constitution, int intelligence, int sagesse, int charisme)
	{
		this.force = force;
		this.dexterite = dexterite;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.sagesse = sagesse;
		this.charisme = charisme;
		trouverModificateurs();
	}
	private void trouverModificateurs() {
		// TODO Auto-generated method stub
		modifForce = (this.force-10)/2;
		modifDexterite = (this.dexterite-10)/2;
		modifConstitution = (this.constitution-10)/2;
		modifIntelligence = (this.intelligence-10)/2;
		modifSagesse = (this.sagesse-10)/2;
		modifCharisme = (this.charisme-10)/2;
	}
}
