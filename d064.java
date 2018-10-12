import java.util.Scanner;

public class d064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	System.out.println(a%2!=0?"Odd":"Even");
        }
    }
}