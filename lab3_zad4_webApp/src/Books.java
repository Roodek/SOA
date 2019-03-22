import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

@ManagedBean(name="Books", eager = true)
@SessionScoped
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;
    public String title;
    public String author;
    public String genre;
    public double price;
    public int pages;
    public String currency;

    public static final ArrayList<Book> bookList
            = new ArrayList<Book>(Arrays.asList(new Book("Krzyżacy","Henryk Sienkiewicz","Przygodowa", 30,551, "PLN"),
            new Book("Lalka","Bolesław Prus","Obyczajowa",40,912,"PLN"),
            new Book("Fahrenheit 451","Ray Bradburry","Science-fiction",8,256,"USD"),
            new Book("Hobbit","J.R.Tolkien","Fantasy",20, 315,"PLN")
    ));


    public ArrayList<Book> getBookList() {
        return bookList;
    }


    public ArrayList<Book> filterByAuthor(String author){
        ArrayList<Book> filtered = new ArrayList<Book>()  ;

        for (Book i:bookList){
            if (i.author.equals(author)){
                filtered.add(i);
            }
        }
        return filtered;
    }
    public ArrayList<Book> filterByPrice(int bot, int top){
        ArrayList<Book> filtered = new ArrayList<Book>()  ;
        for (Book i:bookList){
            if (i.price >=bot && i.price <=top ){
                filtered.add(i);
            }
        }
        return  filtered;
    }
    public ArrayList<Book> filterByCurrency(String curr){
        ArrayList<Book> filtered = new ArrayList<Book>()  ;
        for (Book i:bookList){
            if (i.currency.equals(curr) ){
                filtered.add(i);
            }
        }
        return  filtered;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getCurrency() {
        return currency;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
