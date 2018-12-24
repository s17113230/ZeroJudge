import java.util.Scanner;
public class d058 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int str=sc.nextInt();
			System.out.println(str==0?0:(str>0?1:-1));
		}
	}
}