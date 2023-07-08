import java.util.Scanner;
public class wahana{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("apakah kamu boleh naik wahana nya ? ");
    System.out.println("berapa tinggi kamu ?");
    int tinggi = input.nextInt();
    
    input.close();
    }

    public static void apakaboleh(int tinggi){
        if (tinggi >=160){
            System.out.println("kamu boleh naik wahan ini, selamat!!");       
        }else{System.out.println("maaf kamu belum bisa naik wahana ini");}
    }
    }
