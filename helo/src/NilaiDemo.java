import java.util.Scanner;
public class NilaiDemo{
    public static void main(String[] args){
        Nilai nilaiku = new Nilai();
        Nilai nilaimu = new Nilai("A11.2024.16050","Ghivary",85,90,95);
        nilaiku.nim = "A11.2024.16067";
        nilaiku.nama = "Zaki";
        nilaiku.nilaiTugas = 80;
        nilaiku.nilaiUts = 83;
        nilaiku.nilaiUas =90;
        nilaiku.hitungNilai();
        nilaimu.hitungNilai();
        nilaiku.cetakNilai();
        nilaimu.cetakNilai();
        nilaimu.judul();
        nilaiku.daftarNilai();
        nilaimu.daftarNilai();

        Scanner input=new Scanner (System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int n=input.nextInt();
        Nilai[] nilaibyk=new Nilai[n];
        for (int i=0;i<n;i++){
            System.out.println("Mahasiswa ke : "+(i+1));
            nilaibyk[i]=new Nilai();
            nilaibyk[i].isiData();
            nilaibyk[i].cetakNilai();
        }
        nilaibyk[0].judul();
        for (int i=0;i<n;i++){
            nilaibyk[i].daftarNilai();
        }
        Nilai nilainya = new Nilai();
        nilainya.setNim("A11.2024.16068");
        nilainya.setUts(80);

        nilainya.hitungNilai();
        nilainya.cetakNilai();
        System.out.println("NIM : "+nilainya.getNim()+ " UTS : "+nilainya.getUts());

        Nilai nilaiDia = new Nilai();
        nilaiDia.isiData();
        nilaiDia.hitungNilai();
        nilaiDia.cetakNilai();
    }
    
  }