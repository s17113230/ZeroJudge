import java.util.*;
public class a022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String a = sc.next();
        	int b = a.length()/2;
        	int c=0;
        	char [] d = new char [a.length()];
        	a.getChars(0,a.length(),d,0);
        	for (int i=0 ; i<d.length ; i++){
        		if(d[i] == d[d.length-i-1])
        			c++;
        	}
        	System.out.println(c>=b?"yes":"no");
        }
    }
}