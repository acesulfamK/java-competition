// 未完成 1:22:39
import java.util.*;
public class ICPC2006d{
    static int w;
    static int h;
    static int[][] a = new int[20][];
    static int gx;
    static int gy;
    
    static void printMap(){
        for(int i =0;i<h;i++){
            for(int j =0;j<w;j++){ 
                System.out.print(""+a[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
    
    static int recur(int y,int x,int v,int n){
        System.out.println("y: "+y+", x: "+x+", v:"+v);
        printMap();
        System.out.println();
        if(x == gx && gy == y)
            return n-1;
        if(n==3)
            return -1;

        if(v ==0  ){
            if(y-1 >=0 && a[y-1][x] != 1){
                a[y][x] = 0;
                while(y-1 >=0 && a[y-1][x] == 0)
                    y--;
                if(y-1>=0 && a[y-1][x] == 1){
                    a[y-1][x] = 0;
                }
                a[y][x] = 2;

            }

        } else if(v == 1){
            if(x+1<w && a[y][x+1]!=1){

                a[y][x] = 0;
                while(x+1<w && a[y][x+1] == 0)
                    x++;

                if(x+1<w && a[y][x+1] == 1)
                    a[y][x+1] = 0;
                    
                a[y][x] = 2;
            }

        } else if(v  == 2){
            if(y+1<h && a[y+1][x]!=1){
                a[y][x] = 0;
                while(y+1 <h && a[y+1][x] == 0)
                    y++;
                if(y+1<h && a[y+1][x] == 1){
                    a[y+1][x] = 0;
                }
                a[y][x] = 2;


            }
            
        } else if(v == 3){
            if(x-1>=0 && a[y][x-1]!=1){
                
                a[y][x] = 0;
                while(x-1>=0 && a[y][x-1] == 0)
                    x--;

                if(x-1>=0 && a[y][x-1] == 1)
                    a[y][x-1] = 0;
                    
                a[y][x] = 2;
            }
        }
        
        printMap();
        System.out.println();

        int[] r = new int[4];

        for(int i = 0;i<=3;i++){
            r[i] = recur(y,x,i,n+1);
        }
        
        boolean isminus = true;
        for(int i = 0;i<=3;i++)
            if(r[i]>=0)
                isminus = false;
        
        if(isminus) 
            return -1;

        int min = 100;
        for(int i = 0;i<=3;i++){
            if(r[i]>=0 && r[i] < min){
                min = r[i];
            }
        }
        return min;

        
    }

    static int search(int y,int x){

        int[] r = new int[4];
        for(int i = 0;i<=3;i++){
            r[i] = recur(y,x,i,1);
        }

        boolean isminus = true;
        for(int i = 0;i<=3;i++)
            if(r[i]>=0)
                isminus = false;                
        
        if(isminus) 
            return -1;

        int min = 100;
        for(int i = 0;i<=3;i++){
            if(r[i]>=0 && r[i] < min){
                min = r[i];
            }
        }
        return min;

    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            
            String[] line1 = scan.nextLine().split(" ");
            w = Integer.parseInt(line1[0]);
            h = Integer.parseInt(line1[1]);

            for(int i =0;i<h;i++){
                a[i] = new int[w];
                String[] line = scan.nextLine().split(" ");
                for(int j =0;j<w;j++){ 
                    a[i][j] = Integer.parseInt(line[j]);
                }
            }

            printMap();

            int startx=0;
            int starty=0;

            for(int i =0;i<h;i++){
                for(int j =0;j<w;j++){ 
                    if(a[i][j] == 2){
                        startx = j;
                        starty = i;
                    } else if(a[i][j] == 3){
                        gx = j;
                        gy = i;
                    }
                }
            }
            
            System.out.println(search(starty,startx));
            return;
            
        }
    }
}
