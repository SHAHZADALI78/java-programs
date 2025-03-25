
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String [] args){
        int array [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Data: ");

        for(int i = 0; i<= 1; i++){
            for(int j = 0; j <=1; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Input For Array Matix");
        for(int i = 0; i<= 1; i++){
            for(int j = 0; j <=1; j++){
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix Is: ");

        for(int i = 0; i<= 1; i++){
            for(int j = 0; j <=1; j++){
                System.out.print(array[j][i] + "   ");
            }
            System.out.println();
        }

    }
}
