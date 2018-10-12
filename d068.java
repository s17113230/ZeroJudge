import java.util.Scanner;

public class d068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int weight = sc.nextInt();
        	System.out.println(weight>50?weight-1:weight);
        }
    }
}