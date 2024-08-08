<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
// This class tests the Command Pattern implementation for home automation
public class Test 
{
    public static void main(String[] args) 
    {
        // Create the light object (receiver)
        Light ob = new Light();

        // Create command objects with the light object
        Command lightOn = new LightOnCommand(ob);
        Command lightOff = new LightOffCommand(ob);

        // Create the remote control (invoker)
        RemoteControl obj = new RemoteControl();

        // Set command to turn the light on and press the button
        obj.setCommand(lightOn);
        obj.pressButton();  // Output: The light is ON

        // Set command to turn the light off and press the button
        obj.setCommand(lightOff);
        obj.pressButton();  // Output: The light is OFF
    }
}
<<<<<<< HEAD
=======
=======
// This class tests the Command Pattern implementation for home automation
public class Test 
{
    public static void main(String[] args) 
    {
        // Create the light object (receiver)
        Light ob = new Light();

        // Create command objects with the light object
        Command lightOn = new LightOnCommand(ob);
        Command lightOff = new LightOffCommand(ob);

        // Create the remote control (invoker)
        RemoteControl obj = new RemoteControl();

        // Set command to turn the light on and press the button
        obj.setCommand(lightOn);
        obj.pressButton();  // Output: The light is ON

        // Set command to turn the light off and press the button
        obj.setCommand(lightOff);
        obj.pressButton();  // Output: The light is OFF
    }
}
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
>>>>>>> c92f9310a8ae5c7cb60f61186dfe356a32c0eb7d
