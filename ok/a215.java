import java.util.*;
public class a215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	String a = sc.next();
        	if(a.compareTo("EOF")==0){
        		break;
        	}
        	String b = sc.next();
			int c = Integer.parseInt(a);
			int d = Integer.parseInt(b);
			int total=0;
			int count=0;
			for(int i=c ; ; i++){
				total += i;
				count++;
				if(total>d){
					break;
				}
			}
			System.out.println(count);
        }
    }
}