import java.util.*;
public class a054 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		char [] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    		int [] b = {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
    		String c = sc.next();
    		char [] d = new char [c.length()];
    		int [] e = new int [c.length()];
    		c.getChars(0,c.length(),d,0);
    		int num = 0;
    		for (int i=0 ; i<d.length ; i++){
    			e[i] = (int)d[i] - 48;
    		}
			for (int i=0 ; i<d.length-1 ; i++){
				num += e[i] * (8-i);
			}
			for (int i=0 ; i<b.length ; i++){
				b[i] = 10 - (b[i]/10*1 + b[i]%10*9 + num) % 10;
				if(b[i]==10)
					b[i] = 0;
				if (b[i]==e[8])
					System.out.print(a[i]);
			}
			System.out.println("");
    	}
    }
}