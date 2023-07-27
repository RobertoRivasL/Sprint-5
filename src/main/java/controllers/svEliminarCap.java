package controllers;

import dao.CapacitacionDAOimpl;
import jakarta.servlet.http.HttpServlet;
import models.Capacitacion;
import static java.lang.System.out;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class svEliminarCap extends HttpServlet {




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        String identificador = request.getParameter("identificador");
        boolean eliminado = false;

        if (identificador != null && !identificador.isEmpty()) {
            CapacitacionDAOimpl capacitacionDAO = new CapacitacionDAOimpl();
            Capacitacion capacitacion = new Capacitacion();
            capacitacion.setIdentificador(identificador);
            eliminado = capacitacionDAO.eliminar(capacitacion);
        }

        if (eliminado) {
            response.sendRedirect("listaCapacitacion.jsp");
        } else {
            out.print("No se pudo eliminar");
        }

    }



}
