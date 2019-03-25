import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@ManagedBean(name="Books", eager = true)
@SessionScoped
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;
    public String title;
    public String author;
    public static String genre;
    public double price;
    public static int pages;
    public static String currency;

    public static boolean displayCurr;


    public ArrayList<Book> trolley  = new ArrayList<Book>();

    public static final ArrayList<Book> bookList
            = BookStore.getBooks();

    public ArrayList<Book> filteredBooks = bookList;

    public boolean getDisplayCurr(){
        return this.displayCurr;
    }
    public void swapDisplayCurr(){
        if (displayCurr == true){
            displayCurr = false;
        } else{
            displayCurr= true;
        }
    }

    public double displayPrice(Book book){
        if(book.currency.equals("USD")) {
            if (displayCurr) {
                return book.price ;
            }else{
                return book.price*3.8;
            }
        }else{
            return book.price;
        }
    }
    public String displayCurr(Book book){
        if(book.currency.equals("USD")) {
            if (displayCurr) {
                return book.currency;
            } else {
                return "PLN";
            }
        }else{
            return "PLN";
        }
    }

    public double checkout(){
        double fullPrice =0;
        for (Book i : trolley){
            if(i.currency.equals("USD")){
                fullPrice+=i.price*3.8;
                continue;
            }else {
                fullPrice += i.price;
            }
            }
        return fullPrice;
    }
    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void buyBook(Book book){
        this.trolley.add(book);

    }
    public ArrayList<String> getGenres(){
        return new ArrayList<String>(Arrays.asList("Przygodowa", "Obyczajowa", "Science-Fiction","Fantasy"));
    }
    public ArrayList<String> getCurrencies(){
        return new ArrayList<String>(Arrays.asList("PLN", "USD"));
    }

    public ArrayList<Book> getFilteredBooks() {
        return filteredBooks;
    }

    public void setFilteredBooks(ArrayList<Book> filteredBooks) {
        this.filteredBooks = filteredBooks;
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

    public void applyFilters(){
        filteredBooks = bookList;
        filterByCurrency();
        filterByGenre();
    }
    public void filterByCurrency(){
        if(this.getCurrency()==null){
            //filteredBooks = bookList;
            return;
        }
        ArrayList<Book> filtered = new ArrayList<Book>()  ;
        for (Book i:filteredBooks){
            if (i.currency.equals(this.getCurrency()) ){
                filtered.add(i);
            }
        }
        filteredBooks=filtered;
    }
    public void filterByGenre(){
        if(this.getGenre()==null){
            //filteredBooks = bookList;
            return;
        }
        ArrayList<Book> filtered = new ArrayList<Book>()  ;
        for (Book i:filteredBooks){
            if (i.genre.equals(this.getGenre()) ){
                filtered.add(i);
            }
        }
        filteredBooks=filtered;
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

    public static boolean isDisplayCurr() {
        return displayCurr;
    }

    public static void setDisplayCurr(boolean displayCurr) {
        Books.displayCurr = displayCurr;
    }


    public  ArrayList<Book> getTrolley() {
        return trolley;
    }

    public  void setTrolley(ArrayList<Book> trolley) {
        this.trolley = trolley;
    }
}
