package vu;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonDAO {
private Connection con;
    public PersonDAO() throws SQLException {
establishconnection();
    }

    private void establishconnection() throws SQLException {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/personinfo?zeroDateTimeBehavior=convertToNull";
        String pass="root";
        String user="";
        con=DriverManager.getConnection(url,pass,user);
         
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void addperson(PersonInfo person) throws SQLException{
        String name=person.getName();
        String addr=person.getAddress();
        String phon=person.getPhoneNum();
        Statement statement = con.createStatement();
        String sql="INSERT INTO personinfo (pname,cellno,paddress) VALUES ('"+name+"','"+addr+"','"+phon+"')";
        statement.executeUpdate(sql);
    }
    public ArrayList retrievePersonList(String pName) throws SQLException {
    
        ArrayList personlist =new ArrayList();
        String sql="SELECT * FROM personinfo WHERE pname=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, pName);
        ResultSet rs = ps.executeQuery();
        String name;String add;String phone;
        while(rs.next()){
        name=rs.getString("pname");
        add=rs.getString("paddress");
        phone=rs.getString("cellno");
        PersonInfo personBean= new PersonInfo();
        personBean.setName(name);
        personBean.setAddress(add);
        personBean.setPhoneNum(phone);
        personlist.add(personBean);
        }
        return personlist;
    }
    
}
