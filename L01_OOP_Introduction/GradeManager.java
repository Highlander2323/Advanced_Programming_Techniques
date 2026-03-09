package L01_OOP_Introduction;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private final ArrayList<Student> students = new ArrayList<>();
    private final String _absPathFolder = "E:\\FAC\\TAP\\Advanced_Programming_Techniques\\out\\production\\Advanced_Programming_Techniques\\L01_OOP_Introduction";
    private final String _filename;
    public GradeManager(String filename){
        _filename = filename;
    }

    public void loadStudents(){
        try {
            List<String> lines = Files.readAllLines(Path.of(_absPathFolder + _filename));

            for(var line : lines){
                String[] parts = line.split(",");
                Student aux = new Student(parts[0],
                        Integer.parseInt(parts[1]),
                        Double.parseDouble(parts[2]),
                        parts[3]);
                students.add(aux);
            }
            System.out.println("\nLoaded students successfully!\n");
        }
        catch(Exception ex){
            System.out.println("Couldn't read from file -> " + ex.getMessage());
        }
    }

    public void printStudent(int position){
        students.get(position).print();
    }

    public void printAll(){
        for(var student : students){
            student.print();
        }
    }

    public void updateGrade(int position, double grade){
        students.get(position).setGrade(grade);
    }

    public void saveStudents(String filename){
        List<String> lines = new ArrayList<>();

        for(var student : students){
            String line = student.getName() + "," + student.getAge() + "," +
                    student.getGrade() + "," + student.getSub();
            lines.add(line);
        }

        try {
            Files.write(Path.of(_absPathFolder + filename), lines);
            System.out.println("File saved sucessfully!");
        } catch (Exception e) {
            System.err.println("Error when writing: " + e.getMessage());
        }

    }
}
