public class Test {
    public static void main(String[] args) {
        Student arch = new Student("arch", 8);
        Student brandy = new Student("brandy", 17);
        Course chem101 = new Course("chem101");
        chem101.registerStudent(arch);
        chem101.registerStudent(brandy);
        for (Student s : chem101.getStudents()) {
            if (s == null) break;
            System.out.println("Student name: " + s.getName() + " Student id: " + s.getId());
        }
    }
}
