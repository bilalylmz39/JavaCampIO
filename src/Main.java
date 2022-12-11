public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(110);
        user.setFirstName("Yusuf Bilal");
        user.setLastName("Yılmaz");

        Student student = new Student();
        student.setId(210);
        student.setFirstName("Vesyel");
        student.setLastName("Ertürk");
        student.setUniversity("ESOGU");

        Instructor instructor = new Instructor();
        instructor.setId(3100);
        instructor.setFirstName("Mehmet");
        instructor.setLastName("Ersoy");
        instructor.setBranch("Artificial Intelligence");

        UserManager um = new UserManager();
        um.addUser(user);
        StudentManager sm = new StudentManager();
        sm.addCourseRegistration(student);
        InstructorManager im = new InstructorManager();
        im.addBranch(instructor);

    }
}