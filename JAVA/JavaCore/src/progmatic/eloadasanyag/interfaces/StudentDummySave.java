package progmatic.eloadasanyag.interfaces;

import progmatic.eloadasanyag.interfaces.studentintefaces.StudentSaver;

public class StudentDummySave implements StudentSaver {
    @Override
    public void save(String student) {
        System.out.println("saved");
    }
}
