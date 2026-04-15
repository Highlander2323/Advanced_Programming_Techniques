package lab09;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * TODO: Implement createTable(), insertCourse(), and enrolStudents().
 * TODO: createTable() must create BOTH the courses table and the enrolments
 *       junction table (student_id INTEGER, course_id INTEGER).
 * TODO: enrolStudents() must use a manual transaction with rollback on failure.
 */
public class CourseRepository {

    private Connection connection;

    public CourseRepository(Connection connection) {
        this.connection = connection;
    }

    /**
     * TODO: Create the courses table:
     *         id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL,
     *         capacity INTEGER, enrolled INTEGER DEFAULT 0
     * TODO: Create the enrolments table:
     *         student_id INTEGER, course_id INTEGER,
     *         PRIMARY KEY (student_id, course_id)
     * TODO: Use CREATE TABLE IF NOT EXISTS for both.
     */
    // Creates the courses and enrolments tables if they do not already exist.
    public void createTable() throws SQLException {
        // IMPLEMENT
    }

    /**
     * TODO: Insert a Course using a PreparedStatement.
     * TODO: After insertion, retrieve the generated key and set it on the Course object
     *       with setId() — hint: use Statement.RETURN_GENERATED_KEYS.
     */
    // Inserts a new course and updates the course object with its generated id.
    public void insertCourse(Course course) throws SQLException {
        // IMPLEMENT
    }

    /**
     * TODO: Disable auto-commit at the start.
     * TODO: For each studentId in the list:
     *         1. Query the current enrolled and capacity for courseId.
     *         2. If enrolled >= capacity, throw new SQLException("Course is full: " + courseId).
     *         3. INSERT into enrolments (student_id, course_id).
     *         4. UPDATE courses SET enrolled = enrolled + 1 WHERE id = courseId.
     * TODO: If all steps succeed, call connection.commit().
     * TODO: In the catch block, call connection.rollback() then re-throw.
     * TODO: Always restore auto-commit to true in a finally block.
     */
    // Enrols a batch of students into a course atomically; rolls back on any failure.
    public void enrolStudents(int courseId, List<Integer> studentIds) throws SQLException {
        // IMPLEMENT
    }
}
