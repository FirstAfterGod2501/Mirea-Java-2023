public class Main {
    public static void main(String[] args) {
        Employee model = new Employee("Gleb", 1000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeSalary(1500);

        controller.updateView();
    }
}