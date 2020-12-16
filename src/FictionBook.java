public class FictionBook extends Books{
    private String category;

    public FictionBook() {
    }

    public FictionBook(String bookCode, String name, String author, double price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook" + '\n' +
                "Ma sach: " + super.getBookCode() + '\t' +
                "Ten sach: " + super.getName() + '\t' +
                "Tac gia: " + super.getAuthor() + '\t' +
                "Gia tien: " + super.getPrice() + '\t' +
                "Category: " + category + '\n';
    }
}
