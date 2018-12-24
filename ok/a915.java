import java.util.Scanner;

public class a915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int n_array[][] = new int[n][2];
            for(int i=0 ; i<n ; i++){
                n_array[i][0] = sc.nextInt();
                n_array[i][1] = sc.nextInt();
            }

            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n-i ; j++){
                    if(j<n-1 && n_array[j][0]>n_array[j+1][0]){
                        int temp_x = n_array[j][0];
                        n_array[j][0] = n_array[j+1][0];
                        n_array[j+1][0] = temp_x;
                        int temp_y = n_array[j][1];
                        n_array[j][1] = n_array[j+1][1];
                        n_array[j+1][1] = temp_y;
                    }
                }
            }

            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n-i ; j++){
                    if(j<n-1 && n_array[j][0]==n_array[j+1][0] && n_array[j][1]>n_array[j+1][1]){
                        int temp_y = n_array[j][1];
                        n_array[j][1] = n_array[j+1][1];
                        n_array[j+1][1] = temp_y;
                    }
                }
            }

            for(int i=0 ; i<n ; i++){
                System.out.println(n_array[i][0]+" "+n_array[i][1]);
            }
        }
    }
}