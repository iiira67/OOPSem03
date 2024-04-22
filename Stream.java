package OOPSem03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;
    public Stream() {
        this.studentGroups = new ArrayList<>();
    }
  
    public void addStudentGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
