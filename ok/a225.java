import java.util.*;
public class a225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int [] b = new int [a];
        	int temp=0;
        	for(int i=0 ; i<a ; i++){
        		b[i] = sc.nextInt();
        	}
        	for(int i=0 ; i<b.length ; i++){
        		for(int j=0 ; j<b.length ; j++){
        			 if(b[i]%10 < b[j]%10){
        			 	temp = b[i];
        			 	b[i] = b[j];
        			 	b[j] = temp;
        			 }
        			 else if(b[i]%10 == b[j]%10){
        			 	if(b[i]/10 > b[j]/10){
        			 		temp = b[i];
        			 		b[i] = b[j];
        			 		b[j] = temp;
        			 	}
        			 }
        		}
        	}
        	for(int k : b){
        		System.out.print(k + " ");
        	}
        	System.out.println();
        }
    }
}