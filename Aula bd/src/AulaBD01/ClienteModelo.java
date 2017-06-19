package AulaBD01;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;
public class ClienteModelo extends AbstractTableModel {
private int colnum = 5;
private int rownum;
private String[] colNames = {
"id","nome","email","usuario", "senha"
};
private ArrayList<String[]> ResultSets;
public ClienteModelo(ResultSet rs) {
ResultSets=new ArrayList<String[]>();
try{
while(rs.next()){
String[] row = {
rs.getString("id"),rs.getString("nome"),
rs.getString("email"),rs.getString("usuario"),
rs.getString("senha")
};
ResultSets.add(row);
}
}
catch(Exception e){
System.out.println("Exception em ClientesModelo");
}
}
public Object getValueAt(int rowindex, int columnindex) {
String[] row = ResultSets.get(rowindex);
return row[columnindex];
}
public int getRowCount() {
return ResultSets.size();
}
public int getColumnCount() {
return colnum;
}
public String getColumnName(int param) {
return colNames[param];
}
}