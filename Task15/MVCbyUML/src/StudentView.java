
public class StudentView {
    private Model student;

    public StudentView(Model student){
        this.student = student;
    }

    public void update(String roll){
        student.setRollNo(roll);
    }
    public void printStudentDetails(){
        System.out.println("Name: " + student.getName() + "\nRoll: " + student.getRollNo() );
    }
}
