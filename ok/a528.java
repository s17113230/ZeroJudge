import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class a528 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			BigInteger[] big=new BigInteger[n];
			for(int i=0;i<n;i++){
				big[i]=new BigInteger(sc.next());
			}
			Arrays.sort(big);
			for(int i=0;i<n;i++){
				System.out.println(big[i]);
			}
		}
	}
}