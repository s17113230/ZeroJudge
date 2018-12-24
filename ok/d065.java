import java.util.Scanner;
import java.util.Arrays;

public class d065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int []a = new int[3];
        	for(int i=0 ; i<3 ; i++){
        		a[i] = sc.nextInt();
        	}
        	Arrays.sort(a);
        	System.out.println(a[2]);
        }
    }
}