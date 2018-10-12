import java.util.Scanner;
import java.util.Arrays;

public class c299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int [] Mi = new int[n];
        	int count=0;

        	for(int i=0 ; i<n ; i++){
        		Mi[i] = sc.nextInt();
        	}

        	Arrays.sort(Mi);

        	for(int i=0 ; i<n ; i++){
				if(i<n-1){
	        		if(Mi[i+1] - Mi[i] != 1){
	        			count++;
	        		}
        		}
        	}
        	System.out.println(count>0?Mi[0]+" "+Mi[n-1]+" no":Mi[0]+" "+Mi[n-1]+" yes");
        }
    }
}