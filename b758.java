import java.util.Scanner;

public class b758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int newa = 0;
			int newb = 0;
			if(b+30>=60){
				newb=b+30-60;
				a++;
			}else{
				newb=b+30;
			}
			newa = (a+2>=24)?a+2-24:a+2;
			System.out.println(((newa<10)?"0"+newa:newa)+":"+((newb<10)?"0"+newb:newb));
        }
    }
}