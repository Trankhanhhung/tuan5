import java.util.*;
public class bai6 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong bat ki : ");
        int a = sc.nextInt();
        long giaiThua = 1;
        if(a > 0){
            for(int i = 1; i <= a; i++) {
                giaiThua = giaiThua * i;
            }
            System.out.print("Giai thua cua " + a + " la " + giaiThua);
        }else{
            System.out.print("Nhap vao 1 so > 0");
        }
        
}
}
