import java.util.*;
public class a414{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;

		while(sc.hasNext()){
			num = sc.nextInt();
			if(num == 0) break;
			System.out.println(getTimes(num));
		}
	}

	public static int getTimes(int a){
		int i;

		for(i = 0; a > 0 && a % 2 == 1; i++)
		a /= 2;
		return i;
	}
}