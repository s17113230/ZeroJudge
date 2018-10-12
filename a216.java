import java.util.Scanner;
public class a216 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			long gn=0;
			int n=sc.nextInt();
			int fn = n * (n+1) /2;
			for(int i = 1; i <= n; i++) {
				gn = gn + i * (n-i+1);
			}
			System.out.println(fn+" "+gn);
		}
	}
}