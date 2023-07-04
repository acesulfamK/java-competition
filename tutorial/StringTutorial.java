import java.util.*;
import java.util.regex.*;
public class StringTutorial{
    public static void main(String[] args){
        String str = "a1b2c3d4e5ao2pw39q29pa4wef8ijwaep9";

        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('a'));
        System.out.println(str.replaceAll("a","c")); //broken
        System.out.println(str.replaceAll("[0-9][0-9][a-z]","FIND!!")); //broken
        
        // regex
        String regex = "[0-9][a-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        while(m.find()){
            System.out.println(m.start());
            System.out.println(m.group());
        }
        
        //String Builder
        //
        str = "12345678";
        StringBuffer strbuf = new StringBuffer(str);
        System.out.println(strbuf.delete(1,3));
        System.out.println(strbuf.toString());
        System.out.println(strbuf.insert(4,"A"));
       
        
    }
}
