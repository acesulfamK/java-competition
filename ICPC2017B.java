import java.util.*;
public class ICPC2017B{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       while(scan.hasNextLine()){
           String[] str1 = scan.nextLine().split("\"",-1);
           String[] str2 = scan.nextLine().split("\"",-1);
    
           if(str1.length != str2.length){
            System.out.println("DIFFERENT");
            continue;
           }
    
           int diff_counter = 0;
           boolean diff_flag = false;
           for(int i= 0;i<str1.length;i++){
               if(i%2 == 0){
                    if(!str1[i].equals(str2[i])){
                        diff_flag = true;
                        break;
                    }
               } else {
                    if(!str1[i].equals(str2[i])){
                        if(diff_counter ==0){
                            diff_counter++;
                        } else {
                            diff_counter++;
                            diff_flag = true;
                            break;
                        }
                    }
    
               }
           }
           if(diff_flag){
                System.out.println("DIFFERENT");
                continue;
           }


           if(diff_counter ==0){
            System.out.println("IDENTICAL");
           } else if(diff_counter == 1){
            System.out.println("CLOSE");
           }
       
       }
    }
}