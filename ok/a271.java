import java.util.*;

public class a271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	while(a>0){
        		int [] b = new int[6];
        		for(int i=0 ; i<b.length ; i++){
        			b[i] = sc.nextInt();
        		}
        		sc.nextLine();
        		String c = sc.nextLine();
        		String new_c = c.replaceAll(" ", "");
        		char []d  = new char [new_c.length()];
        		new_c.getChars(0,new_c.length(),d,0);

        		int weight = b[5];
        		int type = 0;
        		for(int i=0 ; i<d.length ; i++){
        			if(type==0){
	        			if(d[i] == '1'){
	        				weight += b[0];
	        			}else if(d[i]=='2'){
	        				weight += b[1];
	        			}else if(d[i]=='3'){
	        				weight -= b[2];
	        			}else if(d[i]=='4'){
	        				weight -= b[3];
	        				type++;
	        			}else{
	        				weight = weight;
	        			}
	        			if(weight<0){
	        				break;
	        			}
        			}else{
        				weight -= (b[4]*type);

	        			if(weight<0){
	        				break;
	        			}else{
	        				if(d[i]=='1'){
	        					weight += b[0];
		        			}else if(d[i]=='2'){
		        				weight += b[1];
		        			}else if(d[i]=='3'){
		        				weight -= b[2];
		        			}else if(d[i]=='4'){
		        				weight -= b[3];
		        				type++;
		        			}else{
		        				weight = weight;
		        			}
	        			}
        			}
        		}
        		System.out.println((weight>0)?weight+"g":"bye~Rabbit");
        		a--;
        	}
        }
    }
}