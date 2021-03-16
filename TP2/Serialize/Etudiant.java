import java.io.Serializable;

public class Etudiant extends Personne implements Serializable{
    private int idEtudiant = 0;
    public Etudiant(String nom, String prenom, int taille, int age,Adresse addr,Compte compte,int idEtudiant) {
        super(nom, prenom, taille, age,addr,compte);
        this.idEtudiant = idEtudiant;
    }
    public Etudiant(Personne p ,int idEtudiant) {
        super(p.getNom(), p.getPrenom(), p.getTaille(), p.getAge(),p.getAddr(),p.getCompte());
        this.idEtudiant = idEtudiant;
    }

    public int getIdEtudiant(){
        return idEtudiant;
    }

}