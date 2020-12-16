import java.util.Scanner;

/**
 * Tao 5 cuon sach  thuoc lop ProgrammingBook
 * Tao 5 cuon sach thuoc lop FictionBook
 * Tinh tong tien cua 10 cuon sach , dem so sach ProgrammingBook co language la Java
 */
public class Main {
    static BookManager listBooks = new BookManager();
    public static void main(String[] args) {
        // Khu vuc khai bao:
        Scanner sc = new Scanner(System.in);
        int chose;
        do {
            menu();
            chose = sc.nextInt();
            switch (chose){
                case 1:
                    addNew();
                    break;
                case 2:
                    System.out.println("tim kiem gia tien theo ten sach");
                    break;
                case 3:
                    display(sortArray(listBooks.getStore()));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        while (true);
    }

    public static void menu(){
        System.out.println("---------Menu List Books---------");
        System.out.println("01. Nhap gia moi");
        System.out.println("02. Tim kiem gia tien theo ten sach nhap vao");
        System.out.println("03. Sort theo gia tien");
        System.out.println("04. Thoat");
    }

    public static void addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma sach: ");
        String bookCode = sc.nextLine();
        System.out.print("Nhap vao ten sach: ");
        String name = sc.nextLine();
        System.out.print("Nhap vao tac gia: ");
        String author = sc.nextLine();
        System.out.print("Nhap vao gia sach: ");
        double price = sc.nextDouble();
        sc = new Scanner(System.in);
        System.out.print("Nhap vao ngon ngu: ");
        String language = sc.nextLine();
        System.out.print("Nhap vao cong nghe: ");
        String framework = sc.nextLine();
        System.out.print("Nhap vao category: ");
        String category = sc.nextLine();
//        sc.close();
        if (category.length() != 0) {
            ProgrammingBook proBook = new ProgrammingBook(bookCode, name, author, price, language, framework);
            listBooks.addNewBookToManager(proBook);
        } else {
            FictionBook ficBook = new FictionBook(bookCode, name, author, price, category);
            listBooks.addNewBookToManager(ficBook);
        }
        System.out.println("---->> Them moi thanh cong");
    }

    public static void display(Books[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toString());
            }
        }
    }

    public static Books[] sortArray(Books[] store){
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
}
