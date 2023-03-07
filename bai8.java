
import java.util.*;

public class bai8 {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang : ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double tong = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhap vao gia tri thu : "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            tong = tong + arr[i];
        }
        double trungbinh = tong / arr.length;
        System.out.format("Ket qua la: %.3f", trungbinh);
    }
}
