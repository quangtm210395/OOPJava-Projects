/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.library;

/**
 *
 * @author Minnnnn
 */
public class BookLibrary {
    public static void main(String[] args) {
        Author author1 = new Author("Tran Minh Quang","quangtmse04402@fpt.edu.vn",'M');
//        System.out.println(author1);
        author1.setEmail("quangtmse04402@gmail.com");
        System.out.println(author1);
        Author author2 = new Author("J.K.Rolling","jkrolling@outlook.com", 'F');
        System.out.println(author2);
        Book book1 = new Book("Tu truyen Tran Minh Quang", author1, 50, 5);
        System.out.println(book1);
//        System.out.println(book1.getAuthorName()+" "+book1.getAuthorEmail());
        Book book2 = new Book("Harry Potter", author2, 75, 7);
        System.out.println(book2);
//        System.out.println(book2.getAuthorName()+" "+book2.getAuthorEmail());
    }
}
