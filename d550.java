import java.util.*;
public class d550 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] num = new int[n][m];
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    num[i][j] = sc.nextInt();
                }
            }
            for(int i=0 ; i<m ; i++){
                sub(num,n,i);
            }
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    System.out.print(num[i][j]);
                }
                System.out.println("");
            }
        }
    }
    public static void sub(int num[][] , int n , int x){
        for(int i=0;i<n;i++){
            for(int j=i+1 ; j<n ; j++){
                if(num[i][x]>num[j][x]){
                    int temp = num[i][0];
                    num[i][0] = num[j][0];
                    num[j][0] = temp;
                    int temp2 = num[i][1];
                    num[i][1] = num[j][1];
                    num[j][1] = temp;
                    int temp3 = num[i][2];
                    num[i][2] = num[j][2];
                    num[j][2] = temp;
                }
            }
        }
    }
}
