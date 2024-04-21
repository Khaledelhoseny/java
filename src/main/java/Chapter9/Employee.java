package Chapter9;



public class Employee extends Person {

    //Constructor
    public Employee(){
//        super("khaled");
        System.out.println("Employee Constructor ");
    }
    private String employeeId ;
    private String title ;
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Employee obj = new Employee() ;


    }

}
