public class Course {
    private final int CAPACITY = 10;
    private String title;
    private Student[] list;
    private int studentSize;

    public Course(String title) {
        this.title = title;
        this.list = new Student[CAPACITY];
        this.studentSize = 0;
    }

    public Student[] getStudents() {
        return list;
    }

    public boolean isFull() {
        if (studentSize == CAPACITY) return true;
        else return false;
    }

    public boolean registerStudent(Student student) {
        if (!isFull()) {
            list[studentSize++] = student;
            return true;
        } else return false;
    }
}
