package books;

import java.util.List;
import books.booksdao;
import books.books;


public class ListService {
	public List<books> queryMessageList(String bookname) {
        booksdao booksDao = new booksdao();
        System.out.println("����ListService���е�"+bookname);
        System.out.println("����ListService���е�"+booksDao.queryMessageList(bookname));
        return booksDao.queryMessageList(bookname);
    }
}
