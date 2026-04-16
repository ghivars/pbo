import java.util.Scanner;
public class Determinan{
    float a,b,c;
    double D,x1,x2;
    public Determinan(float a,float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    Scanner input = new Scanner(System.in);
    public Determinan(){}
    void inputABC(){
        System.out.print("a : ");
        a=input.nextFloat();
        System.out.print("c: ");
        c=input.nextFloat();
    }
    void hitungD(){
        D=b*b-(4*a*c);
    }
    void hitungX1X2(){
        if(D>0){
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
        }else if(D==0){
            x1=x2=-b/(2*a);
        }else{
             //x1=(-b/(2*a)+(Math.sqrt(D)/(2*a)));
             //x1=(-b/(2*a)-(Math.sqrt(D)/(2*a)));
             
             double real = -b/(2*a);
             double imag = Math.sqrt(-D)/(2*a);
             
             System.out.println("x1 = "+real+" + "+imag+" i ");
             System.out.println("x2 = "+real+" + "+imag+" i ");
        }
    }
        
        void cetakDeterminan(){
            hitungD();
            hitungX1X2();
            System.out.println("a: "+a);
            System.out.println("b: "+a);
            System.out.println("c: "+a);
            System.out.println("D: "+a);
            System.out.println("x1: "+a);
            System.out.println("x2: "+a);
            System.out.println("x1 = "+x2);
            System.out.println("x2 = +x2");
        }
    }
    
