import java.util.Scanner;

public class d060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int girl = sc.nextInt();
            System.out.println(girl<25?25-girl:girl==25?0:60-girl+25);
        }
    }
}