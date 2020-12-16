public class ProgrammingBook extends Books{
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, String author, double price, String language, String framework) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook" +'\n' +
                "Ma sach: " + super.getBookCode() + '\t' +
                "Ten sach: " + super.getName() + '\t' +
                "Tac gia: " + super.getAuthor() + '\t' +
                "Gia tien: " + super.getPrice() + '\t' +
                "Ngon ngu: " + language + '\t' +
                "Cong nghe: " + framework + '\n';
    }
}
