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
        System.out.println(10/5);

        int x = 10;
        System.out.println(++x);
        System.out.println(--x);

        x = 10;
        System.out.println(x+=5);

        int y = 7;
        int z =15;
        int suma= y+z;
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

        System.out.println(var2-=2);
        System.out.println(var2-=2);
        System.out.println(var2);

        boolean cond1 = (var1 + var2 + var3 + var4) >100;
        System.out.println(cond1);
        boolean cond2 = (var1*var2*var3*var4)>1000;
        System.out.println(cond2);

        boolean condSau = cond1 || cond2;
        if (condSau){
            System.out.println("una dintre conditii este adevarata!");
        }
        System.out.println(condSau);



        boolean condSi = cond1 && cond2;
        if (condSi){
            System.out.println("ambele conditii sunt adevarate");
        }  else
        {
            System.out.println("cel putin una dintre conditii nu este adevarata");
        }
        System.out.println(condSi);










    }
}
