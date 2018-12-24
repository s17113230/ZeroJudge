import java.util.*;
public class a410 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();

			double temp = a*e-b*d;
			if(temp == 0){
				if(c*d == a*f)
	        		System.out.println("Too many\n");
	       		else
	      			System.out.println("No answer\n");
			}else{
				System.out.println("x="+String.format("%.2f",(double)(c*e-b*f)/temp));
	    		System.out.println("y="+String.format("%.2f",(double)(c*d-a*f)/-temp));
			}
		}
    }
}