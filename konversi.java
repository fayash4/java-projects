import java.util.Scanner;
public class cb {
    public static void main (String[]args){
        try{
            try(Scanner rupiah = new Scanner (System.in)){
            System.out.println("konversi rp -> $");
            System.out.println("jumlah uang dalam rupiah");
            double rd = 0.000067;
            double a = rupiah.nextInt();
            double b = a*rd;
            System.out.print("uang dollar kamu = "+ b+" $");
            }
        }
        catch (Exception e){
            System.out.println("ERROR!!");
            System.out.println("saat mengisi jumlah uang dimohon untuk menggunakan angka saja.");
        }
    }
    
}
