import java.util.*;
public class a065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String a = sc.next();
        	char [] b = new char[a.length()];
        	a.getChars(0,a.length(),b,0);
        	for(int i = 0 ; i<b.length ; i++){
        		if (i!=b.length-1)
        			System.out.print(b[i]-b[i+1]<0 ? -(b[i]-b[i+1]) : (b[i]-b[i+1]));
        	}
        	System.out.println("");
        }
    }
}