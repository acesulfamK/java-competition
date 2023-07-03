import java.util.*;
public class HashMapTutorial{

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Taro",1);
        map.put("Jiro",2);
        map.put("Saburo",3);

        System.out.println(map.toString());

        for(String key : map.keySet()){
            System.out.println(""+key+":"+map.get(key));
        }
        
        map.remove("Taro");

    }
}
