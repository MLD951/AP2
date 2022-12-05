package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vue.Accueil;

import model.ADHERENT;
import model.AUTEUR;
import model.LIVRE;



public class ProgrammePrincipal {

	private static ArrayList<LIVRE> ListLivre;
	private static ArrayList<AUTEUR> ListAuteur;
	private static ArrayList<ADHERENT> ListAdherent;
	
	public static LIVRE findlivre(String ISBN)
	{
		for(int i=0;i!=ListLivre.size();i++)
		{
			if(ListLivre.get(i).getISBN().equals(ISBN))
			{
				return ListLivre.get(i);
			}
		}
		return null;
	}
	
	public static ADHERENT findadherent(String num)
	{
		for(int i=0;i!=ListAdherent.size();i++)
		{
			if(ListAdherent.get(i).getNum().equals(num))
			{
				return ListAdherent.get(i);
			}
		}
		return null;
	}
	
	public static AUTEUR findauteur(String num)
	{
		for(int i=0;i!=ListAuteur.size();i++)
		{
			if(ListAuteur.get(i).getNum().equals(num))
			{
				return ListAuteur.get(i);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String BDD="AP2_2SIO";
		String url="jdbc:mysql://localhost:3306/"+BDD;
		String user="root";
		String passwd="";

		ListLivre=new ArrayList<LIVRE> ();
		ListAuteur=new ArrayList<AUTEUR> ();
		ListAdherent=new ArrayList<ADHERENT> ();
		
		//************************************************
		// CONNEXION A LA BDD ****************************
		//************************************************
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,passwd);
		
		//******************************************************
		//LANCEMENT DE LA VUE ACCUEIL AVEC LE PROGRAMME PRINCIPAL
		Accueil a = new Accueil();
		//*******************************************************
		
		
	}

}