public class Persegi2 {

    int p,l,luas,kel;
    void setP(int p){ //setter
        this.p = p;
    }

    int getP(){ //getter
        return p;
    }

    void setL(int l){
        this.l = l;
    }

    int getL(){
        return l;
    }

    void hitungLuas(){
        luas=p*l;
    }

    void hitungKel(){
        kel=2*(p+l);
    }

    int getLuas(){
        return p*l;
    }

    int getKel(){
        return 2*(p+l);
    }
   
    void info(){
        System.out.println("Panjang : "+p);
        System.out.println("Lebar : "+l);
        hitungLuas();
        hitungKel();
        System.out.println("Luas : "+luas);
        System.out.println("Keliling : "+kel);
    }
}