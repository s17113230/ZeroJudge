import java.util.Scanner;
import java.util.Arrays;

public class d074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int num = sc.nextInt();
        	int a [] = new int [num];
        	for(int i=0 ; i<num ; i++){
        		a[i] = sc.nextInt();
        	}

        	Arrays.sort(a);
        	System.out.println(a[num-1]);
        }
    }
}