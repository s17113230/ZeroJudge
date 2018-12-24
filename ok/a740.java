import java.util.*;
public class a740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int ans = 0;
        	for(int i=2 ; i<=n ; i++){
        		if(n%i==0){
        			ans+=i;
        			n/=i;
        			i--;
        		}
        	}
        	System.out.println(ans);
        }
    }
}