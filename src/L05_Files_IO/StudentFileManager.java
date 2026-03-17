package Lab05_Files_IO;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Implement all methods below using BufferedReader and BufferedWriter.
 * TODO: Wrap all file operations in try-with-resources blocks.
 * TODO: Re-use what you learned in Lab 04 — handle IOExceptions properly.
 */
public class StudentFileManager {

    private String filePath;

    public StudentFileManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * TODO: Read the file at filePath line by line.
     * TODO: Parse each line into a StudentRecord (split by comma).
     * TODO: Return the list of all parsed records.
     * TODO: If the file does not exist, print a friendly error and return an empty list.
     */
    /**
     * TODO: Citeste fisierul din filePath linie cu linie.
     * TODO: Parcurge si introduce fiecare linie intr-un StudentRecord (separat de virgula).
     * TODO: Returneaza lista cu toti studentii.
     * TODO: Daca fisierul nui exista, afisati un mesaj de eroare si returnati lista goala.
     */

    // Reads all student records from the file and returns them as a list.
    // Citeste toti studentii dintr-un fisier si ii returneaza intr-o lista.
    public List<StudentRecord> readAll() {
        List<StudentRecord> records = new ArrayList<>();
        // IMPLEMENT
        return records;
    }

    /**
     * TODO: Write each StudentRecord to the file, one per line, in NAME,AGE,GPA format.
     * TODO: Use try-with-resources to ensure the writer is always closed.
     * TODO: If writing fails, throw the IOException — do not swallow it silently.
     */

    /**
     * TODO: Scrie fiecare StudentRecord in fisier, unul pe fiecare linie, in formatul NAME,AGE,GPA
     * TODO: Foloseste try-with-resources pentru a se asigura inchiderea scrierii.
     * TODO: Daca scrierea esueaza, se "arunca" IOException.
     */

    // Writes a list of StudentRecord objects to the file, overwriting any existing content.
    // Scrie o lista de obiecte StudentRecord in fisier, suprascriind orice continut existent.
    public void writeAll(List<StudentRecord> records) {
        // TODO: implement
    }

    /**
     * TODO: Open the file in append mode (hint: new FileWriter(path, true)).
     * TODO: Write only the new record without erasing existing content.
     */

    /**
     * TODO: Deschide fisierul in modul append (hint: new FileWriter(path, true)).
     * TODO: Scrie doar noua inregistrare fara a sterge continutul existent.
     */

    // Appends a single StudentRecord to the end of the file.
    // Adauga un singur StudentRecord la sfarsitul fisierului
    public void appendRecord(StudentRecord record) {
        // TODO: implement
    }
}
