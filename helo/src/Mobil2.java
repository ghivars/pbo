public class Mobil2{
    int roda = 4;
    int body = 1;
    static int mesin = 1;
    static void maju(){
        System.out.println("Mobil maju");
    }

    static void mundur(){
        System.out.println("Mobil mundur");
    }

    static void belok(){
        System.out.println("Mobil belok");
    }

    void HidupkanMobil(String nama){
        System.out.println("Mobil hidup" +nama);
    }

    void MatikanMobil(String nama){
        System.out.println("Matikan "+nama);
    }

    void Ubahgigi(String nama){
        System.out.println("Ubah gigi "+nama);
    }
}