import com.sun.corba.se.impl.encoding.BufferManagerReadGrow;

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

        ProgrammingBook proBook = new ProgrammingBook(bookCode,name,author,price,language,framework);
        FictionBook ficBook = new FictionBook(bookCode,name,author,price,category);

        listBooks.addNewBookToManager(proBook);
        listBooks.addNewBookToManager(ficBook);

        for (int i = 0; i < listBooks.getStore().length; i++) {
            if (listBooks.getStore()[i] != null) {
                System.out.println(listBooks.getStore()[i].toString());
            }
        }
    }

    public int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Menu List Books---------");
        System.out.println("01. Nhap gia moi");
        System.out.println("02. Tim kiem gia tien theo ten sach nhap vao");
        System.out.println("03. Sort theo gia tien");
        System.out.println("04. Thoat");
        int chose = sc.nextInt();
        return chose;
    }
}
