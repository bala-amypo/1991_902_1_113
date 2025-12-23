@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final List<StudentProfile> students = new ArrayList<>();

    @Override
    public StudentProfile createStudent(StudentProfile profile) {
        students.add(profile);   // ✅ store
        return profile;
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return students;         // ✅ return stored
    }
}
