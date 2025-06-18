import java.sql.*;
import java.util.*;

public class PassengerDAO {
    public List<Passenger> getAllPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM passengers")) {
            while (rs.next()) {
                passengers.add(new Passenger(rs.getInt("id"), rs.getString("name"), rs.getString("destination")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passengers;
    }
}