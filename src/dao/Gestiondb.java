package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;


import model.Etudiant;

public class Gestiondb implements IGestion {
Connection con;
public Gestiondb(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/etd","root","");
		}catch(Exception e) {
			e.printStackTrace();
		System.out.println("mochkla fel cnx base");
		}
		
}

public List<Etudiant> getAllEtudiants() {
	List<Etudiant>	l=new ArrayList<Etudiant>();
	String req="SELECT * FROM etudiant";
	try{
		
		PreparedStatement stmt = con.prepareStatement (req);
		ResultSet resultats = stmt.executeQuery ();
		while (resultats.next()) {
            Etudiant p=new Etudiant();
            p.setNum(resultats.getInt ("num"));
            p.setNom(resultats.getString("nom"));
            p.setPrenom(resultats.getString("prenom"));
            p.setTel(resultats.getString("tel"));
			
            		l.add(p);
		}
		
			}
	catch (SQLException e){
		e.printStackTrace();
		System.out.println("mochkla fel get alletd");
		return null;

	}
	
	
	return l;
}
public void addEtudiant(Etudiant p){
	String s="INSERT INTO etudiant VALUES(?,?,?,?)";
	try{
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1,p.getNum());
		ps.setString(2,p.getPrenom());
		ps.setString(3,p.getNom());
		ps.setString(4,p.getTel());

		ps.executeUpdate ();

	

	}catch (SQLException e){
		e.printStackTrace();
		System.out.println("mochkla fel ajout");
	}
}
public void deleteEtudiant(int num){
	String s="DELETE FROM etudiant WHERE num="+num;

	try{
		PreparedStatement ps=con.prepareStatement(s);
		ps.executeUpdate ();
		}
	catch (SQLException e){
		e.printStackTrace();
	}
}
public boolean verif(String user,String mp){
	boolean x=false;
	String req="SELECT * FROM compte";
	try{
		PreparedStatement stmt = con.prepareStatement (req);
		ResultSet resultats = stmt.executeQuery ();
		
		while(resultats.next()) {
		if(resultats.getString("user").equals(user) && 		resultats.getString("mp").equals(mp)) 
			x=true ;
				


	}}
	catch (SQLException e){
		e.printStackTrace();
	}
	return  x;
}
}