package projet;
import projet.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
 * 
 * creation de la classe Client
 */
public class Client {
	/*
	 * les attributs de la classe Client
	 */
	private int clientID;
	private String nom;
	private String prenom;
	private String adresse;
	private int telephone;
	private Produit produitID;
	private static BufferedReader in = null;
	private static List<Client> list_client = new ArrayList<Client>();
	
	/*
	 * le constructeur de la classe Client
	 */
	public Client(String nom,String prenom,String adresse,int telephone,Produit prod){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.produitID = prod;
		list_client.add(this);
	}
	
	static{
		in= new BufferedReader(new InputStreamReader(System.in));
	}
	/*
	 * 
	 * la methode qui permet de saisir l'entier
	 */
	 public static int saisieEntier(String message){
			int a=0;
			String val="";
			System.out.println(message);
			 do{
			try {
					
					val=in.readLine();
					a=Integer.parseInt(val);
					break;
				} catch (IOException e) {
					// TODO Auto-generated  catch block
					e.printStackTrace();
				}
				catch(NumberFormatException ex){
					System.out.println("Tapez s'il vous plait un entier!!!");
				}
			 }while(true);
			
			
			return a;
		}
	 
	 /*
	  * la methode qui permet de saisir la chaine
	  */
	 public static String saisie_Chaine_Caracteres(String mes){
	    	
	    	String val="";
	         if(in!=null){
	        	 System.out.println(mes);
	        	 try {
					val=in.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	 
	         }
	    	return val;
	    }
	 

	 /*
	  * generation automatique des accesseurs et les mutateurs
	  */
	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
	public static void add_new_client(){
		
	}
	
	public static String afficher_liste_clients(String liste){
		return liste;
	}
	/*
	 * 
	 * liste des clients
	 */
	public static void afficher_liste_client(){
		if(list_client.size()>0){
			for(int i=0;i<list_client.size();i++){
				System.out.println(i+")"+((Client)list_client.get(i)).afficher_client());
			}
		}else{
			System.out.println("pas de donnees,souvenez-vous qu'il n'y a pas de base de donnees");
		}
	}
	
	public String afficher_client(){
		return nom+","+prenom+","+adresse+","+telephone+","+produitID.afficher_produit();
	}

	public static List<Client> getList_client() {
		return list_client;
	}
	
	
}
