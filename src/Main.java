//Существует только одна тройка Пифагора, для которой a + b + c = 1000.
//Найдите произведение abc.
import java.math.*;
public class Main {
    public static void main(String[] args) {
        double z;
        double pro;


        for(float i=0; i<1000; i++)
            for(float j=0; j<1000;j++){
                z= Math.sqrt((i*i) + (j*j));
                if((z%1==0)&(i+j+z)==1000) {
                    pro = i*j*z;
                    int value = (int)pro;
                    System.out.println(value);}
            }

    }
}
