import java.util.*;
public class a040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
	        String a = sc.next();
	        String b = sc.next();
	        int c = Integer.parseInt(a);
	        int d = Integer.parseInt(b);
	        int count = 0;
	        int sum = 0;
	        for (int i=c ; i<d ; i++){
	        	int total = 0;
	        	String x = String.valueOf(i);
	        	char [] e = new char [x.length()];
	        	x.getChars(0,x.length(),e,0);
	        	int [] f = new int[x.length()];
	        	for(int j=0 ; j<e.length ; j++){
	        		f[j] = e[j]-48;
	        	}
	        	for(int j=0 ; j<9 ; j++){
	        		if(x.length() == j){
	        			count = j;
	        		}
	        	}
	        	for (int j=0 ; j<f.length ; j++){
	        		total += Math.pow(f[j],count);
	        	}
	        	if(i == total){
	        		System.out.print(i+" ");
	        		sum++;
	        	}
	        }

	        if(sum == 0){
	        	System.out.println("none");
	        }
	        else{
	        	System.out.println();
	        }
        }
    }
}