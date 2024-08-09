<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
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
<<<<<<< HEAD
=======
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
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
}