package books;

import java.sql.*;

import books.User;
import books.BaseDao;
import books.BaseDao2;

public class UserDao {

    /***
     * �û���½�ķ�������
     * @param user
     * @return
     */
    public User login(User user){
    	User u = null;
    	Connection connection = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;
    	
    	try{
    		// ��ȡ���ݿ�����
    		connection = BaseDao2.getCon2();
    		// дsql���
    		String sql = "select * from user where username=? and password=? ";
    		preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
    		preparedStatement.setString(1, user.getUsername());
    		preparedStatement.setString(2, user.getPassword());
    		resultSet = preparedStatement.executeQuery();
    		System.out.println(resultSet);
    		if(resultSet.next()){
    			u = new User();
    			u.setUsername(resultSet.getString("username"));
    			u.setPassword(resultSet.getString("password"));
    			System.out.println("�û�����������ȷ");
    		} else {
    			System.out.println("�û������������");
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
    		BaseDao.close(connection, preparedStatement);
    	}
    	return u;
    }
    
    /***
     * �û�ע��ķ�������
     * @param user
     * @return
     * @throws ClassNotFoundException 
     */
    public boolean register(User user){
    	Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean flag = true;
        try {
            connection = BaseDao.getCon();
//            String sql = "insert into user(username,password,idtype,name,idnumber,email,phonenumber,travelertype)values(?,?,?,?,?,?,?,?);";
            String sql = "insert into user(username,password,name)values(?,?,?);";
            preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
//            preparedStatement.setInt(3,user.getIdtype());
            preparedStatement.setString(3,user.getName());
//            preparedStatement.setInt(8,user.getTravelertype());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            flag = false;
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}finally{
            BaseDao.close(connection,preparedStatement);
        }
		return flag;
    }
	
}
