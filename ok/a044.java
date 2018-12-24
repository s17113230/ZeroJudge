import java.util.*;

public class a044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int sum = 1;
        	int a = sc.nextInt();
        	for(int i=1 ; i<=a ; ++i){
        		sum += 1 + i * (i-1) /2;
        	}
        	System.out.println(sum);
        }
    }
}