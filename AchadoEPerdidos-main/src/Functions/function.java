package Functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class function {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;


    public void selectAll(){ 
        try{
            conn = DB.getConnection();

            st = conn.createStatement();
            rs = st.executeQuery("select * from itensencontrados order by `Data` ");

            while (rs.next()){
                System.out.println(rs.getInt("ID") + ", " + rs.getString("Titulo")  + ", " + rs.getString("Status") + ", " + rs.getString("Local") + ", "+ rs.getString("Data") + ", "+ rs.getString("Hora") + ", "+ rs.getString("Observacao"));
            }
            

        }
        catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    public void insert(String cpf, String local, String data, String hora, String titulo, String observacao, String status){
        try {
            conn = DB.getConnection();

            pst = conn.prepareStatement(
                "INSERT INTO itensencontrados"
                + "(CPF, Titulo, Status, Local, Data, Hora, Observacao)"
                + "VALUES"
                + "(?, ?, ?, ?, ?, ?, ?)"                
            );

            pst.setString(1, cpf);
            pst.setString(2, titulo);
            pst.setString(3, status);
            pst.setString(4, local);
            pst.setDate(5, new java.sql.Date(sdf.parse(data).getTime()));
            pst.setString(6, hora);
            pst.setString(7, observacao);

            pst.executeUpdate();
  


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        
    }

    public void exluir(int id){
        try {
            conn = DB.getConnection();
            
            pst = conn.prepareStatement(
                "DELETE FROM itensencontrados "
                + "WHERE "
                + "ID = ?");

                pst.setInt(1, id);

                pst.executeUpdate();

        } catch (Exception e) {
            throw new DbIntegrityException(e.getMessage());
        }finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public void atualizar(int ID, String linha, String por){
        try {
            conn = DB.getConnection();

            pst = conn.prepareStatement("update itensencontrados SET "+linha+" = ? WHERE (ID = ?)");

            pst.setString(1, por);
            pst.setInt(2, ID);

            pst.executeUpdate();


        }catch (SQLException e) {
			e.printStackTrace();
		}finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

    }

    public void procurar(String titulo){
        try {
            conn = DB.getConnection();

            st = conn.createStatement();
            rs = st.executeQuery("select * from itensencontrados where Titulo = '"+titulo+"'");

            while (rs.next()){
                System.out.println(rs.getInt("ID") + ", " + rs.getString("Titulo")  + ", " + rs.getString("Status") + ", " + rs.getString("Local") + ", "+ rs.getString("Data") + ", "+ rs.getString("Hora") + ", "+ rs.getString("Observacao"));
            }
            

        }
        catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

}
