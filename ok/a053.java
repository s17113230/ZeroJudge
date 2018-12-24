import java.util.*;
public class a053 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
        	int [][] a = {{0,10,20},{6,2,1}};
        	int b = sc.nextInt();
        	int i = a[0].length-1;
        	int sum=0;
        	while(i>0){
        		if(b>a[0][i]){
        			break;
        		}
        		i--;
        	}
        	while(i>=0){
        		sum += (b-a[0][i]) * a[1][i];
        		b = a[0][i];
        		i--;
        	}
        	System.out.println(sum>100?"100":sum);
        }
    }
}