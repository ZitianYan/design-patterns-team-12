package command;

import java.util.HashMap;

public class InputHandler 
{
	/*
	 * Class that creates an instance of the stop watch and uses hash
	 * map functions to execute either a count down from one minute,
	 * five minutes, or thirty seconds by Peyton Fisher
	 */
    private HashMap<String, Command> commands;
    private StopWatch watch;
    
    public InputHandler(StopWatch watch)
    {
        this.watch = watch;
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }

    public boolean inputEntered(String data)
    {
    	Command command = commands.get(data);
    	if(command != null)
    	{
    		command.execute();
    		return true;
    	}
    	else
    	{
    		return false;
    	} 
    }
}
