import java.util.*;
public class d485 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println(n%2==0 || m%2==0?(m-n)/2+1:(m-n)/2);
        }
    }
}
