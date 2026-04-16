public class SuhuDemo {
    public static void main(String[] args) {
        Suhu suhuku = new Suhu();
        suhuku.cTof(25);
        suhuku.cToK(25);
        System.out.println("Hasil Konversi C ke F : " + suhuku.cTF(25));
        System.out.println("Hasil Konversi C ke K : " + suhuku.cTK(25));
       
        Suhu suhumu=new Suhu(20);
        suhumu.cTof(suhumu.c);
        suhumu.cToK(suhumu.c);

        Suhu suhunya = new Suhu();
        suhunya.inputC();
        suhunya.cToK(suhunya.c);
        suhunya.cTof(suhunya.c);
    }
}