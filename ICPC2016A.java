import java.util.*;
public class ICPC2016A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            
            int n = Integer.parseInt(scan.nextLine());
            if(!scan.hasNextLine()) 
                return;
            String[] input = scan.nextLine().split(" ");
            
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = Integer.parseInt(input[i]);
            }
            
            float min=Float.POSITIVE_INFINITY;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int candi = Math.abs(a[i]-a[j]);
                    if(min>candi){
                        min = candi;
                    }
                }
            }
            System.out.println((int)min);
        }
    }
}
