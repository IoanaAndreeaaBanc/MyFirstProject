public class Tema3 {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }
        for (int i=20; i>=10; i--){
            System.out.println(i);}

        for (int i=0; i<=100; i++){
            if (i%2==0){
                System.out.println(i);
            }}


        String[] fructe ={"mar","capsune","pere","banane"};
        for (String fruct:fructe){
            System.out.println("Imi place sa mananc " + fruct);
        }


        // Exemplu cu While
        String[] luni={"Ianuarie", "Februarie","Martie","Aprilie", "Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};
        int nrLuna=0;
        while(nrLuna<12)
        {
            System.out.println( nrLuna + 1 + " " + luni[nrLuna]);
            nrLuna++;
        }

       // Exemplu cu For

        for (int index=0; index<luni.length; index++){
            System.out.println(index+1 + " " + luni[index]);
        }

        for (int z=0; z<11; z++){
            System.out.println(z);
        }
        for (int z=20; z>=10; z--){
            System.out.println(z);
        }
        for (int z=0; z<=100; z++){
            if (z%2==0){
            System.out.println(z);
        }}

        String [] fructe1 = {"mere", "capsune", "pere", "banane"};
        for (String fruct:fructe1){
            System.out.println("imi place sa mananc " + fruct);
        }








    }
}
