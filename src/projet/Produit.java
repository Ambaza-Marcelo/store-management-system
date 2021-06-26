package projet;
import projet.*;
public class Produit {
	private int produitID;
	private String nom;
	private int prix_unitaire;
	private int quantite;
	private static Produit[] tableau_statique_produit;
	
	/*
	 * 
	 * le constructeur de la classe Produit
	 */
	
	public Produit(String nom,int prix_unitaire,int quantite){
		this.nom = nom;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
		add_new_produit(this);
	}
	
	/*
	 * ajouter les produits dans un tableau
	 */

	public static void add_new_produit(Produit ajout_du_nouveau_produit){
		if(tableau_statique_produit == null){
			tableau_statique_produit = new Produit[1];
			tableau_statique_produit[0] = ajout_du_nouveau_produit;
		}else{
			Produit[] tableau_statique_temporaire = tableau_statique_produit;
			tableau_statique_produit = new Produit[tableau_statique_produit.length+1];
			
			for(int i=0;i<tableau_statique_temporaire.length;i++){
				tableau_statique_produit[i] = tableau_statique_temporaire[i];
			}
			tableau_statique_produit[tableau_statique_produit.length-1] = ajout_du_nouveau_produit;
			tableau_statique_temporaire = null;
		}
	}
	/*
	 * afficher la liste des produits
	 */
	public static void afficher_liste_produit(){
		if(tableau_statique_produit == null){
			System.out.println("pas de donnes,souvenez-vous qu'il n'y a pas de base de donnees");
		}else{
			for(int i=0;i<tableau_statique_produit.length;i++){
				System.out.println(i+")"+tableau_statique_produit[i].afficher_produit());
			}
		}
	}
	
	public String afficher_produit(){
		return nom+","+prix_unitaire+"Fbu"+","+quantite+","+prix_unitaire*quantite+"Fbu";
	}
	/*
	 * modification de la quantite du produit
	 */
	public void modifier_produit(int quantite){
		this.quantite = quantite;
	}
	
	public int getProduitID() {
		return produitID;
	}

	public void setProduitID(int produitID) {
		this.produitID = produitID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(int prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public static Produit[] getTableau_statique_produit() {
		return tableau_statique_produit;
	}
	
	
	
	
}
