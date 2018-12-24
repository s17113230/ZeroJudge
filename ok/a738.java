import java.util.*;

public class a738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	String test = sc.next();
        	if(test.equals("EOF"))break;
			int a = Integer.parseInt(test);
			int b = sc.nextInt();

			System.out.println(test(a,b));
        }
   }
   public static int test(int a , int b){
   		if(a==b) return a;
   		else if (a==0) return b;
   		else if (b==0) return a;
   		else{
   			if(a>b) a%=b;
   			else b%=a;
   			return test(a,b);
   		}
   }
}