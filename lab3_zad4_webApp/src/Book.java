public class Book {
    public String title;
    public String author;
    public String genre;
    public double price;
    public int pages;
    public String currency;

    public Book(String title, String author, String genre, double price, int pages, String currency) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.pages = pages;
        this.currency = currency;
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