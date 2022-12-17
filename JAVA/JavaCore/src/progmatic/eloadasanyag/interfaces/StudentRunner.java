package progmatic.eloadasanyag.interfaces;

public class StudentRunner {
    public static void main(String[] args) {
        StudentFileOperations saveStudentOne = new StudentFileOperations();
        saveStudentOne.save("TothBela - 5c");
        System.out.println(saveStudentOne.read());
    }
}
