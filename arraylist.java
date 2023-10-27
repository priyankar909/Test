
import java.util.ArrayList;
public class arraylist {
    static ArrayList<String> listname = new ArrayList<>();
    
    public static void main(String[] args) {
        listname.add("priyankar");
        listname.add("adit");
        listname.add("raja");
        listname.add("ayush");
        listname.add("vishesh");
        //System.out.println(listname);
        arraylist app=new arraylist();
        app.display(listname);
        app.modify(1, "sana");
        System.out.println("************");
        app.display(listname);
        int pos=app.search("sana");
        System.out.println(pos);

        
    }
    void display(ArrayList<String> listname){
        for(String name:listname){
            System.out.println(name);
        }
    }
    void modify(int pos,String newname){
        listname.set(pos, newname);
    }
      int search(String name){
        return listname.lastIndexOf(name);
      }
 }

