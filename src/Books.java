public class Books {
    private String bookCode;
    private String name;
    private double price;
    private String author;

    public Books() {
    }

    public Books(String bookCode, String name, String author, double price) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return  "bookCode: " + bookCode + '\t' +
                "name: " + name + '\t' +
                "price: " + price +
                "author: " + author + '\t';
    }
}
