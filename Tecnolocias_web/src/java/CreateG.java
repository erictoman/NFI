/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jdom.JDOMException;

/**
 *
 * @author Marcus
 */
public class CreateG extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
    
        String nom = request.getParameter("nom");
        String i=request.getParameter("num"); //catman aqui me mandas lo que tengas de serializar el canvas 
        Operaciones ope= new Operaciones();
    
         String path = request.getRealPath("archivo_xml");
            path=path + "/base.xml";
       
       
        ope.Cgrupo(nom, i ,path);
               
        
      
    
    }

}
