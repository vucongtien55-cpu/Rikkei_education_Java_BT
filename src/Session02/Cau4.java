package Session02;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        int a = sc.nextInt();

        System.out.println("Nhap so nguyen b: ");
        int b = sc.nextInt();

        System.out.println("Nhap so nguyen c: ");
        int c = sc.nextInt();

        if(a + b > c && b + c > a && a + c > b){
            System.out.println("Tam gia hop le");

            if(a == b && b == c){
                System.out.println("Tam giac nay la tam giac deu.");

            } else if(a == b  || a == c || b == c){
                System.out.println("Day la tam giac can");
            } else if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a ){
                System.out.println("Day la tam giac vuong");
            } else{
                System.out.println("Day la tam giac thuong");
            }
        } else{
            System.out.println("Tam giac khong hop le");
        }
    }
}
