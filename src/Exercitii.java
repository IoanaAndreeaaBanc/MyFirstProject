import com.sun.security.jgss.GSSUtil;

import javax.print.DocFlavor;
import java.util.logging.SocketHandler;

public class Exercitii {
    public static void main(String[] args) {

        int numbers [] = {5,6,7,8,9};
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);

        //Afiseaza daca un numar este impar
        if(3%2!=0) {
            System.out.println("numar impar");
        }
        for(int nr=1; nr<=10; nr++){
            if(nr%2!=0){
                System.out.println(nr);
            }
        }
        int nr=1;
        while (nr<=10){
            if (nr%2!=0){
                System.out.println(nr);
            }
            nr++;

        }

        for(int index=1; index<=12; index++){
            switch (index){
                case 1:
                    System.out.println("Ianuarie");
                    break;
                case 2:
                    System.out.println("Febraurie");
                    break;
                case 3 :
                    System.out.println("Martie");
                    break;
                default:
                    System.out.println("nu exista luna");
            }

        }

        String[] luni={"Ianuarie", "Februarie","Martie","Aprilie", "Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};

        for(int index=0; index< luni.length; index++) {


            System.out.println(index + 1 + " " + luni[index]);
        }


        int time = 20;
        if(time < 24)
        {
            System.out.println("good night");
        }
        else{


        System.out.println("good morning");}

        String[] cars = {"bmw", "Seat Ateca", "Toyota"};
        for (String c:cars){
            System.out.println(c);}

        //  TEMA 27.10.2023

        int temperature = 20;

        if (temperature<18){
            System.out.println("Prea Frig");
        }
        else if (temperature>=18 && temperature<=22){
            System.out.println("ok");
        }
        else {
            System.out.println("Prea cald");
        }
        // ex 2

        char gender = 'f';
        boolean married = true;

        if(gender=='m'){
            System.out.println("Domnul");
        }
        if (gender=='f'){

            if(married==true){
                System.out.println("Doamna");
            }
            else {
                System.out.println("Domnisoara");
            }

        }
        // ex 3

        int x = 50;
        int y = 100;

        if (x>y){
            System.out.println(x + " este mai mare mare decat " + y);
        }
        else if (y>x){
            System.out.println(y + " este mai mare decat " + x);
        }
        else {
            System.out.println("sunt egale");
        }


        //ex 4

        int z = 7;
        if(x>y && x>z){
            System.out.println(x);
        }
        else if (y>x && y>z){
            System.out.println(y);
        }
        else if (z>x && z>y){
            System.out.println(z);
        }
        else{
            System.out.println("Toate sunt egale");
        }

        System.out.println( Math.max(x,Math.max(y,z)));

        //ex 5
        char letter = 'l';

       switch (letter){
           case 'a' :
           case 'e' :
           case 'i' :
           case 'o' :
           case 'u' :
               System.out.println(letter + " este vocala");
               break;
           default: System.out.println(letter + " este consoana");
       };

    }
}
