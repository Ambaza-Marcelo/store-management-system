package projet;
import projet.*;
public class IntroductionJavaProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
		Menu();
		}while(true);
		
	}
	
	public static void Menu(){
		System.out.println("1.Creer un nouveau produit");
		System.out.println("2.Creer un nouveau client");
		System.out.println("3.Creer un nouvel achat");
		System.out.println("4.Creer un nouveau vente");
		
		System.out.println("--------------------------------");
		
		System.out.println("5.Afficher les produits deja crees");
		System.out.println("6.Afficher les clients deja crees");
		System.out.println("7.Afficher les achats deja crees");
		System.out.println("8.Afficher les ventes deja crees");
		System.out.println("9.Quitter le programme");
		
		switch(Client.saisieEntier("choisir l'un des choix ci-haut")){
		case 1 : 
			new Produit(Client.saisie_Chaine_Caracteres("saisir le nom du produit"),Client.saisieEntier("saisir le prix unitaire du produit"),
					Client.saisieEntier("saisir le quantite du produit"));
			break;
			
		case 5:
			System.out.println("voici la liste des produits deja crees");
			Produit.afficher_liste_produit();
			System.out.println("-----------------------------------------");
			break;
		case 3:
			new Achat(Client.saisie_Chaine_Caracteres("saisir la description de l'achat"));
			break;
		case 7:
			System.out.println("voici la liste des achats deja crees");
			Achat.afficher_liste_achats();
			break;
		case 4:
			new Vente(Client.saisie_Chaine_Caracteres("saisir la description de ce que vous avez vendu"));
			break;
			
		case 8:
			System.out.println("voici la liste des ventes deja crees");
			System.out.println("--------------------------------------");
			Vente.afficher_liste_ventes();
			break;
		case 2:
			Produit prod = null;
			System.out.println("affichage des produits deja crees");
			Produit.afficher_liste_produit();
			System.out.println("-----------------------------------");
			
			if(Produit.getTableau_statique_produit()!=null){
				prod= Produit.getTableau_statique_produit()[Client.saisieEntier("choisir l'un des index ci-haut")];
				if(prod.getQuantite()>0){
					prod.modifier_produit(Client.saisieEntier("saisir la quantite"));
				}else{
					System.out.println("la quantite est invalide");
				}
				new Client(Client.saisie_Chaine_Caracteres("saisir le nom du client"),Client.saisie_Chaine_Caracteres("saisir le prenom du client")
						,Client.saisie_Chaine_Caracteres("saisir l'adresse du client"),Client.saisieEntier("saisir le numero telephone du client"),prod);
			}else{
				System.out.println("pas de donnees dans le tableau du produit");
			}
			break;
		case 6:
			System.out.println("affichage des clients deja crees");
			Client.afficher_liste_client();
			System.out.println("-------------------------------------------------");
			break;
			
		default:
		}
	}

}
