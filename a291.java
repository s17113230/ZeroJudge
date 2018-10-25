import java.util.*;

public class a291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int [] a = new int[4];
		    for(int i=0 ; i<4 ; i++){
		    	a[i] = sc.nextInt();
		    }
		    int count=sc.nextInt();
        	for(; count>0 ; count--){
				int [] b = new int[4];
				boolean [] c = new boolean[4];
				boolean [] d = new boolean[4];
				int x = 0;
				int y = 0;
				for (int i=0 ; i<4 ; i++){
					b[i] = sc.nextInt();
					if(b[i] == a[i]){
						c[i] = true;
						d[i] = true;
						x++;
					}else{
						c[i] = false;
						d[i] = false;
					}
				}

				for(int i=0 ; i<4 ; i++){
					if(c[i] == false){
						for(int j=0 ; j<4 ; j++){
							if(a[i] == b[j] && d[j] == false){
								c[i] = true;
								d[j] = true;
								y++;
								break;
							}
						}
					}
				}
				System.out.println(x+"A"+y+"B");
        	}
        }
    }
}