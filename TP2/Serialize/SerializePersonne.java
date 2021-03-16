import java.io.*;

public class SerializePersonne {
public static void main(String argv[]) { 
        Adresse addr = new Adresse("INSAT","INSAT",2,2);
        Personne personne = new Personne("Taher","Menzli",350,20,addr,new Compte(addr,10));
        ObjectOutputStream oos = null;
        try { 
            FileOutputStream fichier = new FileOutputStream("personne.ser"); 
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(personne); 
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