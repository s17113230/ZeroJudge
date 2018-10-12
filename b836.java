import java.util.Scanner;

public class b836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(b==0){
				System.out.println("Go Kevin!!");
			}else{
				System.out.println(((a-1)%b==0)?"Go Kevin!!":"No Stop!!");
			}
        }
    }
}