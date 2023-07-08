import java.util.*;
public class Main {//ここが Main になっている
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int[][] a = new int[n][];
        for(int i=0;i<n;i++){
            String[] str2 = scan.nextLine().split(" ");
            int[] a2 = new int[2];
            a2[0] = Integer.parseInt(str2[0]);
            a2[1] = Integer.parseInt(str2[1]);
            a[i] = a2;
        }
        

        int[] days = new int[n];
        for(int i= 0;i<n;i++){
            days[i] = a[i][0];
        }

        Arrays.sort(days);


        long initial_count = 0;
        for(int i=0;i<n;i++){
            initial_count += a[i][1];
        }

        if(initial_count<=k){
            System.out.println(1);
            return;
        }
        
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            hash.put(a[i][0],a[i][1]);
        }
        
        
        for(int i=0;i<n;i++){
            initial_count -= hash.get(days[i]);
            if(initial_count<=k){
                System.out.println(days[i]+1);
                return;
            }
        }

    }
}