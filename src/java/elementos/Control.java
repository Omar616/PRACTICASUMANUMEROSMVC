/**
 * CONTROLADOR
 * Alumno: Bueno Rosas Brayan Omar
 * Grupo: 5IM8.
 * Version 2 7u7
 * Fecha: 31/08/2017
 */

package elementos;


import elementos.Modelo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// La clase controlador

@WebServlet(name = "Control", urlPatterns = {"/Control"})
public class Control extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Modelo ObjetoModelo = new Modelo();
            int Numerito1 = Integer.parseInt(request.getParameter("Num1"));
            int Numerito2 = Integer.parseInt(request.getParameter("Num2"));
            int ResultadoSuma = 0;
            
            
            
            ObjetoModelo.setNumeroUno(Numerito1);
            ObjetoModelo.setNumeroDos(Numerito2);
           
            ResultadoSuma = ObjetoModelo.SumaNumeros();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Controlador servlet</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"stilo.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Suma: " 
                    + ResultadoSuma + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
