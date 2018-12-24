import java.util.*;
public class a006 {
    public static void main(String [] args) {
    	Scanner num = new Scanner(System.in);
		  while(num.hasNext()){
    		int a = num.nextInt();
    		int b = num.nextInt();
    		int c = num.nextInt();
    		int i = 1000,y = -1000;
    		loop:for (; i  <10000 ; i--){
    			for (; y  <10000 ; y++){
    				if (((a*y*y)+(b*y)+c) == 0){
    					break;
    				}
    				if (y >100000000){
    					System.out.println("No real root");
              break loop;
            }
    			}
    			if (i<-1000){
              System.out.println("No real root");
              break loop;
    			}
    			if (((a*i*i)+(b*i)+c) == 0){
              if (i != y){
              System.out.println("Two different roots x1="+ i + " , x2=" + y);
              break;
					}
					else if (i == y){
    					System.out.println("Two same roots x="+i);
    					break;
          }
        }
      }
    }
  }
}