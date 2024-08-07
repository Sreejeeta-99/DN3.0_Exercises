<<<<<<< HEAD
// This class implements the Command interface to turn the light on
public class LightOnCommand implements Command 
{
    private Light light;

    // Constructor to initialize the light object
    public LightOnCommand(Light light) 
    {
        this.light = light;
    }

    // Execute method to turn the light on
    @Override
    public void execute() 
    {
        light.turnOn();
    }
=======
// This class implements the Command interface to turn the light on
public class LightOnCommand implements Command 
{
    private Light light;

    // Constructor to initialize the light object
    public LightOnCommand(Light light) 
    {
        this.light = light;
    }

    // Execute method to turn the light on
    @Override
    public void execute() 
    {
        light.turnOn();
    }
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
}