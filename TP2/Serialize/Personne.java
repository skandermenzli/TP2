import java.io.Serializable;

public class Personne implements Serializable{
    private String nom = "";
    private String prenom = "";
    private int taille = 0;
    private transient int age = 0;
    Adresse addr;
    Compte compte;

    public Personne(String nom, String prenom, int taille,int age,Adresse addr,Compte c) {
        this.nom = nom;
        this.taille = taille;
        this.prenom = prenom;
        this.age = age;
        this.addr = addr; 
        this.compte = c;
    }
    public int getAge(){
        return age;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Adresse getAddr() {
        return addr;
    }
    public void setAddr(Adresse addr) {
        this.addr = addr;
    }
    public Compte getCompte() {
        return compte;
    }
    public void setCompte(Compte compte) {
        this.compte = compte;
    }

}