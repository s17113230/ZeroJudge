import java.util.*;
public class d490 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        int count;
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            count=0;
            for(int i=n ; i<=m ; i++){
                if(i%2==0)count+=i;
            }
            System.out.println(count);
        }
    }
}
