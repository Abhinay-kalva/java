// import java.sql.*;
// class jdbc{
//     public static void main(String[] args) {
//         String url="jdbc:mysql://localhost:3306/cseh";
//         String user="root";
//         String password="cvr123";
//         try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection conn=DriverManager.getConnection(url, user, password);
//             Statement stmt=conn.createStatement();
//             stmt.executeUpdate("insert into table (name,rollno) values ('abhinay',12)");
//             ResultSet rs=stmt.executeQuery("select * from table");
//             while(rs.next()){
//                 System.out.println(rs.getString(1)+" "+rs.getInt(2));
//             }

//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
// }
// // 
// create procedure show()
// begin 
// select * from student
// end
// import java.sql.*;
// class jdbc{
//     public static void main(String []args){
//         String url="jdbc:mysql://localhost:3306/cseh";
//         String user="root";
//         String password="cvr123";
//         try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con=DriverManager.getConnection(url, user, password);
//             PreparedStatement p=con.prepareStatement("Insert into student (name,rollno)values (?,?)");
//             p.setString(1, "abhinay");
//             p.setInt(2, 123);
//             p.executeUpdate();
//             CallableStatement cal=con.prepareCall("{call show()}");
//             ResultSet rs=cal.executeQuery();
//             while(rs.next()){
//                 System.out.println(rs.getString(1)+" "+rs.getInt(2));
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }
import java.sql.*;
public class jdbc {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/cseh";
        String user="root";
        String password="cvr123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=stmt.executeQuery("select * from students");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            }
            rs.last();
            rs.updateInt("rollno",12344);
            rs.updateRow();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
