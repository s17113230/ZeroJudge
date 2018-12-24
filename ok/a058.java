import java.util.*;
public class a058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()){
	    	int a = sc.nextInt();
	    	int [] b = new int [a];
	    	int count1=0;
	    	int count2=0;
	    	int count3=0;
	    	for(int i=0 ; i<a ; i++){
	    		b[i] = sc.nextInt();
	    	}
	    	for(int i=0 ; i<b.length ; i++){
	    		if(b[i]%3 == 0)
	    			count1++;
	    		else if(b[i]%3 == 1)
	    			count2++;
	    		else
	    			count3++;
	    	}
	    	System.out.println(count1 + " " + count2 + " " + count3);
	    }
    }
}