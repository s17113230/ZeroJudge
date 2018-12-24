import java.util.*;
public class d586 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,temp,count;
        String str;
        String[] str_arr;
        String[] first_letter = {"m","j","q","h","o","f","a","w","c","p","n","s","e","x","d","k","v","g","t","z","b","l","r","y","u","i"};
        String[] twice_letter = {"u","z","r","m","a","t","i","f","x","o","p","n","h","w","v","b","s","l","e","k","y","c","q","j","g","d"};
        List<String> first_list = Arrays.asList(first_letter);
        List<String> twice_list = Arrays.asList(twice_letter);
        while(sc.hasNext()){
            num = sc.nextInt();
            sc.nextLine();
            while(num>0){
                count=0;
                str = sc.nextLine();
                str_arr = str.split(" ");
                for(int i=1 ; i<str_arr.length ; i++){
                    try {
                        System.out.print(first_letter[Integer.parseInt(str_arr[i])-1]);
                    }catch(NumberFormatException ex){
                        count += twice_list.indexOf(str_arr[i])+1;
                    }
                }
                System.out.println(count>0?count:"");
                num--;
            }
        }
    }
}
