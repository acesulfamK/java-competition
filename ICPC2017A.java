import java.util.*;

public class ICPC2017A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            String[] first_line = scan.nextLine().split(" ");
            int n = Integer.parseInt(first_line[0]);
            int m = Integer.parseInt(first_line[1]);
            if(n == 0 && m == 0)
                return;

            String[] string_list = scan.nextLine().split(" ");
            int[] a = new int[n];
            for(int i=0;i<string_list.length; i++){
                a[i] = Integer.parseInt(string_list[i]);
            }
    
            int best = -1;
            for( int i=0;i<n;i++){
                for( int j=i+1;j<n;j++){
                    int score = a[i]+a[j];
                    if(score>best && score <= m){
                        best = score;
                    }
                }
            }
            if(best == -1){
                System.out.println("NONE");
            }else{
                System.out.println(best);
            }
    
        }
    }
}