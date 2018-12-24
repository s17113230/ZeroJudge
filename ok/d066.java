import java.util.Scanner;

public class d066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int h = sc.nextInt();
        	int m = sc.nextInt();
        	if((h==7&&m>=30) || (h>7&&h<17)){
        		System.out.println("At School");
        	}else{
        		System.out.println("Off School");
        	}
        }
    }
}