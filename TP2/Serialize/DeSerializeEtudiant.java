import java.io.*;

public class DeSerializeEtudiant {
    public static void main(String argv[]) {
        try {
            FileInputStream fichier = new FileInputStream("etudiant.ser");
            ObjectInputStream ois = new ObjectInputStream(fichier);
            Etudiant etudiant = (Etudiant) ois.readObject();

            System.out.println("etudiant : ");
            System.out.println("nom : " + etudiant.getNom());
            System.out.println("prenom : " + etudiant.getPrenom());
            System.out.println("taille : " + etudiant.getTaille());
            System.out.println("Age : " + etudiant.getAge());
            System.out.println("Adresse : " + etudiant.getAddr().getNumero_rue() + " " + etudiant.getAddr().getNumero_maison() + " " + etudiant.getAddr().getPays() + " " + etudiant.getAddr().getVille());
            System.out.println("idEtudiant : " + etudiant.getIdEtudiant());
            System.out.println("Compte : " + etudiant.getCompte().getId());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
