// This class represents the Controller in the MVC pattern, managing interactions between the Model and the View.
public class StudentController 
{
    private Student model;
    private StudentView view;

    // Constructor to initialize the model and view
    public StudentController(Student model, StudentView view) 
    {
        this.model = model;
        this.view = view;
    }

    // Method to update student details
    public void setStudentName(String name) 
    {
        model.setName(name);
    }
    public void setStudentId(int id) 
    {
        model.setId(id);
    }
    public void setStudentGrade(String grade) 
    {
        model.setGrade(grade);
    }

    
    public String getStudentName() 
    {
        return model.getName();
    }
    public int getStudentId() 
    {
        return model.getId();
    }
    public String getStudentGrade() 
    {
        return model.getGrade();
    }

    // Method to update the view with the current model data
    public void updateView() 
    {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}