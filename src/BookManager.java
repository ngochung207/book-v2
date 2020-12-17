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

    public Books[] sortArray(Books[] store){
        for (int i = 0; i < store.length-1; i++) {
            if (store[i] != null) {
                Books temp = store[i];
                for (int j = i + 1; j < store.length; j++) {
                    if (store[j] != null) {
                        if (temp.getPrice() > store[j].getPrice()) {
                            store[i] = store[j];
                            store[j] = temp;
                            temp = store[i];
                        }
                    }
                }
            }
        }
        return store;
    }

    public int findIndexByName(String codeBook){
        for (int i = 0; i < this.getStore().length; i++) {
            if (this.getStore()[i] != null) {
                if (this.getStore()[i].getBookCode().equals(codeBook)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public double getPriceByIndex(int index) {
        if (index != -1) {
            return this.getStore()[index].getPrice();
        } else {
            return 0;
        }
    }

    public String getNameByIndex(int index) {
        if (index != -1) {
            return this.getStore()[index].getName();
        } else {
            return "";
        }
    }

    public double getSumTotal(){
        double sum = 0;
        for (Books element: this.getStore()
             ) {
            if (element!=null){
                sum += element.getPrice();
            }
        }
        return sum;
    }

    public int getCountByLanguage(String str){
        int count = 0;
        for (Books element: this.getStore()
             ) {
            if (element instanceof ProgrammingBook) {
                ProgrammingBook i = (ProgrammingBook) element;
                if (i.getLanguage() != null) {
                    if (i.getLanguage().equals(str)) {
                        count++;
                    }
                }
            }
        }
        return count;
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
