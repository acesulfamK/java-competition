import java.util.*;
public class ICPC2015c{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String line = scan.nextLine();
            int n = Integer.parseInt(line);
            System.out.println(line);
            ArrayList<String> a = new ArrayList<String>();
            
            for(int i=0;i<n;i++){
                a.add(scan.nextLine());
            }
            

            for(int i=0;i<n;i++){
                System.out.println(a.get(i));
            }
            
            
            int index = 0;
            int is_combo = 0;

            for(int i = 0;i < n*n;i++){
                
            }
            
            return;
        }
        
    }
}
