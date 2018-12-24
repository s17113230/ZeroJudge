import java.util.*;
public class a244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	long [][] b = new long [a][3];
        	for(int i=0 ; i<a ; i++){
        		for(int j=0 ; j<3 ; j++){
        			b[i][j] = sc.nextLong();
        		}
        	}
        	for(int i=0 ; i<a ; i++){
        		if(b[i][0]==1){
        			System.out.println(b[i][1]+b[i][2]);
        		}
        		else if (b[i][0]==2){
        			System.out.println(b[i][1]-b[i][2]);
        		}
        		else if (b[i][0]==3){
        			System.out.println(b[i][1]*b[i][2]);
        		}
        		else if (b[i][0]==4){
        			System.out.println(b[i][1]/b[i][2]);
        		}
        	}
        }
    }
}