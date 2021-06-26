package projet;
import projet.*;
public class Vente {
	private int venteID;
	private String description;
	private static Vente[] tableau_statique_vente;
	
	/*
	 * le constructeur de la classe Vente
	 */
	public Vente(String description){
		this.description = description;
		add_new_vente(this);
	}
	
	public static void add_new_vente(Vente nouveau_vente_a_jouter){
		if(tableau_statique_vente == null){
			tableau_statique_vente = new Vente[1];
			tableau_statique_vente[0] = nouveau_vente_a_jouter;
		}else{
			Vente[] tableau_statique_temporaire = tableau_statique_vente;
			tableau_statique_vente = new Vente[tableau_statique_temporaire.length+1];
			
			for(int i=0;i<tableau_statique_temporaire.length;i++){
				tableau_statique_vente[i] = tableau_statique_temporaire[i];
			}
			tableau_statique_vente[tableau_statique_temporaire.length-1] = nouveau_vente_a_jouter;
		}
	}
	
	public static void afficher_liste_ventes(){
		if(tableau_statique_vente == null){
			System.out.println("pas de donnees,souvenez-vous qu'iln'y a pas de base de donnees");
		}else{
			for(int i =0;i<tableau_statique_vente.length;i++){
				System.out.println(i+")"+tableau_statique_vente[i].afficher_vente());
			}
		}
	}
	/*
	 * les accesseurs et les mutateurs
	 */

	public int getVenteID() {
		return venteID;
	}

	public void setVenteID(int venteID) {
		this.venteID = venteID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String afficher_vente(){
		return description;
	}
	
}
