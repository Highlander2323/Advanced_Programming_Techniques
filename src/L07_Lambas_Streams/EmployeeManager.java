package lab07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Manages a list of employees and exposes stream-based query methods.
 * No for-loops or while-loops are permitted in this class.
 * Gestionează o listă de angajați și conține funcții bazate pe stream.
 * Structuri for și while nu sunt permise în această clasă.
 */
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    /**
     * TODO: Returns a list of employees whose department matches the given argument.
     * Use .filter() and .collect().
     * TODO: Returnează lista de angajați.
     * Utilizați .filter() și .collect()
     */
    public List<Employee> getDepartmentEmployees(String department) {
        // TODO
        return null;
    }

    /**
     * TODO: Returns a list of employee names ordered by salary from lowest to highest.
     * TODO: Returnează lista cu numele angajaților ordonați crescător după salar.
     * Chain .sorted(), .map(), and .collect().
     * Utilizați .sorted(), .map() și .collect().
     */
    public List<String> getNamesSortedBySalary() {
        // TODO
        return null;
    }

    /**
     * TODO: Returns a list of names of employees whose salary is strictly above.
     * TODO: Returnează o listă cu numele angajaților a cărui salariu e strict mai mare.
     * Use .filter(), .map(), and .collect().
     * Utilizați .filter(), .map() și .collect().
     */
    public List<String> getHighEarnerNames(double threshold) {
        // TODO
        return null;
    }

    /**
     * TODO: Returns a single String with all employee names separated by " | ".
     * TODO: Returnează un singur String cu toți angajați separați de " | ".
     * Use .map() and Collectors.joining(" | ").
     * Utilizați .map() și Collectors.joining(" | ").
     */
    public String getRosterLine() {
        // TODO
        return null;
    }

    /**
     * TODO: Prints each employee in the given department on its own line.
     * TODO: Afișează fiecare angajat din departamentul dat pe o singură linie.
     * Use .filter() and .forEach() with a lambda. No .collect() needed.
     * Utilizați .filter() și .forEach() cu un lambda. .collect() nu e necesar.
     */
    public void printByDepartment(String department) {
        // TODO
    }
}
