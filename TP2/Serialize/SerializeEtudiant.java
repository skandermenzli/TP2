import java.io.*;

public class SerializeEtudiant {
public static void main(String argv[]) { 
        Adresse addr = new Adresse("MESTIR","TOUNES",20,10);
        Personne personne = new Personne("Taher","Menzli",350,20,addr,new Compte(addr,20));
        Etudiant etudiant = new Etudiant(personne, 99);
        ObjectOutputStream oos = null;
        try { 
            FileOutputStream fichier_etudiant = new FileOutputStream("etudiant.ser"); 
            oos = new ObjectOutputStream(fichier_etudiant);
            oos.writeObject(etudiant); 
            oos.close();
        }
        catch (java.io.IOException e) 
        { 
            try {
                oos.flush();
            } catch (IOException e1) {
                
                e1.printStackTrace();
            }
            e.printStackTrace(); 
        }
    }
}