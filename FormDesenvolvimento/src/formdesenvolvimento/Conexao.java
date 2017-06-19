/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdesenvolvimento;
import java.sql.*;
public class Conexao {
private Connection myConnection;
public Conexao() {
}
public void init(){
try{
Class.forName("com.mysql.jdbc.Driver");
myConnection = DriverManager.getConnection(
"jdbc:mysql://localhost/sell","admin", "");
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