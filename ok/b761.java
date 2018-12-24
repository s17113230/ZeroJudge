import java.util.Scanner;

public class b761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int a = sc.nextInt();
			System.out.println((a%4==0)?"egg":"fat");
        }
    }
}