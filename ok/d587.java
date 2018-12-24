import java.util.*;
public class d587 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int[] num_arr;
        StringBuffer str = new StringBuffer("");
        while(sc.hasNext()){
            num = sc.nextInt();
            num_arr = new int[num];
            str.delete(0,str.length());
            for(int i=0 ; i<num ; i++){
                num_arr[i] = sc.nextInt();
            }
            Arrays.sort(num_arr);
            for(int i:num_arr){
                str.append(i+" ");
            }
            str.delete(str.length()-1,str.length());
            System.out.println(str);
        }
    }
}
