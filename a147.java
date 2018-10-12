import java.util.*;
public class a147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	if(a==0)
        		break;
        	for(int i=1 ; i<a ; i++){
        		if(i%7!=0){
        			System.out.print(i+" ");
        		}
        	}
        	System.out.println();
        }
    }
}