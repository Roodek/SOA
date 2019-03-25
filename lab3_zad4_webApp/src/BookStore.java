import java.util.ArrayList;
import java.util.Arrays;

public class BookStore {
    public static ArrayList<Book> getBooks(){
        return new ArrayList<Book>(Arrays.asList(new Book("Krzyżacy","Henryk Sienkiewicz","Przygodowa", 30,551, "PLN"),
                new Book("Lalka","Bolesław Prus","Obyczajowa",40,912,"PLN"),
                new Book("Fahrenheit 451","Ray Bradburry","Science-fiction",8,256,"USD"),
                new Book("Hobbit","J.R.Tolkien","Fantasy",20, 315,"PLN"),
                new Book("Władca Pierścieni","J.R.Tolkien","Fantasy",25, 915,"USD")));
    }
}
