import java.util.Scanner;

public class a417{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int count = sc.nextInt();
        	while(count>0){
        		int a = sc.nextInt();
	        	int b = sc.nextInt();
	        	int [][] c = new int[a][a];
	        	if(b==1){
	        		int templ = a;
		        	int tempr = 0;
		        	int num = 1;
		        	int ne_i=0;
		        	int ne_j=0;
		        	int ne_k=1;
		        	int ne_l=a-2;
		        	int ne_o=a-2;
		        	int i=ne_i;
		        	int j=ne_j;
		        	int k=ne_k;
		        	int l=ne_l;
		        	int o=ne_o;
		        	for(; i<a ; i++){
						for(; j<templ ; j++){
							c[i][j] = num++;
						}
						j--;
						for(; k<templ ; k++){
							c[k][j] = num++;
						}
						j++;
						k--;
						for(; l>=tempr ; l--){
							c[k][l] = num++;
						}
						k++;
						l++;
						for(; o>i ; o--){
							c[o][l] = num++;
						}
						l--;
						o++;
						templ--;
						tempr++;
						ne_j++;
						ne_k++;
						ne_l--;
						ne_o--;
						j=ne_j;
		        		k=ne_k;
		        		l=ne_l;
		        		o=ne_o;
		        	}
	        	}
	        	if(b==2){
	        		int templ = a;
		        	int tempr = 0;
		        	int num = 1;
		        	int ne_i=0;
		        	int ne_j=0;
		        	int ne_k=1;
		        	int ne_l=a-2;
		        	int ne_o=a-2;
		        	int i=ne_i;
		        	int j=ne_j;
		        	int k=ne_k;
		        	int l=ne_l;
		        	int o=ne_o;
		        	for(; i<a ; i++){
						for(; j<templ ; j++){
							c[j][i] = num++;
						}
						j--;
						for(; k<templ ; k++){
							c[j][k] = num++;
						}
						j++;
						k--;
						for(; l>=tempr ; l--){
							c[l][k] = num++;
						}
						k++;
						l++;
						for(; o>i ; o--){
							c[l][o] = num++;
						}
						l--;
						o++;
						templ--;
						tempr++;
						ne_j++;
						ne_k++;
						ne_l--;
						ne_o--;
						j=ne_j;
		        		k=ne_k;
		        		l=ne_l;
		        		o=ne_o;
		        	}
	        	}

	        	for(int z=0 ; z<a ; z++){
	        		for(int x=0 ; x<a ; x++){
						if(c[z][x]<10){
	        				System.out.print(x!=a-1?"    "+c[z][x]:"    "+c[z][x]);
	        			}else if(c[z][x]<100){
	        				System.out.print(x!=a-1?"   "+c[z][x]:"   "+c[z][x]);
	        			}else if(c[z][x]<1000){
	        				System.out.print(x!=a-1?"  "+c[z][x]:"  "+c[z][x]);
	        			}else if(c[z][x]<10000){
	        				System.out.print(x!=a-1?" "+c[z][x]:" "+c[z][x]);
	        			}else{
	        				System.out.print(x!=a-1?c[z][x]:c[z][x]);
	        			}
		        	}
		        	System.out.println();
        		}
        		count--;
        	}
        }
    }
}