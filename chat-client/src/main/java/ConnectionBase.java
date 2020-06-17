import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionBase  {
    Connection dbConnection;
    public static final String USER_TABLE = "users";
    public static final String NICKNAME = "nickname";
    public static final String PASSWORD = "password";
    public static final String EMAIL = "email";

    //соединение с базой
    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection("jdbc:sqlite:users.db");
            System.out.println("Base connected");
            return dbConnection;
    }

    //регистрация пользователя
    public void singUpUser (String nickname, String password, String email) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + USER_TABLE + "(" + NICKNAME + PASSWORD + EMAIL + ")" + "VALUES(?,?,?,?,?,?)";
        PreparedStatement prST = getDbConnection().prepareStatement(insert);
        prST.setString(1,NICKNAME);
        prST.setString(2,PASSWORD);
        prST.setString(3,EMAIL);


    }
    
}




