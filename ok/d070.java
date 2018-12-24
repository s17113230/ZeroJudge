import java.util.Scanner;

public class d070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
    		int a = sc.nextInt();
    		if(a==0)break;
    		if((a%4==0 && a%100!=0) || (a%400==0)){
    			System.out.println("a leap year");
    		}else{
    			System.out.println("a normal year");
    		}
        }
    }
}