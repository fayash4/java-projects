import java.util.Scanner;
public class war {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        System.out.print("Masukan Jumlah Siswa : ");
        int a = le.nextInt();

        String nama[] = new String[a];
        String status[] = new String[a];
        int nilai[] = new int[a];

        for (int b=0; b<a; b++){
            System.out.println("Siswa Ke : "+(b+1));
            System.out.print("Nama : ");
            nama[b]=le.next();

            System.out.print("Nilai : ");
            nilai[b]=le.nextInt();

            if (nilai[b]>70){
                status[b]="Lulus";
            }else{
                status[b]="Tidak Lulus";
            }
        }
        System.out.println("============================");
        System.out.println("    DAFTAR NILAI SISWA");
        System.out.println("============================");
        System.out.println("No   Nama   Nilai   Status");

        for (int b=0; b<a; b++){
            System.out.println((b+1)+"    "+nama[b]+"     "+nilai[b]+"     "+status[b]);
        }
        le.close();
    }
}
