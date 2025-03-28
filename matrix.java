import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix;
        int[][] transpose;
        int sum=0,r,c,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        r=sc.nextInt();
        System.out.println("enter the no of colums");
        c=sc.nextInt();
        if(r!=c){
            System.out.println("olny square matrix allowed");
        }
        else{
            matrix = new int[r][c];
            transpose = new int[c][r];
            System.out.println("Enter the elements of the matrix");
            for(int i=0;i<r;i++){
                for(j=0;j<c;j++){
                    matrix[i][j]=sc.nextInt();

                }
            }
            System.out.println(" given matrix");
            
            for(int i=0;i<r;i++){
                for(j=0;j<c;j++){
                   System.out.println(matrix[i][j] +" "); 

                }
                System.out.println("\n");
            }

            for(int i=0;i<r;i++){
                for(j=0;j<c;j++){
                   transpose[j][i]= matrix[i][j];
                   if(i==j){
                    sum=sum+(matrix[i][j]);
                   }
                }
            }
            System.out.println("the trance of givem matrix is" +sum);
            System.out.println("transpose matrix");
            for(int i=0;i<c;i++){
                for(j=0;j<r;j++){
                   System.out.println(transpose[i][j] +" "); 

                }
                System.out.println("\n");
            }
            
        }
    }
    
}
