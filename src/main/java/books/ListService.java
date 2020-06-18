package books;

import java.util.List;
import books.booksdao;
import books.books;


public class ListService {
	public List<books> queryMessageList(String bookname) {
        booksdao booksDao = new booksdao();
        System.out.println("这是ListService类中的"+bookname);
        System.out.println("这是ListService类中的"+booksDao.queryMessageList(bookname));
        return booksDao.queryMessageList(bookname);
    }
}
