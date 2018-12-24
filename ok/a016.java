import java.util.*;
public class a016 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()){
    		int [][] a = new int [9][9];
    		int sum=0;
    		for (int i=0 ; i<9 ; i++){
    			for (int j=0 ; j<9 ; j++){
    				a[i][j] = sc.nextInt();
    			}
    		}
    		for (int i=0 ; i<9 ; i++){
    			for (int j=0 ; j<9 ; j++){
    				for (int k=0 ; k<9 ; k++){
						if (a[i][j] == a[i][k] && j!=k)
    						sum++;
    					if (a[j][i] == a[k][i] && j!=k)
    						sum++;
    				}
    			}
    		}
    		for (int i=0 ; i<9 ; i++){
    			for (int j=0 ; j<9 ; j++){
    				for (int x=0 ; x<9 ; x++){
    					for (int k=0 ; k<9 ;k++){
    						if (i<3){
    							if(j<3){
    								if(x<3){
    									if(k<3){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    							else if (j>2 && j<6){
    								if(x<3){
    									if(k>2 && k<6){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    							else{
    								if(x<3){
    									if(k>5 && k<9){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    						}
    						else if(i>2 && i<6){
    							if(j<3){
    								if(x>2 && x<6){
    									if(k<3){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    							else if (j>2 && j<6){
    								if(x>2 && x<6){
    									if(k>2 && k<6){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    							else{
    								if(x>2 && x<6){
    									if(k>5 && k<9){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    						}
    						else{
    							if(j<3){
    								if(x>5){
    									if(k<3){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    							else if (j>2 && j<6){
    								if(x>5){
    									if(k>2 && k<6){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    							else{
    								if(x>5){
    									if(k>5 && k<9){
    										if(a[i][j] == a[x][k] && (i!=x && j!=k))
    											sum++;
    									}
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    		System.out.println((sum>0) ? "no":"yes");
    	}

    }
}