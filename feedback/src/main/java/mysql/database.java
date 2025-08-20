package mysql;

import com.feedback.Feedback;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class database {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "root";
    private static final String PASSWORD = "2006";

    public static void saveFeedback(Feedback fb) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "INSERT INTO feedbacks (name, email, course, rating, message) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, fb.getName());
            ps.setString(2, fb.getEmail());
            ps.setString(3, fb.getCourse());
            ps.setString(4, fb.getRating());
            ps.setString(5, fb.getMessage());

            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
