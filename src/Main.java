import java.awt.print.Book;
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
        Integer chose = 0;
        do {
            menu();
            chose = Integer.parseInt(sc.nextLine());
            switch (chose){
                case 1:
                    addNew();
                    break;
                case 2:
                    System.out.println("tim kiem gia tien theo ten sach");
                    String bookCode = sc.nextLine();
                    int index = listBooks.findIndexByName(bookCode);
                    if (index != -1) {
                        System.out.println("Sach: " + listBooks.getNameByIndex(index) + " co gia la: " + listBooks.getPriceByIndex(index));
                    } else System.out.println("Khong tim thay ten sach");
                    break;
                case 3:
                    display(listBooks.sortArray(listBooks.getStore()));
                    break;
                case 4:
                    System.out.println("Tổng tiền store là: " + listBooks.getSumTotal());
                    break;
                case 5:
                    String str = "Java";
                    System.out.println("Tổng số sách có language " + str + " là: " + listBooks.getCountByLanguage("Java"));
                    break;
                case 6:
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
        System.out.println("01. Nhập sách mới");
        System.out.println("02. Tìm kiếm giá tiền theo tên sách");
        System.out.println("03. Sort theo giá tiền");
        System.out.println("04. Tính tổng tiền");
        System.out.println("05. Tính tổng sách có Language");
        System.out.println("06. Thoat");
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

        if (category.length() != 0) {
            Books proBook = new ProgrammingBook(bookCode, name, author, price, language, framework);
            listBooks.addNewBookToManager(proBook);
        } else {
            Books ficBook = new FictionBook(bookCode, name, author, price, category);
            listBooks.addNewBookToManager(ficBook);
        }
        System.out.println("---->> Them moi thanh cong <<----");
    }

    public static void display(Books[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toString());
            }
        }
    }

}
