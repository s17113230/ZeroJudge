import java.util.*;
public class d511 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int count;
        while(sc.hasNext()){
            count=0;
            for(int i=0 ; i<5 ;i++){
                for(int j=0 ; j<3 ; j++){
                    num[j] = sc.nextInt();
                }
                Arrays.sort(num);
                if(num[0]+num[1]>num[2]&&num[2]>num[1]-num[0]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
