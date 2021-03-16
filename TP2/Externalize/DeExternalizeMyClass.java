import java.io.*;
public class DeExternalizeMyClass {
    public static void main(String[] args) {
        try{
            FileInputStream fichier = new FileInputStream("exemple");
            ObjectInputStream ois = new ObjectInputStream(fichier);
            MyClass c = new MyClass();
            c.readExternal(ois);
            ois.close();
    
            System.out.println(c.getId() + " " + c.getLogin() + " " + c.getNb());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
