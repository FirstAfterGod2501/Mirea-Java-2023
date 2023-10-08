public class StudentController {

    private Model student;

    private StudentView view;

    public StudentController(Model student){
        this.student = student;
        view = new StudentView(student);
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public Model getStudent() {
        return student;
    }

    public void setStudent(Model student) {
        this.student = student;
    }

    private void updateView(){
        view.update(student.getRollNo());
    }
}
