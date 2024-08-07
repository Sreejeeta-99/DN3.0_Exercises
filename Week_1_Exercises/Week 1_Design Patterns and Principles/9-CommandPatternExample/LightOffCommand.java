<<<<<<< HEAD
// This class implements the Command interface to turn the light off
public class LightOffCommand implements Command 
{
    private Light light;

    // Constructor to initialize the light object
    public LightOffCommand(Light light) 
    {
        this.light = light;
    }

    // Execute method to turn the light off
    @Override
    public void execute() 
    {
        light.turnOff();
    }
=======
// This class implements the Command interface to turn the light off
public class LightOffCommand implements Command 
{
    private Light light;

    // Constructor to initialize the light object
    public LightOffCommand(Light light) 
    {
        this.light = light;
    }

    // Execute method to turn the light off
    @Override
    public void execute() 
    {
        light.turnOff();
    }
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
}