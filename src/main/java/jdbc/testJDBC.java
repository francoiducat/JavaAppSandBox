package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created on 12/26/2019.
 */
public class testJDBC {

  private static final Logger logger = Logger.getLogger(testJDBC.class.getName());

  public static void main(String[] args) throws Exception {
    Statement st;
    Connection cx = DriverManager.getConnection("jdbc:postgresql://localhost/mydb", System.getenv("LOGIN"), System.getenv("PWD"));

    st = cx.createStatement();

    ResultSet rs = st.executeQuery("SELECT * FROM persons");

    while (rs.next()) {
      String lastname = rs.getString("lastname");
      int personid = rs.getInt("personid");
      logger.log(Level.INFO, String.format("personid : %s ,  lastname : %s ", personid, lastname));
    }
    rs.close();
    st.close();
    cx.close();
  }
}
