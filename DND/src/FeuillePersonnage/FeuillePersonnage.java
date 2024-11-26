package FeuillePersonnage;

public class FeuillePersonnage {
	IdPersonnage identification;
	StatsBase statsBase;
	JetsSauvegarde jetsSauvegarde;
	Compétences compétences;
	FeuillePersonnage(){}
	
	FeuillePersonnage(IdPersonnage id, StatsBase stats, JetsSauvegarde jetsSauvegarde, Compétences compétences)
	{
		this.identification = id;
		this.statsBase = stats;
		this.jetsSauvegarde = jetsSauvegarde;
		this.compétences = compétences;
	}
	
	
}
