// time 27:03
import java.util.*;
public class ICPC2010c{

    public static int pollock(int n){
        return n*(n+1)*(n+2)/6;
    }
    
    public static int[] a = new int[1000000];
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int n = scan.nextInt();
            if(n == 0){return;}
            
            for (int i = 0;i<1000000;i++){
                a[i] = 0;
            }

            //calc pollock
            for (int i = 0;pollock(i)<1000000;i++){
                a[pollock(i)] = 1;
            }
            
            for(int i=1;i<=n;i++){
                if(a[i] != 0){
                    continue;
                } else {
                    int min = 1000000;
                    for(int j=1;j<=i/2;j++){
                        if(a[j]+a[i-j]<min){
                            min = a[j]+a[i-j];                                                        
                        }
                    }
                    a[i] = min;
                }
            }
            
            int pollock1 = a[n];

            for (int i = 0;i<1000000;i++){
                a[i] = 0;
            }
            
            for (int i = 0;pollock(i)<1000000;i++){
                if(pollock(i)%2 ==1){
                    a[pollock(i)] = 1;
                }
            }

            for(int i=1;i<=n;i++){
                if(a[i] != 0){
                    continue;
                } else {
                    int min = 1000000;
                    for(int j=1;j<=i/2;j++){
                        if(a[j]+a[i-j]<min){
                            min = a[j]+a[i-j];                                                        
                        }
                    }
                    a[i] = min;
                }
            }
            int pollock2 = a[n];
            
            System.out.println(""+pollock1+" "+pollock2);

        }
    }
}
