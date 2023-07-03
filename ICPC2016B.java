import java.util.*;
public class ICPC2016B{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = Integer.parseInt(scan.nextLine());
            if(!scan.hasNextLine()){
                return;
            }
            String[] c = scan.nextLine().split(" ");
            
            if(c.length == 1){
                System.out.println(""+c[0]+" 1");
                continue;
            }

            HashMap<String, Integer> map = new HashMap<>();

            boolean find_top=false;
            for(String v: c)
                map.put(v,0);
            
            int left = n;
            int count = 0;
            for(String v: c){
                map.put(v,map.get(v)+1);
                left--;
                count++;

                int top = 0;
                int second = 0;

                for(String i: map.keySet()){
                    if(map.get(i)>top){
                        second = top;
                        top = map.get(i);
                    }else if(map.get(i)>second){
                        second = map.get(i);
                    }
                }
                
                if(top-second>left){
                    String top_key="UNFIND";
                    for(String key: map.keySet()){
                        if(map.get(key) == top){
                            top_key = key;
                        }
                    }
                    System.out.println(top_key+" "+count);
                    find_top=true;
                    break;
                }
            }
            if(find_top){
                continue;
            }else {
                System.out.println("TIE");
            }

        }
    }
}
