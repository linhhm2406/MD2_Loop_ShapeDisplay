import java.util.Scanner;

public class ShapeDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Case 1 : Rectangle
        System.out.print("Nhap vao do dai canh hinh vuong: ");
        int square = input.nextInt();

        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Case 2-1 : square triangle / top-right
        System.out.print("Nhap vao do dai canh goc vuong: ");
        int triTopRight = input.nextInt();
        for (int i = 0; i < triTopRight; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i == 0){
                    continue;
                }
                System.out.print(" ");
            }
            for (int k = triTopRight; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Case 2-2 : square triangle / bottom-right
        System.out.print("Nhap vao do dai canh goc vuong: ");
        int triBotRight = input.nextInt();
        for (int i = 0; i < triBotRight; i++) {
            for (int k = triBotRight-1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Case 2-3 : square triangle / bottom-left
        System.out.print("Nhap vao do dai canh goc vuong: ");
        int triBottomLeft = input.nextInt();
        for (int i = 0; i < triBottomLeft; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Case 2-4 : square triangle / top-left
        System.out.print("Nhap vao do dai canh goc vuong: ");
        int triTopLeft = input.nextInt();
        for (int i = 0; i < triTopLeft; i++) {
            for (int j = triTopLeft-i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Case 3 : isosceles triangle
        System.out.print("Nhap vao do dai canh day cua tam giac can: ");
        int isosceles = input.nextInt();
        int halfOfIsosceles = isosceles/2;
        for (int k = 0, i = 0; i < isosceles; i+=2,k++) {
            for (int j = halfOfIsosceles-i+k; j >= 0 ;j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
