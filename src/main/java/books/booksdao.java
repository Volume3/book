package books;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import books.books;

public class booksdao {
	public List<books> queryMessageList(String bookname) {
        List<books> messageList = new ArrayList<books>();
        //数据库连接
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://101.37.31.3:3307/library" +
                "?useUnicode=true&characterEncoding=utf8","root","root");
            System.out.println("booksdao连接数据库成功");
            StringBuilder sql = new StringBuilder("SELECT bookid,bookname,author,position,num from bookinfo where 1=1");
            List<String> paramList = new ArrayList<String>();
            
            if(bookname != null && !"".equals(bookname.trim())) {
                sql.append(" and bookname=? ");
                paramList.add(bookname);
            }
            PreparedStatement ptmt = conn.prepareStatement(sql.toString());
            for (int i=0;i<paramList.size();i++) {
                ptmt.setString(i+1,paramList.get(i));
            }
            ResultSet rs =  ptmt.executeQuery();
            while (rs.next()) {
//            	System.out.println("这是booksdao中的操作:"+rs.getInt("bookid"));
//            	System.out.println("这是booksdao中的操作:"+rs.getString("bookname"));
                books book = new books();
                messageList.add(book);
                book.setBookid(rs.getInt("bookid"));
                book.setBookname(rs.getString("bookname"));
                book.setAuthor(rs.getString("author"));
                book.setPosition(rs.getString("position"));
                book.setNum(rs.getInt("num"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return messageList;
    }
}
