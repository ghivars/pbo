import java.io.*;
public class Pecah{
    int bil,p;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public Pecah(){}
    public Pecah(int bil){
        this.bil=bil;
    }
    void inputBil() throws IOException{
        System.out.print("Bil: ");
        bil=Integer.parseInt(input.readLine());
    }
    
    void cetak() throws IOException{
        for(int i=1;i<=bil;i++){
            System.out.print(i+" ");
            if(i%5==0)
            System.out.println("");
        }
        System.out.print("Pecah: ");
        p=Integer.parseInt(input.readLine());
        for(int i=1;i<=bil;i++){
            System.out.print(i+" ");
            if(i%p==0)
            System.out.println("");
    }
    }}