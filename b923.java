import java.util.Scanner;

public class b923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int c=0,count=0;
        	int []ans = new int[100000];
        	while(a>0){
        		int b = sc.nextInt();
        		if(b==3){
        			c = sc.nextInt();
        			ans[count] = c;
        			count++;
        		}else if(b==2){
        			System.out.println(ans[count-1]);
        		}else{
        			count--;
        		}
        		a--;
        	}
        }
    }
}