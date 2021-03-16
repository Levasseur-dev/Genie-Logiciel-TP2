package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyse la requête et indique s'il faut envoyer une équipe d'intervention pour le patient en fonction du résultat de la comparaison de données.
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Compare les données entre celle que le patient envoie et les données stockées dans la base de données, si les symptomes n'ont pas été encore observé le test est positif.		
		return "Cluster trouvé";
	}

}
