import java.util.*;
public class c419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			for(int i=0 ; i<a ; i++){
				for(int j=0 ; j<a-i-1 ; j++){
					System.out.print("_");
				}
				for(int j=0 ; j<=i ; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
    }
}