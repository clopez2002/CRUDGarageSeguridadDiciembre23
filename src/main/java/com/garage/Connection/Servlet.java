package com.garage.Connection;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hola Mundo desde el Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/bbddgarageseptiembre23?useSSL=false";
        String usuario = "root";
        String password = "Unicamente1";

        String driver = "com.mysql.jdbc.Driver";

        try {

            PrintWriter out=response.getWriter(); // codigo explido en video de Servlet

            out.print("Nombre de la BBDD: " + jdbcUrl);

            Class.forName(driver);	// cargamos driver jdbc

            Connection myConnection = (Connection) DriverManager.getConnection(jdbcUrl, usuario, password);

            out.print("\n\n\nConectado al Garage 7/10/23!!!");

            myConnection.close();



        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}