/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DB4OUtil;
//import Business.ConfigureASystem;
//import Business.EcoSystem;
import Business.Person.Person;
import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import java.util.Date;





/**
 *
 * @author sreej
 */
public class DB4OUtil {
    public static void main(String args[])
  {
     storeSystem();
        
  }
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
     private static ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }
    
    public static synchronized void storeSystem() {
        ObjectContainer conn = createConnection();
        Date d=new Date(12/01/2000);
        Person p =new Person("s","v",d, "sreeja","f",123456789) ;
        conn.store(p);
        conn.commit();
        conn.close();
    }
    
    
   


    

    
    
}
