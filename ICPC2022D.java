import java.util.*;
import java.util.regex.*;
public class ICPC2022D{
    static int counter = 0;

    static boolean isHead(int n,List<Integer> arr){
        return n==arr.get(0);
    }
    
    static boolean isAfter(int n, List<Integer> passed,List<Integer> source){
        return passed.contains(source.get(source.indexOf(n)-1));
    }
    
    static int arrayMax(List<Integer> a){
        Integer max=0;
        for(Integer num : a){
            if(num>max)
                max = num;
        }
        return max;
    }
    
    static long conb(int n, int r){
        if(n== 0)
            return 1;

        long ans = 1;
        for(int i=0;i<r;i++){
            ans = (ans*(n-i)/(i+1))%(998244353);
        }
        return ans;
    }

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){

            String[] input1 = scan.nextLine().split(" ");
            int n = Integer.parseInt(input1[0]);
            int k = Integer.parseInt(input1[1]);

            if(n == 0 && k == 0)
                return;

            List<Integer> cur = new ArrayList<Integer>();
            if(!scan.hasNextLine()){
                return;
            }
            for(String a: scan.nextLine().split(" ")){
                cur.add(Integer.parseInt(a));
            }

            List<Integer> target = new ArrayList<Integer>();
            if(!scan.hasNextLine()){
                return;
            }
            for(String a: scan.nextLine().split(" ")){
                target.add(Integer.parseInt(a));
            }

            boolean flag = false;
            for(int i=0;i<target.indexOf(cur.get(0));i++){
                if(target.get(i)>cur.get(0)){
                    System.out.println(0);
                    flag = true;
                    break;
                }
            }
            if(flag)
                continue;
            
            int count_bar = 0;
            int count_branch = 0;
    
            List<Integer> passed = new ArrayList<Integer>();
    
            for(int i=0;i<n;i++){
                int target_num = target.get(i);
                
                if(isHead(target_num,cur)){
                } else {
                    if (isAfter(target_num,passed,cur)){
                        if(arrayMax(passed) < target_num){
                            count_branch++;
                        } else {
                        }
                    } else {
                        count_bar++;
                    }
                }
                passed.add(target_num);
            }
            
            long sum = 0;
            for(int i=0;i<k-count_bar;i++){
                
                sum = (sum+conb(count_branch,i))%998244353;
            }
            System.out.println(""+sum);
        }
    }
}
