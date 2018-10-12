import java.util.*;
public class a034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

			int que = sc.nextInt();
			String ans = "";

        	StringBuffer sb = new StringBuffer();

        	while(que>0){
        		ans += que%2;
        		que /= 2;
        	}

        	sb.append(ans);
        	sb.reverse();

        	System.out.println(sb);
        }
    }
}