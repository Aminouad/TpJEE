package model;

public class Etudiant {
	int num;
	String prenom,nom,tel;
public Etudiant(int num,String prenom,String nom,String tel){
	this.num=num;
	this.prenom=prenom;
	this.nom=nom;
	this.tel=tel;
}

public Etudiant() {
	super();
}

@Override
public String toString() {
	return "Etudiant [num=" + num + ", prenom=" + prenom + ", nom=" + nom
			+ ", tel=" + tel + "]";
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
}
