import java.util.Scanner;
public class SingleArray{
    int j,i;
    int[] nilai;
    Scanner input = new Scanner(System.in);
    public SingleArray(){}
    public SingleArray(int j){
        this.j=j;
    }
    void inputData(){
        System.out.print("Jumlah Data : ");
        j=input.nextInt();
        nilai=new int[j];
        for(i=0;i<j;i++){
            System.out.println("Data ke- "+(i+1)+" = ");
            nilai[i] = input.nextInt();
        }
    }
    
    void cetak(){
        for(i=0;i<j;i++){
            System.out.println("Hasil Nilai  ["+nilai[i]+"] = " +nilai[i]);
        }
    }
    
}