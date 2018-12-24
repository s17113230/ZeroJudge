import java.util.*;
public class d532 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        int count;
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            count=0;
            for(int i=n ; i<=m ; i++){
                if(i%4==0 && i%100!=0 || i%400==0)count++;
            }
            System.out.println(count);
        }
    }
}
