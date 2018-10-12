import java.util.*;
public class a059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int sum = 1;
        	while(a>0){
        		int b = sc.nextInt();
        		int c = sc.nextInt();
        		int total = 0;
        		for(int i=b ; i<=c ;i++){
        			for(int j=1 ; j<=i ; j++){
        				if (j*j == i){
        					total += i;
        				}
        			}
        		}
        		System.out.println("Case " + (sum++) + ": " + total);
        		a--;
        	}
        }
    }
}