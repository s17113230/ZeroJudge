import java.util.Scanner;
public class d010 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();

			long total=0;
			for(int i=1;i<=n/2;i++){
				if(n%i==0){
					total+=i;
				}
			}
			if(total==n){
				System.out.println("完全數");
			}
			else if(total>n){
				System.out.println("盈數");
			}
			else if(total<n){
				System.out.println("虧數");
			}
		}
	}
}