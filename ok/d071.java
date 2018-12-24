import java.util.Scanner;

public class d071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
    		String str = sc.next();
    		if(str.equals("EOF"))break;
    		int a = Integer.parseInt(str);
    		if((a%4==0 && a%100!=0) || (a%400==0)){
    			System.out.println("a leap year");
    		}else{
    			System.out.println("a normal year");
    		}
        }
    }
}