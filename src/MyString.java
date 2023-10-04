import java.sql.SQLOutput;

public class MyString {
    public static void main(String[] args) {
        String myString="This is a text";
        int  lungime = myString.length();
        System.out.println("lungimea textului este" + lungime);

        String myName = "Banc Ioana Andreea";
        int lungimeNumelui = myName.length();
        System.out.println(lungimeNumelui);
        System.out.println("Lungimea numelui \""+myName+"\" este" +  lungimeNumelui);
        System.out.println();

//       String myNamewithoutSpace =  myName

        char adoualitera = myName.charAt(2);
        System.out.println(adoualitera);
        char primalitera= myName.charAt(0);
        System.out.println(primalitera);

        String tara = "Spania ";
        System.out.println(tara);

        int lungimeaTarii = tara.length();
        System.out.println(lungimeaTarii);

        tara= "Brazilia";
        lungimeaTarii = tara.length();
        System.out.println(lungimeaTarii);

        String myFavouriteMovie = "James Bond";
        String film = "My favourite movie is ";
        System.out.println(film + '"' + myFavouriteMovie + '"'+ '.');


        System.out.println(myFavouriteMovie.toUpperCase());

        System.out.println(myFavouriteMovie.toLowerCase());

        System.out.println(myFavouriteMovie.length());

        System.out.println(film + "\"" + myFavouriteMovie + "\"");












    }
}
