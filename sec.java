import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        int i,g;
        System.out.println("enter the length of array");
        Scanner sc =new Scanner(System.in);
        int k= sc.nextInt();
        
        String[] name=new String[k];
        for(i=0;i<k;i++){
            System.out.println("enter the name ");
             Scanner pc =new Scanner(System.in);
             name[i]=pc.nextLine();
             

             
        }
        for(i=0;i<k;i++){
        System.out.println(name[i]);
        }


        
    }
    
}
