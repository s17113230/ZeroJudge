import java.util.*;
public class d471 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double num;
        int bit;
        String temp="";
        while(sc.hasNext()){
            num = sc.nextDouble();
            bit = (int)Math.pow(2.0,num);
            for(int i=0; i<bit ; i++){
                temp = Integer.toBinaryString(i);
                for(int j=temp.length() ; j<num ; j++){
                    System.out.print("0");
                }
                System.out.println(temp);
            }
        }
    }
}
