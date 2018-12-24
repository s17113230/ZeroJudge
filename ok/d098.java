import java.util.*;
public class d098 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str;
        while(sc.hasNext()){
            str = sc.nextLine();
            count=0;
            String [] str_arr = str.split(" ");
            for(int i=0 ; i<str_arr.length ; i++){
                try {
                    count += Integer.parseInt(str_arr[i]);
                }catch (NumberFormatException ex){}
            }
            System.out.println(count);
        }
    }
}
