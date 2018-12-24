import java.util.Scanner;
public class d051 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double str=sc.nextDouble();
			System.out.printf("%.3f\n",(str-32)*5/9);
		}
	}
}