import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class a021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	BigInteger a = new BigInteger(sc.next());
        	String x = sc.next();
        	BigInteger b = new BigInteger(sc.next());

			if(x.equals("+")){
				System.out.println(a.add(b));
			}else if(x.equals("-")){
				System.out.println(a.subtract(b));
			}else if(x.equals("*")){
				System.out.println(a.multiply(b));
			}else{
				System.out.println(a.divide(b));
			}

        }
    }
}