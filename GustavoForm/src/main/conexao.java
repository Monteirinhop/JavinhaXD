package main;
import java.sql.*;
    public class conexao {
private Connection myConnection;
    public conexao() {
    }
    public void init(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
  Class.forName("com.mysql.jdbc.Driver");
myConnection = DriverManager.getConnection(
"jdbc:mysql://localhost/sell","admin", "gadmin");
}
    catch(Exception e){
    System.out.println("Falhou ao Fazer a conexão!");
    e.printStackTrace();
    }
}
    public Connection getMyConnection(){
        return myConnection;
}
    public void close(ResultSet rs){
    if(rs !=null){
    try{
        rs.close();
}
    catch(Exception e){}
    }
}
    public void close(java.sql.Statement stmt){
    if(stmt != null){
        try{
            stmt.close();
}
catch(Exception e){}
    }
}
    public void destroy(){
    if(myConnection != null){
        try{
            myConnection.close();
}
catch(Exception e){}
        }
    }
}