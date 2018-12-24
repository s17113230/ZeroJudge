import java.util.*;
public class c315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] a = {0,0};
        while(num>0){
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(b==0){
				a[1] += c;
			}else if(b==1){
				a[0] += c;
			}else if(b==2){
				a[1] -= c;
			}else{
				a[0] -= c;
			}
			num--;
        }
		System.out.print(a[0] + " " + a[1]);
    }
}