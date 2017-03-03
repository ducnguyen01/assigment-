package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Account;
import model.Product;

public class ConnecDB {
   Connection con;
    String dbname;
    String user;
    String pass;
    public  ConnecDB(String dbname, String user, String pass){
        this.dbname=dbname;
        this.user=user;
        this.pass=pass;
        try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlbh","nguyen","123456");
        } catch (Exception e) {
        }
    }
    public static Connection getConnecttion() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=qlbh","nguyen","123456");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public  int Login(String user, String pass){ // tro ve 0 khi login sai, 1 la ad, 2 la khach hang
    try {
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from TAI_KHOAN where Username= '"+user+"' and Pass= '"+pass+"' ");
        if(rs.next()){
            if(rs.getString(3).equals("admin"))
                return 1;
            else 
                return 2;
        }else{
            return 0;
        }
    } catch (SQLException e) {
        return 0;
    }}
   

    public static void main(String[] args) {
        System.out.println(getConnecttion());
    
    }
}
  

