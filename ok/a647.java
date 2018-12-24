import java.util.Scanner;
public class a647 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			while(a>0){
				double m=sc.nextDouble();
				double p=sc.nextDouble();
				double money=(p-m)/m*100;
				money=(money==-0.00)?0.00:money;
				System.out.printf("%.2f",money);
				if((money>=10)||(money<=-7)){
					System.out.println("% dispose");
				}else{
					System.out.println("% keep");
				}
				a--;
			}
		}
	}
}