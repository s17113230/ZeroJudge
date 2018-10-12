
import java.util.*;
public class a038{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String a = sc.next();
        	StringBuffer b = new StringBuffer(a);
        	b.reverse();
        	for(int i=0 ; i<b.length() ; i++){
        		char c = b.charAt(0);
        		if(c=='0'){
        			b.delete(0,1);
        			i=0;
        		}
        	}
        	System.out.println(b);
		}
    }
}
