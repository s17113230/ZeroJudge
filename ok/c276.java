import java.util.*;
public class c276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] d = new char[4];
        a.getChars(0,a.length(),d,0);

        int num = sc.nextInt();
        while(num>0){
        	String c = sc.next();
        	char [] e = new char[4];
        	c.getChars(0,c.length(),e,0);
        	num--;

        	int aco = 0;
        	int bco = 0;

        	for(int i=0 ; i<4 ; i++){
        		for(int j=0 ; j<4 ; j++){
        			if(i==j){
	        			if(d[i] == e[j]){
	        				aco++;
	        				j++;
	        			}
        			}else{
        				if(d[i] == e[j]){
        					bco++;
        				}
        			}

        		}
        	}
        	System.out.println(aco+"A"+bco+"B");
        }
    }
}