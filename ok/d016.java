import java.util.*;
public class d016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int a,b;
        String [] str_arr;
        Stack<Integer> stack = new Stack<Integer>();
        while(sc.hasNext()){
            str = sc.nextLine();
            str_arr = str.split(" ");
            for(int i=0 ; i<str_arr.length ; i++) {
                try {
                    stack.push(Integer.parseInt(str_arr[i]));
                }catch(NumberFormatException ex){
                    b=stack.pop();
                    a=stack.pop();
                    if(str_arr[i].equals("+")){
                        stack.push(a+b);
                    }else if(str_arr[i].equals("-")){
                        stack.push(a-b);
                    }else if(str_arr[i].equals("*")){
                        stack.push(a*b);
                    }else if(str_arr[i].equals("/")){
                        stack.push(a/b);
                    }else if(str_arr[i].equals("%")){
                        stack.push(a%b);
                    }
                }
            }
            System.out.println(stack.pop());
        }
    }
}
