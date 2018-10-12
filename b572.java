import java.util.*;

public class b572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int x = sc.nextInt();
			while(x>0){
				int a = sc.nextInt();
	        	int b = sc.nextInt();
	        	int c = sc.nextInt();
	        	int d = sc.nextInt();
	        	int e = sc.nextInt();
	        	if(a==c){
	        		System.out.println((e<=(d-b))?"Yes":"No");
	        	}else{
	        		d += (c-a)*60-b;
	        		System.out.println(e<=d?"Yes":"No");
	        	}
	        	x--;
			}
        }
    }
}