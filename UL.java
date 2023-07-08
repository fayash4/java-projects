import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class proyek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));

        String jawab = "y";
        int i = 0;
        int pirang, baju, celana, sepatu, total=0;
        String produk[] = new String [100];
        int harga[] = new int [100];
        String tanya = "apakah anda ingin menambah pembelian (y/t)", tuanya = "Memilih produk = ";

        System.out.println(" ____    ____ _____");
        System.out.println("|    |  |    |     |");
        System.out.println("|    |  |    |     |");
        System.out.println("|    |  |    |     |");
        System.out.println("|    |__|    |     |_____");
        System.out.println("|            |           |");
        System.out.println("|____________|___________|");
        System.out.println();
        System.out.println();

        while (jawab.equals("Y")||jawab.equals("y")){
        System.out.println("------------------DAFTAR PRODUK UNIKLAWU------------------");
        System.out.println("1. Baju");
        System.out.println("2. Celana");
        System.out.println("3. Sepatu");
        System.out.println("*Untuk memilih barang silahkan ketik nomor dari produk yang tersedia*");
        pirang = input.nextInt();

            if (pirang==1){
                System.out.println("------------------BAJU UNIKLAWU-----------------");
                System.out.println("jenis baju yang tersedia");
                System.out.println("1. Cardigan = Rp228.000");
                System.out.println("2. Hoodie   = Rp359.000");
                System.out.println("3. Sweater  = Rp299.000");
                System.out.println("4. T-Shirt  = Rp100.000");
                System.out.println("5. Jacket   = Rp399.000");
                System.out.print(tuanya);
                baju = input.nextInt();
                switch(baju){
                    case 1: 
                    produk [i] = "Cardigan"; 
                    harga [i] = 228000;
                    break;
                    case 2: 
                    produk [i] = "Hoodie"; 
                    harga [i] = 359000;
                    break;
                    case 3: 
                    produk [i] = "Sweater"; 
                    harga [i] = 299000;
                    break;
                    case 4: 
                    produk [i] = "T-Shirt"; 
                    harga [i] = 100000;
                    break;
                    case 5: 
                    produk [i] = "Jacket"; 
                    harga [i] = 399000;
                    break;
                    default:System.out.println("Maaf produk belum tersedia");
                    baju = 0;
                    break;
                }
                pirang = baju;
            
            }
            else if (pirang==2){
                System.out.println("------------------CELANA UNIKLAWU-----------------");
                System.out.println("jenis celana yang tersedia");
                System.out.println("1. Jeans    = Rp299.000");
                System.out.println("2. Cargo    = Rp249.000");
                System.out.println("3. Rok      = Rp220.000");
                System.out.println("4. Jogger   = Rp259.000");
                System.out.println("5. Boot cut = Rp275.000");
                System.out.print(tuanya);
                celana = input.nextInt();
                switch(celana){
                    case 1: 
                    produk [i] = "Jeans"; 
                    harga [i] = 299000;
                    break;
                    case 2: 
                    produk [i] = "Cargo"; 
                    harga [i] = 249000;
                    break;
                    case 3: 
                    produk [i] = "Rok"; 
                    harga [i] = 220000;
                    break;
                    case 4: 
                    produk [i] = "Jogger"; 
                    harga [i] = 259000;
                    break;
                    case 5: 
                    produk [i] = "Boot cut"; 
                    harga [i] = 275000;
                    break;
                    default:System.out.println("Maaf produk belum tersedia");
                    celana = 0;
                    break;
                }
                pirang = celana;
            }
            else if (pirang==3){
                System.out.println("------------------SEPATU UNIKLAWU-----------------");
                System.out.println("jenis sepatu yang tersedia");
                System.out.println("1. Sneakers = 390.000");
                System.out.println("2. Slip On  = 319.000");
                System.out.println("3. Boots    = 319.000");
                System.out.println("4. Stiletto = 385.000");
                System.out.println("5. Pantofel = 259.000");
                System.out.print(tuanya);
                sepatu = input.nextInt();
                switch(sepatu){
                    case 1: 
                    produk [i] = "Sneakers"; 
                    harga [i] = 390000;
                    break;
                    case 2: 
                    produk [i] = "Slip On"; 
                    harga [i] = 149000;
                    break;
                    case 3: 
                    produk [i] = "Boots"; 
                    harga [i] = 319000;
                    break;
                    case 4: 
                    produk [i] = "Stiletto"; 
                    harga [i] = 385000;
                    break;
                    case 5: 
                    produk [i] = "Pantofel"; 
                    harga [i] = 259000;
                    break;
                    default:System.out.println("Maaf produk belum tersedia");
                    sepatu = 0;
                    break;
                }
                pirang = sepatu;
            }
            else{
                System.out.println("Mohon pilih angka 1-3");

            }
            System.out.println("Produk yang anda pilih adalah          : "+produk[i]);
            System.out.println("Harga yang harus dibayar               : "+harga[i]);
            System.out.println(tanya);

            try{
                jawab = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;

        }

        System.out.println("");
        System.out.println("Produk yang anda pilih adalah          : "+i);
        for (int a = 0; a<i;a++){
            System.out.print(produk[a]+", ");
        }
        System.out.println("");
        for (int b = 0; b<i;b++){
            total = total + harga[b];
        }
        System.out.println("Total yang harus anda bayar adalah   : Rp."+total);

        input.close();
    }
}
