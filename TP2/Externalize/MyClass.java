
import java.io.*;

public class MyClass implements Externalizable{
    private String login;
    private String id;
    private int nb;
    
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        login = in.readUTF();
        id = in.readUTF();
        nb = in.readInt();
    }
 
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(login);
        out.writeUTF(id);
        out.writeInt(nb);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public MyClass(String login, String id, int nb) {
        this.login = login;
        this.id = id;
        this.nb = nb;
    }
    public MyClass(){
        this.login = "";
        this.id = "";
        this.nb = 0;
    }
}
