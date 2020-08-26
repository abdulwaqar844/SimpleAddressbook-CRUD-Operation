package vu;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controller extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
String action=request.getParameter("action");
PrintWriter out = response.getWriter();
        switch (action) {
            case "addperson":
                response.sendRedirect("addperson.jsp");
                break;
//response.sendRedirect("addperson.jsp");
//if(action.equals("searchperson")){
        //  response.sendRedirect("searchperson.jsp");
//}
            case "searchperson":
                response.sendRedirect("searchperson.jsp");
                break;
            case "add":
                PersonDAO persondao=new PersonDAO();
                String pname=request.getParameter("pname");
                String address=request.getParameter("address");
                String phone=request.getParameter("phone");
               PersonInfo person=new PersonInfo();
                person.setName(pname);
                person.setAddress(address);
                person.setPhoneNum(phone);
                persondao.addperson(person);
                response.sendRedirect("index.jsp");


                break;
        }
           
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}