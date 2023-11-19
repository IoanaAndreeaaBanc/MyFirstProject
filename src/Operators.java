import java.sql.SQLOutput;

public class Operators  {
    public static void main(String[] args)
    {


        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        System.out.println("sum3=" + sum3);
        int number1 = 100;
        int number2 = 50;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        System.out.println(9 % 2); // restul
        System.out.println(9 / 2); // catul
        System.out.println(++number1);
        System.out.println(--number2);
        System.out.println(number1++);
        System.out.println(number1);
        int number3=number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);
        //number2 = number2+2;
        System.out.println(number2);
        number2+=4; // echivalent numbar2=nummar2+4;
        number2-=2;
        System.out.println(number2);
        number2*=2;
        System.out.println(number2);
        System.out.println(number1>number2); //100.6
        System.out.println(number1<number2);
        System.out.println(10>5);
        System.out.println('A'=='A');
        System.out.println('A'!='A');
        System.out.println(true);
        System.out.println(!true);
        System.out.println(number1);
        System.out.println(number2);
        boolean condition = number1>number2 && number1>100; //test
        System.out.println(condition);

        if (condition){
            System.out.println("Conditia este adevarata!");
        }


        System.out.println(10*6);
        double result = 10*6;
        System.out.println(result);



        System.out.println(10/5);

        int x = 10;
        System.out.println(++x);
        System.out.println(--x);

        x = 10;
        System.out.println(x+=5);

        // ex 5

        int y = 7;
        int z =15;
        int suma= y+z;
        System.out.println(suma);
        if(suma>=10)
        {
            System.out.println("suma este mai mare decat 10 ");
        }
        else
        {
            System.out.println("suma este mai mica decat 10");
        }


        if(suma % 2==0){
            System.out.println("suma este numar par");

        }
         else
        {
            System.out.println("suma este numar impar");        }

         int var1=10;
         int var2=12;
         int var3=5;
         int var4=20;
        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4 % var2);

        System.out.println(++var1);
        System.out.println(++var1);
        System.out.println(++var1);
        System.out.println(var1);

        //sau optional cu for

        for (int i=0; i<3; i++) {
            var1++;
        }

        System.out.println(var2-=2);
        System.out.println(var2-=2);
        System.out.println(var2);

        for (int i=0; i<2; i++){
            var2--;
        }


        int no = 2;
        System.out.println(++no);
        System.out.println(no-=3);

        int adunare1 = 5+21;
        int adunare2 = adunare1 + 200;
        int adunare3 = adunare2 + adunare2;
        System.out.println(adunare1);
        System.out.println(adunare2);
        System.out.println(adunare3);

        System.out.println(9%2);
        System.out.println((float)9/2);


        int n = 2;
        System.out.println(n++);
        System.out.println(++n);
        int m = 10;
        System.out.println(m+=4);

        int no1 = 20;
        int no2 = 40;
        int sumaLor = no1+no2;
        System.out.println(sumaLor);
        System.out.println(no1+no2);
        if(sumaLor>=10){
            System.out.println("Suma este mai mare decat 10");
        }
        else{
            System.out.println("Suma este mai mica decat 10");
        }
        if(sumaLor%2==0){
            System.out.println("Suma este numar par");
        }


















    }
}
