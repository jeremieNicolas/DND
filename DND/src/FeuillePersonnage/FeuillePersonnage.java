package FeuillePersonnage;

import java.util.List;

public class FeuillePersonnage {
	IdPersonnage identification;
	StatsBase statsBase;
	JetsSauvegarde jetsSauvegarde;
	Compétences compétences;
	int maitrise;
	List<String> maitrisesEtLangues;
	int sagessePassive; 
	BlocVie blocVie;
	
	FeuillePersonnage(){}
	
	FeuillePersonnage(IdPersonnage id, StatsBase stats, JetsSauvegarde jetsSauvegarde, Compétences compétences, List<String> maitrisesEtLangues, int sagessePassive, BlocVie blocVie)
	{
		this.identification = id;
		this.statsBase = stats;
		this.jetsSauvegarde = jetsSauvegarde;
		this.compétences = compétences;
		this.maitrisesEtLangues = maitrisesEtLangues;
		this.sagessePassive = sagessePassive;
		this.blocVie = blocVie;
	}
	
	
}
