import java.util.Scanner;
public class d050 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int str=sc.nextInt();
			System.out.println(str-15<0?24-(15-str):str-15);
		}
	}
}