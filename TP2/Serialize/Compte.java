import java.io.Serializable;
public class Compte implements Serializable{
    private Adresse addr;
    private int id = 0;
    public Compte(Adresse addr, int id) {
        this.addr = addr;
        this.id = id;
    }
    public Adresse getAddr() {
        return addr;
    }
    public void setAddr(Adresse addr) {
        this.addr = addr;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}