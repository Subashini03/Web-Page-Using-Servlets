/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

/**
 *
 * @author THENSUBA
 */
@WebServlet(urlPatterns = {"/check.view"})
public class bookticket extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         Date date =Calendar.getInstance().getTime();
            SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
          String today=formatter.format(date);
          out.println("enjoy watching on     " +today);
           out.println("<html>");
            out.println("<body>");
       
            LinkedList l = new LinkedList();
            l.add("1");
            l.add("2");
            l.add("3");
            l.add("4");
            l.add("5");
            l.add("6");
            l.add("7");
            l.add("8");
            l.add("9");
            l.add("10");
             l.add("11");
            l.add("12");
            l.add("13");
            l.add("14");
            l.add("15");
            l.add("16");
            l.add("17");
            l.add("18");
            l.add("19");
            l.add("20");
            out.println("choose ur seats");
            out.println("<center><h1>" + l + "</h1>");
            out.println("<img src='seat.jpg'/>");
            out.println("<a href = 'seat.html'>Book A Ticket</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            out.println(e);
        }
          }

           
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
