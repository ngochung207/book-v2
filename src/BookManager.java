import java.util.Arrays;

public class BookManager {
    // thao tac voi doi tuong Book
    private Books[] store = new Books[10];

    public BookManager() {
    }

    public BookManager(Books[] store) {
        this.store = store;
    }

    public void addNewBookToManager(Books newBook) {
        for (int i = 0; i < store.length; i++) {
            if (store[i] == null) {
                store[i] = newBook;
                break;
            }
        }
    }

    public Books[] getStore() {
        Books[] newBook = new Books[this.store.length];
        for (int i = 0; i < this.store.length; i++) {
            newBook[i] = this.store[i];
        }
        return newBook;
    }

    public void setStore(Books[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "BookManager{" +
                "store: " + Arrays.toString(store) +
                '}';
    }
}
