package projet;
import projet.*;
public class Achat {
	private int achatID;
	private String description;
	private static Achat[] tableau_statique_achat;
	
	/*
	 * le constructeur de la classe Achat
	 */
	public Achat(String description){
		this.description = description;
		add_new_achat(this);
	}

	public static void add_new_achat(Achat nouvel_achat_a_ajouter){
		if(tableau_statique_achat == null){
			tableau_statique_achat = new Achat[1];
			tableau_statique_achat[0] = nouvel_achat_a_ajouter;
		}else{
			Achat[] tableau_statique_temporaire = tableau_statique_achat;
			tableau_statique_achat = new Achat[tableau_statique_temporaire.length+1];
			
			for(int i =0;i<tableau_statique_temporaire.length;i++){
				tableau_statique_achat[i] = tableau_statique_temporaire[i];
			}
			tableau_statique_achat[tableau_statique_temporaire.length-1] = nouvel_achat_a_ajouter;
			tableau_statique_temporaire = null;
		}
	}
	
	public static void afficher_liste_achats(){
		if(tableau_statique_achat == null){
			System.out.println("pas des donnes,souvenez-vous qu'il n'y a pas de base de donnees");
		}else{
			for(int i=0;i<tableau_statique_achat.length;i++){
				System.out.println(i+")"+tableau_statique_achat[i].afficher_achat());
			}
		}
	}
	
	public int getAchatID() {
		return achatID;
	}


	public void setAchatID(int achatID) {
		this.achatID = achatID;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public String afficher_achat(){
		return description;
	}
	
	
}
