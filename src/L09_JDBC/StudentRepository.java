package lab09;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO (Part I):   implement insertStudent(), findAll(), updateGpa(), deleteStudent()
 *                  using plain Statement objects.
 * TODO (Part II):  refactor insertStudent() and findAll() to use PreparedStatement.
 *                  Add findByName() with a LIKE clause.
 * TODO: Wrap every database operation in try-with-resources.
 * TODO: Never swallow SQLExceptions — propagate them to the caller.
 */
public class StudentRepository {

    private Connection connection;

    public StudentRepository(Connection connection) {
        this.connection = connection;
    }

    // ─── Part I ──────────────────────────────────────────────────────────────

    /**
     * TODO (Part I): Build an INSERT statement as a String and execute it with Statement.
     * TODO (Part II): Replace the Statement with a PreparedStatement and bind parameters.
     */
    // Inserts a single student record into the students table.
    public void insertStudent(StudentRecord record) throws SQLException {
        // IMPLEMENT
    }

    /**
     * TODO: Execute SELECT * FROM students, iterate the ResultSet,
     *       create a StudentRecord for each row, and return the list.
     */
    // Fetches all student rows and maps them to StudentRecord objects.
    public List<StudentRecord> findAll() throws SQLException {
        List<StudentRecord> list = new ArrayList<>();
        // IMPLEMENT
        return list;
    }

    /**
     * TODO: Build an UPDATE students SET gpa = ? WHERE id = ? statement.
     * TODO: Use a PreparedStatement even in Part I — this one always needs parameters.
     */
    // Updates the GPA of the student with the given database id.
    public void updateGpa(int id, double newGpa) throws SQLException {
        // IMPLEMENT
    }

    /**
     * TODO: Execute DELETE FROM students WHERE id = ? using a PreparedStatement.
     */
    // Removes the student row with the specified id from the database.
    public void deleteStudent(int id) throws SQLException {
        // IMPLEMENT
    }

    // ─── Part II ─────────────────────────────────────────────────────────────

    /**
     * TODO: Use a PreparedStatement with SELECT * FROM students WHERE name LIKE ?.
     * TODO: Pass "%" + name + "%" as the parameter to allow partial matches.
     */
    // Returns all students whose name contains the given substring (case-insensitive).
    public List<StudentRecord> findByName(String name) throws SQLException {
        List<StudentRecord> list = new ArrayList<>();
        // IMPLEMENT
        return list;
    }
}
