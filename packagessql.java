import java.sql.Connection;
import java.sql.DriverManager;

class packagessql {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root",
                "password"
            );

            System.out.println("Database connected successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}
