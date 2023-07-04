import java.util.*;
public class ICPC2022C{
    static int score(int n){ return n*n;}

    static int xval(int m,int k){
        return score(m/k)*(k-m%k)+score(m/k+1)*(m%k);
    }
    
    static int oval(int n,int k){
        if(k==1){
            return score(n);
        }else{
            return score(n-(k-2))+k-2;        
        }
    }

    static int val(int n,int m,int k){
        return -xval(m,k)+oval(n,k);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String[] str = scan.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            

            double max = -1.0/0;

            for(int k=1;k<=m && k<=n+1 ;k++){
                int cand = val(n,m,k);
                if(cand>max){
                    max = cand;
                }
            }
            System.out.println((int)max);
        }
    }
}
