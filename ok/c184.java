import java.util.*;

public class c184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	if(a==0)break;
        	int count = 0;
        	int countb = 0;
        	for(int i=1 ; i<a ; i++){
        		if(a%i==0)count+=i;
        	}
        	if(count==a){
        		System.out.println("="+a);
        	}else{
        		for(int i=1 ; i<count ; i++){
        			if(count%i==0)countb+=i;
        		}
        		if(a==countb){
	        		System.out.println(count);
	        	}else{
	        		System.out.println("0");
	        	}
        	}
        }
    }
}