public class MyArray {
    public static void main(String[] args) {
        int []myArray = {1,2,3,4};
        String []myStringArray = {"unu", "doi", "trei"};
        System.out.println(myArray[0]);
        System.out.println(myArray[3]);
        System.out.println(myArray[1]);
        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        for (int i=0;i<myStringArray.length;i++)
        {
            System.out.println(myStringArray[i]);
        }


        double []ex4={7,9.56789123,10,19.55,11.23456};
        System.out.println(ex4[1]);
        //Afisam elementul de pe ultima pozitie
        System.out.println(ex4[4]);
        //sau
        System.out.println(ex4[ex4.length -1]);
        System.out.println(ex4.length);

        for (int index=0; index<ex4.length;index++)
        {
            System.out.println(ex4[index]);
        }

        double []ioana={78,100.0000005,78.5555555555555,4.5};
        System.out.println(ioana[1]);
        System.out.println(ioana[0]);
        System.out.println(ioana[2]);
        System.out.println(ioana[3]);
        System.out.println(ioana[0]);

        System.out.println(ioana.length);


        for (int index=0; index<ioana.length;index++)
        {
            System.out.println(ioana[index]);
        }

        char[] sir={'a','b','c','d'};
        System.out.println(sir[0]);
        System.out.println(sir[1]);
        System.out.println(sir[3]);


        for (int index=0; index<sir.length;index++)
        {
            System.out.println(sir[index]);
        }

        double[] numere = {75.866555, 85.25465, 1.0, 55.113456789};
        System.out.println(numere[1]);
        System.out.println(numere[3]);
        System.out.println(numere.length);










    }
}
