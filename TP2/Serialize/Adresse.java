import java.io.Serializable;

public class Adresse implements Serializable{
    private String ville = "";
    private String pays = "";
    private int numero_rue = 0;
    private int numero_maison = 0;
    
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public int getNumero_rue() {
        return numero_rue;
    }
    public void setNumero_rue(int numero_rue) {
        this.numero_rue = numero_rue;
    }
    public int getNumero_maison() {
        return numero_maison;
    }
    public void setNumero_maison(int numero_maison) {
        this.numero_maison = numero_maison;
    }
    public Adresse(String ville, String pays, int numero_rue, int numero_maison) {
        this.ville = ville;
        this.pays = pays;
        this.numero_rue = numero_rue;
        this.numero_maison = numero_maison;
    }
    
}
