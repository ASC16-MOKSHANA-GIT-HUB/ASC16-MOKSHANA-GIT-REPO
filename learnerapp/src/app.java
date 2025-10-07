import java.util.HashMap;
public class app {
    HashMap<String,String> appl = new HashMap<~>();
    public void assign(){
        appl.put("Bob","a");
        appl.put("Alice","c");
        appl.put("Ethan","b");
    }
    public void display(){
        System.out.println(appl.get("Alice"));
        System.out.println(appl.get("Ethan"));
        System.out.println(appl.get("Bob"));
    }
}