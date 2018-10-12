import java.util.*;
public class a024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = 0;
        	if(b>a){
        		for(int i=a ; i>0 ; i--){
        			if(b%i==0 && a%i==0){
        				if(c<i)
        					c=i;
        			}
        		}
        	}
        	else{
        		for(int i=b ; i>0 ; i--){
        			if(b%i==0 && a%i==0){
        				if(c<i)
        					c=i;
        			}
        		}
        	}
        	System.out.println(c);
        }
    }
}