import java.util.Scanner;

public class b759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			String a = sc.next();
			System.out.println(a);
			for(int i=1 ; i<a.length() ; i++){
				StringBuffer b = new StringBuffer(a).deleteCharAt(0);
				System.out.println(b.insert(a.length()-1,a.charAt(0)));
				a = new String(b);
			}
        }
    }
}