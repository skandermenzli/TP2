import java.io.*;

public class DeSerializePersonne {
    public static void main(String argv[]) {
        try {
            FileInputStream fichier = new FileInputStream("personne.ser");
            ObjectInputStream ois = new ObjectInputStream(fichier);
            Personne personne = (Personne) ois.readObject();

            System.out.println("Personne : ");
            System.out.println("nom : " + personne.getNom());
            System.out.println("prenom : " + personne.getPrenom());
            System.out.println("taille : " + personne.getTaille());
            System.out.println("Age : " + personne.getAge());
            System.out.println("Adresse : " + personne.getAddr().getNumero_rue() + " " + personne.getAddr().getNumero_maison() + " " + personne.getAddr().getPays() + " " + personne.getAddr().getVille());
            System.out.println("Compte : " + personne.getCompte().getId());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}