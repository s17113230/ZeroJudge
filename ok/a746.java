import java.util.Scanner;

public class a746 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int m_array[][] = new int[m][2];
            String n_array[][] = new String[n][n];
            for(int i=0 ; i<m ; i++){
                m_array[i][0] = sc.nextInt();
                m_array[i][1] = sc.nextInt();
            }
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n ; j++){
                    n_array[i][j] = " ";
                }
            }

            int x1=0,y1=0,x2=0,y2=0;
            for(int i=0 ; i<m ; i++){
                if(i%2==0 && x1==0 && y1==0){
                    x1 = m_array[i][0];
                    y1 = m_array[i][1];
                }else if(i%2!=0 && x2==0 && y2==0){
                    x2 = m_array[i][0];
                    y2 = m_array[i][1];
                    if(x1 == x2){
                        for(int j=y1 ; j<=y2 ; j++){
                            n_array[x1-1][j-1] = "*";
                        }
                    }else if(y1 == y2){
                        for(int j=x1 ; j<=x2 ; j++){
                            n_array[j-1][y1-1] = "*";
                        }
                    }
                }else {
                    x1 = x2;
                    y1 = y2;
                    x2 = m_array[i][0];
                    y2 = m_array[i][1];
                    if(x1 == x2){
                        if(y2>y1){
                            for(int j=y1 ; j<=y2 ; j++){
                                n_array[x1-1][j-1] = "*";
                            }
                        }else{
                            for(int j=y2 ; j<=y1 ; j++){
                                n_array[x1-1][j-1] = "*";
                            }
                        }
                    }else if(y1 == y2){
                        if(x2>x1){
                            for(int j=x1 ; j<=x2 ; j++){
                                n_array[j-1][y1-1] = "*";
                            }
                        }else{
                            for(int j=x2 ; j<=x1 ; j++){
                                n_array[j-1][y1-1] = "*";
                            }
                        }
                    }
                }
            }


            StringBuffer allPrint = new StringBuffer("");
            allPrint.append("--");
            for(int i=0 ; i<n ; i++){
                allPrint.append("-");
            }
            for(int i=0 ; i<n ; i++){
                allPrint.append("\n|");
                for(int j=0 ; j<n ; j++){
                    allPrint.append(n_array[i][j]);
                }
                allPrint.append("|");
            }
            allPrint.append("\n--");
            for(int i=0 ; i<n ; i++){
                allPrint.append("-");
            }
            System.out.println(allPrint);
        }
    }
}