import java.util.Scanner;
public class Nilai{
    String nim,nama,predikat;
    float nilaiUts,nilaiTugas,nilaiUas,pNilaiUts,pNilaiTugas,pNilaiUas,nilaiAkhir;
    char nHuruf;
    Scanner in=new Scanner(System.in);
    public Nilai(){}//konstruktor default

    public Nilai(String nim, String nama,float nilaiUts,float nilaiTugas,float nilaiUas){
        this.nim=nim;
        this.nama=nama;
        this.nilaiUts=nilaiUts;
        this.nilaiTugas=nilaiTugas;
        this.nilaiUas=nilaiUas;
    }

   void setNim(String nim){
        this.nim=nim;
    }

    String getNim(){
        return nim;
    }


    void setUts(float nilaiUts){
        this.nilaiUts=nilaiUts;
    }

    float getUts(){
        return nilaiUts;
    }

    public void isiData(){
        System.out.print("Masukkan NIM : ");
        nim=in.nextLine();
        System.out.print("Masukkan Nama : ");
        nama=in.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas=in.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUts=in.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUas=in.nextFloat();
    }

    void hitungNilai(){
        pNilaiUts=0.35f*nilaiUts;
        pNilaiTugas=0.2f*nilaiTugas;
        pNilaiUas=0.45f*nilaiUas;
        nilaiAkhir=pNilaiUts+pNilaiTugas+pNilaiUas;
    }
    
    String getPredikat(char huruf){
    switch(huruf)
    {
    case 'A':predikat="Apik";
    break;
    case 'B':predikat="Baik";
    break;
    case 'C':predikat="Cukup";
    break;
    case 'D':predikat="Dablek";
    break;
    default:predikat="Elek";
    }
    return predikat;
    }
    void cetakNilai(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Nilai Tugas : "+nilaiTugas+"20% : "+pNilaiTugas);
        System.out.println("Nilai UTS : "+nilaiUts+" 35%: " +pNilaiUts);
        System.out.println("Nilai UAS : "+nilaiUas+" 45%: " +pNilaiUas);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+getNilHuruf(nilaiAkhir));
        System.out.println("Predikat : "+getPredikat(nHuruf));
    }
    
    char getNilHuruf(float nilai)
    {
    if(nilai>=85)
    nHuruf='A';
    else if(nilai>=70 && nilai<85)
    nHuruf='B';
    else if(nilai>=60 && nilai<70)
    nHuruf='C';
    else if(nilai>=40 && nilai<60)
    nHuruf='D';
    else
    nHuruf='E';
    return nHuruf;
    }
    
    void judul(){
        System.out.println("Daftar Nilai PBO");
        System.out.println("----------------");
        System.out.println("Nim\tNama\tN.Tgs\tN.Uts\tN.Uas\tN.Akhir");
    }
    
    void daftarNilai(){
        System.out.println(nim+"\t"+nama+"\t"+nilaiTugas+"\t"+nilaiUts+"\t"+nilaiUas+"\t"+nilaiAkhir+"\t"+nHuruf+"\t"+predikat);
    }
}



