import java.util.Scanner;

public class d072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int num = sc.nextInt();
        	for(int i=0 ; i<num ; i++){
        		int a = sc.nextInt();
        		if((a%4==0 && a%100!=0) || (a%400==0)){
        			System.out.println("Case "+(i+1)+": a leap year");
        		}else{
        			System.out.println("Case "+(i+1)+": a normal year");
        		}
        	}
        }
    }
}