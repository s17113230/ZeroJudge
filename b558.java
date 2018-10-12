import java.util.Scanner;

public class b558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int a = sc.nextInt();
			System.out.println(ans(a));
        }
    }

    public static int ans(int a){
    	if(a==1){
    		return 1;
    	}
    	return ans(a-1) + a-1;
    }
}