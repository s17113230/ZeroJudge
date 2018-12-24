import java.util.*;
public class a149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	while(a>0){
        		String b = sc.next();
        		char c [] = new char [b.length()];
        		int total=1;
        		b.getChars(0,b.length(),c,0);
        		for(int i=0 ; i<c.length ; i++){
        			total *= c[i]-48;
        		}
        		System.out.println(total);
        		a--;
        	}
        }
    }
}