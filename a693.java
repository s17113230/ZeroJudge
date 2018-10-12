import java.util.*;

public class a693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	String test = sc.next();
        	if(test.equals("EOF"))break;
			int a = Integer.parseInt(test);
			int b = sc.nextInt();
			int [] c = new int[a];

			for(int i=0 ; i<a ; i++){
				c[i] = sc.nextInt();
			}
			for(int i=0 ; i<b ; i++){
				int d = sc.nextInt();
				int e = sc.nextInt();
				int sum = 0;
				for(int j=d-1 ; j<e ; j++){
					sum += c[j];
				}
				System.out.println(sum);
			}
        }
    }
}