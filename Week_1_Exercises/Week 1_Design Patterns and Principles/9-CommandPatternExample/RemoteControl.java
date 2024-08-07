<<<<<<< HEAD
// This class holds a reference to a Command and executes it.
public class RemoteControl 
{
    private Command command;

    // Method to set the command
    public void setCommand(Command command) 
    {
        this.command = command;
    }

    // Method to execute the command
    public void pressButton() 
    {
        command.execute();
    }
=======
// This class holds a reference to a Command and executes it.
public class RemoteControl 
{
    private Command command;

    // Method to set the command
    public void setCommand(Command command) 
    {
        this.command = command;
    }

    // Method to execute the command
    public void pressButton() 
    {
        command.execute();
    }
>>>>>>> 5237ffd08bb0919cdc2e97c805224a6444f9441d
}