import java.io.*;

public class ExternalizeMyClass {
    public static void main(String[] args) {
        try {
            MyClass c = new MyClass("Taher","112",221);
            FileOutputStream fichier = new FileOutputStream("exemple"); 
            ObjectOutputStream oos = new ObjectOutputStream(fichier);
            c.writeExternal(oos);
            oos.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
