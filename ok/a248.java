import java.util.Scanner;
public class a248{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			StringBuilder sb = new StringBuilder();
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			int precise = sc.nextInt();
			if(precise == 0){
				System.out.println(number1 / number2);
			}else if(number1 % number2 == 0 && precise > 0){
				sb.append(number1 / number2+".");
    			for(int time = 0;time < precise;time++){
     				sb.append("0");
    			}
    			System.out.println(sb.toString());
   			}else{
    			sb.append(number1 / number2+".");
    			int remainder = number1 % number2;
    			for(int time = 0;time < precise;time++){
     				remainder *= 10;
     				sb.append(remainder / number2);
     				remainder = remainder % number2;
    			}
    			System.out.println(sb.toString());
   			}

		}
 	}
}