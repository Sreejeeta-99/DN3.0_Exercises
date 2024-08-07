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
}