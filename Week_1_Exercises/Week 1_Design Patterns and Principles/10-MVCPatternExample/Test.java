// This class tests the MVC implementation by creating a Student, updating it using StudentController, and displaying it using StudentView
public class Test
{
    public static void main(String[] args) 
    {
        // Create a Student object (Model)
        Student ob = new Student(" Sreejeeta Dutta", 52, "A");

        // Create a StudentView object (View)
        StudentView obj = new StudentView();

        // Create a StudentController object (Controller) with the Student and StudentView
        StudentController controller = new StudentController(ob, obj);

        // Display the initial student details
        controller.updateView();

        // Update student details using the controller
        controller.setStudentName(" John Snow");
        controller.setStudentId(63);
        controller.setStudentGrade("B");

        // Display the updated student details
        controller.updateView();
    }
}