import java.util.*;
public class c381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0){
				break;
			}

			StringBuffer str = new StringBuffer();
			for(int i=0 ; i<a ; i++){
				str.append(sc.next());
			}
			StringBuffer end = new StringBuffer();
			for(int i=0 ; i<b ; i++){
				end.append(str.charAt(sc.nextInt()-1));
			}
			System.out.println(end);
		}
    }
}