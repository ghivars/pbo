public class MatematikaDemo{

    public static void main(String[] args){
        Matematika mtk = new Matematika();
        mtk.pertambahan(20,20);
        mtk.pengurangan(10,5);
        mtk.perkalian(11,77);
        mtk.pembagian(100,15);

        Matematika mtkku = new Matematika();
        mtkku.pertambahan(10.7f,15);
        mtkku.pengurangan(77.7f,27.5f);
        mtkku.perkalian(22.2f,99.9f);
        mtkku.pembagian(100f,6f);
    }
}