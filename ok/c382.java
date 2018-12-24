import java.util.*;
public class c382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			String b = sc.next();
			int c = sc.nextInt();
			if(b.equals("+")){
				System.out.println(a+c);
			}
			if(b.equals("-")){
				System.out.println(a-c);
			}
			if(b.equals("*")){
				System.out.println(a*c);
			}
			if(b.equals("/")){
				System.out.println(a/c);
			}
		}
    }
}