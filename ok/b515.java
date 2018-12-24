import java.util.*;
public class b515 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] mos_str = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        String [] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int num;
        String str;
        List<String> mos_list = Arrays.asList(mos_str);
        List<String> str_arr;
        while(sc.hasNext()){
            num = sc.nextInt();
            sc.nextLine();
            while(num>0){
                str = sc.nextLine();
                str_arr = Arrays.asList(str.split(" "));
                for(int i=0 ; i<str_arr.size() ; i++){
                    System.out.print(mos_list.indexOf(str_arr.get(i))>=0?letter[mos_list.indexOf(str_arr.get(i))].toUpperCase():"");
                }
                System.out.println();
                num--;
            }
        }
    }
}