import java.util.*;
public class a148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int [] b = new int [a];
        	double total =0;
        	for(int i=0 ; i<a ; i++){
        		b[i] = sc.nextInt();
        		total += b[i];
        	}
        	System.out.println((double)(total/a)>59?"no":"yes");
        }
    }
}