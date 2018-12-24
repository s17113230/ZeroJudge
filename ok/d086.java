import java.util.*;
public class d086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char [] Upper = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count=0;
        boolean check=true;
        String str;
        while(sc.hasNext()){
            str = sc.next().toLowerCase();
            if(str.equals("0"))break;
            check=true;
            count=0;
            for(int i=0 ; i<str.length() ; i++){
                if(Arrays.binarySearch(Upper,str.charAt(i))+1>0){
                    count += Arrays.binarySearch(Upper,str.charAt(i))+1;
                }else{
                    check = false;
                    break;
                }
            }
            if(check == true){
                System.out.println(count);
            }else{
                System.out.println("Fail");
            }
        }
    }
}
