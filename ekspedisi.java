import java.util.Scanner;
public class ekspedisi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("===volume paket===");
        System.out.println("panjang (cm) : ");
        int panjang = input.nextInt();
        System.out.println("lebar (cm) : ");
        int lebar = input.nextInt();
        System.out.println("tinggi (cm) : ");
        int tinggi = input. nextInt();

        System.out.println("masukkan berat barang (kg) : ");
        int berat = input.nextInt();

        System.out.println("masukkan jarak pengiriman (km) : ");
        int jarak = input.nextInt();
                  

        int volume = panjang * lebar * tinggi;

        int biayaPerKg;
        if (jarak <= 10){
            biayaPerKg = 4250;
        }else {
            biayaPerKg = 6000;
        }

        int biayaTotal = berat * biayaPerKg;

        if (volume > 100000){
            biayaTotal += 50000;
        }

        System.out.println("===RINCIAN BIAYA===");
        System.out.println("Volume paket: " + volume + " cm");
        System.out.println("Biaya volume paket: " + (volume > 100000? "Rp 50000 (biaya tambahan)" : "Rp 0"));
        System.out.println("Berat paket: " + berat + "kg");
        System.out.println("Jarak pengiriman: " +jarak + "km");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);

        System.out.println("=========================");
        System.out.println("Yang harus dibayar : Rp " + biayaTotal);
        System.out.println(" Terimakasih");
        

        
    }
}