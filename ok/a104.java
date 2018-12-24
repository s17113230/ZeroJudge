import java.util.*;
public class a104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int [] b = new int [a];
        	int [] c = new int [a];
        	for(int i=0 ; i<b.length ; i++){
        		b[i] = sc.nextInt();
        	}
        	int temp=0;
        	for(int i=0 ; i<b.length ; i++){
        		for(int j=0 ; j<b.length ;j++){
        			if(b[i] < b[j]){
        				temp = b[j];
        				b[j] = b[i];
        				b[i] = temp;
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