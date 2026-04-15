package lab09;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Represents a course offered by the university.
 * Reprezintă un curs oferit de universitate.
 */
public class Course {

    private int    id;
    private String title;
    private int    capacity;
    private int    enrolled;

    public Course(String title, int capacity) {
        this.title    = title;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public int    getId()       { return id; }
    public String getTitle()    { return title; }
    public int    getCapacity() { return capacity; }
    public int    getEnrolled() { return enrolled; }
    public void   setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return String.format("Course{id=%d, title='%s', capacity=%d, enrolled=%d}",
                id, title, capacity, enrolled);
    }
}
