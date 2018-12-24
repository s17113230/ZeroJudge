import java.util.*;
public class b532 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,num;
        String str;
        while(sc.hasNext()){
            num = sc.nextInt();
            sc.nextLine();
            while(num>0){
                str = sc.nextLine();
                a=0;
                b=0;
                String[] str_arr = str.split("[a-z]|[A-Z]");
                str="";
                for(int i=0 ; i<str_arr.length ; i++){
                    str += str_arr[i];
                }
                for(int i=0 ; i<str.length() ; i++){
                    if(str.charAt(i)=='+'){
                        a = Integer.parseInt(str.substring(0,i));
                        b = Integer.parseInt(str.substring(i+1,str.length()));
                        System.out.println(a+b);
                        break;
                    }else if(str.charAt(i)=='-'){
                        a = Integer.parseInt(str.substring(0,i));
                        b = Integer.parseInt(str.substring(i+1,str.length()));
                        System.out.println(a-b);
                        break;
                    }else if(str.charAt(i)=='*'){
                        a = Integer.parseInt(str.substring(0,i));
                        b = Integer.parseInt(str.substring(i+1,str.length()));
                        System.out.println(a*b);
                        break;
                    }else if(str.charAt(i)=='/'){
                        a = Integer.parseInt(str.substring(0,i));
                        b = Integer.parseInt(str.substring(i+1,str.length()));
                        System.out.println(a/b);
                        break;
                    }else if(str.charAt(i)=='%'){
                        a = Integer.parseInt(str.substring(0,i));
                        b = Integer.parseInt(str.substring(i+1,str.length()));
                        System.out.println(a%b);
                        break;
                    }
                }
                num--;
            }
        }
    }
}