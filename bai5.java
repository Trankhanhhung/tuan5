import java.util.*;

public class bai5 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao cac so nguyen bat ki : ");
        int a = sc.nextInt();
        int tong = 0; 
        while(a > 0){
            tong += a%10;
            a /=10;
        }
        if(tong < 100){
            System.out.print("Tong cac chu so : " + tong);
        }else{

        }   
    }
}
