package com.servlet;

import com.feedback.Feedback;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitFeedback")
public class SubmitFeedback extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Feedback fb = new Feedback();
        fb.setName(request.getParameter("name"));
        fb.setEmail(request.getParameter("email"));
        fb.setCourse(request.getParameter("course"));
        fb.setRating(request.getParameter("rating"));
        fb.setMessage(request.getParameter("message"));

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "2006";

            
            Connection conn = DriverManager.getConnection(url, username, password);

            
            String sql = "INSERT INTO feedbacks (name, email, course, rating, message) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, fb.getName());
            ps.setString(2, fb.getEmail());
            ps.setString(3, fb.getCourse());
            ps.setString(4, fb.getRating());
            ps.setString(5, fb.getMessage());

            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<html><body>");
                out.println("<h2>Thank you for your feedback, " + fb.getName() + "!</h2>");
                out.println("</body></html>");
            } else {
                out.println("<html><body>");
                out.println("<h2>Sorry, something went wrong while saving your feedback.</h2>");
                out.println("</body></html>");
            }

            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<html><body>");
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
            out.println("</body></html>");
        }
    }
}
