package lab09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * TODO: Implement getConnection() and createTable().
 * TODO: Use DriverManager.getConnection() with the jdbc:sqlite: URL.
 * TODO: Use try-with-resources wherever you open a Connection or Statement.
 */
public class DatabaseManager {

    private static final String URL = "jdbc:sqlite:lab09.db";

    /**
     * TODO: Open and return a new Connection to lab09.db.
     * TODO: If the connection fails, throw the SQLException — do not swallow it.
     */
    // Returns a new JDBC connection to the SQLite database file.
    public static Connection getConnection() throws SQLException {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Execute a CREATE TABLE IF NOT EXISTS statement for the students table.
     * TODO: Columns: id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL,
     *       age INTEGER, gpa REAL.
     * TODO: Use try-with-resources for both Connection and Statement.
     */
    // Creates the students table if it does not already exist.
    public static void createTable() throws SQLException {
        // IMPLEMENT
    }
}
